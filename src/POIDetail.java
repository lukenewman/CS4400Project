import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;

public class POIDetail extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public POIDetail() throws SQLException {
		setLayout(null);
		
		JLabel lblPoiDetail = new JLabel("POI Detail");
		lblPoiDetail.setForeground(Color.ORANGE);
		lblPoiDetail.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPoiDetail.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoiDetail.setBounds(6, 6, 567, 26);
		add(lblPoiDetail);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(16, 44, 148, 16);
		add(lblType);
		
		ResultSet rs = DatabaseConnection.sharedConnection().executeQuery("SELECT * FROM Data_Type");
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
		comboBox.setBounds(176, 40, 52, 27);
		add(comboBox);
		
		JLabel lblDataValue = new JLabel("Data Value");
		lblDataValue.setBounds(16, 87, 152, 16);
		add(lblDataValue);
		
		textField = new JTextField();
		textField.setBounds(176, 82, 38, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("to");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(215, 87, 66, 16);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 82, 38, 26);
		add(textField_1);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(16, 121, 148, 16);
		add(lblTime);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(176, 117, 52, 27);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_2.setBounds(225, 117, 52, 27);
		add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_3.setBounds(276, 117, 52, 27);
		add(comboBox_3);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(16, 160, 148, 16);
		add(lblDate);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
		comboBox_4.setBounds(286, 156, 52, 27);
		add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_5.setBounds(186, 156, 52, 27);
		add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_6.setBounds(235, 156, 52, 27);
		add(comboBox_6);
		
		JButton btnApplyFilter = new JButton("Apply Filter");
		btnApplyFilter.setEnabled(false);
		btnApplyFilter.setBounds(97, 195, 117, 29);
		add(btnApplyFilter);
		
		JButton btnResetFilter = new JButton("Reset Filter");
		btnResetFilter.setBounds(316, 195, 117, 29);
		add(btnResetFilter);
		
		table = new JTable();
		table.setBounds(16, 228, 539, 138);
		add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(80, 378, 117, 29);
		add(btnBack);
		
		JButton btnFlag = new JButton("Flag");
		btnFlag.setEnabled(false);
		btnFlag.setBounds(357, 378, 117, 29);
		add(btnFlag);

	}

}
