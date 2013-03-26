package pcc.io;

import java.nio.*;
import java.util.*;
import java.io.*;

import pcc.vercon.Project;
import pcc.vercon.ProjectVersion;

public class IOUtils {

	public static Project openProject(String fileName) {
		Project		retProject = null;
		
		File f=new File(fileName);
		if(f.exists())
		{
			
		}
	
		return (retProject);
	}

	public static void saveProject(Project project, String fileName) throws IOException {
		FileOutputStream fout	=	new FileOutputStream (fileName);
		
		ObjectOutputStream oos	=	new ObjectOutputStream (fout);
		
		oos.writeObject (project);
		oos.close();
		
		
	}

	public static ProjectVersion openVersion(String fileName) {
		ProjectVersion		retVersion = null;
		
		File f=new File(fileName);
		
		if(f.exists())
		{
			
		}
		
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
				store.add(line);
			}
		}
		
		String [] sourceCode=(String[]) store.toArray();
		return sourceCode;

	}

	public static void writeSourceFile(String fileName, String contents) {
		
		BufferedWriter writer=null;
		FileWriter fwriter=null;
		try{
			fwriter=new FileWriter(fileName);
			writer=new BufferedWriter(fwriter);
			writer.write(contents);
			writer.newLine();
			
			writer.close();
		}catch (Exception e)
		{
			
		}
		
		
		
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
}
