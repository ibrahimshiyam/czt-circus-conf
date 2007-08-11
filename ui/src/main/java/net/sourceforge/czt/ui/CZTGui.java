package net.sourceforge.czt.ui;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import net.sourceforge.czt.base.util.TermTreeNode;
import net.sourceforge.czt.parser.util.CztError;
import net.sourceforge.czt.parser.util.CztErrorList;
import net.sourceforge.czt.session.CommandException;
import net.sourceforge.czt.session.FileSource;
import net.sourceforge.czt.session.Key;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.session.Source;
import net.sourceforge.czt.z.ast.Spec;

/**
 *  Description of the Class
 *
 *@author     yt49
 *@created    July 31, 2007
 */
public class CZTGui implements ActionListener
{
  String softwarename = "CZT";
  JFileChooser chooser = new JFileChooser();
  JFrame frame = new JFrame(softwarename);
  JTree treeView = null;
  JPanel resultPanel = new JPanel();
  JLabel resultLabel = new JLabel("Results");
  JTextArea textResults = new JTextArea();

  JPanel specificationPanel = new JPanel();
  JTextField specText = new JTextField(12);
  JLabel specificationLabel = new JLabel("Specification:");
  JButton specBrowseButton = new JButton("...");

  JPanel specMidPanel = new JPanel();

  JPanel languagePanel = new JPanel();
  JLabel languageLabel = new JLabel("Language: ");
  String[] languageOptions = {"Standard Z", "Object Z", "Circus"};
  JComboBox languageCombo = new JComboBox(languageOptions);

  JPanel markupPanel = new JPanel();
  JLabel markupLabel = new JLabel("Markup: ");
  String[] markupOptions = {"Latex", "Unicode", "XML"};
  JComboBox markupCombo = new JComboBox(markupOptions);
  
  JPanel encodingPanel = new JPanel();
  JLabel encodingLabel = new JLabel("Encoding: ");
  String[] encodingOptions = {"Default","UTF8","UTF16"};
  JComboBox encodingCombo = new JComboBox(encodingOptions);

  JPanel typecheckPanel = new JPanel();
  JLabel typecheckLabel = new JLabel("Typecheck? ");
  JCheckBox typecheckCheckBox = new JCheckBox("", true);

  JPanel specOKCancelPanel = new JPanel();
  JButton specOKButton = new JButton("OK");
  JButton specCancelButton = new JButton("Cancel");

  final JDialog specDialog = new JDialog(frame, "Specification", true);

  JMenuBar menubar = new JMenuBar();
  JMenu filemenu = new JMenu("File");
  JMenuItem open = new JMenuItem("Open");
  JMenuItem saveas = new JMenuItem("Save As...");
  JMenuItem close = new JMenuItem("Close");
  JMenuItem exit = new JMenuItem("Exit");
  JScrollPane scrollResults = new JScrollPane(textResults);
  JScrollPane scrollTreeStructure = new JScrollPane();
  JSplitPane split = null;
  File file = null;

  
  /**
   *  Constructor for the CZTGui object
   */
  public CZTGui() {
    
    try{
      FileInputStream fileStream = new FileInputStream(softwarename+".dat");
      ObjectInputStream os = new ObjectInputStream(fileStream);
      
      Object pathObject = os.readObject();      
      String path = (String)pathObject;
      chooser.setCurrentDirectory(new File(path));
      
      os.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }


  /**
   *  The main program for the CZTGui class
   *
   *@param  args  The command line arguments
   */
  public static void main(String[] args)
  {
    CZTGui gui = new CZTGui();
    gui.go();
  }


  /**
   *  Description of the Method
   */
  public void go()
  {
    resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
    resultPanel.add(BorderLayout.CENTER, resultLabel);
    resultPanel.add(BorderLayout.CENTER, scrollResults);
    
    split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollTreeStructure, resultPanel);
    split.setDividerLocation(400);

    open.addActionListener(this);
    saveas.setEnabled(false);
    saveas.addActionListener(this);
    close.addActionListener(this);
    exit.addActionListener(this);

    filemenu.add(open);
    filemenu.add(saveas);
    filemenu.add(close);
    filemenu.add(exit);

    menubar.add(filemenu);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(BorderLayout.NORTH, menubar);
    frame.getContentPane().add(BorderLayout.CENTER, split);
    frame.setSize(600, 600);
    frame.setVisible(true);

    specificationPanel.add(BorderLayout.WEST, specificationLabel);
    specificationPanel.add(BorderLayout.CENTER, specText);
    specificationPanel.add(BorderLayout.EAST, specBrowseButton);
    specBrowseButton.addActionListener(this);

    languagePanel.add(BorderLayout.WEST, languageLabel);
    languagePanel.add(BorderLayout.CENTER, languageCombo);

    markupPanel.add(BorderLayout.WEST, markupLabel);
    markupPanel.add(BorderLayout.CENTER, markupCombo);
    
    encodingPanel.add(BorderLayout.WEST, encodingLabel);
    encodingPanel.add(BorderLayout.CENTER, encodingCombo);
    
    typecheckPanel.add(BorderLayout.WEST, typecheckLabel);
    typecheckPanel.add(BorderLayout.EAST, typecheckCheckBox);

    specMidPanel.setLayout(new BoxLayout(specMidPanel, BoxLayout.Y_AXIS));
    specMidPanel.add(languagePanel);
    specMidPanel.add(markupPanel);
    specMidPanel.add(encodingPanel);
    specMidPanel.add(typecheckPanel);

    specOKCancelPanel.add(BorderLayout.WEST, specOKButton);
    specOKCancelPanel.add(BorderLayout.WEST, specCancelButton);
    specOKButton.addActionListener(this);
    specCancelButton.addActionListener(this);

    specDialog.getContentPane().add(BorderLayout.NORTH, specificationPanel);
    specDialog.getContentPane().add(BorderLayout.CENTER, specMidPanel);
    specDialog.getContentPane().add(BorderLayout.SOUTH, specOKCancelPanel);
    specDialog.setSize(300, 250);

  }


