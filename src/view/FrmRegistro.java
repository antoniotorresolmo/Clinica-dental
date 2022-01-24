package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmRegistro extends JFrame {
	
	public static JTextField txtNombreRegistro;
	public static JTextField txtApellidosRegistro;
	public static JTextField txtUsuarioRegistro;
	public static JTextField txtCorreoRegistro;
	public static JTextField txtDireccionRegistro;
	public static JTextField txtTelefonoRegistro;
	public static JPasswordField txtPasswordRegistro;

	public FrmRegistro() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 480, 407);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 130, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIconoRegistro = new JLabel("");
		lblIconoRegistro.setIcon(new ImageIcon("images/perfil.png"));
		lblIconoRegistro.setBounds(10, 122, 100, 100);
		panel.add(lblIconoRegistro);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(129, 0, 337, 369);
		panel_1.setBackground(view.JDialogLogin.principal);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombreRegistro = new JLabel("Nombre:");
		lblNombreRegistro.setBounds(10, 33, 60, 14);
		panel_1.add(lblNombreRegistro);
		
		txtNombreRegistro = new JTextField();
		txtNombreRegistro.setBounds(70, 30, 241, 20);
		panel_1.add(txtNombreRegistro);
		txtNombreRegistro.setColumns(10);
		
		JLabel lblApellidosRegistro = new JLabel("Apellidos:");
		lblApellidosRegistro.setBounds(10, 73, 60, 14);
		panel_1.add(lblApellidosRegistro);
		
		txtApellidosRegistro = new JTextField();
		txtApellidosRegistro.setBounds(70, 70, 241, 20);
		panel_1.add(txtApellidosRegistro);
		txtApellidosRegistro.setColumns(10);
		
		JLabel lblUsuarioRegistro = new JLabel("Usuario:");
		lblUsuarioRegistro.setBounds(10, 113, 60, 14);
		panel_1.add(lblUsuarioRegistro);
		
		txtUsuarioRegistro = new JTextField();
		txtUsuarioRegistro.setBounds(70, 110, 241, 20);
		panel_1.add(txtUsuarioRegistro);
		txtUsuarioRegistro.setColumns(10);
		
		JLabel lblPasswordRegistro = new JLabel("Pass:");
		lblPasswordRegistro.setBounds(10, 153, 60, 14);
		panel_1.add(lblPasswordRegistro);
		
		JLabel lblNewLabel = new JLabel("Correo:");
		lblNewLabel.setBounds(10, 193, 60, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_1.setBounds(10, 233, 60, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblTelefonoRegistro = new JLabel("Tel\u00E9fono:");
		lblTelefonoRegistro.setBounds(10, 273, 60, 14);
		panel_1.add(lblTelefonoRegistro);
		
		txtCorreoRegistro = new JTextField();
		txtCorreoRegistro.setBounds(70, 190, 241, 20);
		panel_1.add(txtCorreoRegistro);
		txtCorreoRegistro.setColumns(10);
		
		txtDireccionRegistro = new JTextField();
		txtDireccionRegistro.setBounds(70, 230, 241, 20);
		panel_1.add(txtDireccionRegistro);
		txtDireccionRegistro.setColumns(10);
		
		txtTelefonoRegistro = new JTextField();
		txtTelefonoRegistro.setBounds(70, 270, 241, 20);
		panel_1.add(txtTelefonoRegistro);
		txtTelefonoRegistro.setColumns(10);
		
		txtPasswordRegistro = new JPasswordField();
		txtPasswordRegistro.setBounds(70, 150, 241, 20);
		panel_1.add(txtPasswordRegistro);
		
		JButton btnCancelarRegistro = new JButton("Cancelar");
		btnCancelarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancelarRegistro.setBackground(view.JDialogLogin.secundario);
		btnCancelarRegistro.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnCancelarRegistro.setBounds(222, 322, 89, 23);
		panel_1.add(btnCancelarRegistro);
		
		JButton btnAceptarRegistro = new JButton("Aceptar");
		btnAceptarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					logic.LogicMedico.insertar();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAceptarRegistro.setBackground(Color.BLUE);
		btnAceptarRegistro.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnAceptarRegistro.setBounds(70, 322, 89, 23);
		panel_1.add(btnAceptarRegistro);

		setVisible(true);
		
	}
}
