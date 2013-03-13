package pcc.analysis;
import java.util.LinkedList;

import pcc.vercon.ProjectVersion;


public class ChangeCounterUtils{
	private static LinkedList<Change> getChanges(String[] old, String[] cur){
		//TODO
		return null;
	}
	private static int countAdded(String[] old, String[] cur){
		//TODO
		return 0;
	}
	private static int countRemoved(String[] old, String[] cur){
		//TODO
		return 0;
	}
	private static void exportChangeLabels(String[] old, String[] cur, String lableFileName){
		//TODO
	}
	public static void exportChangeLabels(String toDirName, ProjectVersion v1, ProjectVersion v2){
		//TODO
	}
	public static String getLineChangesReport(ProjectVersion v1, ProjectVersion v2){
		//TODO
		return null;
	}
	public static int getLLOC(ProjectVersion version){
		//TODO
		return 0;
	}
	public static String getLOCChanges(ProjectVersion v1, ProjectVersion v2){
		//TODO
		return null;
	}
}
