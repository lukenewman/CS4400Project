import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginPanel extends JPanel {
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	public LoginPanel(Application app) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 538, 30);
		add(lblNewLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Lato", Font.PLAIN, 13));
		usernameLabel.setBounds(115, 69, 62, 16);
		add(usernameLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Lato", Font.PLAIN, 13));
		usernameTextField.setColumns(10);
		usernameTextField.setBounds(271, 64, 159, 26);
		add(usernameTextField);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Lato", Font.PLAIN, 13));
		passwordLabel.setBounds(115, 97, 89, 16);
		add(passwordLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Lato", Font.PLAIN, 13));
		loginButton.setBounds(148, 160, 84, 29);
		add(loginButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(271, 92, 159, 26);
		add(passwordField);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Lato", Font.PLAIN, 13));
		registerButton.setBounds(310, 160, 84, 29);
		add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showRegistrationFrame();
		  	}
		});
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean loggedIn = DatabaseConnection.sharedConnection().login(usernameTextField.getText(), new String(passwordField.getPassword()));
				// move to next screen
			}
		});
	}
}
