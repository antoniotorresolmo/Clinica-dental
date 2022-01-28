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
    PnlInicio pnlInicio = new PnlInicio();

	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
		//setBounds(100, 100, 691, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNorte = new JPanel();
		pnlNorte.setBackground(CLR_PRIMARIO);
		contentPane.add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel pnlOeste = new PnlSlidingMenu();
		contentPane.add(pnlOeste, BorderLayout.WEST);
		pnlOeste.setVisible(false);
		
		JLabel lblMenu = new JLabel("");
        lblMenu.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/menu.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		pnlNorte.add(lblMenu);
		
		pnlCentro = new JPanel();
        pnlCentro.setLayout(new BorderLayout());
		contentPane.add(pnlCentro, BorderLayout.CENTER);
        pnlCentro.add(pnlInicio, BorderLayout.CENTER);
		
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
