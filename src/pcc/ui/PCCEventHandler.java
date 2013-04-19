package pcc.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PCCEventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO handle all PCCFrame events
		System.out.println("Event: " + e.getActionCommand());
	}

}
