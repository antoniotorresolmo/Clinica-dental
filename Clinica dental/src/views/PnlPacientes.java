package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JTextField;

import models.Paciente;
import models.Paciente_Medico;
import javax.swing.JTextPane;

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
		
		JLabel lblDatosPaciente = new JLabel("Pacientes");
		lblDatosPaciente.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		add(lblDatosPaciente, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		listPacientes = new List();
		add(listPacientes, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		// lblNombre.addMouseListener(new MouseAdapter() {
		// 	public void mouseClicked(MouseEvent e) {
				
				
				
		// 	}
		// });
		lblNombre.setBounds(10, 12, 62, 14);
		panel_1.add(lblNombre);
		
		txtNombre = new JLabel();
		txtNombre.setBounds(100, 9, 266, 20);
		panel_1.add(txtNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 52, 62, 14);
		panel_1.add(lblApellidos);
		
		txtApellidos = new JLabel();
		txtApellidos.setBounds(100, 49, 266, 20);
		panel_1.add(txtApellidos);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 132, 46, 14);
		panel_1.add(lblCorreo);
		
		txtCorreo = new JLabel();
		txtCorreo.setBounds(100, 129, 266, 20);
		panel_1.add(txtCorreo);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(10, 92, 62, 14);
		panel_1.add(lblDireccion);
		
		txtDireccion = new JLabel();
		txtDireccion.setBounds(100, 89, 266, 20);
		panel_1.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 172, 62, 14);
		panel_1.add(lblTelefono);
		
		txtTelefono = new JLabel();
		txtTelefono.setBounds(100, 169, 266, 20);
		panel_1.add(txtTelefono);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 212, 46, 14);
		panel_1.add(lblDni);
		
		txtDni = new JLabel();
		txtDni.setBounds(100, 209, 266, 20);
		panel_1.add(txtDni);
		
		JLabel lblHistorial = new JLabel("Historial");
		lblHistorial.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblHistorial.setBounds(10, 257, 87, 27);
		panel_1.add(lblHistorial);
		
		JLabel lblRecetario = new JLabel("Recetario");
		lblRecetario.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblRecetario.setBounds(400, 257, 87, 27);
		panel_1.add(lblRecetario);
		
		textPaneHistorial = new JTextPane();
		textPaneHistorial.setBounds(10, 289, 315, 201);
		panel_1.add(textPaneHistorial);
		
		textPaneRecetario = new JTextPane();
		textPaneRecetario.setBounds(400, 289, 315, 201);
		panel_1.add(textPaneRecetario);

		textPaneHistorial.setEditable(false);
		textPaneRecetario.setEditable(false);

		controllers.PnlPacientesController.cargarLista();

		// Eventos

		listPacientes.addActionListener(v -> {

			controllers.PnlPacientesController.cargarPaciente();

		});

	}
}
