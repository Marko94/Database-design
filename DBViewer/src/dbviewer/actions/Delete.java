package dbviewer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Delete extends MyAction{

	public Delete(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK));
		putValue(NAME,"Izbrisi iz tabele.");
		putValue(SMALL_ICON, makeIcon("icons/delete.png"));
		putValue(SHORT_DESCRIPTION,"Izbrisi iz tabele.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Delete");
	}
}
