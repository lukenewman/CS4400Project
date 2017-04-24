import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class PendingDataPoints extends JPanel {
	Application app;
	
	private JTable table;

	public PendingDataPoints(Application app) {
		this.app = app;
		
		setLayout(null);
		
		JLabel lblPendingDataPoints = new JLabel("Pending Data Points");
		lblPendingDataPoints.setBounds(92, 6, 260, 54);
		lblPendingDataPoints.setForeground(Color.ORANGE);
		lblPendingDataPoints.setHorizontalAlignment(SwingConstants.CENTER);
		lblPendingDataPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		add(lblPendingDataPoints);
		
		table = new JTable();
		table.setBounds(6, 61, 438, 171);
		table.setBackground(new Color(105, 105, 105));
		add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(26, 244, 117, 29);
		add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showAdminOptionsPanel();
		  	}
		});
		
		JButton btnReject = new JButton("Reject");
		btnReject.setEnabled(false);
		btnReject.setBounds(199, 244, 117, 29);
		add(btnReject);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setEnabled(false);
		btnAccept.setBounds(327, 244, 117, 29);
		add(btnAccept);
	}
}
