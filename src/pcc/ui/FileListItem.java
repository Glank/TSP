package pcc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
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
		if(name.length()>25)
			name = "..."+name.substring(name.length()-22);
		fileName = new JLabel(name);
		remove = new JButton("X");
		remove.addActionListener(this);
		this.parent = parent;
		
		setLayout(new BorderLayout());
		add(fileName, BorderLayout.WEST);
		add(remove, BorderLayout.EAST);
	}
	
	@Override
	public void paint(Graphics graphics){
		Dimension d = getSize();
		//System.out.println("Reached 1");
		Graphics g = fileName.getGraphics();
		int i = 0;
		String substring = fullFileName.substring(i);
		int strWidth = (int) g.getFontMetrics().getStringBounds(substring, g).getWidth();
		while(strWidth>(d.getWidth()-remove.getWidth()-2) && i<=fullFileName.length()){
			i++;
			if(i<=fullFileName.length()){
				substring = fullFileName.substring(i);
				strWidth = (int) g.getFontMetrics().getStringBounds(substring, g).getWidth();
			}
		}
		if(i!=0){
			substring = "..."+fullFileName.substring(
					Math.min(i+2, fullFileName.length()));
		}
		else
			substring = fullFileName;
		fileName.setText(substring);
		super.paint(graphics);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO remove self from parent & call appropriate method in main
		Main.removeFile(fullFileName);
		parent.remove(this);
	}
}
