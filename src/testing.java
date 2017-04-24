import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;

public class testing extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public testing() {
		setLayout(null);
		
		JLabel lblPoiReport = new JLabel("POI Report");
		lblPoiReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoiReport.setBounds(6, 6, 745, 35);
		add(lblPoiReport);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(6, 51, 745, 160);
		add(table);
		
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {"POI location", "City", "State", "Mold Min", "Mold Avg", "Mold Max", "AQ Min", "AQ Avg", "AQ Max", "# of data points", "Flagged?"},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "POI location", "City", "State", "Mold Min", "Mold Avg", "Mold Max", "AQ Min", "AQ Avg", "AQ Max", "# of data points", "Flagged?"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
	            };

	});
	}
}
