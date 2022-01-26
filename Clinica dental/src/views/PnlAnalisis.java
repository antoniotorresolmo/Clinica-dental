package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class PnlAnalisis extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlAnalisis() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Est\u00E1s en análisis bro");
		add(lblNewLabel, BorderLayout.CENTER);

	}

}
