package pcc.vercon;
import java.util.ArrayList;
import java.util.Date;


public class ProjectVersion implements java.io.Serializable
{
	private String m_number;
	private String m_reason;
	private String m_author;
	private Date m_dateCommited;
	private ArrayList<SourceFileRecord> m_files;
	
	public  ProjectVersion(String number, String author, String reason, ArrayList<String> filenames)
	{
		m_number	=	(null == number) ? "None" : number;
		m_author	=	(null == author) ? "None": author;
		m_reason	=	(null == reason) ? "None" : reason;
		
		for (int ii = 0; ii < filenames.size(); ii ++)
		{
			SourceFileRecord	srcFileRec	=	new SourceFileRecord (null, filenames.get(ii));
			m_files.add(srcFileRec);
		}
	}
	
	public String getNumber()
	{
		return (m_number);
	}
	
	public String getReason()
	{
		return (m_reason);
	}
	
	public String getAuthor()
	{
		return (m_author);
	}
	
	public ArrayList<SourceFileRecord> getFiles()
	{
		return (m_files);
	}
	
	public SourceFileRecord getFile(String name)
	{
		SourceFileRecord		retFileRec	=	null;
		
		for (int ii = 0; ii < m_files.size(); ii ++)
		{
			if (m_files.get(ii).getName().equalsIgnoreCase(name))
			{
				retFileRec	=	m_files.get(ii);
				break;
			}
		}
		
		return (retFileRec);
	}
	
	/**
	 * number, reason, author
	 */
	public String getMetaData()
	{
		String	ret		=	"Version #: ".concat(m_number).concat(" ||| Reason: ").concat(m_reason).concat(" ||| Author: ").concat(m_author);	
		
		return (ret);
	}
}
