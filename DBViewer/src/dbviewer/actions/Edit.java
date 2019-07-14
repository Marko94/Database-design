package dbviewer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Edit extends MyAction{

	public Edit(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
		putValue(NAME,"Edituj.");
		putValue(SMALL_ICON, makeIcon("icons/edit.png"));
		putValue(SHORT_DESCRIPTION,"Edituj.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Edit");
	}

}
