package dbviewer.actions;

import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class MyAction extends AbstractAction{

	public Icon makeIcon(String name){
		
		URL iconURL =getClass().getResource(name);
		Icon icon = null;
		
		if(iconURL!= null)
			icon = new ImageIcon(iconURL);
		else
			System.err.println("GRESKA!");
			
		return icon;		
	}

}
