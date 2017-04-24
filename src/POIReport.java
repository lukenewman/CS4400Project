import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class POIReport extends JPanel {
	private JTable table;

<<<<<<< HEAD
	
	/**
	 * Create the panel.
	 */
	public POIReport() {
=======
	Application app;
	
	public POIReport(Application app) {
		this.app = app;
		
>>>>>>> origin/master
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("POI Report");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 625, 48);
		add(lblNewLabel);
		
//		table = new JTable();
//		DefaultTableModel dtm = new DefaultTableModel(0, 0);
//		table.setBackground(Color.GRAY);
//		table.setBounds(6, 105, 704, 160);
//		String header[] = new String[] {"POI location", "City", "State", "Mold Min", "Mold Avg", "Mold Max", "AQ Min", "AQ Avg", "AQ Max", "# of data points", "Flagged?"};
//		dtm.setColumnIdentifiers(header);
//		table.setModel(dtm);
//		add(table);
//	
        table = new javax.swing.JTable();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
		

		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(259, 370, 117, 29);
		add(btnBack);
		
<<<<<<< HEAD
=======
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.showCityOfficialOptions();
		  	}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 66, 625, 270);
		add(scrollPane);

	}
	
	public static DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }
>>>>>>> origin/master


	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		POIReport p = new POIReport();
		jf.setVisible(true);
		jf.add(p);
		
	}
	

}
