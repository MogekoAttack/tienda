package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Panel_InicioSesion extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Panel_InicioSesion() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(3, 2, 5, 5));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);

	}

}
