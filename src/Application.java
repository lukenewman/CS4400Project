import java.awt.*;
import java.sql.SQLException;

import javax.swing.*;

public class Application {

	JPanel cards;
	
    final static String LOGIN_PANEL = "Login Panel";
    final static String REGISTRATION_PANEL = "Registration Panel";
    
    final static String CITY_SCIENTIST_OPTIONS_PANEL = "City Scientist Options";
    final static String ADD_DATA_POINT_PANEL = "Add Data Point";
    final static String ADD_LOCATION_PANEL = "Add Location";
    
    final static String CITY_OFFICIAL_OPTIONS_PANEL = "City Official Options";
    final static String FILTER_SEARCH_POI_PANEL = "Filter Search POI";
    final static String POI_REPORT_PANEL = "POI Report";
    
    final static String ADMIN_OPTIONS_PANEL = "Admin Options";
    final static String PENDING_DATA_POINTS_PANEL = "Pending Data Points";
    final static String PENDING_CITY_OFFICIAL_ACCOUNTS_PANEL = "Pending City Official Accounts";
	
    LoginPanel loginPanel;
    RegistrationPanel registrationPanel;
    
    CityScientistOptionsPanel cityScientistOptionsPanel;
    AddDataPointPanel addDataPointPanel;
    AddLocationPanel addLocationPanel;
    
    CityOfficialOptionsPanel cityOfficialOptionsPanel;
    POIView poiFilterSearchPanel;
    POIReport poiReportPanel;
    
    AdminOptionsPanel adminOptionsPanel;
    PendingDataPoints pendingDataPointsPanel;
    PendingCityOfficials pendingCityOfficialsPanel;
    
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
        try {
			app.addComponentToPane(frame.getContentPane());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        frame.setVisible(true);
	}
	
	public void addComponentToPane(Container pane) throws SQLException {
        loginPanel = new LoginPanel(this);
        registrationPanel = new RegistrationPanel(this);
        
        cityScientistOptionsPanel = new CityScientistOptionsPanel(this);
        addDataPointPanel = new AddDataPointPanel(this);
        addLocationPanel = new AddLocationPanel(this);
        
        cityOfficialOptionsPanel = new CityOfficialOptionsPanel(this);
        poiFilterSearchPanel = new POIView(this);
        poiReportPanel = new POIReport(this);
        
        adminOptionsPanel = new AdminOptionsPanel(this);
        pendingDataPointsPanel = new PendingDataPoints(this);
        pendingCityOfficialsPanel = new PendingCityOfficials(this);
        
        cards = new JPanel(new CardLayout());
        cards.add(loginPanel, LOGIN_PANEL);
        cards.add(registrationPanel, REGISTRATION_PANEL);
        
        cards.add(cityScientistOptionsPanel, CITY_SCIENTIST_OPTIONS_PANEL);
        cards.add(addDataPointPanel, ADD_DATA_POINT_PANEL);
        cards.add(addLocationPanel, ADD_LOCATION_PANEL);
        
        cards.add(cityOfficialOptionsPanel, CITY_OFFICIAL_OPTIONS_PANEL);
        cards.add(poiFilterSearchPanel, FILTER_SEARCH_POI_PANEL);
        cards.add(poiReportPanel, POI_REPORT_PANEL);
        
        cards.add(adminOptionsPanel, ADMIN_OPTIONS_PANEL);
        cards.add(pendingDataPointsPanel, PENDING_DATA_POINTS_PANEL);
        cards.add(pendingCityOfficialsPanel, PENDING_CITY_OFFICIAL_ACCOUNTS_PANEL);
         
        pane.add(cards, null);
    }
	
	public void showLogin() {
		loginPanel.clear();
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, LOGIN_PANEL);
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
	
	public void showAddLocationPanel() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, ADD_LOCATION_PANEL);
	}
	
	public void showFilterSearchPOI() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, FILTER_SEARCH_POI_PANEL);
	}
	
	public void showPOIReport() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, POI_REPORT_PANEL);
	}
	
	public void showAdminOptionsPanel() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, ADMIN_OPTIONS_PANEL);
	}
	
	public void showPendingDataPoints() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, PENDING_DATA_POINTS_PANEL);
	}
	
	public void showPendingCityOfficialAccounts() {
		CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, PENDING_CITY_OFFICIAL_ACCOUNTS_PANEL);
	}
}
