import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class CityOfficialOptionsPanel extends JPanel {
	Application app;
	
	public CityOfficialOptionsPanel(Application app) {
		this.app = app;
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose Functionality");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 63);
		add(lblNewLabel);
		
		JButton btnFiltersearchPoi = new JButton("Filter/Search POI");
		btnFiltersearchPoi.setBounds(114, 94, 217, 29);
		add(btnFiltersearchPoi);
		
		btnFiltersearchPoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showFilterSearchPOI();
		  	}
		});
		
		JButton btnPoiReport = new JButton("POI Report");
		btnPoiReport.setBounds(167, 148, 117, 29);
		add(btnPoiReport);
		
		btnPoiReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showPOIReport();
		  	}
		});
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(289, 239, 117, 29);
		add(btnLogOut);
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showLogin();
		  	}
		});
	}
}
