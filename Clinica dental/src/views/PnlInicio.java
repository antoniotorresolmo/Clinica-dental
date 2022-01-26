package views;

import javax.swing.*;
import javax.swing.border.*;

import controllers.CtrlCitas;
import controllers.CtrlPacientes;
import models.Cita;

import java.awt.*;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.awt.image.*;
import java.awt.geom.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlInicio extends JPanel {

	private static Font font;
	private static Color AZULITO = new Color(137, 207, 240);
	private static CtrlCitas ctrlCitas = new CtrlCitas();
	private static List<Cita> lstCitas = new ArrayList<>();
	private JButton btnCita10;
	private JButton btnCita11;
	private JButton btnCita12;
	private JButton btnCita13;
	private JButton btnCita14;
	private JButton btnCita15;
	private JButton btnCita16;
	private JButton btnCita17;	

	public PnlInicio() {
		
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		//JPanel pnlPrincipal = new JPanel();#023E73
		//GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#e093a0"), Color.decode("#771d32"),GradientPanel.DIAGONAL_DOWN);
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#AEDFF2"), Color.decode("#04C4D9"),GradientPanel.DIAGONAL_DOWN);
		pnlPrincipal.setBackground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(100, 100, 793, 518);
		scrollPane.setViewportView(pnlPrincipal);
		pnlPrincipal.setLayout(null);
		
		JPanel pnlAgenda = new JPanel();
		
		pnlAgenda.setBounds(46, 150, 718, 347);
		pnlPrincipal.add(pnlAgenda);
		pnlAgenda.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		//#D98E32
		//pnlAgenda.setBackground(Color.decode("#D98E32"));
		pnlAgenda.setLayout(new BorderLayout());
		
		JPanel pnlHoras = new JPanel();
		pnlAgenda.add(pnlHoras, BorderLayout.WEST);
		pnlHoras.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lbl10 = new JLabel("");
		lbl10.setOpaque(true);
		lbl10.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/diez.png")));
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl10);
		
		JLabel lbl11 = new JLabel("");
		lbl11.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/once.png")));
		lbl11.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setOpaque(true);
		pnlHoras.add(lbl11);
		
		JLabel lbl12 = new JLabel("");
		lbl12.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/doce.png")));
		lbl12.setOpaque(true);
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl12);
		
		JLabel lbl13 = new JLabel("");
		lbl13.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/una.png")));
		lbl13.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setOpaque(true);
		pnlHoras.add(lbl13);
		
		JLabel lbl14 = new JLabel("");
		lbl14.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/dos.png")));
		lbl14.setOpaque(true);
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl14);
		
		JLabel lbl15 = new JLabel("");
		lbl15.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/tres.png")));
		lbl15.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setOpaque(true);
		pnlHoras.add(lbl15);
		
		JLabel lbl16 = new JLabel("");
		lbl16.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/cuatro.png")));
		lbl16.setOpaque(true);
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl16);
		
		JLabel lbl17 = new JLabel("");
		lbl17.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/cinco.png")));
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl17.setOpaque(true);
		pnlHoras.add(lbl17);
		
		JPanel pnlCitas = new JPanel();
		//pnlCitas.setBackground(new Color(255, 255, 255));
		pnlCitas.setBackground(Color.WHITE);
		pnlCitas.setLayout(new GridLayout(8, 1, 0, 0));
		pnlAgenda.add(pnlCitas, BorderLayout.CENTER);
		
		LineBorder border = new LineBorder(Color.BLACK, 2, true); ///////////////////////////////
		Font font = new Font("Microsoft JhengHei UI", Font.BOLD, 15);
		btnCita10 = new JButton();
		btnCita10.setForeground(Color.BLACK);
		btnCita10.setContentAreaFilled(false);
		btnCita10.setOpaque(false);
		btnCita10.setBorder(border);
		btnCita10.setFont(font);
		btnCita10.setText("-");
		
		btnCita10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita10.setBackground(Color.YELLOW);
		pnlCitas.add(btnCita10);
		
		
		
		btnCita11 = new JButton();
		btnCita11.setForeground(Color.BLACK);
		btnCita11.setContentAreaFilled(false);
		btnCita11.setBorder(border);
		btnCita11.setFont(font);
		btnCita11.setText("-");
		
		btnCita11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita11.setBackground(Color.BLACK);
		pnlCitas.add(btnCita11);
		
		btnCita12 = new JButton();
		btnCita12.setForeground(Color.BLACK);
		btnCita12.setContentAreaFilled(false);
		btnCita12.setBorder(border);
		btnCita12.setFont(font);
		btnCita12.setText("-");
		
		btnCita12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita12.setBackground(Color.PINK);
		pnlCitas.add(btnCita12);
		
		btnCita13 = new JButton();
		btnCita13.setForeground(Color.BLACK);
		btnCita13.setContentAreaFilled(false);
		btnCita13.setBorder(border);
		btnCita13.setFont(font);
		btnCita13.setText("-");
		
		btnCita13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita13.setBackground(Color.PINK);
		pnlCitas.add(btnCita13);
		
		
		
		btnCita14 = new JButton();
		btnCita14.setForeground(Color.BLACK);

		btnCita14.setContentAreaFilled(false);
		btnCita14.setBorder(border);
		btnCita14.setFont(font);
		btnCita14.setText("-");
		
		btnCita14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita14.setBackground(Color.PINK);
		pnlCitas.add(btnCita14);
		
		
		btnCita15 = new JButton();
		btnCita15.setForeground(Color.BLACK);
		btnCita15.setContentAreaFilled(false);
		btnCita15.setBorder(border);
		btnCita15.setFont(font);
		btnCita15.setText("-");
		
		btnCita15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita15.setBackground(Color.PINK);
		pnlCitas.add(btnCita15);
		
		btnCita16 = new JButton();
		btnCita16.setForeground(Color.BLACK);
		btnCita16.setContentAreaFilled(false);
		btnCita16.setBorder(border);
		btnCita16.setFont(font);
		btnCita16.setText("-");
		
		btnCita16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita16.setBackground(Color.PINK);
		pnlCitas.add(btnCita16);
		
		btnCita17 = new JButton();
		btnCita17.setForeground(Color.BLACK);
		btnCita17.setContentAreaFilled(false);
		btnCita17.setBorder(border);
		btnCita17.setFont(font);
		btnCita17.setText("-");
		
		btnCita17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita17.setBackground(Color.PINK);
		pnlCitas.add(btnCita17);
		
	

		
		JButton btnDerecha = new JButton("");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDerecha.setContentAreaFilled(false);
		btnDerecha.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnDerecha.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/derecha2.png")));
		btnDerecha.setBounds(651, 79, 40, 42);
		btnDerecha.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(btnDerecha);
		
		JButton btnIzq = new JButton();
		btnIzq.setContentAreaFilled(false);
		btnIzq.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnIzq.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/izq2.png")));
		btnIzq.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		btnIzq.setBounds(127, 79, 40, 42);
		pnlPrincipal.add(btnIzq);
		
		JButton btnHome = new JButton();
		btnHome.setBorderPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnHome.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/hoy2.png")));
		btnHome.setBounds(386, 27,40,40);
		btnHome.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("1 ENERO 2022");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 79, 491, 42);
		pnlPrincipal.add(lblNewLabel);

		add(scrollPane);

		// Eventos

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					lstCitas=ctrlCitas.getCitas(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			
		});

		setVisible(true);

		try {
			lstCitas=ctrlCitas.getCitas(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
			rellenarBotones();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		

	}
	
	private void rellenarBotones() throws Exception {
		for (int i=0; i<lstCitas.size();i++) {
			
			switch (lstCitas.get(i).getHora()) {
			case "10:00":
			System.out.println("entra cabesa"); 
				btnCita10.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "11:00": 
				btnCita11.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "12:00": 
				btnCita12.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "13:00": 
				btnCita13.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "14:00": 
				btnCita14.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "15:00": 
				btnCita15.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "16:00": 
				btnCita16.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "17:00": 
				btnCita17.setText(CtrlPacientes.getNombrePaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			}
			
			
		}
		

	
}
}

