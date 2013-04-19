package pcc.ui;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PCCFrame extends JFrame{
	private static final long serialVersionUID = -5411538418780791931L;
	private JMenu file, analysis;
	private JMenuItem newProj, open;
	private JMenuItem shortReport, longReport, exportChangeLabels;
	private JPanel files, versions;
	private ComponentList fileList, versionList;
	private JButton addFile, commit;
	private JEditorPane reports;
	private PCCEventHandler eventHandler;
	
	public PCCFrame(){
		//TODO
		//init components
		//call update
	}
	
	public void update(){
		//TODO
		//reset fileList and versionList
		//clear report field
	}
}
