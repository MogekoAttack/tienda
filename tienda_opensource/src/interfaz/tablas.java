package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTable;

public class tablas extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Create the panel.
	 */
	public tablas() {
		setLayout(new GridLayout(1, 3, 25, 25));
		
		table = new JTable();
		add(table);
		
		table_1 = new JTable();
		add(table_1);
		
		table_2 = new JTable();
		add(table_2);

	}

}
