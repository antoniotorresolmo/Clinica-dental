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

public class JDialogClickCita extends JDialog implements IColores {
	
	public static Cita oCita;

	public JDialogClickCita() {
		
		int iX, iY;

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		iX = (screensize.width - 538) / 2;
		iY = (screensize.height - 162) / 2;
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(iX, iY, 538, 162);
		//setUndecorated(true);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("\u00BFQu\u00E9 desea hacer?");
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 11, 522, 38);
		getContentPane().add(lblTitulo);
		
		JPanel pnlVerPerfil = new JPanel();
		pnlVerPerfil.setBackground(CLR_SECUNDARIO);
		pnlVerPerfil.setBounds(22, 65, 135, 38);
		getContentPane().add(pnlVerPerfil);
		pnlVerPerfil.setLayout(null);
		
		JLabel lblImagenPerfil = new JLabel();
		lblImagenPerfil.setBounds(15, 8, 25, 25);
		
		ImageIcon imgIcon = new ImageIcon("images/verPerfil.png");
		Image imgEscalada = imgIcon.getImage().getScaledInstance(lblImagenPerfil.getWidth(),lblImagenPerfil.getHeight(), Image.SCALE_SMOOTH);
		Icon iconoEscalado = new ImageIcon(imgEscalada);
		lblImagenPerfil.setIcon(iconoEscalado);
		
		pnlVerPerfil.add(lblImagenPerfil);
		
		JLabel lblVerPerfil = new JLabel("Ver perfil");
		lblVerPerfil.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblVerPerfil.setBounds(55, 0, 70, 38);
		pnlVerPerfil.add(lblVerPerfil);
		
		JPanel pnlCompletarCita = new JPanel();
		pnlCompletarCita.setBackground(CLR_SECUNDARIO);
		pnlCompletarCita.setBounds(193, 65, 135, 38);
		getContentPane().add(pnlCompletarCita);
		pnlCompletarCita.setLayout(null);
		
		JLabel lblImagenCompletada = new JLabel();
		lblImagenCompletada.setBounds(15, 8, 20, 20);
		
		imgIcon = new ImageIcon("images/tick.png");
		imgEscalada = imgIcon.getImage().getScaledInstance(lblImagenCompletada.getWidth(),lblImagenCompletada.getHeight(), Image.SCALE_SMOOTH);
		iconoEscalado = new ImageIcon(imgEscalada);
		lblImagenCompletada.setIcon(iconoEscalado);
		
		pnlCompletarCita.add(lblImagenCompletada);
		
		JLabel lblCompletarCita = new JLabel("Completar");
		lblCompletarCita.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblCompletarCita.setBounds(55, 0, 80, 38);
		pnlCompletarCita.add(lblCompletarCita);
		
		JPanel pnlEliminar = new JPanel();
		pnlEliminar.setBackground(CLR_SECUNDARIO);
		pnlEliminar.setBounds(364, 65, 135, 38);
		getContentPane().add(pnlEliminar);
		pnlEliminar.setLayout(null);
		
		JLabel lblImagenEliminar = new JLabel();
		lblImagenEliminar.setBounds(15, 11, 17, 17);
		
		imgIcon = new ImageIcon("images/cross.png");
		imgEscalada = imgIcon.getImage().getScaledInstance(lblImagenEliminar.getWidth(),lblImagenEliminar.getHeight(), Image.SCALE_SMOOTH);
		iconoEscalado = new ImageIcon(imgEscalada);
		lblImagenEliminar.setIcon(iconoEscalado);
		
		pnlEliminar.add(lblImagenEliminar);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblEliminar.setBounds(55, 0, 80, 38);
		pnlEliminar.add(lblEliminar);
		
		// Eventos
		
		pnlVerPerfil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				controllers.ClickCitaController.verPerfil();
				dispose();
				
			}
		});
		
		pnlCompletarCita.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				controllers.ClickCitaController.completarCita();
				dispose();
				
			}
		});
		
		pnlEliminar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				controllers.ClickCitaController.eliminar();
				controllers.PnlInicioController.cargarTodo();
				dispose();
				
			}
		});

		setVisible(true);
	}
}
