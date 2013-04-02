package pcc.test.integration;

import pcc.vercon.SourceFileRecord;

public class StubFile1 extends SourceFileRecord{

	private static final long serialVersionUID = -8027964992078023672L;

	public StubFile1() {
		super(null,null);
	}
	
	@Override
	public String getName(){
		return "StubFileA.txt";
	}
	
	@Override
	public String[] getLines(){
		return new String[]{"start", "abcd", "defg", "\t  ", "end"};
	}

}