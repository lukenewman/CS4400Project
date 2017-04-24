import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddLocationPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	
	Application app;

	public AddLocationPanel(Application app) throws SQLException {
		this.app = app;
		
		setLayout(null);
		
		JLabel lblAddANew = new JLabel("Add a new location");
		lblAddANew.setForeground(Color.ORANGE);
		lblAddANew.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblAddANew.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddANew.setBounds(6, 6, 438, 58);
		add(lblAddANew);
		
		JLabel lblPoiLocationName = new JLabel("POI Location Name");
		lblPoiLocationName.setBounds(16, 64, 119, 16);
		add(lblPoiLocationName);
		
		textField = new JTextField();
		textField.setBounds(147, 59, 267, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(105, 101, 30, 16);
		add(lblCity);
		
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
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBounds(147, 97, 119, 27);
		add(comboBox);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(104, 142, 31, 16);
		add(lblState);
		
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
		JComboBox comboBox_1 = new JComboBox(options2);
		comboBox_1.setBounds(147, 138, 119, 27);
		add(comboBox_1);
		
		JLabel lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(81, 188, 54, 16);
		add(lblZipCode);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 183, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(38, 251, 117, 29);
		add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showCityScientistOptions();
		  	}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setEnabled(false);
		btnSubmit.setBounds(286, 251, 117, 29);
		add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO - Submit the information
			}
		});

	}

}
