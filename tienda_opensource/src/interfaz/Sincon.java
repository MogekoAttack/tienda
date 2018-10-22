package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Sincon extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sincon frame = new Sincon();
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
	public Sincon() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 29, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 25, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 76, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -35, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("Hola");
		
		JButton btnNewButton = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 38, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 151, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 240, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame n = new Frame();
				n.setVisible(true);
				try {
					dispose();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}
}
