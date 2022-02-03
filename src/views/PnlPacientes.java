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
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class PnlPacientes extends JPanel {
	public static List listPacientes;
	public static java.util.List<Paciente> lPacientes;
	public static JTextPane textPaneHistorial;
	public static JTextPane textPaneRecetario;
	public static JTextField txtApellidos;
	public static JTextField txtNombre;
	public static JTextField txtCorreo;
	public static JTextField txtDNI;
	public static JTextField txtTeléfono;
	public static JTextField txtDirección;

	public PnlPacientes() {
		setLayout(new BorderLayout(0, 0));
		
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		//pnlPrincipal.setBackground(Color.WHITE);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlOeste = new JPanel();
		pnlOeste.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "LISTA PACIENTES", TitledBorder.CENTER, TitledBorder.TOP, null, null));
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
		pnlCentro.setLayout(new GridLayout(0, 1, 50, 50));
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		pnlCentro.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 50, 70));
		
		JPanel pnlNombre = new JPanel();
		panel_1.add(pnlNombre);
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "NOMBRE", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		pnlNombre.setBackground(Color.WHITE);
		pnlNombre.setLayout(new BorderLayout(0, 0));
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombre.setEditable(false);
		txtNombre.setBorder(null);
		txtNombre.setBackground(Color.WHITE);
		pnlNombre.add(txtNombre, BorderLayout.CENTER);
		
		JPanel pnlDirección = new JPanel();
		panel_1.add(pnlDirección);
		pnlDirección.setOpaque(false);
		pnlDirección.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "DIRECCI\u00D3N", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlDirección.setBackground(Color.WHITE);
		pnlDirección.setLayout(new BorderLayout(0, 0));
		
		txtDirección = new JTextField();
		txtDirección.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDirección.setEditable(false);
		txtDirección.setBorder(null);
		txtDirección.setBackground(Color.WHITE);
		pnlDirección.add(txtDirección, BorderLayout.CENTER);
		
		JPanel pnlApellidos = new JPanel();
		panel_1.add(pnlApellidos);
		pnlApellidos.setOpaque(false);
		pnlApellidos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "APELLIDOS", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlApellidos.setBackground(Color.WHITE);
		pnlApellidos.setLayout(new BorderLayout(0, 0));
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtApellidos.setEditable(false);
		txtApellidos.setBorder(null);
		txtApellidos.setBackground(Color.WHITE);
		pnlApellidos.add(txtApellidos, BorderLayout.CENTER);
		
		JPanel pnlTeléfono = new JPanel();
		panel_1.add(pnlTeléfono);
		pnlTeléfono.setOpaque(false);
		pnlTeléfono.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "TEL\u00C9FONO", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlTeléfono.setBackground(Color.WHITE);
		pnlTeléfono.setLayout(new BorderLayout(0, 0));
		
		txtTeléfono = new JTextField();
		txtTeléfono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTeléfono.setEditable(false);
		txtTeléfono.setBorder(null);
		txtTeléfono.setBackground(Color.WHITE);
		pnlTeléfono.add(txtTeléfono, BorderLayout.CENTER);
		
		JPanel pnlCorreo = new JPanel();
		panel_1.add(pnlCorreo);
		pnlCorreo.setOpaque(false);
		pnlCorreo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "CORREO", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlCorreo.setBackground(Color.WHITE);
		pnlCorreo.setLayout(new BorderLayout(0, 0));
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCorreo.setEditable(false);
		txtCorreo.setBorder(null);
		txtCorreo.setBackground(Color.WHITE);
		pnlCorreo.add(txtCorreo, BorderLayout.CENTER);
		
		JPanel pnlDNI = new JPanel();
		panel_1.add(pnlDNI);
		pnlDNI.setOpaque(false);
		pnlDNI.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "DNI", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlDNI.setBackground(Color.WHITE);
		pnlDNI.setLayout(new BorderLayout(0, 0));
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDNI.setEditable(false);
		txtDNI.setBorder(null);
		txtDNI.setBackground(Color.WHITE);
		pnlDNI.add(txtDNI, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		pnlCentro.add(panel);
		panel.setLayout(new GridLayout(0, 2, 40, 40));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "HISTORIAL", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_2.setOpaque(false);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		textPaneHistorial = new JTextPane();
		panel_2.add(textPaneHistorial);
		
				textPaneHistorial.setEditable(false);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "RECETARIO", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		textPaneRecetario = new JTextPane();
		panel_3.add(textPaneRecetario);
		textPaneRecetario.setEditable(false);
		
		add(pnlPrincipal);

		controllers.PnlPacientesController.cargarLista();

		// Eventos

		listPacientes.addActionListener(v -> {

			controllers.PnlPacientesController.cargarPaciente();

		});

	}
}