  /**
   *  Description of the Method
   */
  private void loadFile()
  {
    specDialog.setVisible(false);
    saveas.setEnabled(true);
    frame.setTitle(softwarename + " - " + file.getName());
    SectionManager manager = new SectionManager();
    FileSource source = new FileSource(file);
    
    manager.put(new Key(source.getName(), Source.class), source);
    
    try{
      FileOutputStream fileStream = new FileOutputStream(softwarename+".dat");
      ObjectOutputStream os = new ObjectOutputStream(fileStream);
      os.writeObject(file.getPath());
      os.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    
    try {
      Spec spec = (Spec)
        manager.get(new Key(source.getName(), Spec.class));
      // TODO: Display JTree instead of printing
      // use TermTreeNode to create JTree
      treeView = new JTree((new TermTreeNode(0,spec,null)));
      scrollTreeStructure.setViewportView(treeView);

      frame.getContentPane().add(BorderLayout.NORTH, menubar);
      frame.getContentPane().add(BorderLayout.CENTER, split);
    }
    catch (CommandException exception) {
      Throwable cause = exception.getCause();
      if (cause instanceof CztErrorList) {
        java.util.List<? extends CztError> errors =
        ((CztErrorList) cause).getErrors();
        // TODO: (iterate over error list
        for (int i = 0; i < errors.size(); i++) {
          textResults.append(errors.get(i).toString() + "\n");
        }
      }
      else if (cause instanceof IOException) {
        String message = "Input output error: " + cause.getMessage();
      }
      else {
        String message = cause + getClass().getName();
      }
    }
    catch (Throwable e) {
      String message =
        "Caught " + e.getClass().getName() + ": " + e.getMessage();
    }
  }


  /**
   *  Description of the Method
   *
   *@param  event  Description of the Parameter
   */
  public void actionPerformed(ActionEvent event)
  {
    int n = 0;
    //display the spec dialog
    if (event.getSource() == open) {
      specDialog.setVisible(true);
    }
    //choose a file
    if (event.getSource() == specBrowseButton) {
      int returnValOpen = chooser.showOpenDialog(frame);
      if (returnValOpen == JFileChooser.APPROVE_OPTION) {
        specText.setText(chooser.getSelectedFile().getPath());
        //specText.setText(file.getPath());
      }
    }
    //load the file
    if (event.getSource() == specOKButton) {
        if (!specText.equals("")) {
          file = new File(specText.getText());
          if (!file.isFile()) {
            file = null;
            JOptionPane.showMessageDialog(frame,
              "File Does Not Exist",
              "Error",
              JOptionPane.ERROR_MESSAGE);
          }
          else {
            textResults.setText("");
            loadFile();
          }
        }
    }
    //if the cancel button is clicked on the spec dialog then hid it
    if (event.getSource() == specCancelButton) {
      specText.setText("");
      specDialog.setVisible(false);
    }
    //save
    if (event.getSource() == saveas) {
      int returnValSave = chooser.showSaveDialog(frame);
      if (returnValSave == JFileChooser.APPROVE_OPTION) {
        file = chooser.getSelectedFile();
      }
    }
    //close the project and set back to defaults
    if (event.getSource() == close) {
      file = null;
      frame.setTitle(softwarename);
      saveas.setEnabled(false);
      textResults.setText("");

    }
    //exit program and asks if user wants to save if a file is opened
    if (event.getSource() == exit) {
      if (file != null) {
        n = JOptionPane.showConfirmDialog(frame, "Exit without saving?", softwarename, JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
          System.exit(0);
        }
      }
      else {
        System.exit(0);
      }
    }
  }  
}

