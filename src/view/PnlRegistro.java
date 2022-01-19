package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class PnlRegistro extends JPanel {
	private JTextField txtNombreRegistro;
	private JTextField txtApellidosRegistro;

	public PnlRegistro() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 130, 300);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblIconoRegistro = new JLabel("");
		lblIconoRegistro.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\Clinica-dental\\images\\perfil.png"));
		lblIconoRegistro.setBounds(20, 100, 100, 100);
		panel.add(lblIconoRegistro);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(129, 0, 321, 300);
		panel_1.setBackground(view.JDialogLogin.principal);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombreRegistro = new JLabel("Nombre:");
		lblNombreRegistro.setBounds(10, 32, 46, 14);
		panel_1.add(lblNombreRegistro);
		
		txtNombreRegistro = new JTextField();
		txtNombreRegistro.setBounds(60, 29, 251, 20);
		panel_1.add(txtNombreRegistro);
		txtNombreRegistro.setColumns(10);
		
		JLabel lblApellidosRegistro = new JLabel("Apellidos:");
		lblApellidosRegistro.setBounds(10, 72, 46, 14);
		panel_1.add(lblApellidosRegistro);
		
		txtApellidosRegistro = new JTextField();
		txtApellidosRegistro.setBounds(60, 69, 251, 20);
		panel_1.add(txtApellidosRegistro);
		txtApellidosRegistro.setColumns(10);

	}
}
