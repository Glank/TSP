package pcc.test.analysis;

import java.util.ArrayList;

import pcc.vercon.ProjectVersion;
import pcc.vercon.SourceFileRecord;

public class StubVersion2 extends ProjectVersion {
	private static final long serialVersionUID = 4623446490667911804L;
	
	StubFile3 stubFileA = new StubFile3();

	public StubVersion2() {
		super("", "", "", new ArrayList<String>());
	}
	
	@Override
	public ArrayList<SourceFileRecord> getFiles(){
		ArrayList<SourceFileRecord> files = new ArrayList<SourceFileRecord>();
		files.add(stubFileA);
		return files;
	}
	
	@Override
	public SourceFileRecord getFile(String name){
		if(name.equals("StubFileA"))
			return stubFileA;
		else
			return null;
	}
	
	@Override
	public String getMetaData(){
		return "<Meta Data Version 2>";
	}
	
	
}