import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;

import javax.swing.JPanel;
import javax.swing.Timer;

import GamePanel.ObjectManager;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Font titleFont = new Font("Arial", Font.PLAIN, 40);
	Font titleFont1 = new Font("Arial", Font.PLAIN, 15);
	Font titleFont2 = new Font("Arial", Font.PLAIN, 40);
	Font titleFont3 = new Font("Arial", Font.PLAIN, 15);
	Timer frameDraw;
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Rocketship rocketship = new Rocketship(250, 700, 50, 50);
	Timer alienSpawn;

	public static void Objectmanager() {
		Rocketship rocketship = null;

	}

	void startGame() {
		Timer alienSpawn = null;
		alienSpawn.start();

	}

	public class Objectmanager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			addAlien();
			int speed = 1000;
			alienSpawn = new Timer(1000, Objectmanager);
			alienSpawn.start();
			

		}

	}

	public Projectile getProjectile() {
		return new Projectile(x + WIDTH / 2, y, 10, 10);

	}

	public GamePanel() {
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.fillRect(10, 10, 100, 100);
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
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
		g.drawString("Press SPACE for instructions", 125, 300);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		Objectmanager();
		rocketship.draw(g);

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont2);
		g.setColor(Color.YELLOW);
		g.drawString("Game Over", 150, 150);
		g.setFont(titleFont3);
		g.setColor(Color.YELLOW);
		g.drawString("You killed enemies", 150, 300);
		g.drawString("Press ENTER to restart", 150, 400);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("action");
		repaint();
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;
				startGame();

			} else {
				currentState++;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("UP");
			rocketship.up();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("DOWN");
			rocketship.down();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
			rocketship.left();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
			rocketship.right();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
