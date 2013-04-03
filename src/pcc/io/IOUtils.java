package pcc.io;

import java.util.*;
import java.io.*;

import pcc.vercon.Project;
import pcc.vercon.ProjectVersion;

public class IOUtils {
	public static Project openProject(String fileName) throws IOException, ClassNotFoundException {
		Project		retProj = null;
		
		FileInputStream	fin	=	new FileInputStream (fileName);
		
		ObjectInputStream	ois	=	new ObjectInputStream (fin);
		
		retProj	=	(Project) ois.readObject();
		ois.close();
		
		return (retProj);
	}

	public static void saveProject(Project project, String fileName) throws IOException {
		FileOutputStream fout	=	new FileOutputStream (fileName);
		
		ObjectOutputStream oos	=	new ObjectOutputStream (fout);
		
		oos.writeObject (project);
		oos.close();
		
		
	}

	public static ProjectVersion openVersion(String fileName) throws IOException, ClassNotFoundException {
		ProjectVersion		retVersion = null;
		
		FileInputStream	fin	=	new FileInputStream (fileName);
		
		ObjectInputStream	ois	=	new ObjectInputStream (fin);
		
		retVersion	=	(ProjectVersion) ois.readObject();
		ois.close();
		
		return (retVersion);
	}

	public static void saveVersion(ProjectVersion projectVersion, String fileName) throws IOException {

		FileOutputStream fout	=	new FileOutputStream (fileName);
		
		ObjectOutputStream oos	=	new ObjectOutputStream (fout);
		
		oos.writeObject (projectVersion);
		oos.close();
	}

	public static String[] openSourceFile(String fileName) throws IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(new File(fileName)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<String> store=new ArrayList<String>();
		String line;
		while((line = reader.readLine())!=null)
		{
			String [] splitLine = line.split("\n");
			for(String x:splitLine)
			{
				store.add(x);
			}
		}
		
		reader.close();
		
		String[] lines = new String[store.size()];
		for(int i = 0; i < store.size(); i++)
			lines[i] = store.get(i);
		return lines;

	}

	public static void writeSourceFile(String dir, String fileName, String contents) throws IOException {
		fileName = dir+File.separator+fileName.substring(fileName.lastIndexOf(File.separator)+1);
		System.out.println("Writing: " + fileName);
		File file = new File(fileName);
		while(file.exists()){
			fileName = "other_"+fileName;
			file = new File(fileName);
		}
		if(!file.exists())
			file.createNewFile();
		BufferedWriter writer=null;
		FileWriter fwriter=null;
		fwriter=new FileWriter(fileName);
		writer=new BufferedWriter(fwriter);
		writer.write(contents);
		writer.newLine();
		
		writer.close();
	}
	
	public static boolean fileExists(String name) {
		File file = null;
		try{
			file = new File(name);
		}catch(Throwable t){
			return false;
		}
	    return file.exists();
	}

	public static void createFolder(String name)
	{
		File theDir = new File(name);
		  // if the directory does not exist, create it
		  if (!theDir.exists())
		  {
		  
		    boolean result = theDir.mkdir();  
		    if(result){    
		    	  System.out.println("Folder created");  
		     }

		  }
	}
	
	public static void deleteFolder(String name){
		File f = new File(name);
		if(f.exists()){
			if(f.isDirectory()) {
	            deleteFolder(f);
	        } else {
	            f.delete();
	        }
		}
	}
	
	private static void deleteFolder(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                deleteFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	    folder.delete();
	}
}
