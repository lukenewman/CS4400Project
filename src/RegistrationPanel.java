import java.awt.*;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.sql.*;

@SuppressWarnings("serial")
public class RegistrationPanel extends JPanel implements ActionListener {

	Application app;
	
	private JTextField usernameTextField;
	private JTextField emailAddressTextField;
	private JTextField titleTextField;
	private JPasswordField passwordField;
	private JPasswordField confirmPasswordField;
	private JButton createButton;
	private JComboBox<String> userTypeComboBox; 
	private JComboBox<String> cityComboBox;
	private JComboBox<String> stateComboBox;

	public RegistrationPanel(Application app) throws SQLException {
		this.app = app;
		
		setLayout(null);

		JLabel lblNewLabel = new JLabel("New User Registration");
		lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 538, 46);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(116, 69, 62, 16);
		add(lblNewLabel_1);

		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Lato", Font.PLAIN, 13));
		usernameTextField.setBounds(272, 64, 159, 26);
		add(usernameTextField);
		usernameTextField.setColumns(10);

		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Lato", Font.PLAIN, 13));
		lblEmailAddress.setBounds(116, 97, 89, 16);
		add(lblEmailAddress);

		emailAddressTextField = new JTextField();
		emailAddressTextField.setFont(new Font("Lato", Font.PLAIN, 13));
		emailAddressTextField.setColumns(10);
		emailAddressTextField.setBounds(272, 92, 159, 26);
		add(emailAddressTextField);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lato", Font.PLAIN, 13));
		lblPassword.setBounds(116, 126, 59, 16);
		add(lblPassword);

		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Lato", Font.PLAIN, 13));
		lblConfirmPassword.setBounds(116, 154, 114, 16);
		add(lblConfirmPassword);

		JLabel lblUserType = new JLabel("User Type");
		lblUserType.setFont(new Font("Lato", Font.PLAIN, 13));
		lblUserType.setBounds(116, 182, 62, 16);
		add(lblUserType);

		ResultSet rs3 = DatabaseConnection.sharedConnection().executeQuery("SELECT DISTINCT User_Type FROM User WHERE User_Type != 'Admin'");
		int rowCount3 = 0;
		List tmp3 = new List();
		while(rs3.next()){
			tmp3.add(rs3.getString(1));
			rowCount3++;
		}
		String[] options3 = new String[rowCount3];
		for (int i = 0; i < rowCount3; i++) {
			options3[i] = tmp3.getItem(i).replace('_', ' ');
		}
		userTypeComboBox = new JComboBox<String>(options3);
		userTypeComboBox.setFont(new Font("Lato", Font.PLAIN, 13));
		userTypeComboBox.setBounds(272, 178, 159, 27);
		userTypeComboBox.addActionListener(this);
		add(userTypeComboBox);

