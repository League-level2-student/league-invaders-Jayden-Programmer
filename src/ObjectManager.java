import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	Random random = new Random();

	public ObjectManager(Rocketship rocket) {

	}

	void addProjectile(Projectile projectile) {
		projectiles.add(projectile);

	}

	void draw(Graphics g) { 
		rocket.draw(g); 
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g); 
			
		}
	}

	void purgeobjects() {
		for (int i = 0; i < aliens.; i++) {
		
		}

	}

	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

	}

	void update() {
		for (int i = 0; i < aliens.size(); i++) {

		}

	}
}
