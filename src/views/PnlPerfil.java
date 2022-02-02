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
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;

public class PnlPerfil extends JPanel {
	
	public static JTextField txtNombre;
	public static JTextField txtApellidos;
	public static JTextField txtUsuario;
	public static JPasswordField txtPassword;
	public static JTextField txtCorreo;
	public static JTextField txtDireccion;
	public static JTextField txtTelefono;
	Color transparente = new Color(1.0f, 1.0f, 1.0f, 0.0f);
	int iXLbl1 = 270;
	int iXPnl1 = 400;

	public PnlPerfil() {
		setLayout(new BorderLayout(0, 0));
		
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		pnlPrincipal.setLayout(new BorderLayout(0, 0));

		// PnlSur
		
		JPanel pnlSur = new JPanel();
		pnlSur.setOpaque(false);
		FlowLayout fl_pnlSur = (FlowLayout) pnlSur.getLayout();
		fl_pnlSur.setVgap(20);
		fl_pnlSur.setAlignment(FlowLayout.RIGHT);

		JButton btnModificar = new JButton("  MODIFICAR  ");
		//btnModificar.setContentAreaFilled(false);
		btnModificar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnModificar.setBackground(Color.WHITE);

		btnModificar.setSelected(true);
		btnModificar.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));


		pnlSur.add(btnModificar);

		JButton btnGuardar = new JButton("  GUARDAR  ");
		btnGuardar.setVisible(false);
		
		btnGuardar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setSelected(true);
		btnGuardar.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		pnlSur.add(btnGuardar);

		JButton btnCancelar = new JButton("  CANCELAR  ");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setVisible(false);
		
		btnCancelar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCancelar.setBackground(new Color(139, 0, 0));
		btnCancelar.setSelected(true);
		btnCancelar.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		pnlSur.add(btnCancelar);
		
		pnlPrincipal.add(pnlSur, BorderLayout.SOUTH);
		
		// PnlCentro

		JPanel pnlCentro = new JPanel();
		pnlCentro.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		pnlCentro.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(pnlCentro, BorderLayout.CENTER);
		pnlCentro.setLayout(new GridLayout(0, 2, 40, 80));
		
		JPanel pnlNombre = new JPanel();
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "NOMBRE", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		pnlNombre.setBackground(Color.WHITE);
		pnlCentro.add(pnlNombre);
		pnlNombre.setLayout(new BorderLayout(0, 0));
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlNombre.add(txtNombre);
		txtNombre.setBorder(null);
		txtNombre.setEditable(false);
		txtNombre.setBackground(Color.WHITE);
		
		JPanel pnlCorreo = new JPanel();
		pnlCorreo.setOpaque(false);
		pnlCorreo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "CORREO", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		pnlCorreo.setBackground(Color.WHITE);
		pnlCentro.add(pnlCorreo);
		pnlCorreo.setLayout(new BorderLayout(0, 0));
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCorreo.setEditable(false);
		txtCorreo.setBorder(null);
		txtCorreo.setBackground(Color.WHITE);
		pnlCorreo.add(txtCorreo);
		
		JPanel pnlApellidos = new JPanel();
		pnlApellidos.setOpaque(false);
		pnlApellidos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "APELLIDOS", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlApellidos.setBackground(Color.WHITE);
		pnlCentro.add(pnlApellidos);
		pnlApellidos.setLayout(new BorderLayout(0, 0));
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtApellidos.setEditable(false);
		txtApellidos.setBorder(null);
		txtApellidos.setBackground(Color.WHITE);
		pnlApellidos.add(txtApellidos);
		
		JPanel pnlDireccion = new JPanel();
		pnlDireccion.setOpaque(false);
		pnlDireccion.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "DIRECCI\u00D3N", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlDireccion.setBackground(Color.WHITE);
		pnlCentro.add(pnlDireccion);
		pnlDireccion.setLayout(new BorderLayout(0, 0));
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDireccion.setEditable(false);
		txtDireccion.setBorder(null);
		txtDireccion.setBackground(Color.WHITE);
		pnlDireccion.add(txtDireccion);
		
		JPanel pnlUsuario = new JPanel();
		pnlUsuario.setOpaque(false);
		pnlUsuario.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "USUARIO", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		pnlUsuario.setBackground(Color.WHITE);
		pnlCentro.add(pnlUsuario);
		pnlUsuario.setLayout(new BorderLayout(0, 0));
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsuario.setEditable(false);
		txtUsuario.setBorder(null);
		txtUsuario.setBackground(Color.WHITE);
		pnlUsuario.add(txtUsuario);
		
		JPanel pnlPassword = new JPanel();
		pnlPassword.setOpaque(false);
		pnlPassword.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "CONTRASE\u00D1A", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlPassword.setBackground(new Color(255, 255, 255));
		pnlCentro.add(pnlPassword);
		pnlPassword.setLayout(new BorderLayout(0, 0));
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setEditable(false);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.WHITE);
		pnlPassword.add(txtPassword);
		
		JPanel pnlTelefono = new JPanel();
		pnlTelefono.setOpaque(false);
		pnlTelefono.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "TEL\u00C9FONO", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		pnlTelefono.setBackground(Color.WHITE);
		pnlCentro.add(pnlTelefono);
		pnlTelefono.setLayout(new BorderLayout(0, 0));
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTelefono.setEditable(false);
		txtTelefono.setBorder(null);
		txtTelefono.setBackground(Color.WHITE);
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
		
		JPanel pnlFoto = new JPanel();
		pnlFoto.setOpaque(false);
		pnlPrincipal.add(pnlFoto, BorderLayout.NORTH);
		pnlFoto.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		
		JLabel lblAvatar = new JLabel("");
		lblAvatar.setIcon(new ImageIcon(PnlPerfil.class.getResource("/images/avatar.png")));
		pnlFoto.add(lblAvatar);
		
		JLabel espacio = new JLabel("                                                          ");
		pnlPrincipal.add(espacio, BorderLayout.WEST);
		
		JLabel espacio2 = new JLabel("                                                          ");
		pnlPrincipal.add(espacio2, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PnlPerfil.class.getResource("/images/avatar.png")));

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
