import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	

	void loadImage(String imageFile) {
		if (needImage) {
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
			if (needImage) {
				loadImage("rocket.png");
			}
		}
	}

	void up() {
		y -= speed;
	}

	void down() {
		y += speed;
	}

	void left() {
		x -= speed;
	}

	void right() {
		x += speed;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}

	}

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;

		// TODO Auto-generated constructor stub
	}

}
