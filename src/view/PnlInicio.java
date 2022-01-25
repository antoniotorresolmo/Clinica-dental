package view;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.io.InputStream;
import java.awt.image.*;
import java.awt.geom.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlInicio extends JPanel {

	private static Font font;
	private static Color AZULITO = new Color(137, 207, 240);

	public PnlInicio() {
		
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		//JPanel pnlPrincipal = new JPanel();
		GradientPanel pnlPrincipal = new GradientPanel(Color.decode("#e093a0"), Color.decode("#771d32"),GradientPanel.DIAGONAL_DOWN);
		pnlPrincipal.setBackground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(100, 100, 793, 518);
		scrollPane.setViewportView(pnlPrincipal);
		pnlPrincipal.setLayout(null);
		
		AbstractBorder bordeAgenda = new TextBubbleBorder(Color.BLACK,2,16,0, false);
		
		JPanel pnlAgenda = new JPanel();

		
		pnlAgenda.setBounds(46, 150, 718, 347);
		pnlPrincipal.add(pnlAgenda);
		pnlAgenda.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlAgenda.setLayout(new BorderLayout());
		
		JPanel pnlHoras = new JPanel();
		pnlAgenda.add(pnlHoras, BorderLayout.WEST);
		pnlHoras.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lbl10 = new JLabel("");
		lbl10.setOpaque(true);
		lbl10.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/diez.png")));
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl10);
		
		JLabel lbl11 = new JLabel("");
		lbl11.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/once.png")));
		lbl11.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setOpaque(true);
		pnlHoras.add(lbl11);
		
		JLabel lbl12 = new JLabel("");
		lbl12.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/doce.png")));
		lbl12.setOpaque(true);
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl12);
		
		JLabel lbl13 = new JLabel("");
		lbl13.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/una.png")));
		lbl13.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setOpaque(true);
		pnlHoras.add(lbl13);
		
		JLabel lbl14 = new JLabel("");
		lbl14.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/dos.png")));
		lbl14.setOpaque(true);
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl14);
		
		JLabel lbl15 = new JLabel("");
		lbl15.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/tres.png")));
		lbl15.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setOpaque(true);
		pnlHoras.add(lbl15);
		
		JLabel lbl16 = new JLabel("");
		lbl16.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/cuatro.png")));
		lbl16.setOpaque(true);
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlHoras.add(lbl16);
		
		JLabel lbl17 = new JLabel("");
		lbl17.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/cinco.png")));
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		lbl17.setOpaque(true);
		pnlHoras.add(lbl17);
		
		JPanel pnlCitas = new JPanel();
		pnlCitas.setBackground(new Color(255, 255, 255));
		pnlCitas.setLayout(new GridLayout(8, 1, 0, 0));
		pnlAgenda.add(pnlCitas, BorderLayout.CENTER);
		
		LineBorder border = new LineBorder(Color.BLACK, 2, true);
		
		JButton btnCita10 = new JButton();
		btnCita10.setContentAreaFilled(false);
		btnCita10.setOpaque(false);
		btnCita10.setBorder(border);
		btnCita10.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita10.setText("JOSE LUIS PEREZ - MUTILACION DE LENGUA");
		
		btnCita10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita10.setBackground(Color.YELLOW);
		pnlCitas.add(btnCita10);
		
		
		
		JButton btnCita11 = new JButton();
		btnCita11.setContentAreaFilled(false);
		btnCita11.setBorder(border);
		btnCita11.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita11.setText("ANTONIO - MONGOLO");
		
		btnCita11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita11.setBackground(Color.BLACK);
		pnlCitas.add(btnCita11);
		
		JButton btnCita12 = new JButton();
		btnCita12.setContentAreaFilled(false);
		btnCita12.setBorder(border);
		btnCita12.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita12.setText("ANTONIO - MONGOLO");
		
		btnCita12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita12.setBackground(Color.PINK);
		pnlCitas.add(btnCita12);
		
		JButton btnCita13 = new JButton();
		btnCita13.setContentAreaFilled(false);
		btnCita13.setBorder(border);
		btnCita13.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita13.setText("ANTONIO - MONGOLO");
		
		btnCita13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita13.setBackground(Color.PINK);
		pnlCitas.add(btnCita13);
		
		
		
		JButton btnCita14 = new JButton("New button");

		btnCita14.setContentAreaFilled(false);
		btnCita14.setBorder(border);
		btnCita14.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita14.setText("ANTONIO - MONGOLO");
		
		btnCita14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita14.setBackground(Color.PINK);
		pnlCitas.add(btnCita14);
		
		
		JButton btnCita15 = new JButton();
		btnCita15.setContentAreaFilled(false);
		btnCita15.setBorder(border);
		btnCita15.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita15.setText("ANTONIO - MONGOLO");
		
		btnCita15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita15.setBackground(Color.PINK);
		pnlCitas.add(btnCita15);
		
		JButton btnCita16 = new JButton();
		btnCita16.setContentAreaFilled(false);
		btnCita16.setBorder(border);
		btnCita16.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita16.setText("ANTONIO - MONGOLO");
		
		btnCita16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita16.setBackground(Color.PINK);
		pnlCitas.add(btnCita16);
		
		JButton btnCita17 = new JButton();
		btnCita17.setContentAreaFilled(false);
		btnCita17.setBorder(border);
		btnCita17.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnCita17.setText("ANTONIO - MONGOLO");
		
		btnCita17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCita17.setBackground(Color.PINK);
		pnlCitas.add(btnCita17);
		
	
		AbstractBorder bordeFecha = new TextBubbleBorder(Color.BLACK,2,16,0, false);
		
		JButton btnDerecha = new JButton("");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDerecha.setContentAreaFilled(false);
		btnDerecha.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnDerecha.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/derecha2.png")));
		btnDerecha.setBounds(651, 79, 40, 42);
		btnDerecha.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(btnDerecha);
		
		JButton btnIzq = new JButton();
		btnIzq.setContentAreaFilled(false);
		btnIzq.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnIzq.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/izq2.png")));
		btnIzq.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		btnIzq.setBounds(127, 79, 40, 42);
		pnlPrincipal.add(btnIzq);
		
		JButton btnHome = new JButton();
		btnHome.setBorderPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnHome.setIcon(new ImageIcon(PnlInicio.class.getResource("/images/hoy2.png")));
		btnHome.setBounds(386, 27,40,40);
		btnHome.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		pnlPrincipal.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("1 ENERO 2022");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 79, 491, 42);
		pnlPrincipal.add(lblNewLabel);
		
		setVisible(false);

	}
}

