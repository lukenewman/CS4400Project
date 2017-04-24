import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddDataPointPanel extends JPanel implements ActionListener {
	private JTextField textField;
	Application app;

	public AddDataPointPanel(Application app) throws SQLException {
		this.app = app;

		setLayout(null);

		JLabel lblAddANew = new JLabel("Add a new data point");
		lblAddANew.setForeground(Color.ORANGE);
		lblAddANew.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblAddANew.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddANew.setBounds(6, 6, 438, 53);
		add(lblAddANew);

		JLabel lblPoiLocationName = new JLabel("POI location name:");
		lblPoiLocationName.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblPoiLocationName.setBounds(77, 71, 107, 16);
		add(lblPoiLocationName);

		ResultSet rs = DatabaseConnection.sharedConnection().executeQuery("SELECT DISTINCT Name FROM POI");
		int rowCount = 0;
		List tmp = new List();
		while (rs.next()) {
			tmp.add(rs.getString(1));
			rowCount++;
		}
		String[] options = new String[rowCount];
		for (int i = 0; i < rowCount; i++) {
			options[i] = tmp.getItem(i);
		}
		JComboBox<String> comboBox = new JComboBox<String>(options);
		comboBox.setBounds(196, 67, 103, 27);
		add(comboBox);

		JButton btnAddANew = new JButton("Add new location");
		btnAddANew.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnAddANew.setBounds(311, 66, 117, 29);
		add(btnAddANew);

		btnAddANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showAddLocationPanel();
			}
		});

		JLabel lblTimeAndDate = new JLabel("time and date of data reading:");
		lblTimeAndDate.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblTimeAndDate.setBounds(6, 109, 178, 16);
		add(lblTimeAndDate);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08",
				"09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
				"26", "27", "28", "29", "30", "31" }));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(247, 105, 52, 27);
		add(comboBox_1);

		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		comboBox_2.setBounds(196, 105, 52, 27);
		add(comboBox_2);

		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005",
				"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
		comboBox_3.setBounds(300, 105, 52, 27);
		add(comboBox_3);

		JLabel lblDd = new JLabel("dd");
		lblDd.setHorizontalAlignment(SwingConstants.CENTER);
		lblDd.setBounds(257, 131, 26, 16);
		add(lblDd);

		JLabel lblMm = new JLabel("mm");
		lblMm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMm.setBounds(201, 131, 34, 16);
		add(lblMm);

		JLabel lblYyyy = new JLabel("yyyy");
		lblYyyy.setHorizontalAlignment(SwingConstants.CENTER);
		lblYyyy.setBounds(307, 131, 34, 16);
		add(lblYyyy);

		JLabel lblDataType = new JLabel("Data type:");
		lblDataType.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblDataType.setBounds(123, 213, 61, 16);
		add(lblDataType);

		ResultSet rs2 = DatabaseConnection.sharedConnection().executeQuery("SELECT * FROM Data_Type");
		int rowCount2 = 0;
		List tmp2 = new List();
		while (rs2.next()) {
			tmp2.add(rs2.getString(1));
			rowCount2++;
		}
		String[] options2 = new String[rowCount2];
		for (int i = 0; i < rowCount2; i++) {
			options2[i] = tmp2.getItem(i);
		}
		JComboBox<String> comboBox_4 = new JComboBox<String>(options2);
		comboBox_4.setBounds(197, 209, 75, 27);
		add(comboBox_4);

		JComboBox<String> comboBox_5 = new JComboBox<String>();
		comboBox_5.setModel(new DefaultComboBoxModel<String>(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_5.setBounds(211, 159, 52, 27);
		add(comboBox_5);

		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setModel(new DefaultComboBoxModel<String>(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		comboBox_6.setBounds(267, 159, 52, 27);
		add(comboBox_6);

		JComboBox<String> comboBox_7 = new JComboBox<String>();
		comboBox_7.setModel(new DefaultComboBoxModel<String>(new String[] { "AM", "PM" }));
		comboBox_7.setSelectedIndex(0);
		comboBox_7.setBounds(331, 159, 61, 27);
		add(comboBox_7);

		JLabel lblHour = new JLabel("hour");
		lblHour.setBounds(221, 187, 34, 16);
		add(lblHour);

		JLabel lblMinute = new JLabel("minute");
		lblMinute.setBounds(277, 187, 44, 16);
		add(lblMinute);

		JLabel lblDataValue = new JLabel("Data value:");
		lblDataValue.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblDataValue.setBounds(119, 241, 65, 16);
		add(lblDataValue);

		textField = new JTextField();
		textField.setBounds(201, 236, 227, 26);
		add(textField);
		textField.setColumns(10);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(46, 265, 117, 29);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showCityScientistOptions();
			}
		});

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(235, 265, 117, 29);
		add(btnSubmit);

		btnSubmit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Please ensure all relevant fields are filled out.", "Missing Field(s)",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
//		
//		// Register with the database.
//		User newUser = new User();
//		newUser.setUsername(usernameTextField.getText());
//		newUser.setEmailAddress(emailAddressTextField.getText());
//		newUser.setPassword(new String(passwordField.getPassword()));
//		newUser.setUserType((String) userTypeComboBox.getSelectedItem());
//		boolean success = DatabaseConnection.sharedConnection().registerUser(newUser);
//		if (success) {
//			if (newUser.getUserType().equals("City_Scientist")) {
//				app.showCityScientistOptions();
//			} else {
//				app.showCityOfficialOptions();
//			}
//		} else {
//			JOptionPane.showMessageDialog(this, "There was an error registering this user. Please try again.",
//					"Registration Error", JOptionPane.ERROR_MESSAGE);
//		}
	}
}
