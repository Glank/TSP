package pcc.ui;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import pcc.analysis.ChangeCounterUtils;
import pcc.io.IOUtils;
import pcc.vercon.Project;
import pcc.vercon.ProjectVersion;


public class Main{
	public static Project project;
	public static String projectName;
	public static PCCFrame frame;
	public static void main(String[] args){
		//init resources
		frame = new PCCFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void openProject(){
		projectName = JOptionPane.showInputDialog("Project name: ");
		try {
			project = IOUtils.openProject(projectName+File.separator+"project.dat");
		} catch (Throwable t){
			JOptionPane.showMessageDialog(null,"Error opening project file.");
		}
	}
	private static void saveProject(){
		if(project==null)
			return;
		try {
			File dir = new File(projectName);
			if(!dir.exists())
				IOUtils.createFolder(projectName);
			IOUtils.saveProject(project, projectName+File.separator+"project.dat");
		} catch (Throwable t) {
			JOptionPane.showMessageDialog(null,"Error updating project file.");
		}
	}
	public static void explicitSave(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		saveProject();
	}
	public static void newProject(){
		projectName = JOptionPane.showInputDialog("Project name: ");
		if(!projectName.matches("[a-zA-Z0-9_]+"))
			JOptionPane.showMessageDialog(null,"Invalid name entered: letters and underscores only.");
		else{
			if((new File(projectName)).exists())
				JOptionPane.showMessageDialog(null,"A folder/file with the given name already exists.");
			else{
				project = new Project();
				saveProject();
			}
		}
	}
	public static void addFile(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		JFileChooser jfc = new JFileChooser();
		int result = jfc.showOpenDialog(null);
		if(result==JFileChooser.CANCEL_OPTION)
			return;
		File file = jfc.getSelectedFile();
		if(!file.exists()){
			JOptionPane.showMessageDialog(null,"Error adding file.");
			return;
		}
		for(String fn:project.getFiles()){
			File ofile = new File(fn);
			if(file.equals(ofile)){
				JOptionPane.showMessageDialog(null,"That file is already being monitored: see \"files\"");
				return;
			}
		}
		project.addFile(file.getAbsolutePath());
		saveProject();
	}
	public static void removeFile(String name){
		if(!project.removeFile(name))
			JOptionPane.showMessageDialog(frame, "File Not Found!");
		saveProject();
	}
	public static void commitNewVersion(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		String number = JOptionPane.showInputDialog("Version number: ");
		if(project.getVersion(number)!=null){
			JOptionPane.showMessageDialog(null,"That version already exists: see \"versions\"");
			return;
		}
		String author = JOptionPane.showInputDialog("Author name: ");
		String reason = JOptionPane.showInputDialog("Reason for commit: ");
		try {
			project.commit(number, author, reason);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Error commiting source files.");
		}
		saveProject();
	}
	public static void exportChangeLables(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		String version1 = JOptionPane.showInputDialog("First version: ");
		ProjectVersion v1 = project.getVersion(version1);
		if(v1==null){
			JOptionPane.showMessageDialog(null,"Invalid version number.");
			return;
		}
		String version2 = JOptionPane.showInputDialog("Last version: ");
		ProjectVersion v2 = project.getVersion(version2);
		if(v2==null){
			JOptionPane.showMessageDialog(null,"Invalid version number.");
			return;
		}
		JFileChooser jfc = new JFileChooser();
		jfc.setFileFilter(new FileFilter(){
			@Override
			public boolean accept(File f) {
				return f.isDirectory();
			}
			@Override
			public String getDescription() {
				return "";
			}
		});
		int result = jfc.showSaveDialog(null);
		if(result==JOptionPane.CANCEL_OPTION)
			return;
		String dir = jfc.getSelectedFile().getAbsolutePath();
		try {
			if(IOUtils.fileExists(dir)){
				int response = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete all files in this directory?");
				if(response!=JOptionPane.YES_OPTION)
					return;
				IOUtils.deleteFolder(dir);
			}
			ChangeCounterUtils.exportChangeLabels(dir,
					project.getVersion(version1), project.getVersion(version2));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Error exporting change labels.");
		}
	}
	public static void displayAllFiles(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		for(String fn:project.getFiles())
			System.out.println(fn);
	}
	public static void displayCurrentVersion(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		System.out.println(project.getCurrentVersion());
	}
	public static void displayAllVersions(){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		for(String v:project.getVersionList())
			System.out.println(v);
	}
	public static String displayVersionData(String number){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return "";
		}
		ProjectVersion version = project.getVersion(number);
		String ret = "";
		if(version==null)
			JOptionPane.showMessageDialog(null,"Invalid version number: see \"versions\"");
		else{
			ret+="<html>"+version.getMetaData();
			ret+="<br>Total LLOC: "+ChangeCounterUtils.getLLOC(version);
			ret+="</br></html>";
		}
		return ret;
	}
	public static void displayVersionChanges(boolean shortReport){
		if(project==null){
			JOptionPane.showMessageDialog(null,"Please open or create a project first.");
			return;
		}
		String version1 = JOptionPane.showInputDialog("First version: ");
		ProjectVersion v1 = project.getVersion(version1);
		if(v1==null){
			JOptionPane.showMessageDialog(null,"Invalid version number.");
			return;
		}
		String version2 = JOptionPane.showInputDialog("Last version: ");
		ProjectVersion v2 = project.getVersion(version2);
		if(v2==null){
			JOptionPane.showMessageDialog(null,"Invalid version number.");
			return;
		}
		String report = "";
		if(shortReport)
			report = ChangeCounterUtils.getLLOCChanges(v1, v2);
		else
			report = ChangeCounterUtils.getLineChangesReport(v1, v2);
		System.out.println(report);
	}
}
