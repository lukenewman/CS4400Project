import java.awt.*;
import java.sql.SQLException;

import javax.swing.*;

public class Application {

	JPanel cards;
    final static String LOGIN_PANEL = "Login Panel";
    final static String REGISTRATION_PANEL = "Registration Panel";
    final static String CITY_SCIENTIST_OPTIONS_PANEL = "City Scientist Options";
    final static String CITY_OFFICIAL_OPTIONS_PANEL = "City Official Options";
    final static String ADD_DATA_POINT_PANEL = "Add Data Point";
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void createAndShowGUI() throws SQLException {
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Application app = new Application();
        app.addComponentToPane(frame.getContentPane());
        
        frame.setVisible(true);
	}
	
	public void addComponentToPane(Container pane) throws SQLException {
        JPanel loginPanel = new LoginPanel(this);
        JPanel registrationPanel = new RegistrationPanel(this);
        JPanel cityScientistOptionsPanel = new CityScientistOptionsPanel();
        JPanel cityOfficialOptionsPanel = new CityOfficialOptionsPanel();
        JPanel addDataPointPanel = new AddDataPointPanel();
        
        cards = new JPanel(new CardLayout());
        cards.add(loginPanel, LOGIN_PANEL);
        cards.add(registrationPanel, REGISTRATION_PANEL);
        cards.add(cityScientistOptionsPanel, CITY_SCIENTIST_OPTIONS_PANEL);
        cards.add(addDataPointPanel, ADD_DATA_POINT_PANEL);
        
        cards.add(cityOfficialOptionsPanel, CITY_OFFICIAL_OPTIONS_PANEL);
         
        pane.add(cards, null);
    }
	
	public void showRegistrationFrame() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, REGISTRATION_PANEL);
	}
	
	public void showCityScientistOptions() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, CITY_SCIENTIST_OPTIONS_PANEL);
	}
	
	public void showCityOfficialOptions() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, CITY_OFFICIAL_OPTIONS_PANEL);
	}
	
	public void showAddDataPointPanel() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, ADD_DATA_POINT_PANEL);
	}
}
