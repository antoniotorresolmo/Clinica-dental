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
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDialogCompletarCita extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public static JTextArea txtHistorial;
	public static JTextArea txtRecetario;
	public static Cita oCita;

	public JDialogCompletarCita() {
		
		setModal(true);
		setUndecorated(true);
		int iX, iY;

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		iX = (screensize.width - 701) / 2;
		iY = (screensize.height - 502) / 2;
		
		setBounds(iX, iY, 701, 502);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBackground(Color.YELLOW);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(0, 0, 701, 502);
		getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		
		GradientPanel panel_1 = new GradientPanel(Color.decode("#4BE392"), Color.decode("#AFFF4E"));
		panel_4.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "  OBSERVACIONES", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(16, 144, 210, 250);
		panel_1.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtHistorial = new JTextArea();
		panel.add(txtHistorial);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "  RECETA", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(469, 144, 210, 250);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		txtRecetario = new JTextArea();
		panel_2.add(txtRecetario);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_3.setBounds(16, 18, 663, 93);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PASTILLAS JUANOLA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		panel_3.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JPanel pnlCompletar = new JPanel();
		pnlCompletar.setOpaque(false);
		pnlCompletar.setBounds(433, 412, 112, 57);
		panel_1.add(pnlCompletar);
		pnlCompletar.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlCompletar.setLayout(new BorderLayout(0, 0));
		
		JLabel btnCompletar = new JLabel("COMPLETAR");
		btnCompletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				controllers.CompletarCitaController.completarCita();
				dispose();
				
			}
		});
		btnCompletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCompletar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		pnlCompletar.add(btnCompletar, BorderLayout.CENTER);
		btnCompletar.setOpaque(true);
		btnCompletar.setHorizontalAlignment(SwingConstants.CENTER);
		btnCompletar.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JPanel pnlCancelar = new JPanel();
		pnlCancelar.setOpaque(false);
		pnlCancelar.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		pnlCancelar.setBounds(567, 412, 112, 57);
		panel_1.add(pnlCancelar);
		pnlCancelar.setLayout(new BorderLayout(0, 0));
		
		JLabel btnCancelar = new JLabel("CANCELAR");
		btnCancelar.setForeground(Color.RED);
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setOpaque(true);
		btnCancelar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancelar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		pnlCancelar.add(btnCancelar, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setVisible(true);
	}
}
