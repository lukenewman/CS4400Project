import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AdminOptionsPanel extends JPanel {
Application app;
	
	public AdminOptionsPanel(Application app) {
		this.app = app;
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose Functionality");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 63);
		add(lblNewLabel);
		
		JButton pendingDataPointsButton = new JButton("Pending Data Points");
		pendingDataPointsButton.setBounds(81, 94, 281, 29);
		add(pendingDataPointsButton);
		
		pendingDataPointsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showPendingDataPoints();
		  	}
		});
		
		JButton pendingCityOfficialAccountsButton = new JButton("Pending City Official Accounts");
		pendingCityOfficialAccountsButton.setBounds(81, 148, 281, 29);
		add(pendingCityOfficialAccountsButton);
		
		pendingCityOfficialAccountsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showPendingCityOfficialAccounts();
		  	}
		});
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(289, 239, 117, 29);
		add(btnLogOut);
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showLogin();
		  	}
		});
	}
}
