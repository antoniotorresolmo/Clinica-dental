package views;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.io.InputStream;
import java.awt.image.*;
import java.awt.geom.*;

public class PnlInicio extends JPanel {

	private static Font font;
	private static Color AZULITO = new Color(137, 207, 240);

	public PnlInicio() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(pnlPrincipal);
		pnlPrincipal.setLayout(null);

		String fontName = "quicksand.ttf";
		try {
			// Se carga la fuente
			InputStream is = getClass().getResourceAsStream(fontName);
			font = Font.createFont(Font.TRUETYPE_FONT, is);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Font Quicksand = font.deriveFont(Font.BOLD, 25);
		
		setFont(Quicksand);

		JLabel lblDia = new JLabel("1");
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setBounds(50, 50, 50, 50);
		lblDia.setFont(Quicksand);
		pnlPrincipal.add(lblDia);

		JLabel lblMes = new JLabel("Diciembre");
		lblMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMes.setBounds(298, 50, 150, 50);
		lblMes.setFont(Quicksand);
		pnlPrincipal.add(lblMes);

		JLabel lblYear = new JLabel("2022");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(664, 50, 100, 50);
		lblYear.setFont(Quicksand);
		pnlPrincipal.add(lblYear);
		
		AbstractBorder bordeAgenda = new TextBubbleBorder(Color.BLACK,2,16,0, false);
		
		JPanel pnlAgenda = new JPanel();
		pnlAgenda.setBounds(46, 150, 718, 347);
		pnlPrincipal.add(pnlAgenda);
		pnlAgenda.setLayout(new BorderLayout());
		
		JPanel pnlHoras = new JPanel();
		pnlAgenda.add(pnlHoras, BorderLayout.WEST);
		pnlHoras.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lbl10 = new JLabel("10:00");
		lbl10.setOpaque(true);
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setBackground(AZULITO);
		pnlHoras.add(lbl10);
		
		JLabel lbl11 = new JLabel("11:00");
		lbl11.setBackground(Color.WHITE);
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setOpaque(true);
		pnlHoras.add(lbl11);
		
		JLabel lbl12 = new JLabel("12:00");
		lbl12.setOpaque(true);
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBackground(AZULITO);
		pnlHoras.add(lbl12);
		
		JLabel lbl13 = new JLabel("13:00");
		lbl13.setBackground(Color.WHITE);
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setOpaque(true);
		pnlHoras.add(lbl13);
		
		JLabel lbl14 = new JLabel("14:00");
		lbl14.setOpaque(true);
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBackground(AZULITO);
		pnlHoras.add(lbl14);
		
		JLabel lbl15 = new JLabel("15:00");
		lbl15.setBackground(Color.WHITE);
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setOpaque(true);
		pnlHoras.add(lbl15);
		
		JLabel lbl16 = new JLabel("16:00");
		lbl16.setOpaque(true);
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setBackground(AZULITO);
		pnlHoras.add(lbl16);
		
		JLabel lbl17 = new JLabel("  17:00  ");
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setBackground(Color.WHITE);
		lbl17.setOpaque(true);
		pnlHoras.add(lbl17);
		
		JPanel pnlCitas = new JPanel();
		pnlCitas.setLayout(new GridLayout(8, 1, 0, 0));
		pnlAgenda.add(pnlCitas, BorderLayout.CENTER);
		
		JLabel lblCita10 = new JLabel("Paciente 1 - Operaci\u00F3n");
		lblCita10.setOpaque(true);
		lblCita10.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita10.setBackground(AZULITO);
		pnlCitas.add(lblCita10);
		
		JLabel lblCita11 = new JLabel("Paciente 2 - Operaci\u00F3n");
		lblCita11.setBackground(Color.WHITE);
		lblCita11.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita11.setOpaque(true);
		pnlCitas.add(lblCita11);
		
		JLabel lblCita12 = new JLabel("Paciente 3 - Operaci\u00F3n");
		lblCita12.setOpaque(true);
		lblCita12.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita12.setBackground(AZULITO);
		pnlCitas.add(lblCita12);
		
		JLabel lblCita13 = new JLabel("Paciente 4 - Operaci\u00F3n");
		lblCita13.setBackground(Color.WHITE);
		lblCita13.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita13.setOpaque(true);
		pnlCitas.add(lblCita13);
		
		JLabel lblCita14 = new JLabel("Paciente 5 - Operaci\u00F3n");
		lblCita14.setOpaque(true);
		lblCita14.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita14.setBackground(AZULITO);
		pnlCitas.add(lblCita14);
		
		JLabel lblCita15 = new JLabel("Paciente 6 - Operaci\u00F3n");
		lblCita15.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita15.setBackground(Color.WHITE);
		lblCita15.setOpaque(true);
		pnlCitas.add(lblCita15);
		
		JLabel lblCita16 = new JLabel("Paciente 7 - Operaci\u00F3n");
		lblCita16.setOpaque(true);
		lblCita16.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita16.setBackground(AZULITO);
		pnlCitas.add(lblCita16);
		
		JLabel lblCita17 = new JLabel("Paciente 8 - Operaci\u00F3n");
		lblCita17.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita17.setBackground(Color.WHITE);
		lblCita17.setOpaque(true);
		pnlCitas.add(lblCita17);
		
		AbstractBorder bordeFecha = new TextBubbleBorder(Color.BLACK,2,16,0, false);
		
		JPanel panel = new JPanel();
		panel.setBorder(bordeFecha);
		panel.setBounds(50, 50, 714, 50);
		panel.setBackground(AZULITO);
		pnlPrincipal.add(panel);
		
		

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