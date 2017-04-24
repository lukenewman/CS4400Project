import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CityScientistOptionsPanel extends JPanel {

	public CityScientistOptionsPanel() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose Functionality");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 63);
		add(lblNewLabel);

		JButton addNewDataPointButton = new JButton("Add New Data Point");
		addNewDataPointButton.setBounds(114, 94, 217, 29);
		add(addNewDataPointButton);

		JButton addNewLocationButton = new JButton("Add New Location");
		addNewLocationButton.setBounds(167, 148, 117, 29);
		add(addNewLocationButton);

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(289, 239, 117, 29);
		add(btnLogOut);
	}

}
