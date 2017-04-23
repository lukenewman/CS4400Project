import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;

public class PendingCityOfficials {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PendingCityOfficials window = new PendingCityOfficials();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PendingCityOfficials() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPendingCityOfficial = new JLabel("Pending City Official Accounts");
		lblPendingCityOfficial.setForeground(Color.ORANGE);
		lblPendingCityOfficial.setHorizontalAlignment(SwingConstants.CENTER);
		lblPendingCityOfficial.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblPendingCityOfficial.setBounds(22, 6, 409, 45);
		frame.getContentPane().add(lblPendingCityOfficial);
		
		table = new JTable();
		table.setBounds(6, 66, 438, 155);
		frame.getContentPane().add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(22, 233, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setEnabled(false);
		btnReject.setBounds(203, 233, 117, 29);
		frame.getContentPane().add(btnReject);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setEnabled(false);
		btnAccept.setBounds(332, 233, 117, 29);
		frame.getContentPane().add(btnAccept);
	}
}
