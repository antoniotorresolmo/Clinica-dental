package views;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PnlRegistro extends JPanel {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtTelefono;

	public PnlRegistro() {
		setBounds(100, 100, 450, 342);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(models.IStyle.PRINCIPAL);
		panel.setBounds(0, 0, 130, 300);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblIcono = new JLabel(new ImageIcon("logo.png"));
		lblIcono.setBounds(10, 107, 100, 100);
		panel.add(lblIcono);
		
		JLabel lblUsuarioMedico = new JLabel("Usuario:");
		lblUsuarioMedico.setBounds(136, 29, 46, 14);
		lblUsuarioMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		contentPanel.add(lblUsuarioMedico);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(196, 27, 228, 20);
		contentPanel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPasswordMedico = new JLabel("Contrase\u00F1a:");
		lblPasswordMedico.setBounds(136, 70, 69, 14);
		contentPanel.add(lblPasswordMedico);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(196, 67, 228, 20);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblCorreoMedico = new JLabel("Correo:");
		lblCorreoMedico.setBounds(136, 110, 46, 14);
		contentPanel.add(lblCorreoMedico);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(196, 107, 228, 20);
		contentPanel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(136, 150, 56, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(196, 147, 228, 20);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(136, 190, 56, 14);
		contentPanel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(196, 187, 228, 20);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 247, 89, 23);
		btnCancelar.setBackground(models.IStyle.SECUNDARIO);
		contentPanel.add(btnCancelar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(213, 247, 112, 23);
		btnRegistrarse.setBackground(models.IStyle.PRINCIPAL);
		contentPanel.add(btnRegistrarse);
		
		setVisible(true);
	}
}
