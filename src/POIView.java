import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;

public class POIView extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public POIView() {
		setLayout(null);
		
		JLabel lblViewpois = new JLabel("View POIs");
		lblViewpois.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewpois.setForeground(Color.ORANGE);
		lblViewpois.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblViewpois.setBounds(6, 18, 438, 16);
		add(lblViewpois);
		
		JLabel lblPoiLocationName = new JLabel("POI Location Name");
		lblPoiLocationName.setBounds(16, 51, 133, 16);
		add(lblPoiLocationName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(175, 46, 104, 27);
		add(comboBox);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(16, 79, 133, 16);
		add(lblCity);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(175, 75, 104, 27);
		add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("State");
		lblNewLabel.setBounds(16, 113, 133, 16);
		add(lblNewLabel);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(175, 109, 104, 27);
		add(comboBox_2);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(16, 149, 61, 16);
		add(lblZipCode);
		
		textField = new JTextField();
		textField.setBounds(175, 148, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblFlagged = new JLabel("Flagged?");
		lblFlagged.setBounds(16, 194, 133, 16);
		add(lblFlagged);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(175, 190, 28, 23);
		add(checkBox);
		
		JLabel lblDateFlagged = new JLabel("Date Flagged");
		lblDateFlagged.setEnabled(false);
		lblDateFlagged.setBounds(16, 238, 133, 16);
		add(lblDateFlagged);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_3.setEnabled(false);
		comboBox_3.setBounds(175, 234, 52, 27);
		add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_4.setEnabled(false);
		comboBox_4.setBounds(222, 234, 52, 27);
		add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
		comboBox_5.setEnabled(false);
		comboBox_5.setBounds(268, 234, 52, 27);
		add(comboBox_5);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setEnabled(false);
		lblTo.setBounds(312, 238, 61, 16);
		add(lblTo);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_6.setEnabled(false);
		comboBox_6.setBounds(369, 234, 52, 27);
		add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_7.setEnabled(false);
		comboBox_7.setBounds(414, 234, 52, 27);
		add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
		comboBox_8.setEnabled(false);
		comboBox_8.setBounds(460, 234, 52, 27);
		add(comboBox_8);
		
		JButton btnApplyFilter = new JButton("Apply Filter");
		btnApplyFilter.setEnabled(false);
		btnApplyFilter.setBounds(102, 273, 117, 29);
		add(btnApplyFilter);
		
		JButton btnResetFilter = new JButton("Reset Filter");
		btnResetFilter.setBounds(256, 273, 117, 29);
		add(btnResetFilter);
		
		table = new JTable();
		table.setBounds(17, 302, 505, 76);
		add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(213, 380, 117, 29);
		add(btnBack);

	}
}