package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JTextField;

import models.Paciente;
import models.Paciente_Medico;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class PnlPacientes extends JPanel {

	public static JLabel txtNombre;
	public static JLabel lblApellidos;
	public static JLabel txtApellidos;
	public static JLabel txtCorreo;
	public static JLabel txtDireccion;
	public static JLabel txtTelefono;
	public static JLabel txtDni;
	public static List listPacientes;
	public static java.util.List<Paciente> lPacientes;
	public static JTextPane textPaneHistorial;
	public static JTextPane textPaneRecetario;

	public PnlPacientes() {
		setLayout(new BorderLayout(0, 0));
		
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		//pnlPrincipal.setBackground(Color.WHITE);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDatosPaciente = new JLabel("Pacientes");
		lblDatosPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosPaciente.setFont(new Font("Yu Gothic", Font.PLAIN, 25));
		lblDatosPaciente.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(lblDatosPaciente, BorderLayout.NORTH);
		
		JPanel pnlOeste = new JPanel();
		pnlOeste.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlOeste.setLayout(new BorderLayout());
		listPacientes = new List();
		listPacientes.setMultipleSelections(false);
		listPacientes.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlOeste.add(listPacientes, BorderLayout.CENTER);
		pnlPrincipal.add(pnlOeste, BorderLayout.WEST);
		
		GradientPanel pnlCentro = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		pnlCentro.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(pnlCentro, BorderLayout.CENTER);
		pnlCentro.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		// lblNombre.addMouseListener(new MouseAdapter() {
		// 	public void mouseClicked(MouseEvent e) {
				
				
				
		// 	}
		// });
		lblNombre.setBounds(10, 12, 80, 29);
		lblNombre.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblNombre);
		
		txtNombre = new JLabel();
		txtNombre.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		txtNombre.setBounds(100, 9, 266, 32);
		txtNombre.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(txtNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		lblApellidos.setBounds(10, 52, 62, 29);
		lblApellidos.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblApellidos);
		
		txtApellidos = new JLabel();
		txtApellidos.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		txtApellidos.setBounds(100, 49, 266, 32);
		txtApellidos.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(txtApellidos);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		lblCorreo.setBounds(10, 132, 62, 29);
		lblCorreo.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblCorreo);
		
		txtCorreo = new JLabel();
		txtCorreo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtCorreo.setBounds(100, 129, 266, 32);
		txtCorreo.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(txtCorreo);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		lblDireccion.setBounds(10, 92, 80, 29);
		lblDireccion.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblDireccion);
		
		txtDireccion = new JLabel();
		txtDireccion.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		txtDireccion.setBounds(100, 89, 266, 29);
		txtDireccion.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		lblTelefono.setBounds(10, 172, 80, 29);
		lblTelefono.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblTelefono);
		
		txtTelefono = new JLabel();
		txtTelefono.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtTelefono.setBounds(100, 169, 266, 32);
		txtTelefono.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(txtTelefono);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		lblDni.setBounds(10, 212, 46, 34);
		lblDni.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblDni);
		
		txtDni = new JLabel();
		txtDni.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtDni.setBounds(100, 209, 266, 37);
		txtDni.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(txtDni);
		
		JLabel lblHistorial = new JLabel("Historial");
		lblHistorial.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblHistorial.setBounds(10, 257, 100, 27);
		lblHistorial.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblHistorial);
		
		JLabel lblRecetario = new JLabel("Recetario");
		lblRecetario.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblRecetario.setBounds(400, 257, 107, 27);
		lblRecetario.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlCentro.add(lblRecetario);
		
		textPaneHistorial = new JTextPane();
		textPaneHistorial.setBounds(10, 289, 315, 201);
		pnlCentro.add(textPaneHistorial);
		
		textPaneRecetario = new JTextPane();
		textPaneRecetario.setBounds(400, 289, 315, 201);
		pnlCentro.add(textPaneRecetario);

		textPaneHistorial.setEditable(false);
		textPaneRecetario.setEditable(false);
		
		add(pnlPrincipal);

		controllers.PnlPacientesController.cargarLista();

		// Eventos

		listPacientes.addActionListener(v -> {

			controllers.PnlPacientesController.cargarPaciente();

		});

	}
}
