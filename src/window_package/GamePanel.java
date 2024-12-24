package window_package;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // PULISCO LO SCHERMO
		
		// IMPOSTO IL COLORE DELL'OGGETTO
		g.setColor(Color.red);
		
		// QUADRATO ROSSO
		g.fillRect(50, 50, 100, 100);
	}
}
