package pcc.vercon;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.util.Iterator;


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
		m_files		=	new ArrayList<SourceFileRecord>();
		
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
	
	public boolean setLinesForFile (String fileName, String [] lines)
	{
		boolean				found			=	false;
		
		if (fileName == null || fileName.isEmpty())
		{
			return found;
		}
		
		//
		// Find the src-file-record for this file-name and set these lines for that.
		// --> this can be in the constructor itself where it can take a hashmap of filename to lines of code.
		//
		SourceFileRecord	thisSrcFileRec	=	null;
		
		for (int ii = 0; ii < m_files.size(); ii ++)
		{
			if ( (thisSrcFileRec = m_files.get(ii)).getName().equalsIgnoreCase(fileName))
			{
				thisSrcFileRec.setLines(lines);
				
				found	=	true;

				break;
				
			}
		}

		return (found);
	}
	
	public boolean setLinesForFiles ( HashMap<String, String []> filesAndLines)
	{
		boolean				found			=	false;
		
		if (filesAndLines == null || filesAndLines.isEmpty())
		{
			return found;
		}
		
		//
		// Find the src-file-record for this file-name and set these lines for that.
		// --> this can be in the constructor itself where it can take a hashmap of filename to lines of code.
		//
		String				curFileName		=	null;
		String[]			curLines		=	null;
		
		for (Map.Entry<String, String[]> entry : filesAndLines.entrySet())
		{
	
			curFileName	=	entry.getKey();
			curLines	=	entry.getValue();

			// Very unoptimized - but good enough for now..
			setLinesForFile(curFileName, curLines);
		}

		if (null != curFileName)
		{
			found	=	true;
		}
		
		return (found);
	}
	
}
