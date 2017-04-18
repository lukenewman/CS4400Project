import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class RegistrationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JTextField emailAddressTextField;
	private JTextField passwordTextField;
	private JTextField confirmPasswordTextField;
	private JTextField titleTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationFrame frame = new RegistrationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New User Registration");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(180, 34, 156, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(110, 62, 170, 16);
		contentPane.add(lblNewLabel_1);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(292, 57, 130, 26);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(110, 95, 170, 16);
		contentPane.add(lblEmailAddress);
		
		emailAddressTextField = new JTextField();
		emailAddressTextField.setColumns(10);
		emailAddressTextField.setBounds(292, 90, 130, 26);
		contentPane.add(emailAddressTextField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(110, 128, 170, 16);
		contentPane.add(lblPassword);
		
		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(292, 123, 130, 26);
		contentPane.add(passwordTextField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(110, 161, 170, 16);
		contentPane.add(lblConfirmPassword);
		
		confirmPasswordTextField = new JTextField();
		confirmPasswordTextField.setColumns(10);
		confirmPasswordTextField.setBounds(292, 156, 130, 26);
		contentPane.add(confirmPasswordTextField);
		
		JLabel lblUserType = new JLabel("User Type");
		lblUserType.setBounds(110, 189, 94, 16);
		contentPane.add(lblUserType);
		
		JComboBox userTypeComboBox = new JComboBox();
		userTypeComboBox.setBounds(292, 185, 130, 27);
		contentPane.add(userTypeComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Fill out this form if you choose city official");
		lblNewLabel_2.setBounds(131, 224, 270, 16);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cityComboBox = new JComboBox();
		cityComboBox.setBounds(261, 252, 130, 27);
		contentPane.add(cityComboBox);
		
		JComboBox stateComboBox = new JComboBox();
		stateComboBox.setBounds(261, 280, 130, 27);
		contentPane.add(stateComboBox);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(141, 284, 94, 16);
		contentPane.add(lblState);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(141, 256, 170, 16);
		contentPane.add(lblCity);
		
		titleTextField = new JTextField();
		titleTextField.setColumns(10);
		titleTextField.setBounds(261, 309, 130, 26);
		contentPane.add(titleTextField);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(141, 314, 170, 16);
		contentPane.add(lblTitle);
		
		JButton createButton = new JButton("Create");
		createButton.setBounds(200, 340, 117, 29);
		contentPane.add(createButton);
	}
}
