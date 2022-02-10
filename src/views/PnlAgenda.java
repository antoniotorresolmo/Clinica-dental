package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;

import models.Cita;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.*;

import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.TitledBorder;

public class PnlAgenda extends JPanel {
	
	Color transparente = new Color(1.0f, 1.0f, 1.0f, 0.0f);
	DefaultTableModel model;
	Calendar cal = new GregorianCalendar();
	JLabel lblFecha;
	public static String sFechaCogida;
	public static java.util.List<Cita> lCitas = new ArrayList<Cita>();
	public static List lista;
	public static JTable table;

	public PnlAgenda() {
		setLayout(new BorderLayout(0, 0));

		// JPanel panel_1 = new JPanel();

		GradientPanel panel_1 = new GradientPanel(Color.decode("#3CE6DB"), Color.decode("#4FFFA5"));

		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		// setUndecorated(true);
		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setOpaque(false);
		scrollPane.setBackground(transparente);
		panel_1.add(scrollPane, BorderLayout.CENTER);

		JPanel panelCentral = new JPanel();
		panelCentral.setOpaque(false);
		panelCentral.setBackground(transparente);

		scrollPane.setViewportView(panelCentral);
		scrollPane.getViewport().setOpaque(false);
		panelCentral.setLayout(new BorderLayout(0, 0));

		JPanel panelLista = new JPanel();
		panelLista.setOpaque(false);
		panelLista.setBackground(transparente);
		panel_1.add(panelLista, BorderLayout.WEST);
		panelLista.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "CITAS", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelLista.setLayout(new BorderLayout(0, 0));

		lista = new List();
		panelLista.add(lista);
		
		
		lblFecha = new JLabel();
		lblFecha.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFecha.setBackground(Color.RED);
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);

		JButton b1 = new JButton("");
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b1.setContentAreaFilled(false);
		b1.setBackground(transparente);
		b1.setIcon(new ImageIcon(PnlAgenda.class.getResource("/images/izq2.png")));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cal.add(Calendar.MONTH, -1);
				updateMonth();
			}
		});

		JButton b2 = new JButton("");
		b2.setContentAreaFilled(false);
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b2.setBackground(transparente);
		b2.setIcon(new ImageIcon(PnlAgenda.class.getResource("/images/derecha2.png")));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cal.add(Calendar.MONTH, +1);
				updateMonth();
			}
		});

		JPanel panel = new JPanel();

		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout());
		panel.add(b1, BorderLayout.WEST);
		panel.add(lblFecha, BorderLayout.CENTER);
		panel.add(b2, BorderLayout.EAST);

		String[] columns = { "DO", "LUN", "MA", "MI", "JU", "VI", "SA" };
		model = new DefaultTableModel(null, columns) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table = new JTable(model);
		table.setCellSelectionEnabled(true);
		table.getTableHeader().setBackground(Color.WHITE);
		table.setSelectionBackground(Color.PINK);
		table.setGridColor(Color.BLACK);
		table.setBorder(null);
		table.setBackground(Color.WHITE);

		table.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		table.setRowHeight(100);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		// table.setDefaultRenderer(String.class, centerRenderer);

		for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
			table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
		}

		JButton btnAdd = new JButton("A\u00F1adir Cita");



		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				lista.removeAll();
				cogerFecha();
				controllers.AgendaController.listarPacientesCita();

			}
		});

		JScrollPane pane = new JScrollPane();
		pane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pane.setOpaque(false);

		pane.setBackground(transparente);

		pane.getViewport().setOpaque(false);
		pane.getViewport().setBorder(null);
		pane.setViewportView(table);
		panelCentral.add(panel, BorderLayout.NORTH);
		panelCentral.add(pane, BorderLayout.CENTER);

		JPanel panelIzq = new JPanel();
		panelIzq.setBorder(null);
		panelIzq.setOpaque(false);
		panelIzq.setBackground(transparente);
		FlowLayout fl_panelIzq = (FlowLayout) panelIzq.getLayout();
		panelCentral.add(panelIzq, BorderLayout.WEST);

		JLabel lblIzq = new JLabel("                            ");
		lblIzq.setBackground(transparente);
		lblIzq.setForeground(transparente);
		panelIzq.add(lblIzq);

		JPanel panelDrch = new JPanel();
		panelDrch.setBorder(null);
		panelCentral.add(panelDrch, BorderLayout.EAST);
		panelDrch.setOpaque(false);
		panelDrch.setBackground(transparente);

		JLabel lblDrch = new JLabel("                            ");
		panelDrch.add(lblDrch);
		lblDrch.setBackground(transparente);
		lblDrch.setForeground(transparente);

		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(null);
		panelBotones.setOpaque(false);
		panelBotones.setBackground(transparente);

		panelCentral.add(panelBotones, BorderLayout.SOUTH);
		panelBotones.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setOpaque(false);
		panel_2.setBackground(transparente);
		panelBotones.add(panel_2, BorderLayout.EAST);

		JButton btnAceptar = new JButton("New button");
		panel_2.add(btnAceptar);

		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					cogerFecha();
					JDialogDatosCita.isEditing = false;
					new JDialogDatosCita();
					// String sNombre=(String) JDialogDatosCita.cbNombre.getSelectedItem();

					lista.removeAll();
					controllers.AgendaController.listarPacientesCita();

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Selecciona una fecha", "Error", JOptionPane.ERROR_MESSAGE);
					ex.printStackTrace();
				}

			}
		});

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(v -> {

			cogerFecha();
			controllers.AgendaController.prepararJDialogDatosCitaActualizar();
			new JDialogDatosCita();

		});
		panel_2.add(btnAdd);
		panel_2.add(btnModificar);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(v -> {

			controllers.AgendaController.borrarCita();
			lista.removeAll();
			controllers.AgendaController.listarPacientesCita();

		});
		panel_2.add(btnBorrar);

		this.updateMonth();

	}

	void updateMonth() {
		cal.set(Calendar.DAY_OF_MONTH, 1);

		String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
		int year = cal.get(Calendar.YEAR);
		lblFecha.setText(month + " " + year);

		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

		model.setRowCount(0);
		model.setRowCount(6);

		int i = startDay - 1;
		for (int day = 1; day <= numberOfDays; day++) {
			model.setValueAt(day, i / 7, i % 7);

			i = i + 1;

		}

	}

	private void cogerFecha() {

		System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
		int bNumero = (int) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
		String sNumero;
		int iMes = cal.get(Calendar.MONTH) + 1;
		String sMes;
		if (bNumero < 10) {
			sNumero = "0" + bNumero;
		} else {
			sNumero = bNumero + "";
		}

		if (iMes < 10) {
			sMes = "0" + iMes;
		} else {
			sMes = "" + iMes;
		}

		sFechaCogida = sNumero + "/" + sMes + "/" + cal.getWeekYear();

	}

}
