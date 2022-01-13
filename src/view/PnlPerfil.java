package view;

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
	private JTextField txtUsuarioMedico;
	private JTextField txtPasswordMedico;
	private JTextField txtCorreoMedico;
	private JTextField txtDireccionMedico;
	private JTextField txtTelefonoMedico;

	public PnlPerfil() {
		contentPanel.setBackground(view.JDialogLogin.principal);
		setBounds(100, 100, 450, 342);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setBounds(0, 0, 130, 300);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\Clinica-dental\\images\\logo.png"));
		lblIcono.setBounds(10, 107, 100, 100);
		panel.add(lblIcono);
		
		JLabel lblUsuarioMedico = new JLabel("Usuario:");
		lblUsuarioMedico.setBounds(136, 29, 46, 14);
		lblUsuarioMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		contentPanel.add(lblUsuarioMedico);
		
		txtUsuarioMedico = new JTextField();
		txtUsuarioMedico.setBounds(196, 27, 228, 20);
		contentPanel.add(txtUsuarioMedico);
		txtUsuarioMedico.setColumns(10);
		
		JLabel lblPasswordMedico = new JLabel("Contrase\u00F1a:");
		lblPasswordMedico.setBounds(136, 70, 69, 14);
		contentPanel.add(lblPasswordMedico);
		
		txtPasswordMedico = new JTextField();
		txtPasswordMedico.setBounds(196, 67, 228, 20);
		contentPanel.add(txtPasswordMedico);
		txtPasswordMedico.setColumns(10);
		
		JLabel lblCorreoMedico = new JLabel("Correo:");
		lblCorreoMedico.setBounds(136, 110, 46, 14);
		contentPanel.add(lblCorreoMedico);
		
		txtCorreoMedico = new JTextField();
		txtCorreoMedico.setBounds(196, 107, 228, 20);
		contentPanel.add(txtCorreoMedico);
		txtCorreoMedico.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(136, 150, 56, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccionMedico = new JTextField();
		txtDireccionMedico.setBounds(196, 147, 228, 20);
		contentPanel.add(txtDireccionMedico);
		txtDireccionMedico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(136, 190, 56, 14);
		contentPanel.add(lblTelefono);
		
		txtTelefonoMedico = new JTextField();
		txtTelefonoMedico.setBounds(196, 187, 228, 20);
		contentPanel.add(txtTelefonoMedico);
		txtTelefonoMedico.setColumns(10);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(300, 247, 124, 23);
		btnCerrarSesion.setBackground(view.JDialogLogin.secundario);
		contentPanel.add(btnCerrarSesion);
		
		JButton btnAceptarMedico = new JButton("Aceptar");
		btnAceptarMedico.setBounds(196, 247, 89, 23);
		btnAceptarMedico.setBackground(view.JDialogLogin.principal);
		contentPanel.add(btnAceptarMedico);
		
		setVisible(true);
	}
}
