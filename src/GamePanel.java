import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Time;

import javax.swing.JPanel;

	public class GamePanel extends JPanel {   
		Font titleFont = new Font("Arial", Font.PLAIN, 40);
		Font titleFont1 = new Font("Arial", Font.PLAIN, 15);
		Time Timer = new Time(); 
		final int MENU = 0; 
		final int GAME = 1; 
		final int END = 2; 
		int currentState = MENU; 
		@Override
		public void paintComponent(Graphics g){
	g.fillRect(10, 10, 100, 100);
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	    drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
		}	
	
	void updateMenuState() { 
	}
	
	void updateGameState() {
	}	
	
	void updateEndState() {
	}	
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);	
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 50, 150);
		g.setFont(titleFont1);
		g.drawString("Press ENTER to start", 125, 200);
		g.drawString("Press SPACE for instructions", 125, 300 );
	}
	void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	void drawEndState(Graphics g) {
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.drawString("Game Over", 250, 250);
	
	}
	}
	
		
	
