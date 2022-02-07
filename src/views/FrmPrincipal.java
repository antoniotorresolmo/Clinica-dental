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
		pnlNorte.setBackground(azu);
		contentPane.add(pnlNorte, BorderLayout.NORTH);
		
		JPanel pnlOeste = new PnlSlidingMenu();
		contentPane.add(pnlOeste, BorderLayout.WEST);
		pnlOeste.setVisible(false);
		pnlNorte.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMenu = new JLabel("");
		lblMenu.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/menutres.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		pnlNorte.add(lblMenu, BorderLayout.WEST);
		
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
		
		JLabel lblExit = new JLabel("");
		lblExit.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "¿Quieres cerrar la aplicacion?") == 0)
					System.exit(0);
			}
		});
		lblExit.setHorizontalAlignment(SwingConstants.TRAILING);
		lblExit.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/crossdos.png")));
		pnlNorte.add(lblExit, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("");
		pnlNorte.add(lblNewLabel, BorderLayout.CENTER);
		
		pnlCentro = new JPanel();
        pnlCentro.setLayout(new BorderLayout());
		contentPane.add(pnlCentro, BorderLayout.CENTER);

		
		
        controllers.PnlInicioController.cargarTodo();
        //pnlCentro.add(pnlInicio, BorderLayout.CENTER);
		setVisible(true);
    }
}
