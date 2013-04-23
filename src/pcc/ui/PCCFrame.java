package pcc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class PCCFrame extends JFrame{
	private static final long serialVersionUID = -5411538418780791931L;
	private JMenu file, analysis;
	private JMenuItem newProj, open;
	private JMenuItem shortReport, longReport, exportChangeLabels;
	private JPanel files, versions;
	private ComponentList fileList, versionList;
	private JButton addFile, commit;
	private JScrollPane reportsPane;
	private JEditorPane reports;
	private PCCEventHandler eventHandler;
	
	public PCCFrame(){
		eventHandler = new PCCEventHandler(this);
		
		//init components
		initMenuBar();
		initFilesPanel();
		initVersionsPanel();
		initReportsPane();
		
		//init content pane
		JSplitPane left = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		left.setTopComponent(files);
		left.setBottomComponent(versions);
		left.setDividerLocation(200);
		JSplitPane main = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		main.setLeftComponent(left);
		main.setRightComponent(reportsPane);
		main.setDividerLocation(240);
		add(main, BorderLayout.CENTER);
		
		String initReport = 
			"<html><center>"+
			"<h1>Welcome</h1>"+
			"<br>Please create a new project or open an existing project from the file menu.</br>"+
			"</center></html>";
		setReport(initReport);
		
		setSize(new Dimension(640, 480));
	}
	
	private void initMenuBar(){
		initFileMenu();
		initAnalysisMenu();
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file);
		menuBar.add(analysis);
		System.out.println("Reached.");
		setJMenuBar(menuBar);
	}
	
	private void initFileMenu(){
		file = new JMenu("File");
		newProj = new JMenuItem("New Project");
		newProj.addActionListener(eventHandler);
		file.add(newProj);
		open = new JMenuItem("Open Project");
		open.addActionListener(eventHandler);
		file.add(open);
	}
	
	private void initAnalysisMenu(){
		analysis = new JMenu("Analysis");
		shortReport = new JMenuItem("Short Report");
		shortReport.addActionListener(eventHandler);
		analysis.add(shortReport);
		longReport = new JMenuItem("Long Report");
		longReport.addActionListener(eventHandler);
		analysis.add(longReport);
		exportChangeLabels = new JMenuItem("Export Change Labels");
		exportChangeLabels.addActionListener(eventHandler);
		analysis.add(exportChangeLabels);
	}
	
	private void initFilesPanel(){
		files = new JPanel(new BorderLayout());
		fileList = new ComponentList();
		files.add(fileList, BorderLayout.CENTER);
		addFile = new JButton("Add File");
		addFile.addActionListener(eventHandler);
		files.add(addFile, BorderLayout.SOUTH);
	}
	
	private void initVersionsPanel(){
		versions = new JPanel(new BorderLayout());
		versionList = new ComponentList();
		versions.add(versionList, BorderLayout.CENTER);
		commit = new JButton("Commit");
		commit.addActionListener(eventHandler);
		versions.add(commit, BorderLayout.SOUTH);
	}
	
	private void initReportsPane(){
		reports = new JEditorPane();
		reports.setEditable(false);
		reports.setContentType("text/html");
		reportsPane = new JScrollPane(reports);
	}
	
	public void setReport(String html){
		reports.setText(html);
	}
	
	public void update(){
		//TODO
		//reset fileList and versionList
		fileList.removeAll();
		for(String fileName:Main.project.getFiles())
			fileList.add(new FileListItem(fileName, fileList));
		//clear report field
	}
}
