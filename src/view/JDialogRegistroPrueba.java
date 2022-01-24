package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import ctrl.CtrlPrincipal;
import model.Medico;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogRegistroPrueba extends JFrame {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	public static Medico oMedico;

	private int x, y;
	
	public static Color principal = new Color(137, 207, 240);
	public static Color secundario = new Color(224, 147, 160);
	
	public JDialogRegistroPrueba() {

		setBounds(100, 100, 793, 518);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);

		setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

		GradientPanel circlePanel = new GradientPanel(Color.decode("#2BA7B6"), Color.decode("#89CFF0"));
		circlePanel.setBounds(0, 60, 400, 400);
		circlePanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getX() + e.getX() - x, frame.getY() + e.getY() - y);
			}
		});
		circlePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();

			}
		});
		getContentPane().setLayout(null);
		circlePanel.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		circlePanel.setArc(circlePanel.getWidth());
		circlePanel.setBorderColor(Color.white);
		circlePanel.setBorderWidth(2);

		circlePanel.setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\Clinica-dental\\src\\images\\dentista.png"));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(78, 71, 234, 160);
		circlePanel.add(lblLogo);

		JLabel lblNewLabel = new JLabel("Clinica Los Chavales");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		lblNewLabel.setBounds(78, 242, 234, 36);
		circlePanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00E9dico");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(78, 290, 234, 36);
		circlePanel.add(lblNewLabel_1);

		getContentPane().add(circlePanel);

		GradientPanel contentPanel = new GradientPanel(Color.decode("#e093a0"), Color.decode("#771d32"),
				GradientPanel.DIAGONAL_DOWN);
		contentPanel.setBounds(200, 0, 593, 518);
		contentPanel.setArc(10);
		contentPanel.setBorderColor(Color.white);
		contentPanel.setBorderWidth(2);

		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(229, 45, 250, 28);

		panel.setLayout(null);
		contentPanel.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(229, 109, 250, 28);
		contentPanel.add(panel_1);
		
				txtPassword = new JPasswordField();
				txtPassword.setBounds(0, 0, 250, 28);
				panel_1.add(txtPassword);
				txtPassword.setBorder(null);

		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblNewLabel_2.setBounds(229, 20, 250, 14);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(229, 84, 250, 14);
		contentPanel.add(lblNewLabel_2_1);

		JButton btnEntrar = new JButton("ACEPTAR");
		btnEntrar.setSelected(true);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PnlInicio();
			}
		});
		btnEntrar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnEntrar.setBackground(view.JDialogRegistroPrueba.principal);
		btnEntrar.setBorderPainted(false);
		btnEntrar.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnEntrar.setBounds(229, 479, 99, 28);
		contentPanel.add(btnEntrar);

		JLabel lblNewLabel_3 = new JLabel("REGISTRO");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(71, 13, 115, 25);
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("X");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "�Quieres cerrar la aplicaci�n?") == 0)
					System.exit(0);
			}
		});
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(562, 11, 21, 28);
		contentPanel.add(lblNewLabel_3_1);
		getContentPane().add(contentPanel);
		
		JButton btnRegistrarse = new JButton("CANCELAR");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmRegistro();
				dispose();
			}
		});
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CtrlPrincipal.getPaciente(txtUsername.getText(), txtPassword.getText());
					
					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Usuario no encontrado");
				}
			}
		});
		btnRegistrarse.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		btnRegistrarse.setBounds(380, 479, 99, 28);
		btnRegistrarse.setBorderPainted(false);
		btnRegistrarse.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 51, 0)));
		btnRegistrarse.setBackground(view.JDialogRegistroPrueba.secundario);
		contentPanel.add(btnRegistrarse);
				
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setLayout(null);
				panel_1_1.setBackground(Color.WHITE);
				panel_1_1.setBounds(229, 168, 250, 28);
				contentPanel.add(panel_1_1);
				
				JPanel panel_1_2 = new JPanel();
				panel_1_2.setLayout(null);
				panel_1_2.setBackground(Color.WHITE);
				panel_1_2.setBounds(229, 230, 250, 28);
				contentPanel.add(panel_1_2);
				
				JPanel panel_1_3 = new JPanel();
				panel_1_3.setLayout(null);
				panel_1_3.setBackground(Color.WHITE);
				panel_1_3.setBounds(229, 294, 250, 28);
				contentPanel.add(panel_1_3);
				
				JPanel panel_1_4 = new JPanel();
				panel_1_4.setLayout(null);
				panel_1_4.setBackground(Color.WHITE);
				panel_1_4.setBounds(229, 358, 250, 28);
				contentPanel.add(panel_1_4);
				
						txtUsername = new JTextField();
						txtUsername.setBounds(229, 45, 250, 28);
						contentPanel.add(txtUsername);
						txtUsername.setBackground(Color.WHITE);
						
								txtUsername.setColumns(10);
								txtUsername.setBorder(null);
								
								JPanel panel_1_5 = new JPanel();
								panel_1_5.setLayout(null);
								panel_1_5.setBackground(Color.WHITE);
								panel_1_5.setBounds(229, 417, 250, 28);
								contentPanel.add(panel_1_5);
								
								JLabel lblNewLabel_2_1_1 = new JLabel("Contrase\u00F1a");
								lblNewLabel_2_1_1.setForeground(Color.WHITE);
								lblNewLabel_2_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
								lblNewLabel_2_1_1.setBounds(229, 143, 250, 14);
								contentPanel.add(lblNewLabel_2_1_1);
								
								JLabel lblNewLabel_2_1_2 = new JLabel("Contrase\u00F1a");
								lblNewLabel_2_1_2.setForeground(Color.WHITE);
								lblNewLabel_2_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
								lblNewLabel_2_1_2.setBounds(229, 205, 250, 14);
								contentPanel.add(lblNewLabel_2_1_2);
								
								JLabel lblNewLabel_2_1_3 = new JLabel("Contrase\u00F1a");
								lblNewLabel_2_1_3.setForeground(Color.WHITE);
								lblNewLabel_2_1_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
								lblNewLabel_2_1_3.setBounds(229, 269, 250, 14);
								contentPanel.add(lblNewLabel_2_1_3);
								
								JLabel lblNewLabel_2_1_4 = new JLabel("Contrase\u00F1a");
								lblNewLabel_2_1_4.setForeground(Color.WHITE);
								lblNewLabel_2_1_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
								lblNewLabel_2_1_4.setBounds(229, 333, 250, 14);
								contentPanel.add(lblNewLabel_2_1_4);
								
								JLabel lblNewLabel_2_1_5 = new JLabel("Contrase\u00F1a");
								lblNewLabel_2_1_5.setForeground(Color.WHITE);
								lblNewLabel_2_1_5.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
								lblNewLabel_2_1_5.setBounds(229, 392, 250, 14);
								contentPanel.add(lblNewLabel_2_1_5);
		
		setVisible(true);
	}
}