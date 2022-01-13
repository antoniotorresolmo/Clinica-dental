package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class PnlPerfil extends JPanel {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtTelefono;

	public PnlPerfil() {
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
		txtUsuario.setEnabled(false);
		txtUsuario.setBounds(196, 27, 228, 20);
		contentPanel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPasswordMedico = new JLabel("Contrase\u00F1a:");
		lblPasswordMedico.setBounds(136, 70, 69, 14);
		contentPanel.add(lblPasswordMedico);
		
		txtPassword = new JTextField();
		txtPassword.setEnabled(false);
		txtPassword.setBounds(196, 67, 228, 20);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblCorreoMedico = new JLabel("Correo:");
		lblCorreoMedico.setBounds(136, 110, 46, 14);
		contentPanel.add(lblCorreoMedico);
		
		txtCorreo = new JTextField();
		txtCorreo.setEnabled(false);
		txtCorreo.setBounds(196, 107, 228, 20);
		contentPanel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(136, 150, 56, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setEnabled(false);
		txtDireccion.setBounds(196, 147, 228, 20);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(136, 190, 56, 14);
		contentPanel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setEnabled(false);
		txtTelefono.setBounds(196, 187, 228, 20);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(300, 247, 124, 23);
		btnCerrarSesion.setBackground(models.IStyle.SECUNDARIO);
		contentPanel.add(btnCerrarSesion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(196, 247, 89, 23);
		btnGuardar.setBackground(models.IStyle.PRINCIPAL);
		contentPanel.add(btnGuardar);
		
		setVisible(true);
	}
}
