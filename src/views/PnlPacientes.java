package views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		Color transparente = new Color(1.0f, 1.0f, 1.0f, 0.0f);
		setLayout(new BorderLayout(0, 0));

		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		// pnlPrincipal.setBackground(Color.WHITE);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));

		JPanel pnlOeste = new JPanel();
		pnlOeste.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "LISTA PACIENTES",
				TitledBorder.CENTER, TitledBorder.TOP, null, null));
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

		pnlNombre.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "NOMBRE", TitledBorder.CENTER,
				TitledBorder.ABOVE_TOP, null, null));
		pnlNombre.setBackground(transparente);
		pnlNombre.setLayout(new BorderLayout(0, 0));

		txtNombre = new JLabel();
		txtNombre.setOpaque(true);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtNombre.setBorder(null);
		txtNombre.setBackground(Color.WHITE);
		pnlNombre.add(txtNombre, BorderLayout.CENTER);

		JPanel pnlDirección = new JPanel();
		panel_1.add(pnlDirección);

		pnlDirección.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "DIRECCI\u00D3N",
				TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlDirección.setBackground(transparente);
		pnlDirección.setLayout(new BorderLayout(0, 0));

		txtDireccion = new JLabel();
		txtDireccion.setOpaque(true);
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtDireccion.setBorder(null);
		txtDireccion.setBackground(Color.WHITE);
		pnlDirección.add(txtDireccion, BorderLayout.CENTER);

		JPanel pnlApellidos = new JPanel();
		pnlApellidos.setOpaque(false);
		panel_1.add(pnlApellidos);

		pnlApellidos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "APELLIDOS",
				TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlApellidos.setBackground(Color.WHITE);
		pnlApellidos.setLayout(new BorderLayout(0, 0));

		txtApellidos = new JLabel();
		txtApellidos.setOpaque(true);
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtApellidos.setBorder(null);
		txtApellidos.setBackground(Color.WHITE);
		pnlApellidos.add(txtApellidos, BorderLayout.CENTER);

		JPanel pnlTeléfono = new JPanel();
		pnlTeléfono.setOpaque(false);
		panel_1.add(pnlTeléfono);

		pnlTeléfono.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "TEL\u00C9FONO",
				TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlTeléfono.setBackground(Color.WHITE);
		pnlTeléfono.setLayout(new BorderLayout(0, 0));

		txtTelefono = new JLabel();
		txtTelefono.setOpaque(true);
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtTelefono.setBorder(null);
		txtTelefono.setBackground(Color.WHITE);
		pnlTeléfono.add(txtTelefono, BorderLayout.CENTER);

		JPanel pnlCorreo = new JPanel();
		pnlCorreo.setOpaque(false);
		panel_1.add(pnlCorreo);

		pnlCorreo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "CORREO", TitledBorder.CENTER,
				TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlCorreo.setBackground(Color.WHITE);
		pnlCorreo.setLayout(new BorderLayout(0, 0));

		txtCorreo = new JLabel();
		txtCorreo.setOpaque(true);
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtCorreo.setBorder(null);
		txtCorreo.setBackground(Color.WHITE);
		pnlCorreo.add(txtCorreo, BorderLayout.CENTER);

		JPanel pnlDNI = new JPanel();
		pnlDNI.setOpaque(false);
		panel_1.add(pnlDNI);

		pnlDNI.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "DNI", TitledBorder.CENTER,
				TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlDNI.setBackground(Color.WHITE);
		pnlDNI.setLayout(new BorderLayout(0, 0));

		txtDni = new JLabel();
		txtDni.setOpaque(true);
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtDni.setBorder(null);
		txtDni.setBackground(Color.WHITE);
		pnlDNI.add(txtDni, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		pnlCentro.add(panel);
		panel.setLayout(new GridLayout(0, 2, 40, 40));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "HISTORIAL",
				TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_2.setOpaque(false);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		textPaneHistorial = new JTextPane();
		textPaneHistorial.setEditable(false);
		JScrollPane spHistorial = new JScrollPane();
		spHistorial.setViewportView(textPaneHistorial);
		panel_2.add(spHistorial);

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "RECETARIO",
				TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		textPaneRecetario = new JTextPane();
		textPaneRecetario.setEditable(false);
		JScrollPane spRecetario = new JScrollPane();
		spRecetario.setViewportView(textPaneRecetario);
		panel_3.add(spRecetario);

		add(pnlPrincipal);

		controllers.PnlPacientesController.cargarLista();

		// Eventos

		listPacientes.addActionListener(v -> {

			controllers.PnlPacientesController.cargarPaciente();

		});

	}
}
