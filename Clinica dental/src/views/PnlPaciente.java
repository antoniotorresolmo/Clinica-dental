package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import javax.swing.JTextField;

public class PnlPaciente extends JPanel {
	public static JLabel txtNombre;
	public static JLabel lblApellidos;
	public static JLabel txtApellidos;
	public static JLabel txtCorreo;
	public static JLabel textField;
	public static JLabel txtTelefono;
	public static JLabel textField_1;

	/**
	 * Create the panel.
	 */
	public PnlPaciente() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblDatosPaciente = new JLabel("Pacientes");
		lblDatosPaciente.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		add(lblDatosPaciente, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		List listPacientes = new List();
		add(listPacientes, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 12, 62, 14);
		panel_1.add(lblNombre);
		
		txtNombre = new JLabel();
		txtNombre.setBounds(64, 9, 266, 20);
		panel_1.add(txtNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 52, 62, 14);
		panel_1.add(lblApellidos);
		
		txtApellidos = new JLabel();
		txtApellidos.setBounds(64, 49, 266, 20);
		panel_1.add(txtApellidos);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 132, 46, 14);
		panel_1.add(lblCorreo);
		
		txtCorreo = new JLabel();
		txtCorreo.setBounds(64, 129, 266, 20);
		panel_1.add(txtCorreo);
		
		JLabel lblDireccion = new JLabel("Direeci\u00F3n:");
		lblDireccion.setBounds(10, 92, 62, 14);
		panel_1.add(lblDireccion);
		
		textField = new JLabel();
		textField.setBounds(64, 89, 266, 20);
		panel_1.add(textField);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 172, 62, 14);
		panel_1.add(lblTelefono);
		
		txtTelefono = new JLabel();
		txtTelefono.setBounds(64, 169, 266, 20);
		panel_1.add(txtTelefono);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 212, 46, 14);
		panel_1.add(lblDni);
		
		textField_1 = new JLabel();
		textField_1.setBounds(64, 209, 266, 20);
		panel_1.add(textField_1);

	}
}
