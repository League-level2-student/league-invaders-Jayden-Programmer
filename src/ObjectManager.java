import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile> projectiles = new ArrayList <Projectile>(); 
	Random random = new Random();
	Alien aliens;

	public ObjectManager(Rocketship rocket) {

	}

	void addProjectile(Projectile projectile) {
		projectiles.add(projectile); 
		
	}

	void addAlien() {
		Alien.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
		
	}

	void update() { 

	}
}
