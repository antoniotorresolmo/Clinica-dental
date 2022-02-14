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
		
		
		panel.setBounds(0, 0, 522, 123);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("\u00BFQu\u00E9 desea hacer?");
		lblTitulo.setBounds(0, 0, 522, 38);
		panel.add(lblTitulo);
		lblTitulo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlVerPerfil = new JPanel();
		pnlVerPerfil.setOpaque(false);
		pnlVerPerfil.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		pnlVerPerfil.setBounds(60, 37, 101, 55);
		panel.add(pnlVerPerfil);
		pnlVerPerfil.setBackground(CLR_SECUNDARIO);
		

		ImageIcon imgIcon = new ImageIcon("images/verPerfil.png");
		//Icon iconoEscalado = new ImageIcon(imgEscalada);
		pnlVerPerfil.setLayout(new BorderLayout(0, 0));
		
		
		JLabel lblVerPerfil = new JLabel("VER PERFIL");
		
		lblVerPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVerPerfil.setOpaque(true);
		lblVerPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerPerfil.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 13));
		pnlVerPerfil.add(lblVerPerfil);
		
		JLabel lblImagenPerfil = new JLabel();
		lblImagenPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagenPerfil.setBounds(10, 49, 50, 43);
		panel.add(lblImagenPerfil);
		Image imgEscalada = imgIcon.getImage().getScaledInstance(lblImagenPerfil.getWidth(),lblImagenPerfil.getHeight(), Image.SCALE_SMOOTH);
		lblImagenPerfil.setIcon(new ImageIcon(JDialogClickCita.class.getResource("/images/ojito.png")));
		
		JPanel pnlComp = new JPanel();
		pnlComp.setOpaque(false);
		pnlComp.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		pnlComp.setBackground(new Color(224, 147, 160));
		pnlComp.setBounds(239, 37, 101, 55);
		panel.add(pnlComp);
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
		lblImagenCompletada.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagenCompletada.setBounds(190, 49, 50, 43);
		panel.add(lblImagenCompletada);
		imgEscalada = imgIcon.getImage().getScaledInstance(lblImagenCompletada.getWidth(),lblImagenCompletada.getHeight(), Image.SCALE_SMOOTH);
		lblImagenCompletada.setIcon(new ImageIcon(JDialogClickCita.class.getResource("/images/manita.png")));
		
		JPanel pnlCancel = new JPanel();
		pnlCancel.setOpaque(false);
		pnlCancel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " ", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		pnlCancel.setBackground(new Color(224, 147, 160));
		pnlCancel.setBounds(410, 37, 101, 55);
		panel.add(pnlCancel);
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
		lblImgCancel.setIcon(new ImageIcon(JDialogClickCita.class.getResource("/images/dislike.png")));
		lblImgCancel.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgCancel.setBounds(360, 49, 50, 43);
		panel.add(lblImgCancel);
		
		// Eventos
		
		pnlVerPerfil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				controllers.ClickCitaController.verPerfil();
				dispose();
				
			}
		});
		
		
		
		setVisible(true);
	}
}
