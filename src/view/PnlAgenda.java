package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;

public class PnlAgenda extends JPanel {
	
	private JCalendar calendar;

	public PnlAgenda() {
		setLayout(new BorderLayout(0, 0));
		//setUndecorated(true);
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panelCentral = new JPanel();
	

		scrollPane.setViewportView(panelCentral);
		
		calendar = new JCalendar();
		calendar.getYearChooser().getSpinner().setFont(new Font("Quicksand", Font.PLAIN, 11));
		
		//panelCentral.setPreferredSize(new Dimension(600, 400));
		panelCentral.setLayout(new BorderLayout(0, 0));
		
		List lista = new List();
		
		JPanel panelCalendario = new JPanel();
		panelCalendario.setLayout(new BorderLayout(0, 0));
		panelCalendario.add(calendar);
		panelCalendario.setBorder(new EmptyBorder(5,5,0,5));
		panelCentral.add(panelCalendario, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panelCalendario.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnAnadirCita = new JButton("A\u00F1adir cita");
		btnAnadirCita.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnAnadirCita.setBackground(view.JDialogLogin.principal);
		panel.add(btnAnadirCita);
		
		JPanel panelLista = new JPanel();
		panelLista.setLayout(new BorderLayout(0, 0));
		panelLista.add(lista);
		panelLista.setBorder(new EmptyBorder(5,5,30,5));
		panelCentral.add(panelLista, BorderLayout.WEST);
		
		

	}

}
