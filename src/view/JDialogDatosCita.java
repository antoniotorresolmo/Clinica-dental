package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JComboBox;

public class JDialogDatosCita extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public JDialogDatosCita() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JuanLoreLeo\\Desktop\\Proyecto 2\u00BA Trimestre\\Clinica Dental Escritorio\\images\\logotipoEditorDeTexto.png"));
		setTitle("Datos cita");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnCancelar.setBounds(305, 227, 89, 23);
		btnCancelar.setBackground(view.JDialogLogin.secundario);
		contentPanel.add(btnCancelar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Quicksand", Font.PLAIN, 11));
		btnModificar.setBounds(206, 227, 89, 23);
		btnModificar.setBackground(view.JDialogLogin.principal);
		contentPanel.add(btnModificar);
		
		JComboBox cbNombre = new JComboBox();
		cbNombre.setBounds(40, 25, 354, 22);
		contentPanel.add(cbNombre);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(40, 98, 354, 22);
		contentPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(40, 175, 354, 22);
		contentPanel.add(comboBox_2);
		setVisible(true);
	}
}
