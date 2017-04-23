import java.awt.*;
import javax.swing.*;

public class Application {

	JPanel cards;
    final static String LOGINPANEL = "Login Panel";
    final static String REGISTRATIONPANEL = "Registration Panel";
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				DatabaseConnection.sharedConnection().executeQuery("SQL Query Goes Here...");
			}
		});
	}
	
	private static void createAndShowGUI() {
		//Create and set up the main window.
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Create and set up the content pane.
        Application app = new Application();
        app.addComponentToPane(frame.getContentPane());
         
        //Display the window.
        frame.setVisible(true);
	}
	
	public void addComponentToPane(Container pane) {
		//Create the cards
        JPanel loginPanel = new LoginPanel(this);
        JPanel registrationPanel = new RegistrationPanel();
        //...
        
        //Add them to the card layout
        cards = new JPanel(new CardLayout());
        cards.add(loginPanel, LOGINPANEL);
        cards.add(registrationPanel, REGISTRATIONPANEL);
         
        pane.add(cards, null);
    }
	
	public void showRegistrationFrame() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, REGISTRATIONPANEL);
	}
	
	
	// Note: For connecting to the SQL server -> http://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database
}
