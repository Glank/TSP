package pcc.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileListItem extends JPanel implements ActionListener{
	private JLabel fileName;
	private JButton remove;
	private ComponentList parent;
	
	public FileListItem(String fileName, ComponentList parent){
		//TODO
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO remove self from parent & call appropriate method in main
	}
}
