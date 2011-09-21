
package net.sourceforge.czt.zeves;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * The class for Z/Eves server process management. It launches the given Z/Eves
 * executable in an API mode. The class is aware of when the process is closed
 * externally.
 * 
 * @author Andrius Velykis
 */
public class ZEvesServer
{

  private final String zEvesExecCommand;

  private final int port;

  private Process process;
  
  private CopyOnWriteArraySet<ZEvesServerListener> listeners = 
      new CopyOnWriteArraySet<ZEvesServerListener>();
  
  private boolean userStop = false;

  public ZEvesServer(String zEvesExecCommand, int port)
  {
    super();
    this.zEvesExecCommand = zEvesExecCommand;
    this.port = port;
  }

  public void start() throws IOException
  {

    assert process == null;

    String fullZEvesCommand = zEvesExecCommand + " -- -api -port " + String.valueOf(port);

    System.out.println("Starting Z/Eves server with command: " + fullZEvesCommand);

    userStop = false;
    process = Runtime.getRuntime().exec(fullZEvesCommand);

    fireServerStarted();
    
    // wait for the process to die in another thread
    Thread exitWaiter = new Thread(new ProcessExitWaiter());
    exitWaiter.start();
  }

  public void stop()
  {

    if (process == null) {
      return;
    }

    userStop = true;
    process.destroy();
    
    fireServerStopped(true);
  }

  public boolean isRunning()
  {
    return process != null;
  }
  
  public void addServerListener(ZEvesServerListener listener)
  {
    this.listeners.add(listener);
  }
  
  public void removeServerListener(ZEvesServerListener listener)
  {
    this.listeners.remove(listener);
  }
  
  private void fireServerStarted()
  {
    ZEvesServerEvent event = new ZEvesServerEvent(this, true);
    for (ZEvesServerListener listener : listeners) {
      listener.serverStarted(event);
    }
  }

  private void fireServerStopped(boolean user)
  {
    ZEvesServerEvent event = new ZEvesServerEvent(this, user);
    for (ZEvesServerListener listener : listeners) {
      listener.serverStopped(event);
    }
  }

  /**
   * Waits for the Z/Eves server process to terminate.
   * 
   * @author Andrius Velykis
   */
  private class ProcessExitWaiter implements Runnable
  {
    public void run()
    {

      while (!Thread.interrupted()) {
        try {

          process.waitFor();
          process = null;

          System.out.println("Z/Eves server process has terminated.");
          
          if (!userStop) {
            // server died - not stopped by the user, thus report
            fireServerStopped(false);
          }

          Thread.currentThread().interrupt();
          return;

        }
        catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      }
    }
  }

}
