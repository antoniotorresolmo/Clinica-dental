package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class PnlSlidingMenu extends JPanel implements IColores {

	PnlInicio pnlInicio1 = new PnlInicio();
	PnlAgenda pnlAgenda1 = new PnlAgenda();
	PnlPacientes pnlPacientes1 = new PnlPacientes();
	PnlPerfil pnlPerfil1 = new PnlPerfil();
	Color azu = new Color(40,153,192);
	Color transparente = new Color(1.0f, 1.0f, 1.0f, 0.0f);

	public PnlSlidingMenu() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		//JPanel pnlPrincipal = new JPanel();
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#4BE392"), Color.decode("#AFFF4E"));
	
		//pnlPrincipal.setBackground(azu);

		setPreferredSize(new Dimension(164, 1061));

		scrollPane.setViewportView(pnlPrincipal);
		pnlPrincipal.setLayout(new GridLayout(4, 1, 10, 60));

		JPanel pnlInicio = new JPanel();
		pnlInicio.setBackground(transparente);
		pnlPrincipal.add(pnlInicio);
		pnlInicio.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInicio = new JLabel("");
	
		lblInicio.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/homedos.png")));
		lblInicio.setBackground(transparente);
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlInicio.add(lblInicio, BorderLayout.CENTER);

		JPanel pnlAgenda = new JPanel();
		pnlAgenda.setBackground(transparente);
		pnlPrincipal.add(pnlAgenda);
		pnlAgenda.setLayout(new BorderLayout(0, 0));

		JLabel lblAgenda = new JLabel("");
		lblAgenda.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/agenda.png")));
		lblAgenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgenda.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlAgenda.add(lblAgenda, BorderLayout.CENTER);

		JPanel pnlPaciente = new JPanel();
		pnlPaciente.setBackground(transparente);
		pnlPrincipal.add(pnlPaciente);
		pnlPaciente.setLayout(new BorderLayout(0, 0));

		JLabel lblPaciente = new JLabel("");
		lblPaciente.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/pacientes.png")));
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlPaciente.add(lblPaciente, BorderLayout.CENTER);

		JPanel pnlPerfil = new JPanel();
		pnlPerfil.setBackground(transparente);
		pnlPrincipal.add(pnlPerfil);
		pnlPerfil.setLayout(new BorderLayout(0, 0));

		JLabel lblPerfil = new JLabel("");
		lblPerfil.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/profile.png")));
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfil.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlPerfil.add(lblPerfil, BorderLayout.CENTER);

		pnlInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ocultarPaneles();
				pnlInicio1.setVisible(true);
				FrmPrincipal.pnlCentro.add(pnlInicio1, BorderLayout.CENTER);

			}
		});

		lblAgenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ocultarPaneles();
				pnlAgenda1.setVisible(true);
				FrmPrincipal.pnlCentro.add(pnlAgenda1, BorderLayout.CENTER);

			}
		});

		lblPaciente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ocultarPaneles();
				pnlPacientes1.setVisible(true);
				FrmPrincipal.pnlCentro.add(pnlPacientes1, BorderLayout.CENTER);

			}
		});

		lblPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ocultarPaneles();
				pnlPerfil1.setVisible(true);
				FrmPrincipal.pnlCentro.add(pnlPerfil1, BorderLayout.CENTER);

			}
		});

	}

	private void ocultarPaneles() {
		Component[] c = FrmPrincipal.pnlCentro.getComponents();
		for (Component o : c) {
			o.setVisible(false);
		}
	}

}
