package views;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import models.Medico;

import java.awt.event.*;
public class FrmPrincipal extends JFrame implements IColores{

    private JPanel contentPane;
	private boolean isVisible = false;
    public static Medico oMedico;
    public static JPanel pnlCentro;
    Color azu = new Color(40,153,192);
    PnlInicio pnlInicio = new PnlInicio();

	public FrmPrincipal() {

		 
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
		
		contentPane = new JPanel();
		contentPane.setBounds(100, 100, 691, 395);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNorte = new JPanel();
		
		
		pnlCentro = new JPanel();
		pnlCentro.setLayout(new BorderLayout());
        controllers.PnlInicioController.cargarTodo();
        contentPane.add(pnlCentro, BorderLayout.CENTER);
        pnlCentro.add(pnlInicio, BorderLayout.CENTER);
		
		
		
		
		
		
		pnlNorte.setLayout(new BorderLayout(0, 0));
		pnlNorte.setBackground(azu);
		contentPane.add(pnlNorte, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel.setOpaque(false);
		pnlNorte.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMenu = new JLabel("");
		
		lblMenu.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/menutres.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblMenu, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JLabel lblMinimizar = new JLabel("");
		lblMinimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		
	
		lblMinimizar.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/min.png")));
		lblMinimizar.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1.add(lblMinimizar);
		
		JLabel lblExit = new JLabel("");

		lblExit.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/crossdos.png")));
		lblExit.setHorizontalAlignment(SwingConstants.TRAILING);
		
		lblExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "¿Quieres cerrar la aplicacion?") == 0)
					System.exit(0);
			}
		});
		
		panel_1.add(lblExit);
		
		JPanel pnlOeste = new PnlSlidingMenu();
		contentPane.add(pnlOeste, BorderLayout.WEST);
		pnlOeste.setVisible(false);
		
		lblMenu.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(isVisible) {
					pnlOeste.setVisible(false);
					isVisible = false;
				}else {
					pnlOeste.setVisible(true);
					isVisible = true;
				}
				
			}
		});
	
		setVisible(true);
    }
}
