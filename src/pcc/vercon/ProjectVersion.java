package pcc.vercon;
import java.util.ArrayList;
import java.util.Date;


public class ProjectVersion implements java.io.Serializable{
	private String number;
	private String reason;
	private String author;
	private Date dateCommited;
	private ArrayList<SourceFileRecord> files;
	public  ProjectVersion(String number, String author, String reason, ArrayList<String> filenames){
		//TODO
	}
	public String getNumber(){
		//TODO
		return null;
	}
	public String getReason(){
		//TODO
		return null;
	}
	public String getAuthor(){
		//TODO
		return null;
	}
	public ArrayList<SourceFileRecord> getFiles(){
		//TODO
		return null;
	}
	public SourceFileRecord getFile(String name){
		//TODO
		return null;
	}
	/**
	 * name, reason, author
	 */
	public String getMetaData(){
		//TODO
		return null;
	}
}
