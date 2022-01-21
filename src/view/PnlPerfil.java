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
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlPerfil extends JPanel {

	private final JPanel contentPanel = new JPanel();
	public static JTextField txtUsuarioMedico;
	public static JTextField txtCorreoMedico;
	public static JTextField txtDireccionMedico;
	public static JTextField txtTelefonoMedico;
	public static JPasswordField txtPasswordMedico;
	public static JTextField txtNombreMedico;
	public static JTextField txtApellidosMedico;

	public PnlPerfil() {
		contentPanel.setBackground(view.JDialogLogin.principal);
		setBounds(100, 100, 450, 342);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setBounds(0, 0, 130, 418);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon("C:\\Users\\JuanLoreLeo\\Desktop\\Proyecto 2\u00BA Trimestre\\Clinica-dental\\src\\images\\perfil.png"));
		lblIcono.setBounds(10, 158, 100, 100);
		panel.add(lblIcono);
		
		JLabel lblUsuarioMedico = new JLabel("Usuario:");
		lblUsuarioMedico.setBounds(140, 113, 46, 14);
		lblUsuarioMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		contentPanel.add(lblUsuarioMedico);
		
		txtUsuarioMedico = new JTextField();
		txtUsuarioMedico.setEditable(false);
		txtUsuarioMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtUsuarioMedico.setBounds(196, 110, 228, 20);
		contentPanel.add(txtUsuarioMedico);
		txtUsuarioMedico.setColumns(10);
		
		JLabel lblPasswordMedico = new JLabel("Password:");
		lblPasswordMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		lblPasswordMedico.setBounds(137, 153, 69, 14);
		contentPanel.add(lblPasswordMedico);
		
		JLabel lblCorreoMedico = new JLabel("Correo:");
		lblCorreoMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		lblCorreoMedico.setBounds(136, 193, 46, 14);
		contentPanel.add(lblCorreoMedico);
		
		txtCorreoMedico = new JTextField();
		txtCorreoMedico.setEditable(false);
		txtCorreoMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtCorreoMedico.setBounds(196, 190, 228, 20);
		contentPanel.add(txtCorreoMedico);
		txtCorreoMedico.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Quicksand", Font.PLAIN, 11));
		lblDireccion.setBounds(140, 233, 56, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccionMedico = new JTextField();
		txtDireccionMedico.setEditable(false);
		txtDireccionMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtDireccionMedico.setBounds(196, 230, 228, 20);
		contentPanel.add(txtDireccionMedico);
		txtDireccionMedico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Quicksand", Font.PLAIN, 11));
		lblTelefono.setBounds(140, 273, 56, 14);
		contentPanel.add(lblTelefono);
		
		txtTelefonoMedico = new JTextField();
		txtTelefonoMedico.setEditable(false);
		txtTelefonoMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtTelefonoMedico.setBounds(196, 270, 228, 20);
		contentPanel.add(txtTelefonoMedico);
		txtTelefonoMedico.setColumns(10);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new view.JDialogLogin();
			}
		});
		btnCerrarSesion.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnCerrarSesion.setBounds(247, 369, 124, 23);
		btnCerrarSesion.setBackground(view.JDialogLogin.secundario);
		contentPanel.add(btnCerrarSesion);
		
		JButton btnAceptarMedico = new JButton("Aceptar");
		btnAceptarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			}
		});
		btnAceptarMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnAceptarMedico.setBounds(196, 335, 89, 23);
		btnAceptarMedico.setBackground(Color.BLUE);
		contentPanel.add(btnAceptarMedico);
		
		txtPasswordMedico = new JPasswordField();
		txtPasswordMedico.setEditable(false);
		txtPasswordMedico.setBounds(196, 150, 228, 20);
		contentPanel.add(txtPasswordMedico);
		
		JLabel lblNombreMedico = new JLabel("Nombre:");
		lblNombreMedico.setBounds(140, 33, 46, 14);
		contentPanel.add(lblNombreMedico);
		
		txtNombreMedico = new JTextField();
		txtNombreMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtNombreMedico.setBounds(196, 30, 228, 20);
		contentPanel.add(txtNombreMedico);
		txtNombreMedico.setColumns(10);
		
		JLabel lblApellidosMedico = new JLabel("Apellidos:");
		lblApellidosMedico.setBounds(140, 73, 46, 14);
		contentPanel.add(lblApellidosMedico);
		
		txtApellidosMedico = new JTextField();
		txtApellidosMedico.setEditable(false);
		txtApellidosMedico.setBounds(196, 70, 228, 20);
		contentPanel.add(txtApellidosMedico);
		txtApellidosMedico.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ctrl.CtrlPrincipal.camposEditables();
			}
		});
		btnModificar.setBackground(new Color(0, 0, 255));
		btnModificar.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnModificar.setBounds(265, 301, 89, 23);
		contentPanel.add(btnModificar);
		
		JButton btnCancelarMedico = new JButton("Cancelar");
		btnCancelarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			};
		});
		btnCancelarMedico.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnCancelarMedico.setBounds(335, 335, 89, 23);
		btnCancelarMedico.setBackground(view.JDialogLogin.secundario);
		contentPanel.add(btnCancelarMedico);
		
		setVisible(true);
	}
}
