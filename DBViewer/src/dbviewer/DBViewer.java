package dbviewer;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import dbviewer.actions.Actions;
import dbviewer.gui.Menu;
import dbviewer.gui.Toolbar;

public class DBViewer extends JFrame {
	
	private static DBViewer instance = null;
	public ImageIcon icon = new ImageIcon("logo.png");
	private Actions actions;
	private Menu menu;
	private Toolbar toolbar;
	//private Paleta paleta;
	//private WorkspaceModel workspaceModel;
	//private WorkspaceDrvo workspaceTree ;
	private JDesktopPane desktopPane1, desktopPane2;
	private JLabel label;
	private int mod = 0;
	private DBViewer(){}
	
	public static DBViewer getInstance(){
		if (instance==null){
			instance = new DBViewer();
			instance.initialize();
		}
		return instance;
	}
	
	//inicijalizacija prozora sa GUI-jem
	private void initialize(){
	setTitle("DBViewer");
	setIconImage(icon.getImage());
	setSize(1300,800);
	setLocationRelativeTo(null);
	
	actions = new Actions();
	menu = new Menu();
	toolbar = new Toolbar();
	desktopPane1 = new JDesktopPane();
	desktopPane2 = new JDesktopPane();
	JTabbedPane topTabbedPane = new JTabbedPane();
	topTabbedPane.addTab("Parent Tab 1", null, desktopPane1,
	                  "Does nothing");
	topTabbedPane.addTab("Parent Tab 2", null, new JDesktopPane(),
            "Does nothing");
	JTabbedPane botTabbedPane = new JTabbedPane();
	botTabbedPane.addTab("Child Tab 1", null, desktopPane2,
            "Does something");
	JSplitPane viewSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topTabbedPane, botTabbedPane);
	viewSplitPane.setDividerLocation(350);
	
	//desktopPane.addKeyListener(new MojKeyListener());
	//desktopPane.setComponentPopupMenu(new PopupMeniDesktopPane());
	//paleta = new Paleta();
	label = new JLabel();
	label.setPreferredSize(new Dimension(1000,20));
	label.setHorizontalAlignment(JLabel.CENTER);
	//workspaceModel = new WorkspaceModel();
	setJMenuBar(new Menu());
	getContentPane().add(new Toolbar(), BorderLayout.NORTH);
	//getContentPane().add(new Paleta(), BorderLayout.EAST);
	//workspaceTree = new WorkspaceDrvo();
	//workspaceTree.setModel(workspaceModel);
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setMinimumSize(new Dimension(150,500));
	JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, viewSplitPane);
	
	splitPane.setDividerLocation(300);
	add(splitPane);
	add(label,BorderLayout.SOUTH);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);	
	}
	
	
	public JLabel getLabel() {
		return label;
	}
	public Menu getMeni() {
		return menu;
	}
	public Toolbar getToolbar() {
		return toolbar;
	}
	/*
		public Paleta getPaleta() {
			return paleta;
	}
	*/
	/*
	 public WorkspaceDrvo getWorkspaceTree() {
		return workspaceTree;
	 }
	 */
	public JDesktopPane getDesktopPane() {
		return desktopPane1;
	}
	
	  	public Actions getActions() {
			return actions;
	}
	
	public int getMod() {
		return mod;
	}
	
}
