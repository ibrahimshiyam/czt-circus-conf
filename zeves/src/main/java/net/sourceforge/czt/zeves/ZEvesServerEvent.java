package net.sourceforge.czt.zeves;

import java.util.EventObject;

public class ZEvesServerEvent extends EventObject
{

  private final ZEvesServer server;
  
  private final boolean userAction;
  
  public ZEvesServerEvent(ZEvesServer server, boolean userAction)
  {
    super(server);
    this.server = server;
    this.userAction = userAction;
  }

  public ZEvesServer getServer()
  {
    return server;
  }

  public boolean isUser()
  {
    return userAction;
  }

}
