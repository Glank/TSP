package pcc.ui;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import pcc.io.IOUtils;
import pcc.vercon.Project;


public class Main{
	private static Project project;
	private static String projectName;
	private static Scanner in;
	public static void main(String[] args){
		//init resources
		in = new Scanner(System.in);
		while(true)
			promptMainMenu();
	}
	public static void openProject(){
		System.out.print("Enter a project name: ");
		name = in.nextLine();
		
	}
	private static void saveProject(){
		try {
			IOUtils.saveProject(project, projectName+File.separator+"project.dat");
		} catch (IOException e) {
			System.out.println("Error updating project file.");
		}
	}
	public static void promptMainMenu(){
		//print options
		System.out.println("Please select an option:");
		System.out.println("  new: Create a new project.");
		System.out.println("  open: Open an existing project.");
		System.out.println("  add: Add a file to the current project.");
		System.out.println("  rm: Remove a file from the current project.");
		System.out.println("  commit: Commit a new version of the projet.");
		System.out.println("  ecl: Export Change Label Files.");
		System.out.println("  files: Display all files in the current project.");
		System.out.println("  versions: Display all versions of the current project.");
		System.out.println("  version: Display data for a selected version.");
		System.out.println("  change: Display verion changes.");
		System.out.println("  exit: Close this program.");
		//request input
		String input = in.nextLine();
		if(input.equals("new"))
			newProject();
		else if(input.equals("open"))
			openProject();
		else if(input.equals("add"))
			addFile();
		else if(input.equals("rm"))
			removeFile();
		else if(input.equals("commit"))
			commitNewVersion();
		else if(input.equals("ecl"))
			exportChangeLables();
		else if(input.equals("files"))
			displayAllFiles();
		else if(input.equals("versions"))
			displayAllVersions();
		else if(input.equals("version"))
			displayVersionData();
		else if(input.equals("change"))
			displayVersionChanges();
		else if(input.equals("exit"))
			System.exit(0);
		else
			System.out.println("Invalid command.");
	}
	public static void newProject(){
		
	}
	public static void addFile(){
		//TODO
	}
	public static void removeFile(){
		//TODO
	}
	public static void commitNewVersion(){
		//TODO
	}
	public static void exportChangeLables(){
		//TODO
	}
	public static void displayAllFiles(){
		//TODO
	}
	public static void displayCurrentVersion(){
		//TODO
	}
	public static void displayAllVersions(){
		//TODO
	}
	public static void displayVersionData(){
		//TODO
	}
	public static void displayVersionChanges(){
		//TODO
	}
}
