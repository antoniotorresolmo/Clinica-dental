package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PnlSlidingMenu extends JPanel implements IColores {

	PnlInicio pnlInicio1 = new PnlInicio();
	PnlAgenda pnlAgenda1 = new PnlAgenda();
	PnlPacientes pnlPacientes1 = new PnlPacientes();
	PnlAnalisis pnlAnalisis1 = new PnlAnalisis();

	public PnlSlidingMenu() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(CLR_PRIMARIO);

		setPreferredSize(new Dimension(164, 1061));

		scrollPane.setViewportView(pnlPrincipal);
		pnlPrincipal.setLayout(new GridLayout(6, 1, 10, 10));

		JPanel pnlInicio = new JPanel();
		pnlInicio.setBackground(CLR_PRIMARIO);
		pnlPrincipal.add(pnlInicio);
		pnlInicio.setLayout(new BorderLayout(0, 0));

		JLabel lblInicio = new JLabel("");
		lblInicio.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/homedos.png")));
		lblInicio.setBackground(CLR_PRIMARIO);
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlInicio.add(lblInicio, BorderLayout.CENTER);

		JPanel pnlAgenda = new JPanel();
		pnlAgenda.setBackground(CLR_PRIMARIO);
		pnlPrincipal.add(pnlAgenda);
		pnlAgenda.setLayout(new BorderLayout(0, 0));

		JLabel lblAgenda = new JLabel("");
		lblAgenda.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/agenda.png")));
		lblAgenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgenda.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlAgenda.add(lblAgenda, BorderLayout.CENTER);

		JPanel pnlPaciente = new JPanel();
		pnlPaciente.setBackground(CLR_PRIMARIO);
		pnlPrincipal.add(pnlPaciente);
		pnlPaciente.setLayout(new BorderLayout(0, 0));

		JLabel lblPaciente = new JLabel("");
		lblPaciente.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/pacientes.png")));
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlPaciente.add(lblPaciente, BorderLayout.CENTER);

		JPanel pnlPaciente_1 = new JPanel();
		pnlPaciente_1.setBackground(CLR_PRIMARIO);
		pnlPrincipal.add(pnlPaciente_1);
		pnlPaciente_1.setLayout(new BorderLayout(0, 0));

		JLabel lblAnalisis = new JLabel("");
		lblAnalisis.setIcon(new ImageIcon(PnlSlidingMenu.class.getResource("/images/estadistica.png")));
		lblAnalisis.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnalisis.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		pnlPaciente_1.add(lblAnalisis, BorderLayout.CENTER);

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

		lblAnalisis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ocultarPaneles();
				pnlAnalisis1.setVisible(true);
				FrmPrincipal.pnlCentro.add(pnlAnalisis1, BorderLayout.CENTER);

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
