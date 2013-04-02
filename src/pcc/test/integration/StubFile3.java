package pcc.test.integration;

import pcc.vercon.SourceFileRecord;

public class StubFile3 extends SourceFileRecord{

	private static final long serialVersionUID = -8027923992078075673L;

	public StubFile3() {
		super(null,null);
	}
	
	@Override
	public String getName(){
		return "StubFileA.txt";
	}
	
	@Override
	public String[] getLines(){
		return new String[]{"abcd", "abcd", "defg", "end"};
	}

}