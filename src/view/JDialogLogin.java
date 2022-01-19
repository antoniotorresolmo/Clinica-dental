package view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogLogin extends JDialog {

	public static Color principal = new Color(137, 207, 240);
	public static Color secundario = new Color(224, 147, 160);
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private JTextField txtPassword;

	public JDialogLogin() {
		setFont(new Font("Quicksand", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JuanLoreLeo\\Desktop\\DAM\\2\u00BA DAM\\GitHub\\Segundo-DAM\\Desarrollo de interfaces\\Clinica Dental Escritorio\\images\\logo.png"));
		setTitle("Clinica Dental Los Chavales");
		setBounds(100, 100, 490, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(principal);
		panel.setBounds(0, 0, 183, 261);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\JuanLoreLeo\\Desktop\\DAM\\2\u00BA DAM\\GitHub\\Segundo-DAM\\Desarrollo de interfaces\\Clinica Dental Escritorio\\images\\logo.png"));
		lblLogo.setBounds(42, 80, 100, 100);
		panel.add(lblLogo);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Quicksand", Font.PLAIN, 11));
		lblUsuario.setBounds(210, 72, 59, 14);
		contentPanel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtUsuario.setBounds(287, 69, 157, 20);
		contentPanel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Quicksand", Font.PLAIN, 11));
		lblPassword.setBounds(210, 117, 78, 14);
		contentPanel.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Quicksand", Font.PLAIN, 11));
		txtPassword.setBounds(287, 114, 157, 20);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JCheckBox rdbtnRecordar = new JCheckBox("Recordad");
		rdbtnRecordar.setFont(new Font("Quicksand", Font.PLAIN, 11));
		rdbtnRecordar.setBounds(267, 141, 109, 23);
		contentPanel.add(rdbtnRecordar);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setFont(new Font("Quicksand", Font.BOLD, 11));
		btnEntrar.setSelected(true);
		btnEntrar.setBackground(principal);
		btnEntrar.setBounds(210, 200, 89, 23);
		contentPanel.add(btnEntrar);
		
		JButton btnRegistrar = new JButton("REGISTRARSE");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegistrar.setFont(new Font("Quicksand", Font.BOLD, 11));
		btnRegistrar.setBackground(secundario);
		btnRegistrar.setBounds(309, 200, 115, 23);
		contentPanel.add(btnRegistrar);
		
		setVisible(true);
	}
}
