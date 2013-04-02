package pcc.test.integration;

import java.io.IOException;
import java.util.ArrayList;

import pcc.vercon.Project;
import pcc.vercon.ProjectVersion;

public class StubProject extends Project{
	private static final long serialVersionUID = 6364161573515140719L;
	private ProjectVersion v1,v2;
	
	public StubProject(){
		try {
			v1 = new StubVersion1();
			v2 = new StubVersion2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public ProjectVersion getVersion(String num){
		if(num.equals("1"))
			return v1;
		else if(num.equals("2"))
			return v2;
		throw new RuntimeException("Invalid Version.");
	}
	
	@Override
	public ArrayList<String> getVersionList(){
		ArrayList<String> versions = new ArrayList<String>();
		versions.add("1");
		versions.add("2");
		return versions;
	}
}
