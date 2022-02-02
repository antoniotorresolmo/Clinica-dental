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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.*;

import java.awt.event.*;


public class PnlAgenda extends JPanel {
	Color transparente = new Color(1.0f, 1.0f, 1.0f, 0.0f);
	  DefaultTableModel model;
	  Calendar cal = new GregorianCalendar();
	  JLabel label;
	  
	public PnlAgenda() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		//setUndecorated(true);
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panelCentral = new JPanel();
	

		scrollPane.setViewportView(panelCentral);

		panelCentral.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLista = new JPanel();
		panelLista.setBackground(transparente);
		panel_1.add(panelLista, BorderLayout.WEST);
		panelLista.setBorder(new EmptyBorder(5,5,30,5));
		panelLista.setLayout(new BorderLayout(0, 0));
		
		List lista = new List();
		panelLista.add(lista);
		

	    label = new JLabel();
	    label.setHorizontalAlignment(SwingConstants.CENTER);
	 
	    JButton b1 = new JButton("<-");
	    b1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
	        cal.add(Calendar.MONTH, -1);
	        updateMonth();
	      }
	    });
	 
	    JButton b2 = new JButton("->");
	    b2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
	        cal.add(Calendar.MONTH, +1);
	        updateMonth();
	      }
	    });
	 
	    JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    panel.add(b1,BorderLayout.WEST);
	    panel.add(label,BorderLayout.CENTER);
	    panel.add(b2,BorderLayout.EAST);
	 
	 
	    String [] columns = {"Do","Lun","Ma","Mi","Ju","Vi","Sa"};
	    model = new DefaultTableModel(null,columns);
	   
	    JTable table = new JTable(model);
	    table.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    table.setRowHeight(100);
	    
	    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	    centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
	   // table.setDefaultRenderer(String.class, centerRenderer);
	    
	    
	    
	    for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++)
        {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
        }
	    
	    
	    table.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
	    		System.out.println(cal.get(Calendar.MONTH)+1 +" "+cal.getWeekYear());
	    	}
	    });
	    JScrollPane pane = new JScrollPane(table);
	 
	    panelCentral.add(panel,BorderLayout.NORTH);
	    panelCentral.add(pane,BorderLayout.CENTER);
	 
	    this.updateMonth();
	 
	  }
	 
	  void updateMonth() {
	    cal.set(Calendar.DAY_OF_MONTH, 1);
	 
	    String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
	    int year = cal.get(Calendar.YEAR);
	    label.setText(month + " " + year);
	 
	    int startDay = cal.get(Calendar.DAY_OF_WEEK);
	    int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
	 
	    model.setRowCount(0);
	    model.setRowCount(weeks);
	 
	    int i = startDay-1;
	    for(int day=1;day<=numberOfDays;day++){
	      model.setValueAt(day, i/7 , i%7 );    
	      i = i + 1;
	    }
	 
	  }

	}