		JLabel lblNewLabel_2 = new JLabel("Fill out this form if you choose city official:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lato", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(6, 217, 538, 16);
		add(lblNewLabel_2);

//		ArrayList<String[]> result = new ArrayList<String[]>();
//		ResultSet rs = DatabaseConnection.sharedConnection().executeQuery("SELECT City FROM City_State");
//		int columnCount = rs.getMetaData().getColumnCount();
//		while(rs.next()){
//			String[] row = new String[columnCount];
//			for (int i=0; i < columnCount; i++) {
//				row[i] = rs.getString(i + 1);
//			}
//			result.add(row);
//		}
		
		ResultSet rs = DatabaseConnection.sharedConnection().executeQuery("SELECT DISTINCT City FROM City_State");
		int rowCount = 0;
		List tmp = new List();
		while(rs.next()){
			tmp.add(rs.getString(1));
			rowCount++;
		}
		String[] options = new String[rowCount];
		for (int i = 0; i < rowCount; i++) {
			options[i] = tmp.getItem(i);
		}
		cityComboBox = new JComboBox<String>(options);
		cityComboBox.setFont(new Font("Lato", Font.PLAIN, 13));
		cityComboBox.setBounds(272, 245, 159, 27);
		add(cityComboBox);

		ResultSet rs2 = DatabaseConnection.sharedConnection().executeQuery("SELECT DISTINCT State FROM City_State");
		int rowCount2 = 0;
		List tmp2 = new List();
		while(rs2.next()){
			tmp2.add(rs2.getString(1));
			rowCount2++;
		}
		String[] options2 = new String[rowCount2];
		for (int i = 0; i < rowCount2; i++) {
			options2[i] = tmp2.getItem(i);
		}
		stateComboBox = new JComboBox<String>(options2);
		stateComboBox.setFont(new Font("Lato", Font.PLAIN, 13));
		stateComboBox.setBounds(272, 271, 159, 27);
		add(stateComboBox);

		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Lato", Font.PLAIN, 13));
		lblState.setBounds(116, 275, 31, 16);
		add(lblState);

		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Lato", Font.PLAIN, 13));
		lblCity.setBounds(116, 249, 25, 16);
		add(lblCity);

		titleTextField = new JTextField();
		titleTextField.setFont(new Font("Lato", Font.PLAIN, 13));
		titleTextField.setColumns(10);
		titleTextField.setBounds(272, 298, 159, 26);
		add(titleTextField);

		createButton = new JButton("Create");
		createButton.setFont(new Font("Lato", Font.PLAIN, 13));
		createButton.setBounds(236, 336, 84, 29);
		createButton.addActionListener(this);
		add(createButton);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Lato", Font.PLAIN, 13));
		lblTitle.setBounds(116, 303, 28, 16);
		add(lblTitle);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lato", Font.PLAIN, 13));
		passwordField.setBounds(272, 121, 159, 26);
		add(passwordField);

		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setFont(new Font("Lato", Font.PLAIN, 13));
		confirmPasswordField.setBounds(272, 149, 159, 26);
		add(confirmPasswordField);
		
		updateUIForSelectedUserType("City_Scientist");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == createButton) {
			registerUser();
		} else if (e.getSource() == userTypeComboBox) {
			updateUIForSelectedUserType((String)userTypeComboBox.getSelectedItem());
		}
	}

	private void registerUser() {
		// Check for empty fields.
		if (usernameTextField.getText().equals("") || 
			emailAddressTextField.getText().equals("") || 
			new String(passwordField.getPassword()).equals("") || 
			new String(confirmPasswordField.getPassword()).equals("")) {
			JOptionPane.showMessageDialog(this, "Please ensure all relevant fields are filled out.", "Missing Field(s)", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// Check if passwords match.
		if (!(new String(passwordField.getPassword()).equals(new String(confirmPasswordField.getPassword())))) {
			passwordField.setText("");
			confirmPasswordField.setText("");
			JOptionPane.showMessageDialog(this, "Please ensure your passwords match.", "Confirm Password", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// For City Officials, check the remaining fields.
		String selectedUserType = (String)userTypeComboBox.getSelectedItem();
		if (selectedUserType.equals("City_Official")) {
			if (titleTextField.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter a title.", "Missing Field", JOptionPane.WARNING_MESSAGE);
				return;
			}
		}
		
		// Register with the database.
		User newUser = new User();
		newUser.setUsername(usernameTextField.getText());
		newUser.setEmailAddress(emailAddressTextField.getText());
		newUser.setPassword(new String(passwordField.getPassword()));
		newUser.setUserType((String)userTypeComboBox.getSelectedItem());
		boolean success = DatabaseConnection.sharedConnection().registerUser(newUser);
		if (success) {
			if (newUser.getUserType().equals("City_Scientist")) {
				app.showCityScientistOptions();
			} else {
				app.showCityOfficialOptions();
			}
		} else {
			
		}
	}
	
	private void updateUIForSelectedUserType(String userType) {
		boolean enabled = userType.equals("City_Official");
		cityComboBox.setEnabled(enabled);
		stateComboBox.setEnabled(enabled);
		titleTextField.setEnabled(enabled);
	}
}
