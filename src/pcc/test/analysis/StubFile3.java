package pcc.test.analysis;

import pcc.vercon.SourceFileRecord;

//Version 1, A
public class StubFile3 extends SourceFileRecord{

	private static final long serialVersionUID = -8027964992078075673L;

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