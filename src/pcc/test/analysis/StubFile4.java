package pcc.test.analysis;

import pcc.vercon.SourceFileRecord;

public class StubFile4 extends SourceFileRecord{

	private static final long serialVersionUID = -8027964992078075233L;

	public StubFile4() {
		super(null,null);
	}
	
	@Override
	public String getName(){
		return "StubFileC.txt";
	}
	
	@Override
	public String[] getLines(){
		return new String[]{"asdlkfj", "asldkfj", "asdlkfj", "    "};
	}

}