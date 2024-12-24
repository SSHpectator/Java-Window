package window_package;

import javax.swing.JFrame;
import java.awt.*;

public class Window {
	public Window(){
		JFrame frame = new JFrame();
		frame.setSize(800,600);
		
		// COLORE FINESTRA
		frame.getContentPane().setBackground(Color.black);
		
		GamePanel gamePanel = new GamePanel();
		frame.add(gamePanel);
		
		frame.setVisible(true); // RENDO LA FINESTRA VISIBILE
		frame.setTitle("Finestra GOD");
		
		frame.setResizable(false);
		
		// DETERMINO LA GRANDEZZA DELLA FINESTRA
		Toolkit t = Toolkit.getDefaultToolkit();
	//	System.out.println("Screen Resolution= " + t.getScreenResolution());
		
		Dimension dim = t.getScreenSize();
	/*	System.out.println("Screen Height= " + dim.height);
		System.out.println("Screen Width= " + dim.width); */
		
		// CENTRO LA FINESTRA
		frame.setLocation((dim.width-frame.getSize().width)/2, (dim.height-frame.getSize().height)/2);
		
		
		// CLOSE THE PROGRAM ENTIRELY
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
