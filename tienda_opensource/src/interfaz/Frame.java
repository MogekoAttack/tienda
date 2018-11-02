package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txf_usuario;
	private JPasswordField pass_usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	
	
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 2, 3, 3));
		
		JLabel label = new JLabel("Usuario:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 41));
		panel.add(label);
		
		txf_usuario = new JTextField();
		txf_usuario.setFont(new Font("Tahoma", Font.PLAIN, 36));
		txf_usuario.setColumns(10);
		panel.add(txf_usuario);
		
		JLabel label_1 = new JLabel("Contrase\u00F1a:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 41));
		panel.add(label_1);
		
		pass_usuario = new JPasswordField();
		pass_usuario.setFont(new Font("Tahoma", Font.PLAIN, 36));
		pass_usuario.setColumns(10);
		panel.add(pass_usuario);
		
		JButton btn_iniciarsesion = new JButton("Iniciar sesión");
		btn_iniciarsesion.setFont(new Font("Comic Sans MS", Font.PLAIN, 41));
		panel.add(btn_iniciarsesion);
		btn_iniciarsesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usu,pass;
				usu = txf_usuario.getText();
				pass = new String(pass_usuario.getPassword());
				if(usu.equals("1")&&pass.equals("2")) {
					PerfilDueno f = new PerfilDueno();
					f.setVisible(true);
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos", "¡ERROR!", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		JButton btn_cliente = new JButton("Modo cliente");
		btn_cliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 41));
		panel.add(btn_cliente);
		
		JLabel lb_sinpass = new JLabel("\u00BFOlvidaste tu contrase\u00F1a?");
		lb_sinpass.setHorizontalAlignment(SwingConstants.CENTER);
		lb_sinpass.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lb_sinpass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		contentPane.add(lb_sinpass, BorderLayout.SOUTH);
		
	}

}
