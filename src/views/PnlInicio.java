package views;

import javax.swing.*;
import javax.swing.border.*;

import controllers.CtrlCitas;
import controllers.CtrlPacientes;
import controllers.PnlInicioController;
import models.Cita;

import java.awt.*;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.awt.image.*;
import java.awt.geom.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlInicio extends JPanel {

	private static Font font;
	private static Color AZULITO = new Color(137, 207, 240);
	private static CtrlCitas ctrlCitas = new CtrlCitas();
	public static List<Cita> lstCitas = new ArrayList<>();
	public static JButton btnCita10;
	public static JButton btnCita11;
	public static JButton btnCita12;
	public static JButton btnCita13;
	public static JButton btnCita14;
	public static JButton btnCita15;
	public static JButton btnCita16;
	public static JButton btnCita17;	
	public static JLabel lblFecha;
	public static String sFecha=new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());;
	public PnlInicio() {
		
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		//GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#AEDFF2"), Color.decode("#04C4D9"),GradientPanel.DIAGONAL_DOWN);

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setOpaque(false);
		GradientPanel panel_1 = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));
		pnlPrincipal.setBackground(Color.WHITE);
		pnlPrincipal.setLayout(new BorderLayout(220, 50));
		
		JButton btnHome = new JButton();
		btnHome.setBorderPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnHome.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/hoy2.png")));
		btnHome.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(btnHome, BorderLayout.NORTH);
		
				// Eventos
		
				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
							sFecha = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
							lstCitas=ctrlCitas.getCitas(sFecha);
							lblFecha.setText("   "+new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime())+"   ");
							PnlInicioController.cargarTodo();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
		
					
				});
		
		JPanel pnlAgenda = new JPanel();
		pnlPrincipal.add(pnlAgenda);
		pnlAgenda.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		//#D98E32
		//pnlAgenda.setBackground(Color.decode("#D98E32"));
		BorderLayout bl_pnlAgenda = new BorderLayout();
		bl_pnlAgenda.setVgap(100);
		pnlAgenda.setLayout(bl_pnlAgenda);
		
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
		btnCita10.setText(" - ");
		
		
		btnCita10.setBackground(Color.YELLOW);
		pnlCitas.add(btnCita10);
		
		
		
		btnCita11 = new JButton();
		btnCita11.setForeground(Color.BLACK);
		btnCita11.setContentAreaFilled(false);
		btnCita11.setBorder(border);
		btnCita11.setFont(font);
		btnCita11.setText(" - ");
		
	
		btnCita11.setBackground(Color.BLACK);
		pnlCitas.add(btnCita11);
		
		btnCita12 = new JButton();
		btnCita12.setForeground(Color.BLACK);
		btnCita12.setContentAreaFilled(false);
		btnCita12.setBorder(border);
		btnCita12.setFont(font);
		btnCita12.setText(" - ");
		
	
		btnCita12.setBackground(Color.PINK);
		pnlCitas.add(btnCita12);
		
		btnCita13 = new JButton();
		btnCita13.setForeground(Color.BLACK);
		btnCita13.setContentAreaFilled(false);
		btnCita13.setBorder(border);
		btnCita13.setFont(font);
		btnCita13.setText(" - ");
		
	
		btnCita13.setBackground(Color.PINK);
		pnlCitas.add(btnCita13);
		
		
		
		btnCita14 = new JButton();
		btnCita14.setForeground(Color.BLACK);

		btnCita14.setContentAreaFilled(false);
		btnCita14.setBorder(border);
		btnCita14.setFont(font);
		btnCita14.setText(" - ");
		
	
		btnCita14.setBackground(Color.PINK);
		pnlCitas.add(btnCita14);
		
		
		btnCita15 = new JButton();
		btnCita15.setForeground(Color.BLACK);
		btnCita15.setContentAreaFilled(false);
		btnCita15.setBorder(border);
		btnCita15.setFont(font);
		btnCita15.setText(" - ");
		

		btnCita15.setBackground(Color.PINK);
		pnlCitas.add(btnCita15);
		
		btnCita16 = new JButton();
		btnCita16.setForeground(Color.BLACK);
		btnCita16.setContentAreaFilled(false);
		btnCita16.setBorder(border);
		btnCita16.setFont(font);
		btnCita16.setText(" - ");
		

		btnCita16.setBackground(Color.PINK);
		pnlCitas.add(btnCita16);
		
		btnCita17 = new JButton();
		btnCita17.setForeground(Color.BLACK);
		btnCita17.setContentAreaFilled(false);
		btnCita17.setBorder(border);
		btnCita17.setFont(font);
		btnCita17.setText(" - ");
		

		btnCita17.setBackground(Color.PINK);
		pnlCitas.add(btnCita17);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		pnlAgenda.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(470, 96, 400, 50);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton btnIzq = new JButton();
		panel.add(btnIzq);
		btnIzq.setContentAreaFilled(false);
		btnIzq.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnIzq.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/izq2.png")));
		btnIzq.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		
		lblFecha = new JLabel("   "+sFecha+"   ");
		panel.add(lblFecha);
		lblFecha.setOpaque(true);
		lblFecha.setBackground(new Color(255, 255, 255));
		lblFecha.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblFecha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnDerecha = new JButton("");
		
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sFecha=changeDay(sFecha, 1);
					System.out.println(sFecha);
					PnlInicioController.cargarTodo();
				
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		btnIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sFecha=changeDay(sFecha, -1);
					System.out.println(sFecha);
				
					PnlInicioController.cargarTodo();
				
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		// Eventos

				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						try {
							sFecha = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
							lstCitas = ctrlCitas.getCitas(sFecha);
							lblFecha.setText("   " + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime())
									+ "   ");
							controllers.PnlInicioController.cargarTodo();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}

				});

				btnCita10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita10.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("10:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
								
							}					
						}

					}
				});

				btnCita11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita11.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("11:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});

				btnCita12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita12.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("12:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});

				btnCita13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita13.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("13:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});

				btnCita14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita14.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("14:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});

				btnCita15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita15.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("15:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});

				btnCita16.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita16.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("16:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});

				btnCita17.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (!btnCita17.getText().equals(" - ")) {
							JDialogClickCita.oCita = controllers.PnlInicioController.obtenerCitaPorHora("17:00");
							if(JDialogClickCita.oCita.getTerminada() == 0) {
								new JDialogClickCita();
							}
						}

					}
				});
		
		
		
		btnDerecha.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/derecha2.png")));
		btnDerecha.setContentAreaFilled(false);
		btnDerecha.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnDerecha.setBackground(new Color(255, 255, 255, 0));
		panel.add(btnDerecha);

		
		
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(pnlPrincipal, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		pnlPrincipal.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("");
		pnlPrincipal.add(lblNewLabel_1, BorderLayout.EAST);
		panel_1.add(panel, BorderLayout.NORTH);
		PnlInicioController.cargarTodo();
		setVisible(true);
		
		

	}
	private void cargarTodo() {
	try {
		vaciarBotones();
			lstCitas=ctrlCitas.getCitas(sFecha);
			rellenarBotones();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}			
	}
	
	private void rellenarBotones() throws Exception {
		lblFecha.setText(sFecha);
		for (int i=0; i<lstCitas.size();i++) {
			
			switch (lstCitas.get(i).getHora()) {
			case "10:00":
			
				btnCita10.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "11:00": 
				btnCita11.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "12:00": 
				btnCita12.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "13:00": 
				btnCita13.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "14:00": 
				btnCita14.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "15:00": 
				btnCita15.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "16:00": 
				btnCita16.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			case "17:00": 
				btnCita17.setText(CtrlPacientes.getNombreApellidosPaciente(lstCitas.get(i).getID_Paciente()) + " - " + lstCitas.get(i).getOperacion());
				break;
			}
			
			
		}
		

	
}
	
	private void vaciarBotones() {
		btnCita10.setText(" - ");
		btnCita11.setText(" - ");
		btnCita12.setText(" - ");
		btnCita13.setText(" - ");
		btnCita14.setText(" - ");
		btnCita15.setText(" - ");
		btnCita16.setText(" - ");
		btnCita17.setText(" - ");
	}
	
	  private static String changeDay(String day, int param) throws ParseException {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date dt = sdf.parse(day);
	        Calendar rightNow = Calendar.getInstance();
	        rightNow.setTime(dt);
	        rightNow.add(Calendar.DAY_OF_MONTH, param);
	        Date dt1 = rightNow.getTime();
	   
	        return sdf.format(dt1);
	    }
	
}

