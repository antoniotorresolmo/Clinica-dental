package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Cita;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class JDialogCompletarCita extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextArea txtHistorial;
	public static JTextArea txtRecetario;
	public static JButton btnCompletar;
	public static Cita oCita;

	public JDialogCompletarCita() {
		
		int iX, iY;

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		iX = (screensize.width - 538) / 2;
		iY = (screensize.height - 162) / 2;
		
		setBounds(iX, iY, 701, 502);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtHistorial = new JTextArea();
		txtHistorial.setBounds(46, 183, 210, 198);
		getContentPane().add(txtHistorial);
		
		txtRecetario = new JTextArea();
		txtRecetario.setBounds(433, 101, 210, 184);
		getContentPane().add(txtRecetario);
		
		btnCompletar = new JButton("Completar cita");
		btnCompletar.setBounds(135, 80, 161, 70);
		getContentPane().add(btnCompletar);
		
		JLabel lblNewLabel = new JLabel("popopo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(262, 237, 195, 171);
		getContentPane().add(lblNewLabel);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		btnCompletar.addActionListener(v -> {
			
			controllers.CompletarCitaController.completarCita();
			dispose();
			
		});
		
		
		setVisible(true);
	}
}
