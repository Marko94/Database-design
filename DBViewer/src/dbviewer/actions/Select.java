package dbviewer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Select extends MyAction{

	public Select(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		putValue(NAME,"Selektuj u tabeli.");
		putValue(SMALL_ICON, makeIcon("icons/select.png"));
		putValue(SHORT_DESCRIPTION,"Selektuj u tabeli");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Select");
	}
}
