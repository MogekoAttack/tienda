package interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
//Mios
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.Box;
//Mios

public class Panel_InicioSesion extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txf_usario;
	private JPasswordField txf_con;
	private String usuario,pass;

	/**
	 * Create the panel.
	 */
	public Panel_InicioSesion() {
		
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel = new JLabel("Usuario");
		add(lblNewLabel);
		
		txf_usario = new JTextField();
		add(txf_usario);
		txf_usario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		add(lblNewLabel_1);
		
		txf_con = new JPasswordField ();
		add(txf_con);
		txf_con.setColumns(10);
		
		JButton btn_inicio = new JButton("Iniciar sesión");
		add(btn_inicio);
		
		btn_inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				usuario = txf_usario.getText();
				pass = new String(txf_con.getPassword());
				if(usuario.equals("1") && pass.equals("2")){
					new Sincon().setVisible(true);
					Frame f = new Frame();
					f.isVisible();
				}else{
					JOptionPane.showMessageDialog(null,"Nombre de usuario y/o contraseña incorrectos","¡Advertencia!",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		JButton btn_cliente = new JButton("Modo cliente");
		add(btn_cliente);
		btn_cliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame f = new Frame();
				f.dispose();
			}
		});
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		add(horizontalStrut);
		
		JButton btn_exit = new JButton("Salir :)");
		add(btn_exit);
		btn_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

	}

}
