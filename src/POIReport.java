import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;

public class POIReport extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public POIReport() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("POI Report");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 625, 48);
		add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(6, 66, 625, 270);
		add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(259, 370, 117, 29);
		add(btnBack);

	}

}
