package pcc.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileListItem extends JPanel implements ActionListener{
	private JLabel fileName;
	private String fullFileName;
	private JButton remove;
	private ComponentList parent;
	
	public FileListItem(String name, ComponentList parent){
		fullFileName = name;
		if(name.length()>30)
			name = "..."+name.substring(name.length()-33);
		fileName = new JLabel(name);
		remove = new JButton("X");
		remove.addActionListener(this);
		this.parent = parent;
		
		setLayout(new BorderLayout());
		add(fileName, BorderLayout.WEST);
		add(remove, BorderLayout.EAST);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO remove self from parent & call appropriate method in main
		Main.removeFile(fullFileName);
		parent.remove(this);
	}
}
