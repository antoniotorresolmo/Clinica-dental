package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class JDialogCita extends JDialog {

	public JDialogCita() {
		GradientPanel contentPanel = new GradientPanel(Color.decode("#AEDFF2"), Color.decode("#04C4D9"),GradientPanel.DIAGONAL_DOWN);
		
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(0,0,800,513);
		contentPanel.setBounds(0, 0, 800, 513);
		getContentPane().setLayout(null);
		
		JLabel lblPaciente = new JLabel("Pepito Grillo");
		lblPaciente.setBounds(128, 23, 166, 40);
		lblPaciente.setOpaque(true);
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaciente.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblPaciente.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblPaciente.setBackground(Color.WHITE);
		
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Pepito Grillo Tena");
		lblNombre.setBounds(0, 43, 800, 40);
		contentPanel.add(lblNombre);
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNombre.setBackground(new Color(255, 255, 255));
		lblNombre.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		getContentPane().add(contentPanel);
		
		JLabel lblHistorial = new JLabel("HISTORIAL");
		lblHistorial.setOpaque(true);
		lblHistorial.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistorial.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		lblHistorial.setBackground(new Color(255, 255, 255));
		lblHistorial.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblHistorial.setBounds(96, 124, 166, 40);
		contentPanel.add(lblHistorial);
		
		JLabel lblReceta = new JLabel("RECETA");
		lblReceta.setOpaque(true);
		lblReceta.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceta.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		lblReceta.setBackground(new Color(255, 255, 255));
		lblReceta.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblReceta.setBounds(545, 124, 166, 40);
		contentPanel.add(lblReceta);
		
		JTextArea txtReceta = new JTextArea();
		txtReceta.setBounds(466, 203, 311, 154);
		contentPanel.add(txtReceta);
		
		JTextArea txtHistorial = new JTextArea();
		txtHistorial.setBounds(23, 203, 311, 154);
		contentPanel.add(txtHistorial);
		
		JLabel lblNewLabel_3_1 = new JLabel("X");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(769, 11, 21, 28);
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "¿Quieres cerrar la aplicación?") == 0)
					System.exit(0);
			}
		});
		contentPanel.add(lblNewLabel_3_1);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setSelected(true);
		btnAceptar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnAceptar.setBackground(Color.decode("#0487D9"));
		btnAceptar.setBounds(556, 442, 99, 28);
		contentPanel.add(btnAceptar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setSelected(true);
		btnCancelar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnCancelar.setBackground(Color.decode("#8C0303"));
		btnCancelar.setBounds(678, 442, 99, 28);
		contentPanel.add(btnCancelar);
		setVisible(true);
	}
}
