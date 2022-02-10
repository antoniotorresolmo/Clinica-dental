package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.PnlInicioController;
import models.Cita;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogCompletarCita extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextArea txtHistorial;
	public static JTextArea txtRecetario;
	public static JButton btnCompletar;
	public static Cita oCita;

	public JDialogCompletarCita() {
		setUndecorated(true);
		int iX, iY;

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		iX = (screensize.width - 538) / 2;
		iY = (screensize.height - 162) / 2;
		
		setBounds(iX, iY, 701, 502);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtHistorial = new JTextArea();
		txtHistorial.setBounds(10, 101, 210, 198);
		getContentPane().add(txtHistorial);
		
		txtRecetario = new JTextArea();
		txtRecetario.setBounds(481, 101, 210, 198);
		getContentPane().add(txtRecetario);
		
		btnCompletar = new JButton("Completar cita");
		btnCompletar.setBounds(59, 421, 161, 70);
		getContentPane().add(btnCompletar);
		
		JLabel lblNewLabel = new JLabel("popopo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(230, 101, 195, 171);
		getContentPane().add(lblNewLabel);
		
		JButton btnCancelar = new JButton("New button");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(421, 421, 195, 70);
		getContentPane().add(btnCancelar);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		btnCompletar.addActionListener(v -> {
			
			controllers.CompletarCitaController.completarCita();
			PnlInicioController.cargarTodo();
			dispose();
			
		});
		
		
		setVisible(true);
	}
}
