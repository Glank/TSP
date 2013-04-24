package pcc.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VersionListItem extends JPanel implements ActionListener{

	private static final long serialVersionUID = -8889019159234632324L;
	private JLabel versionNumber;
	private JButton showInfo;
	private PCCFrame parent;
	
	public VersionListItem(String number, PCCFrame parent){
		this.parent = parent;
		versionNumber = new JLabel(number);
		showInfo = new JButton("?");
		showInfo.addActionListener(this);
		setLayout(new BorderLayout());
		add(versionNumber, BorderLayout.WEST);
		add(showInfo, BorderLayout.EAST);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String html = Main.displayVersionData(versionNumber.getText());
		parent.setReport(html);
	}
}
