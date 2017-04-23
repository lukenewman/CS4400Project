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
import java.awt.Component;
import javax.swing.Box;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class PendingDataPoints {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PendingDataPoints window = new PendingDataPoints();
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
	public PendingDataPoints() {
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
		
		JLabel lblPendingDataPoints = new JLabel("Pending Data Points");
		lblPendingDataPoints.setBounds(92, 6, 260, 54);
		lblPendingDataPoints.setForeground(Color.ORANGE);
		lblPendingDataPoints.setHorizontalAlignment(SwingConstants.CENTER);
		lblPendingDataPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		frame.getContentPane().add(lblPendingDataPoints);
		
		table = new JTable();
		table.setBounds(6, 61, 438, 171);
		table.setBackground(new Color(105, 105, 105));
		frame.getContentPane().add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(26, 244, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setEnabled(false);
		btnReject.setBounds(199, 244, 117, 29);
		frame.getContentPane().add(btnReject);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setEnabled(false);
		btnAccept.setBounds(327, 244, 117, 29);
		frame.getContentPane().add(btnAccept);
	}
}
