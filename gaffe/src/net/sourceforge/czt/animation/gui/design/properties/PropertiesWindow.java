/*
  GAfFE - A (G)raphical (A)nimator (F)ront(E)nd for Z - Part of the CZT Project.
  Copyright 2003 Nicholas Daley
  
  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.
  
  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package net.sourceforge.czt.animation.gui.design.properties;

import java.awt.BorderLayout;             import java.awt.Component;
import java.awt.GridLayout;               import java.awt.Image;

import java.awt.event.ActionEvent;        import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;          import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import java.beans.BeanInfo;               import java.beans.Customizer;
import java.beans.IntrospectionException; import java.beans.Introspector;           
import java.beans.PropertyChangeEvent;    import java.beans.PropertyChangeListener; 
import java.beans.PropertyEditor;         import java.beans.PropertyEditorManager;

import java.lang.reflect.Method;

import java.util.EventObject;             import java.util.EventListener;
import java.util.Hashtable;               import java.util.HashMap;
import java.util.Iterator;                import java.util.Map;

import javax.swing.AbstractAction;        import javax.swing.AbstractButton;                
import javax.swing.Action;                import javax.swing.ActionMap;             
import javax.swing.Box;                   import javax.swing.ImageIcon;             
import javax.swing.InputMap;              import javax.swing.JButton;             
import javax.swing.JCheckBoxMenuItem;     import javax.swing.JComboBox;             
import javax.swing.JComponent;            import javax.swing.JDialog;             
import javax.swing.JFrame;                import javax.swing.JLabel;                
import javax.swing.JMenu;                 import javax.swing.JMenuBar;              
import javax.swing.JMenuItem;             import javax.swing.JOptionPane;           
import javax.swing.JPanel;                import javax.swing.JScrollPane;           
import javax.swing.JTabbedPane;           import javax.swing.JTable;                
import javax.swing.JTextField;            import javax.swing.KeyStroke;             

import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;     import javax.swing.event.EventListenerList;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor; import javax.swing.table.TableCellRenderer;

import net.sourceforge.czt.animation.gui.design.BeanSelectedListener;
import net.sourceforge.czt.animation.gui.design.BeanSelectedEvent;

import net.sourceforge.czt.animation.gui.util.IntrospectionHelper;

/**
 * The properties window displays the properties/events/methods/configuration of the currently
 * selected bean.
 */
public class PropertiesWindow extends JFrame implements BeanSelectedListener {
  /**
   * The bean that properties are being shown for.
   */
  protected Object bean=null;
  /**
   * The BeanInfo for bean's class.
   */
  protected BeanInfo beanInfo;
  /**
   * A label appearing at the top of the window identifying bean's type.
   * Plus an icon if that is provided by beanInfo.
   */
  protected JLabel headingTypeLabel;
  /**
   * A label appearing at the top of the window identifying bean's <code>name</code> property (if 
   * there is one).
   */
  protected JLabel headingNameLabel;

  protected JButton customiserButton;
  /**
   * The tabbed pane that takes up most of this window.
   */
  protected JTabbedPane tabbedPane;
  /**
   * The PropertiesTable model that appears under the "Properties" tab.
   */
  protected final PropertiesTable propertiesTable;
  /**
   * The EventsTable model that appears under the "Events" tab.
   */
  protected final EventsTable eventsTable;
  /**
   * The MethodsTable model that appears under the "Methods" tab.
   */
  protected final MethodsTable methodsTable;
  /**
   * The tables for properties events and methods.
   */
  protected JTable propertiesTableT, eventsTableT, methodsTableT;
  
  
  protected boolean hiddenShown=false, expertShown=false, onlyPreferredShown=false, transientShown=false;
  protected boolean onlyEditableShown=false;
  protected JCheckBoxMenuItem hiddenShownCB, expertShownCB, onlyPreferredShownCB, transientShownCB;
  protected JCheckBoxMenuItem onlyEditableShownCB;
  protected void setDescriptors() {
    propertiesTable.setPropertyDescriptors();
    eventsTable.setEventDescriptors();
    methodsTable.setMethodDescriptors();
  };
  public void setHiddenShown(boolean b) {
    hiddenShown=b;
    if(hiddenShownCB.isSelected()!=b)hiddenShownCB.setSelected(b);
    setDescriptors();
  };
  public void setExpertShown(boolean b) {
    expertShown=b;
    if(expertShownCB.isSelected()!=b)expertShownCB.setSelected(b);
    setDescriptors();
  };
  public void setOnlyPreferredShown(boolean b) {
    onlyPreferredShown=b;
    if(onlyPreferredShownCB.isSelected()!=b)onlyPreferredShownCB.setSelected(b);
    setDescriptors();
  };
  public void setTransientShown(boolean b) {
    transientShown=b;
    if(transientShownCB.isSelected()!=b)transientShownCB.setSelected(b);
    setDescriptors();
  };
  public void setOnlyEditableShown(boolean b) {
    onlyEditableShown=b;
    if(onlyEditableShownCB.isSelected()!=b)onlyEditableShownCB.setSelected(b);
    propertiesTable.setPropertyDescriptors();
  };

