import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	void update() {
		y -= speed;
	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}

	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		// TODO Auto-generated constructor stub
	}

}
