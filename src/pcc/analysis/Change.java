package pcc.analysis;

public class Change implements Comparable<Change>{
	public ChangeType type;
	public String line;
	public int lineNumber;
	public Change(ChangeType type, String line, int lineNumber){
		this.type = type;
		this.line = line;
		this.lineNumber = lineNumber;
	}
	public String toString(){
		return type+" "+(lineNumber+1) + ": "+line.trim();
	}
	
	public String getLineLabel(){
		if(type==ChangeType.ADDED)
			return "/*"+type+" "+(lineNumber+1) +"*/"+line;
		else if(type==ChangeType.REMOVED)
			return "//"+toString();
		else if(type==ChangeType.CHANGED)
			return "/*"+type+" "+(lineNumber+1) +"*/"+line;
		throw new RuntimeException("Invalid Change Type");
	}
	
	@Override
	public int compareTo(Change o) {
		return lineNumber-o.lineNumber;
	}
}
