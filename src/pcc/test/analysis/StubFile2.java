package pcc.test.analysis;

import pcc.vercon.SourceFileRecord;


public class StubFile2 extends SourceFileRecord{

	private static final long serialVersionUID = -8027964992078075673L;

	public StubFile2() {
		super(null,null);
	}
	
	@Override
	public String getName(){
		return "StubFileB.txt";
	}
	
	@Override
	public String[] getLines(){
		return new String[]{"1234", "5678", "end"};
	}

}
