package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
public class PerfilDueno extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
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
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mn_Agregar = new JMenu("Nuevo");
		menuBar.add(mn_Agregar);
		
		JMenuItem mntm_Producto = new JMenuItem("Producto");
		mn_Agregar.add(mntm_Producto);
		
		JMenu mn_Modificar = new JMenu("Modificar");
		menuBar.add(mn_Modificar);
		
		JMenu mn_Bsucar = new JMenu("Buscar");
		menuBar.add(mn_Bsucar);
		
		JMenu mn_Perfil = new JMenu("Perfil");
		menuBar.add(mn_Perfil);
		
		JMenu mn_Acerca = new JMenu("Acerca");
		menuBar.add(mn_Acerca);
		
		JMenuItem mntm_CerrarSesion = new JMenuItem("Cerrar sesion");
		mn_Acerca.add(mntm_CerrarSesion);
		mntm_CerrarSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Frame().setVisible(true);
				dispose();
			}
		});
		
		JMenuItem mntm_Salir = new JMenuItem("Salir");
		mn_Acerca.add(mntm_Salir);
		mntm_Salir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 3, SpringLayout.EAST, contentPane);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 3, 5, 0));
		
		table = new JTable();
		panel.add(table);
		
		table_1 = new JTable();
		panel.add(table_1);
		
		table_2 = new JTable();
		panel.add(table_2);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, panel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, -92, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -15, SpringLayout.EAST, contentPane);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 5, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5);
	}
}
