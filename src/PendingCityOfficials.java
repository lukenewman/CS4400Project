import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PendingCityOfficials extends JPanel {
	Application app;
	
	private JTable table;

	public PendingCityOfficials(Application app) {
		this.app = app;
		
		setLayout(null);
		
		JLabel lblPendingCityOfficial = new JLabel("Pending City Official Accounts");
		lblPendingCityOfficial.setForeground(Color.ORANGE);
		lblPendingCityOfficial.setHorizontalAlignment(SwingConstants.CENTER);
		lblPendingCityOfficial.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblPendingCityOfficial.setBounds(22, 6, 409, 45);
		add(lblPendingCityOfficial);
		
		table = new JTable();
		table.setBounds(6, 66, 438, 155);
		add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(22, 233, 117, 29);
		add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showAdminOptionsPanel();
		  	}
		});
		
		JButton btnReject = new JButton("Reject");
		btnReject.setEnabled(false);
		btnReject.setBounds(203, 233, 117, 29);
		add(btnReject);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setEnabled(false);
		btnAccept.setBounds(332, 233, 117, 29);
		add(btnAccept);
	}
}
