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
		
		JSpinner spinnerNombre = new JSpinner();
		spinnerNombre.setFont(new Font("Quicksand", Font.PLAIN, 11));
		spinnerNombre.setBounds(40, 30, 354, 20);
		contentPanel.add(spinnerNombre);
		
		JSpinner spinnerNombre_1 = new JSpinner();
		spinnerNombre_1.setFont(new Font("Quicksand", Font.PLAIN, 11));
		spinnerNombre_1.setBounds(40, 100, 354, 20);
		contentPanel.add(spinnerNombre_1);
		
		JSpinner spinnerNombre_2 = new JSpinner();
		spinnerNombre_2.setFont(new Font("Quicksand", Font.PLAIN, 11));
		spinnerNombre_2.setBounds(40, 170, 354, 20);
		contentPanel.add(spinnerNombre_2);
		
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
		setVisible(true);
	}
}
