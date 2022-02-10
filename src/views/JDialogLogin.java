package views;

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
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import controllers.CtrlPrincipal;
import models.Medico;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class JDialogLogin extends JFrame {

	private JFrame frame;
	public static JTextField txtUsername;
	public static JPasswordField txtPassword;
	private int x, y;
	public static Color principal = new Color(137, 207, 240);
	public static Color secundario = new Color(224, 147, 160);
	public static JCheckBox cbRecordar;
	
	public JDialogLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JDialogLogin.class.getResource("/images/dentista.png")));

		setBounds(100, 100, 700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);

		setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

		GradientPanel circlePanel = new GradientPanel(Color.decode("#2BA7B6"), Color.decode("#89CFF0"));
		circlePanel.setBounds(0, 0, 400, 400);
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
		lblLogo.setIcon(new ImageIcon(JDialogLogin.class.getResource("/images/dentista.png")));
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
		contentPanel.setBounds(200, 50, 500, 331);
		contentPanel.setArc(10);
		contentPanel.setBorderColor(Color.white);
		contentPanel.setBorderWidth(2);

		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2, true), "USUARIO", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(255, 255, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(229, 89, 250, 50);
		panel.setLayout(new BorderLayout(0, 0));

		txtUsername = new JTextField();
		txtUsername.setBackground(Color.WHITE);

		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		panel.add(txtUsername);
		contentPanel.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2, true), "CONTRASE\u00D1A", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(255, 255, 255)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(229, 161, 250, 50);
		contentPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		txtPassword = new JPasswordField();
		panel_1.add(txtPassword);
		txtPassword.setBorder(null);

		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setSelected(true);
		btnEntrar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 13));
		btnEntrar.setBackground(views.JDialogLogin.principal);
		btnEntrar.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnEntrar.setBounds(229, 279, 99, 28);
		contentPanel.add(btnEntrar);

		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		lblNewLabel_3.setBorder(new LineBorder(Color.WHITE, 2, true));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(229, 24, 115, 25);
		contentPanel.add(lblNewLabel_3);

		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(JDialogLogin.class.getResource("/images/crossdos.png")));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblX.setBounds(469, 11, 21, 28);
		contentPanel.add(lblX);
		getContentPane().add(contentPanel);
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setForeground(Color.BLACK);
		btnRegistrarse.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnRegistrarse.setBounds(380, 279, 99, 28);
		btnRegistrarse.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnRegistrarse.setBackground(views.JDialogLogin.secundario);
		contentPanel.add(btnRegistrarse);

		cbRecordar = new JCheckBox("Recordar");
		cbRecordar.setForeground(Color.WHITE);
		cbRecordar.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 11));
		cbRecordar.setBounds(229, 218, 97, 23);
		cbRecordar.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		contentPanel.add(cbRecordar);

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sUsuario = txtUsername.getText();
					String sPassword = txtPassword.getText();

					if(!sPassword.isEmpty() && !sUsuario.isEmpty()){
						controllers.LoginController.getPaciente(sUsuario, sPassword);
						//System.out.println("E");
						new FrmPrincipal();
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "Por favor, introduce los datos", "Error", JOptionPane.ERROR_MESSAGE);
					}					
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JDialogRegistro();
				dispose();
			}
		});

		lblX.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "¿Quieres cerrar la aplicacion?") == 0)
					System.exit(0);
			}
		});

		controllers.LoginController.cargarDatos();
		
		setVisible(true);
	}
}