  public boolean getHiddenShown() {return hiddenShown;};
  public boolean getExpertShown() {return expertShown;};
  public boolean getOnlyPreferredShown() {return onlyPreferredShown;};
  public boolean getTransientShown() {return transientShown;};
  public boolean getOnlyEditableShown() {return onlyEditableShown;};

  ActionMap actionMap=new ActionMap();
  InputMap inputMap=new InputMap();
  protected void setupActions(ActionMap am, InputMap im) {
    actionMap.setParent(am);
    inputMap.setParent(im);
    
    getLayeredPane().setActionMap(actionMap);
    getLayeredPane().setInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT,inputMap);
    
    Action action_show_hidden_descriptors;
    action_show_hidden_descriptors=new AbstractAction("Show hidden descriptors") {
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource() instanceof AbstractButton)
	    setHiddenShown(((AbstractButton)e.getSource()).isSelected());
	  else
	    setHiddenShown(!getHiddenShown());
	};
      };
    action_show_hidden_descriptors.putValue(Action.NAME,"Show hidden descriptors");
    action_show_hidden_descriptors.putValue(Action.SHORT_DESCRIPTION,
				 "Show hidden descriptors");
    action_show_hidden_descriptors.putValue(Action.LONG_DESCRIPTION, 
				 "Show hidden descriptors");
    //XXX action_show_hidden_descriptors.putValue(Action.SMALL_ICON,...);
    //XXX action_show_hidden_descriptors.putValue(Action.ACTION_COMMAND_KEY,...);
    action_show_hidden_descriptors.putValue(Action.ACCELERATOR_KEY,
					    KeyStroke.getKeyStroke("control H"));
    //XXX action_show_hidden_descriptors.putValue(Action.MNEMONIC_KEY,...);

    actionMap.put("Show hidden descriptors",action_show_hidden_descriptors);
    inputMap.put((KeyStroke)actionMap.get("Show hidden descriptors").getValue(Action.ACCELERATOR_KEY),
    		 "Show hidden descriptors");

    Action action_show_expert_descriptors;
    action_show_expert_descriptors=new AbstractAction("Show expert descriptors") {
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource() instanceof AbstractButton)
	    setExpertShown(((AbstractButton)e.getSource()).isSelected());
	  else
	    setExpertShown(!getExpertShown());
	};
      };
    action_show_expert_descriptors.putValue(Action.NAME,"Show expert descriptors");
    action_show_expert_descriptors.putValue(Action.SHORT_DESCRIPTION,
				 "Show expert descriptors");
    action_show_expert_descriptors.putValue(Action.LONG_DESCRIPTION, 
				 "Show expert descriptors");
    //XXX action_show_expert_descriptors.putValue(Action.SMALL_ICON,...);
    //XXX action_show_expert_descriptors.putValue(Action.ACTION_COMMAND_KEY,...);
    action_show_expert_descriptors.putValue(Action.ACCELERATOR_KEY,
					    KeyStroke.getKeyStroke("control E"));
    //XXX action_show_expert_descriptors.putValue(Action.MNEMONIC_KEY,...);

    actionMap.put("Show expert descriptors",action_show_expert_descriptors);
    inputMap.put((KeyStroke)actionMap.get("Show expert descriptors").getValue(Action.ACCELERATOR_KEY),
    		 "Show expert descriptors");

    Action action_show_onlyPreferred_descriptors;
    action_show_onlyPreferred_descriptors=new AbstractAction("Only show preferred descriptors") {
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource() instanceof AbstractButton)
	    setOnlyPreferredShown(((AbstractButton)e.getSource()).isSelected());
	  else 
	   setOnlyPreferredShown(!getOnlyPreferredShown()); 
	};
      };
    action_show_onlyPreferred_descriptors.putValue(Action.NAME,"Only show preferred descriptors");
    action_show_onlyPreferred_descriptors.putValue(Action.SHORT_DESCRIPTION,
				 "Only show preferred descriptors");
    action_show_onlyPreferred_descriptors.putValue(Action.LONG_DESCRIPTION, 
				 "Only show preferred descriptors");
    //XXX action_show_onlyPreferred_descriptors.putValue(Action.SMALL_ICON,...);
    //XXX action_show_onlyPreferred_descriptors.putValue(Action.ACTION_COMMAND_KEY,...);
    action_show_onlyPreferred_descriptors.putValue(Action.ACCELERATOR_KEY,
						   KeyStroke.getKeyStroke("control P"));
    //XXX action_show_onlyPreferred_descriptors.putValue(Action.MNEMONIC_KEY,...);

    actionMap.put("Only show preferred descriptors",action_show_onlyPreferred_descriptors);
    inputMap.put((KeyStroke)actionMap.get("Only show preferred descriptors").getValue(Action.ACCELERATOR_KEY),
    		 "Only show preferred descriptors");

    Action action_show_transient_descriptors;
    action_show_transient_descriptors=new AbstractAction("Show transient descriptors") {
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource() instanceof AbstractButton)
	    setTransientShown(((AbstractButton)e.getSource()).isSelected());
	  else 
	    setTransientShown(!getTransientShown()); 
	};
      };
    action_show_transient_descriptors.putValue(Action.NAME,"Show transient descriptors");
    action_show_transient_descriptors.putValue(Action.SHORT_DESCRIPTION,
				 "Show transient descriptors");
    action_show_transient_descriptors.putValue(Action.LONG_DESCRIPTION, 
				 "Show transient descriptors");
    //XXX action_show_transient_descriptors.putValue(Action.SMALL_ICON,...);
    //XXX action_show_transient_descriptors.putValue(Action.ACTION_COMMAND_KEY,...);
    action_show_transient_descriptors.putValue(Action.ACCELERATOR_KEY,
					       KeyStroke.getKeyStroke("control T"));
    //XXX action_show_transient_descriptors.putValue(Action.MNEMONIC_KEY,...);

    actionMap.put("Show transient descriptors",action_show_transient_descriptors);
    inputMap.put((KeyStroke)actionMap.get("Show transient descriptors").getValue(Action.ACCELERATOR_KEY),
    		 "Show transient descriptors");

    Action action_show_onlyEditable_descriptors;
    action_show_onlyEditable_descriptors=new AbstractAction("Only show editable properties") {
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource() instanceof AbstractButton)
	    setOnlyEditableShown(((AbstractButton)e.getSource()).isSelected());
	  else 
	   setOnlyEditableShown(!getOnlyEditableShown()); 
	};
      };
    action_show_onlyEditable_descriptors.putValue(Action.NAME,"Only show editable properties");
    action_show_onlyEditable_descriptors.putValue(Action.SHORT_DESCRIPTION,
				 "Only show editable properties");
    action_show_onlyEditable_descriptors.putValue(Action.LONG_DESCRIPTION, 
				 "Only show editable properties");
    //XXX action_show_onlyEditable_descriptors.putValue(Action.SMALL_ICON,...);
    //XXX action_show_onlyEditable_descriptors.putValue(Action.ACTION_COMMAND_KEY,...);
    action_show_onlyEditable_descriptors.putValue(Action.ACCELERATOR_KEY,
						   KeyStroke.getKeyStroke("control D"));
    //XXX action_show_onlyEditable_descriptors.putValue(Action.MNEMONIC_KEY,...);

    actionMap.put("Only show editable properties",action_show_onlyEditable_descriptors);
    inputMap.put((KeyStroke)actionMap.get("Only show editable properties").getValue(Action.ACCELERATOR_KEY),
    		 "Only show editable properties");

  };
  
  protected void setupMenus() {
    JMenuBar mb=new JMenuBar();
    JMenu file=new JMenu("File");
    file.add(new JMenuItem(actionMap.get("Quit")));

    JMenu filter=new JMenu("Filter");
    filter.setMnemonic(KeyEvent.VK_V);
    hiddenShownCB=new JCheckBoxMenuItem(actionMap.get("Show hidden descriptors"));
    filter.add(hiddenShownCB);
    expertShownCB=new JCheckBoxMenuItem(actionMap.get("Show expert descriptors"));
    filter.add(expertShownCB);
    onlyPreferredShownCB=new JCheckBoxMenuItem(actionMap.get("Only show preferred descriptors"));
    filter.add(onlyPreferredShownCB);
    transientShownCB=new JCheckBoxMenuItem(actionMap.get("Show transient descriptors"));
    filter.add(transientShownCB);
    onlyEditableShownCB=new JCheckBoxMenuItem(actionMap.get("Only show editable properties"));
    filter.add(onlyEditableShownCB);
    
    JMenu help=new JMenu("Help");
    help.setMnemonic(KeyEvent.VK_H);
    help.add(new JMenuItem(actionMap.get("About...")));
    help.add(new JMenuItem(actionMap.get("License...")));

    mb.add(file);
    mb.add(filter);
    mb.add(Box.createHorizontalGlue());
    mb.add(help);
    setJMenuBar(mb);
  };
  

  /**
   * Creates a properties window.
   */
  public PropertiesWindow(ActionMap am, InputMap im) {
    getContentPane().setLayout(new BorderLayout());
    
    setupActions(am,im);
    setupMenus();
    
    JPanel npanel=new JPanel(new GridLayout(1,2));
    
    npanel.add(headingTypeLabel=new JLabel());
    npanel.add(headingNameLabel=new JLabel());
    npanel.add(customiserButton=new JButton("Customiser"));
    customiserButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent ev) {
	  //XXX Creation of the customiser, etc. should probably be done in setBean instead.
	  Customizer customiser;
	  try {
	    customiser=(Customizer)beanInfo.getBeanDescriptor().getCustomizerClass().newInstance();
	  } catch (Exception ex) {
	    System.err.println("Exception while creating customiser (ignoring):"+ex);
	    customiserButton.setEnabled(false);
	    return;
	  };
	  JDialog cDialog=new JDialog(PropertiesWindow.this, 
				      beanInfo.getBeanDescriptor().getName()+" Customiser",true);
	  customiser.setObject(bean);
	  customiser.addPropertyChangeListener(new PropertyChangeListener() {
	      public void propertyChange(PropertyChangeEvent ev) {
		propertiesTable.fireTableDataChanged();
	      };
	    });
	  
	  cDialog.getContentPane().add((Component)customiser);
	  cDialog.pack();
	  cDialog.setVisible(true);
	};
      });
    getContentPane().add(npanel,BorderLayout.NORTH);

    tabbedPane=new JTabbedPane();
    getContentPane().add(tabbedPane,BorderLayout.CENTER);
    propertiesTable=new PropertiesTable(this);
    tabbedPane.add("Properties",new JScrollPane(propertiesTableT=new JTable(propertiesTable) {
	protected void createDefaultEditors() {
	  defaultEditorsByColumnClass=new Hashtable();
	};
      }));
    propertiesTableT.setDefaultEditor(Object.class,propertiesTable.createTableCellEditor());
    propertiesTableT.setDefaultRenderer(Object.class,new PropertyCellRenderer());
    propertiesTableT.setDefaultRenderer(String.class,new OtherRenderer());    
    
    eventsTable=new EventsTable(this);
    tabbedPane.add("Events",new JScrollPane(eventsTableT=new JTable(eventsTable)));
    methodsTable=new MethodsTable(this);
    tabbedPane.add("Methods",new JScrollPane(methodsTableT=new JTable(methodsTable)));
    
    
    setBean(null);
    setSize(500,500);    
  };
  
  /**
   * Getter function for bean.
   */
  public Object getBean() {
    return bean;
  };

  PropertyChangeListener beanNameChangeListener=new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent evt) {
	if(evt.getPropertyName().equals("name")) {
	  String name=(String)evt.getNewValue();
	  headingNameLabel.setText(name==null?"(unnamed)":name);
	}
      };
    };
  
  /**
   * Setter function for bean.
   * Sets up the tables and labels, etc.
   */
  public void setBean(Object bean) {
    if(this.bean!=null)
      IntrospectionHelper.removeBeanListener(this.bean,PropertyChangeListener.class, 
					     beanNameChangeListener);
    this.bean=bean;
    customiserButton.setEnabled(false);
    if(bean!=null)
      try {
	beanInfo=Introspector.getBeanInfo(bean.getClass());
	Image icon=beanInfo.getIcon(BeanInfo.ICON_COLOR_32x32);
	if(icon==null) icon=beanInfo.getIcon(BeanInfo.ICON_MONO_32x32);
	if(icon==null) icon=beanInfo.getIcon(BeanInfo.ICON_COLOR_16x16);
	if(icon==null) icon=beanInfo.getIcon(BeanInfo.ICON_MONO_16x16);
	if(icon==null)
	  headingTypeLabel.setIcon(null);
	else
	  headingTypeLabel.setIcon(new ImageIcon(icon));
	headingTypeLabel.setText(beanInfo.getBeanDescriptor().getName());
	String name=null;
	if(IntrospectionHelper.beanHasReadableProperty(bean,"name"))
	  name=(String)IntrospectionHelper.getBeanProperty(bean,"name");
	headingNameLabel.setText(name==null?"(unnamed)":name);
      } catch (IntrospectionException e) {
	System.err.println("COULDN'T GET BeanInfo");
	System.err.println(e);
      }
    else {
      beanInfo=null;
      headingTypeLabel.setText("(None)");
    }

    propertiesTable.setBean(bean);
    eventsTable.setBean(bean);
    methodsTable.setBean(bean);
    
    if(beanInfo==null)
      setTitle("Property Editor: (none)");
    else
      setTitle("Property Editor: "+beanInfo.getBeanDescriptor().getDisplayName());
    propertiesTableT.clearSelection();
    eventsTableT.clearSelection();
    if(beanInfo!=null) {
      if(beanInfo.getDefaultPropertyIndex()>=0)
	propertiesTableT.addRowSelectionInterval(beanInfo.getDefaultPropertyIndex(),
						 beanInfo.getDefaultPropertyIndex());
      if(beanInfo.getDefaultEventIndex()>=0)
	eventsTableT.addRowSelectionInterval(beanInfo.getDefaultEventIndex(),
					     beanInfo.getDefaultEventIndex());
      if(beanInfo.getBeanDescriptor().getCustomizerClass()!=null) customiserButton.setEnabled(true);
    }
    methodsTableT.clearSelection();
    if(this.bean!=null)
      IntrospectionHelper.addBeanListener(this.bean,PropertyChangeListener.class,
					  beanNameChangeListener);
  };


  /**
   * XXX Editor/Renderer class for properties.
   */
  
  public void beanSelected(BeanSelectedEvent ev) {
    setBean(ev.getSelectedBean());
  };

  public class OtherRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, 
						   boolean isSelected, boolean hasFocus,
						   int row, int column) {
      boolean isEditable=propertiesTable.isCellEditable(row,table.getColumn("Value").getModelIndex());
      Component component=super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
      component.setEnabled(isEditable);
      return component;
    }
  };
  
  public class PropertyCellRenderer implements TableCellRenderer {
    private DefaultTableCellRenderer defaultRenderer=new DefaultTableCellRenderer();
    public Component getTableCellRendererComponent(JTable table, Object value, 
						   boolean isSelected, boolean hasFocus,
						   int row, int column) {
      boolean isEditable=propertiesTable.isCellEditable(row,column);
      Component component;
      if(value!=null) for(Iterator it=defaultRenderers.entrySet().iterator();it.hasNext();) {
	Map.Entry entry=(Map.Entry)it.next();
	Class clazz=(Class)entry.getKey();
	TableCellRenderer renderer=(TableCellRenderer)entry.getValue();
	if(clazz.isAssignableFrom(value.getClass())) {
	  component=renderer.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
	  component.setEnabled(isEditable);
	  return component;
	}
      };
      component=defaultRenderer.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
      component.setEnabled(isEditable);
      return component;
    };
  };
 
  private static final Map/*<Class, TableCellRenderer>*/ defaultRenderers=new HashMap();
  public static final void addDefaultRenderer(Class c, TableCellRenderer r) {
    defaultRenderers.put(c,r);
  };
};