class TextBubbleBorder extends AbstractBorder {

    private Color color;
    private int thickness = 4;
    private int radii = 8;
    private int pointerSize = 7;
    private Insets insets = null;
    private BasicStroke stroke = null;
    private int strokePad;
    private int pointerPad = 4;
    private boolean left = true;
    RenderingHints hints;

    TextBubbleBorder(
            Color color) {
        this(color, 4, 8, 7);
    }

    TextBubbleBorder(
            Color color, int thickness, int radii, int pointerSize) {
        this.thickness = thickness;
        this.radii = radii;
        this.pointerSize = pointerSize;
        this.color = color;

        stroke = new BasicStroke(thickness);
        strokePad = thickness / 2;

        hints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int pad = radii + strokePad;
        int bottomPad = pad + pointerSize + strokePad;
        insets = new Insets(pad, pad, bottomPad, pad);
    }

    TextBubbleBorder(
            Color color, int thickness, int radii, int pointerSize, boolean left) {
        this(color, thickness, radii, pointerSize);
        this.left = left;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return insets;
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        return getBorderInsets(c);
    }

    @Override
    public void paintBorder(
            Component c,
            Graphics g,
            int x, int y,
            int width, int height) {

        Graphics2D g2 = (Graphics2D) g;

        int bottomLineY = height - thickness - pointerSize;

        RoundRectangle2D.Double bubble = new RoundRectangle2D.Double(
                0 + strokePad,
                0 + strokePad,
                width - thickness,
                bottomLineY,
                radii,
                radii);

        Polygon pointer = new Polygon();

        if (left) {
            // left point
            pointer.addPoint(
                    strokePad + radii + pointerPad,
                    bottomLineY);
            // right point
            pointer.addPoint(
                    strokePad + radii + pointerPad + pointerSize,
                    bottomLineY);
            // bottom point
            pointer.addPoint(
                    strokePad + radii + pointerPad + (pointerSize / 2),
                    height - strokePad);
        } else {
            // left point
            pointer.addPoint(
                    width - (strokePad + radii + pointerPad),
                    bottomLineY);
            // right point
            pointer.addPoint(
                    width - (strokePad + radii + pointerPad + pointerSize),
                    bottomLineY);
            // bottom point
            pointer.addPoint(
                    width - (strokePad + radii + pointerPad + (pointerSize / 2)),
                    height - strokePad);
        }

        Area area = new Area(bubble);
        area.add(new Area(pointer));

        g2.setRenderingHints(hints);

        // Paint the BG color of the parent, everywhere outside the clip
        // of the text bubble.
        Component parent  = c.getParent();
        if (parent!=null) {
            Color bg = parent.getBackground();
            Rectangle rect = new Rectangle(0,0,width, height);
            Area borderRegion = new Area(rect);
            borderRegion.subtract(area);
            g2.setClip(borderRegion);
            g2.setColor(bg);
            g2.fillRect(0, 0, width, height);
            g2.setClip(null);
        }

        g2.setColor(color);
        g2.setStroke(stroke);
        g2.draw(area);
    }
}