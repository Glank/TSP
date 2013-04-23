package pcc.ui;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pcc.analysis.ChangeCounterUtils;
import pcc.io.IOUtils;
import pcc.vercon.Project;
import pcc.vercon.ProjectVersion;


public class Main{
	public static Project project;
	public static String projectName;
	public static PCCFrame frame;
	private static Scanner in;
	public static void main(String[] args){
		//init resources
		in = new Scanner(System.in);
		frame = new PCCFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void openProject(){
		System.out.print("Project name: ");
		projectName = in.nextLine();
		try {
			project = IOUtils.openProject(projectName+File.separator+"project.dat");
		} catch (Throwable t){
			t.printStackTrace();
			System.out.println("Error opening project file.");
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
			t.printStackTrace();
			System.out.println("Error updating project file.");
		}
	}
	public static void explicitSave(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		saveProject();
	}
	public static void newProject(){
		System.out.print("Project name: ");
		projectName = in.nextLine();
		if(!projectName.matches("[a-zA-Z0_9_]+"))
			System.out.println("Invalid name entered: letters and underscores only.");
		else{
			if((new File(projectName)).exists())
				System.out.println("A folder/file with the given name already exists.");
			else{
				project = new Project();
				saveProject();
			}
		}
	}
	public static void addFile(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		System.out.print("File name: ");
		String name = in.nextLine();
		try{
			File file = new File(name);
			if(!file.exists())
				throw new RuntimeException();
		}
		catch(Throwable t){
			System.out.println("Error adding file.");
			return;
		}
		for(String fn:project.getFiles())
			if(fn.equalsIgnoreCase(name)){
				System.out.println("That file is already being monitored: see \"files\"");
				return;
			}
		project.addFile(name);
		saveProject();
	}
	public static void removeFile(String name){
		if(!project.removeFile(name))
			JOptionPane.showMessageDialog(frame, "File Not Found!");
		saveProject();
	}
	public static void commitNewVersion(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		System.out.print("Version number: ");
		String number = in.nextLine();
		if(project.getVersion(number)!=null){
			System.out.println("That version already exists: see \"versions\"");
			return;
		}
		System.out.print("Author name: ");
		String author = in.nextLine();
		System.out.print("Reason for commit: ");
		String reason = in.nextLine();
		try {
			project.commit(number, author, reason);
		} catch (IOException e) {
			System.out.println("Error commiting source files.");
		}
		saveProject();
	}
	public static void exportChangeLables(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		System.out.print("First version: ");
		String version1 = in.nextLine();
		System.out.print("Last version: ");
		String version2 = in.nextLine();
		System.out.print("Output directory: ");
		String dir = in.nextLine();
		try {
			if(IOUtils.fileExists(dir)){
				System.out.println("Are you sure you want to delete all files in this directory? (N/y)");
				String confirm = in.nextLine();
				if(!confirm.matches("([yY])|([yY][eE][sS])"))
					return;
				IOUtils.deleteFolder(dir);
			}
			ChangeCounterUtils.exportChangeLabels(dir,
					project.getVersion(version1), project.getVersion(version2));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error exporting change labels.");
		}
	}
	public static void displayAllFiles(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		for(String fn:project.getFiles())
			System.out.println(fn);
	}
	public static void displayCurrentVersion(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		System.out.println(project.getCurrentVersion());
	}
	public static void displayAllVersions(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		for(String v:project.getVersionList())
			System.out.println(v);
	}
	public static void displayVersionData(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		System.out.print("Version: ");
		String number = in.nextLine();
		ProjectVersion version = project.getVersion(number);
		if(version==null)
			System.out.println("Invalid version number: see \"versions\"");
		else{
			System.out.println(version.getMetaData());
			System.out.println("Total LLOC: "+ChangeCounterUtils.getLLOC(version));
		}
	}
	public static void displayVersionChanges(){
		if(project==null){
			System.out.println("Please open or create a project first.");
			return;
		}
		System.out.print("[S]hort or [L]ong report? ");
		String type = in.nextLine();
		if(!type.matches("[sSlL]")){
			System.out.println("Invalid report type.");
			return;
		}
		System.out.print("First version: ");
		String version1 = in.nextLine();
		ProjectVersion v1 = project.getVersion(version1);
		if(v1==null){
			System.out.println("Invalid version number.");
			return;
		}
		System.out.print("Last version: ");
		String version2 = in.nextLine();
		ProjectVersion v2 = project.getVersion(version2);
		if(v2==null){
			System.out.println("Invalid version number.");
			return;
		}
		
		String report = "";
		if(type.matches("[sS]"))
			report = ChangeCounterUtils.getLLOCChanges(v1, v2);
		else
			report = ChangeCounterUtils.getLineChangesReport(v1, v2);
		System.out.println(report);
	}
}
