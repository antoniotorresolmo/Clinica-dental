package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class PnlPacientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlPacientes() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Est\u00E1s en pacientes bro");
		add(lblNewLabel, BorderLayout.CENTER);

	}

}
