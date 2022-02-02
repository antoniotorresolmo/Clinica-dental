package views;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.JTree;
import javax.swing.border.MatteBorder;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;

public class PnlPerfil extends JPanel {
	
	public static JTextField txtNombre;
	public static JTextField txtApellidos;
	public static JTextField txtUsuario;
	public static JPasswordField txtPassword;
	public static JTextField txtCorreo;
	public static JTextField txtDireccion;
	public static JTextField txtTelefono;
	int iXLbl1 = 270;
	int iXPnl1 = 400;

	public PnlPerfil() {
		setLayout(new BorderLayout(0, 0));
		
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		pnlPrincipal.setLayout(new BorderLayout(0, 0));

		// PnlSur
		
		JPanel pnlSur = new JPanel();
		pnlSur.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		FlowLayout fl_pnlSur = (FlowLayout) pnlSur.getLayout();
		fl_pnlSur.setAlignment(FlowLayout.RIGHT);

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setContentAreaFilled(false);
		btnModificar.setSelected(true);
		btnModificar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnModificar.setBackground(views.JDialogLogin.principal);
		btnModificar.setBorderPainted(false);
		btnModificar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		pnlSur.add(btnModificar);

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setVisible(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setSelected(true);
		btnGuardar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnGuardar.setBorderPainted(false);
		btnGuardar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnGuardar.setBackground(new Color(137, 207, 240));
		pnlSur.add(btnGuardar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setVisible(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setSelected(true);
		btnCancelar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnCancelar.setBackground(views.JDialogLogin.secundario);
		pnlSur.add(btnCancelar);
		
		pnlPrincipal.add(pnlSur, BorderLayout.SOUTH);
		
		// PnlCentro

		JPanel pnlCentro = new JPanel();
		pnlCentro.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(pnlCentro, BorderLayout.CENTER);
		pnlCentro.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblNombre.setBounds(269, 140, 115, 41);
		pnlCentro.add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblApellidos.setBounds(269, 240, 115, 41);
		pnlCentro.add(lblApellidos);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblUsuario.setBounds(269, 340, 115, 41);
		pnlCentro.add(lblUsuario);

		JLabel lblPassword = new JLabel("Contrase\u00F1a:");
		lblPassword.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPassword.setBounds(269, 440, 115, 41);
		pnlCentro.add(lblPassword);

		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblCorreo.setBounds(705, 188, 138, 41);
		pnlCentro.add(lblCorreo);

		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblDireccion.setBounds(705, 288, 138, 41);
		pnlCentro.add(lblDireccion);

		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblTelefono.setBounds(705, 388, 138, 41);
		pnlCentro.add(lblTelefono);
		
		JPanel pnlNombre = new JPanel();
		pnlNombre.setLayout(null);
		pnlNombre.setBackground(Color.WHITE);
		pnlNombre.setBounds(399, 138, 250, 50);
		pnlCentro.add(pnlNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtNombre.setBorder(null);
		txtNombre.setBounds(10, 11, 230, 28);
		txtNombre.setEditable(false);
		pnlNombre.add(txtNombre);
		txtNombre.setBackground(Color.WHITE);
		
		JPanel pnlApellidos = new JPanel();
		pnlApellidos.setLayout(null);
		pnlApellidos.setBackground(Color.WHITE);
		pnlApellidos.setBounds(399, 238, 250, 50);
		pnlCentro.add(pnlApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtApellidos.setEditable(false);
		txtApellidos.setBorder(null);
		txtApellidos.setBackground(Color.WHITE);
		txtApellidos.setBounds(10, 11, 230, 28);
		pnlApellidos.add(txtApellidos);
		
		JPanel pnlUsuario = new JPanel();
		pnlUsuario.setLayout(null);
		pnlUsuario.setBackground(Color.WHITE);
		pnlUsuario.setBounds(399, 338, 250, 50);
		pnlCentro.add(pnlUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtUsuario.setEditable(false);
		txtUsuario.setBorder(null);
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setBounds(10, 11, 230, 28);
		pnlUsuario.add(txtUsuario);
		
		JPanel pnlPassword = new JPanel();
		pnlPassword.setLayout(null);
		pnlPassword.setBackground(Color.WHITE);
		pnlPassword.setBounds(399, 438, 250, 50);
		pnlCentro.add(pnlPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtPassword.setEditable(false);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.WHITE);
		txtPassword.setBounds(10, 11, 230, 28);
		pnlPassword.add(txtPassword);
		
		JPanel pnlCorreo = new JPanel();
		pnlCorreo.setLayout(null);
		pnlCorreo.setBackground(Color.WHITE);
		pnlCorreo.setBounds(835, 186, 250, 50);
		pnlCentro.add(pnlCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtCorreo.setEditable(false);
		txtCorreo.setBorder(null);
		txtCorreo.setBackground(Color.WHITE);
		txtCorreo.setBounds(10, 11, 230, 28);
		pnlCorreo.add(txtCorreo);
		
		JPanel pnlDireccion = new JPanel();
		pnlDireccion.setLayout(null);
		pnlDireccion.setBackground(Color.WHITE);
		pnlDireccion.setBounds(835, 286, 250, 50);
		pnlCentro.add(pnlDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtDireccion.setEditable(false);
		txtDireccion.setBorder(null);
		txtDireccion.setBackground(Color.WHITE);
		txtDireccion.setBounds(10, 11, 230, 28);
		pnlDireccion.add(txtDireccion);
		
		JPanel pnlTelefono = new JPanel();
		pnlTelefono.setLayout(null);
		pnlTelefono.setBackground(Color.WHITE);
		pnlTelefono.setBounds(835, 386, 250, 50);
		pnlCentro.add(pnlTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
		txtTelefono.setEditable(false);
		txtTelefono.setBorder(null);
		txtTelefono.setBackground(Color.WHITE);
		txtTelefono.setBounds(10, 11, 230, 28);
		pnlTelefono.add(txtTelefono);
		
		// Eventos
		
		btnModificar.addActionListener(v -> {
			
			btnGuardar.setVisible(true);
			btnCancelar.setVisible(true);
			btnModificar.setVisible(false);
			
			ponerEditables();
			
		});
	
		btnGuardar.addActionListener(v -> {
			
			btnGuardar.setVisible(false);
			btnCancelar.setVisible(false);
			btnModificar.setVisible(true);
			
			String sResultado;
			try {
				
				logic.LogicMedico.actualizar();
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No se ha podido actualizar", "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			
			
		});
		
		btnCancelar.addActionListener(v -> {
			
			btnGuardar.setVisible(false);
			btnCancelar.setVisible(false);
			btnModificar.setVisible(true);
			
			controllers.PerfilController.cargarDatos();
			
		});
		
		controllers.PerfilController.cargarDatos();
		
		add(pnlPrincipal, BorderLayout.CENTER);

	}
	
	private void ponerEditables() {
		
		txtNombre.setEditable(true);
		txtPassword.setEditable(true);
		txtUsuario.setEditable(true);
		txtApellidos.setEditable(true);
		txtCorreo.setEditable(true);
		txtDireccion.setEditable(true);
		txtTelefono.setEditable(true);
		
	}
	
	private void quitarEditables() {
		
		txtNombre.setEditable(false);
		txtPassword.setEditable(false);
		txtUsuario.setEditable(false);
		txtApellidos.setEditable(false);
		txtCorreo.setEditable(false);
		txtDireccion.setEditable(false);
		txtTelefono.setEditable(false);
		
	}
}
