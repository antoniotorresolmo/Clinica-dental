package views;

import java.awt.*;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import models.Cita;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class JDialogClickCita extends JDialog implements IColores {
	
	public static Cita oCita;

	public JDialogClickCita() {
		setUndecorated(true);
		getContentPane().setBackground(Color.YELLOW);
		
		GradientPanel panel = new GradientPanel(Color.decode("#4BE392"), Color.decode("#AFFF4E"));
		
		int iX, iY;

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		iX = (screensize.width - 538) / 2;
		iY = (screensize.height - 162) / 2;
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(iX, iY, 538, 162);
		//setUndecorated(true);
		setResizable(false);
		getContentPane().setLayout(null);
		
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		panel.setBounds(0, 0, 538, 162);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("\u00BFQu\u00E9 desea hacer?");
		lblTitulo.setBounds(10, 0, 512, 38);
		panel.add(lblTitulo);
		lblTitulo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlConjPerfil = new JPanel();
		pnlConjPerfil.setOpaque(false);
		pnlConjPerfil.setBounds(10, 66, 151, 55);
		panel.add(pnlConjPerfil);
		pnlConjPerfil.setLayout(null);
		
		JPanel pnlVerPerfil = new JPanel();
		pnlVerPerfil.setBounds(50, 0, 101, 55);
		pnlConjPerfil.add(pnlVerPerfil);
		pnlVerPerfil.setOpaque(false);
		pnlVerPerfil.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		pnlVerPerfil.setBackground(CLR_SECUNDARIO);
		//Icon iconoEscalado = new ImageIcon(imgEscalada);
		pnlVerPerfil.setLayout(new BorderLayout(0, 0));
		
		
		JLabel lblVerPerfil = new JLabel("VER PERFIL");
		
		lblVerPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVerPerfil.setOpaque(true);
		lblVerPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerPerfil.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		pnlVerPerfil.add(lblVerPerfil);
		
		JLabel lblImagenPerfil = new JLabel();
		lblImagenPerfil.setBounds(0, 12, 50, 43);
		pnlConjPerfil.add(lblImagenPerfil);
		lblImagenPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblImagenPerfil.setIcon(new ImageIcon(JDialogClickCita.class.getResource("/images/ojito.png")));
		
		// Eventos
		
		pnlVerPerfil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				controllers.ClickCitaController.verPerfil();
				dispose();
				
			}
		});
		

		ImageIcon imgIcon = new ImageIcon("images/verPerfil.png");
		
		JPanel pnlConjCompl = new JPanel();
		pnlConjCompl.setOpaque(false);
		pnlConjCompl.setBounds(189, 66, 150, 55);
		panel.add(pnlConjCompl);
		pnlConjCompl.setLayout(null);
		
		JPanel pnlComp = new JPanel();
		pnlComp.setBounds(49, 0, 101, 55);
		pnlConjCompl.add(pnlComp);
		pnlComp.setOpaque(false);
		pnlComp.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		pnlComp.setBackground(new Color(224, 147, 160));
		pnlComp.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCompletar = new JLabel("COMPLETAR");
		lblCompletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controllers.ClickCitaController.completarCita();
				
				dispose();
				
			}
		});
		lblCompletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCompletar.setOpaque(true);
		lblCompletar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompletar.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		pnlComp.add(lblCompletar, BorderLayout.CENTER);
		
		JLabel lblImagenCompletada = new JLabel();
		lblImagenCompletada.setBounds(0, 12, 50, 43);
		pnlConjCompl.add(lblImagenCompletada);
		lblImagenCompletada.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblImagenCompletada.setIcon(new ImageIcon(JDialogClickCita.class.getResource("/images/manita.png")));
		
		JPanel pnlConjCanc = new JPanel();
		pnlConjCanc.setOpaque(false);
		pnlConjCanc.setBounds(371, 66, 151, 55);
		panel.add(pnlConjCanc);
		pnlConjCanc.setLayout(null);
		
		JPanel pnlCancel = new JPanel();
		pnlCancel.setBounds(50, 0, 101, 55);
		pnlConjCanc.add(pnlCancel);
		pnlCancel.setOpaque(false);
		pnlCancel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		pnlCancel.setBackground(new Color(224, 147, 160));
		pnlCancel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCancelar = new JLabel("CANCELAR");
		lblCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCancelar.setOpaque(true);
		lblCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelar.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		pnlCancel.add(lblCancelar, BorderLayout.CENTER);
		
		JLabel lblImgCancel = new JLabel();
		lblImgCancel.setBounds(0, 12, 50, 43);
		pnlConjCanc.add(lblImgCancel);
		lblImgCancel.setIcon(new ImageIcon(JDialogClickCita.class.getResource("/images/dislike.png")));
		lblImgCancel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		setVisible(true);
	}
}
