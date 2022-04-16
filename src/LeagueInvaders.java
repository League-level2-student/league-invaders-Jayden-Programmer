import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	JFrame frame = new JFrame();
	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;
	GamePanel gpanel = new GamePanel();

	LeagueInvaders() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
	}

	void setup() {
		frame.add(gpanel); 
		frame.setSize(WIDTH, HEIGHT);
		
		

	}
}
