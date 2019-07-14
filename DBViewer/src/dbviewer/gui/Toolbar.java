package dbviewer.gui;

import javax.swing.JToolBar;

import dbviewer.DBViewer;

public class Toolbar extends JToolBar{
	
	public Toolbar(){
		add(DBViewer.getInstance().getActions().getAppend());
		add(DBViewer.getInstance().getActions().getDelete());
		add(DBViewer.getInstance().getActions().getEdit());
		add(DBViewer.getInstance().getActions().getSelect());
	}
}
