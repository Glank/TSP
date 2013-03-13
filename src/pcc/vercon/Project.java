package pcc.vercon;
import java.util.ArrayList;
import java.util.HashMap;


public class Project implements java.io.Serializable{
	private String latestVersion;
	/**
	 * version number -> project version file name
	 */
	private ArrayList<String> versions;
	private ArrayList<String> sourceFileNames;
	public  Project(){
		//TODO
	}
	public void commit(String number, String author, String reason){
		//TODO
	}
	public void addFile(String filename){
		//TODO
	}
	public void removeFile(String filename){
		//TODO
	}
	public ArrayList<String> getFiles(){
		//TODO
		return null;
	}
	public String getCurrentVersion(){
		//TODO
		return null;
	}
	public ProjectVersion getVersion(String number){
		//TODO
		return null;
	}
	public ArrayList<String> getVersionList(){
		//TODO
		return null;
	}
}
