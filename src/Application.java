import java.awt.*;
import java.sql.SQLException;

import javax.swing.*;

public class Application {

	JPanel cards;
    final static String LOGINPANEL = "Login Panel";
    final static String REGISTRATIONPANEL = "Registration Panel";
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Application app = new Application();
        try {
			app.addComponentToPane(frame.getContentPane());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        frame.setVisible(true);
	}
	
	public void addComponentToPane(Container pane) throws SQLException {
        JPanel loginPanel = new LoginPanel(this);
        JPanel registrationPanel = new RegistrationPanel();
        
        cards = new JPanel(new CardLayout());
        cards.add(loginPanel, LOGINPANEL);
        cards.add(registrationPanel, REGISTRATIONPANEL);
         
        pane.add(cards, null);
    }
	
	public void showRegistrationFrame() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, REGISTRATIONPANEL);
	}
}
