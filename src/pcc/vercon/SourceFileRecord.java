package pcc.vercon;

public class SourceFileRecord implements java.io.Serializable
{
	private static final long serialVersionUID = -6498586993955677154L;
	/**
	 * file name
	 */
	private String m_name;
	private String[] m_lines;
	
	public  SourceFileRecord(String[] lines, String name)
	{
		m_lines	=	lines;
		
		m_name	=	(name == null) ? "Unknown" : name;
	}
	
	public String getName()
	{
		return (m_name);
	}
	
	public void setName (String p_name)
	{
		m_name	=	p_name;
	}
	
	public String[] getLines()
	{
		return (m_lines);
	}
	
	public void setLines(String[] p_lines)
	{
		m_lines	=	p_lines;
	}
}
