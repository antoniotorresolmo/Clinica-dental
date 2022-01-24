package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;

public class JDialogDatosCita extends JDialog {

	GradientPanel contentPanel = new GradientPanel(Color.decode("#e093a0"), Color.decode("#771d32"),
			GradientPanel.DIAGONAL_DOWN);

	public JDialogDatosCita() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JuanLoreLeo\\Desktop\\Proyecto 2\u00BA Trimestre\\Clinica Dental Escritorio\\images\\logotipoEditorDeTexto.png"));
		setTitle("Datos cita");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JComboBox cbNombre = new JComboBox();
		cbNombre.setBounds(30, 67, 390, 22);
		contentPanel.add(cbNombre);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(30, 130, 390, 22);
		contentPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(30, 191, 390, 22);
		contentPanel.add(comboBox_2);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setSelected(true);
		btnModificar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnModificar.setBorderPainted(false);
		btnModificar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnModificar.setBackground(new Color(137, 207, 240));
		btnModificar.setBounds(233, 266, 89, 23);
		contentPanel.add(btnModificar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setSelected(true);
		btnCancelar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnCancelar.setBackground(new Color(137, 207, 240));
		btnCancelar.setBounds(351, 266, 89, 23);
		contentPanel.add(btnCancelar);
		setVisible(true);
	}
}
