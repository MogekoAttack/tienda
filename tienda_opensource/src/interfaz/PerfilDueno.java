package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;

public class PerfilDueno extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilDueno frame = new PerfilDueno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PerfilDueno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 3, 25, 25));
		
		table_1 = new JTable();
		contentPane.add(table_1);
		
		table_2 = new JTable();
		contentPane.add(table_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("New button");
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		contentPane.add(btnNewButton_6);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_1);
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4);
	}

}
