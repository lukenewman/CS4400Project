import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class screen2 {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public screen2() {
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
		
		JLabel lblChooseFunctionality = new JLabel("Choose Functionality");
		lblChooseFunctionality.setForeground(Color.ORANGE);
		lblChooseFunctionality.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblChooseFunctionality.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseFunctionality.setBounds(54, 6, 329, 76);
		frame.getContentPane().add(lblChooseFunctionality);
		
		JButton btnPendingDataPoints = new JButton("Pending Data Points");
		btnPendingDataPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPendingDataPoints.setBounds(115, 105, 207, 36);
		frame.getContentPane().add(btnPendingDataPoints);
		
		JButton btnNewButton = new JButton("Pending City Official Accounts");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.setBounds(83, 153, 273, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBackground(Color.GRAY);
		btnLogOut.setBounds(287, 229, 117, 29);
		frame.getContentPane().add(btnLogOut);
	}
}
