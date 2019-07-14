package dbviewer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Append extends MyAction{

	public Append(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
		putValue(NAME,"Dodaj u tabelu.");
		putValue(SMALL_ICON, makeIcon("icons/append.png"));
		putValue(SHORT_DESCRIPTION,"Dodaj u tabelu.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Append");
	}
}
