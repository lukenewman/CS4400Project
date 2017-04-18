import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(182, 47, 61, 16);
		contentPane.add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(65, 102, 73, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(65, 148, 73, 16);
		contentPane.add(lblNewLabel_1);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(195, 97, 130, 26);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 143, 130, 26);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(85, 198, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(214, 198, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}
