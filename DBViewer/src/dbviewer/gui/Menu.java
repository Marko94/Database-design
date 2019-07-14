package dbviewer.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Menu extends JMenuBar{
	 public Menu(){
		 JMenu file = new JMenu("File");
		 JMenu window = new JMenu("Window");
		 JMenu help = new JMenu("Help");
		 
		 add(file);
		 add(window);
		 add(help);
	 }
	 
}
