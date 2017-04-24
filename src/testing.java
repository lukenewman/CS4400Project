import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class testing extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public testing() throws SQLException {
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
		DefaultTableModel dtm = new DefaultTableModel(0, 0);
		ArrayList<String[]> result = new ArrayList<String[]>();
		ResultSet rs = DatabaseConnection.sharedConnection().executeQuery("SELECT F, City, State, Flag, Z, Y, W, Q, R, S, C + D FROM (SELECT POI.Name AS F, City, State, Flag, MIN( Data_Value ) AS Z, AVG( Data_Value ) AS Y, MAX( Data_Value ) AS W, COUNT( * ) AS C FROM POI INNER JOIN Data_Point ON POI.Name = Data_Point.NameWHERE DataType =  'Mold' GROUP BY POI.Name) AS A INNER JOIN (SELECT POI.Name AS P, MIN( Data_Value ) AS Q, AVG( Data_Value ) AS R, MAX( Data_Value ) AS S, COUNT( * ) AS D FROM POI INNER JOIN Data_Point ON POI.Name = Data_Point.Name WHERE DataType =  'Air Quality' GROUP BY POI.Name) AS B ON F = P");
		int columnCount = rs.getMetaData().getColumnCount();
		while(rs.next()){
			String[] row = new String[columnCount];
			for (int i=0; i < columnCount; i++) {
				row[i] = rs.getString(i + 1);
			}
			result.add(row);
		}
		System.out.println(result.get(0));
		
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {"POI location", "City", "State", "Mold Min", "Mold Avg", "Mold Max", "AQ Min", "AQ Avg", "AQ Max", "# of data points", "Flagged?"},
	                result.get(0)
	                
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
