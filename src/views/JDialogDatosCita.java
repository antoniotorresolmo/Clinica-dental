package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;

import models.Paciente;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;




public class JDialogDatosCita extends JDialog {

	
	GradientPanel contentPanel = new GradientPanel(Color.decode("#4BE392"), Color.decode("#AFFF4E"));
	
	public static JComboBox cbNombre = new JComboBox();
	public static JComboBox cbOperacion = new JComboBox();
	public static JComboBox cbHora = new JComboBox();
	public static List<Paciente> lPacientes = new ArrayList<Paciente>();
	public static boolean isEditing = false;
	public static int iCitaSeleccionada;
	public static int iPacienteSeleccionado;

	public JDialogDatosCita() {
		
		int iX, iY;

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		iX = (screensize.width - 450) / 2;
		iY = (screensize.height - 300) / 2;

		setModal(true);
		setUndecorated(true);

		setTitle("Datos cita");
		setBounds(iX, iY, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		cbNombre.setBounds(30, 67, 390, 22);
		contentPanel.add(cbNombre);

		cbOperacion.setBounds(30, 130, 390, 22);
		contentPanel.add(cbOperacion);
		cbHora.setBackground(Color.WHITE);

		cbHora.setBounds(30, 191, 390, 22);
		contentPanel.add(cbHora);

		JButton btnAdd = new JButton("A\u00F1adir");
		btnAdd.setSelected(true);
		btnAdd.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnAdd.setBorderPainted(false);
		btnAdd.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(229, 266, 89, 23);
		contentPanel.add(btnAdd);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setSelected(true);
		btnCancelar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(331, 266, 89, 23);
		contentPanel.add(btnCancelar);
		
		controllers.DatosCitaController.cargarHoras();
		controllers.DatosCitaController.cargarOperaciones();
		controllers.DatosCitaController.cargarPacientes();
		
		// Eventos
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isEditing) {
					controllers.DatosCitaController.actualizarCita();
				}else {
					controllers.DatosCitaController.addCita();	
				}
				
							
				
				dispose();
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbNombre.removeAllItems();

				cbOperacion.removeAllItems();

				cbHora.removeAllItems();
				dispose();
			}
		});
		
		setVisible(true);
		
	}
}
