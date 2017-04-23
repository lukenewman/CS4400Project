import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddNewLocation extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public AddNewLocation() {
		setLayout(null);
		
		JLabel lblAddANew = new JLabel("Add a new location");
		lblAddANew.setForeground(Color.ORANGE);
		lblAddANew.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblAddANew.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddANew.setBounds(6, 6, 438, 58);
		add(lblAddANew);
		
		JLabel lblPoiLocationName = new JLabel("POI Location Name");
		lblPoiLocationName.setBounds(16, 64, 119, 16);
		add(lblPoiLocationName);
		
		textField = new JTextField();
		textField.setBounds(147, 59, 267, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(105, 101, 30, 16);
		add(lblCity);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 97, 119, 27);
		add(comboBox);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(104, 142, 31, 16);
		add(lblState);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(147, 138, 119, 27);
		add(comboBox_1);
		
		JLabel lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(81, 188, 54, 16);
		add(lblZipCode);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 183, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(38, 251, 117, 29);
		add(btnBack);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setEnabled(false);
		btnSubmit.setBounds(286, 251, 117, 29);
		add(btnSubmit);

	}

}
