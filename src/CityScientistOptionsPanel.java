import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CityScientistOptionsPanel extends JPanel {

	Application app;
	
	public CityScientistOptionsPanel(Application app) {
		this.app = app;
		
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose Functionality");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 63);
		add(lblNewLabel);

		JButton addNewDataPointButton = new JButton("Add New Data Point");
		addNewDataPointButton.setBounds(114, 94, 217, 29);
		add(addNewDataPointButton);
		
		addNewDataPointButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showAddDataPointPanel();
		  	}
		});

		JButton addNewLocationButton = new JButton("Add New Location");
		addNewLocationButton.setBounds(114, 148, 217, 29);
		add(addNewLocationButton);
		
		addNewLocationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showAddLocationPanel();
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
