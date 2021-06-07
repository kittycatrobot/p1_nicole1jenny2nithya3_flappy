import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.net.URL;

public class Obstacle {

	public int x;
	public int y;
	public int width;
	public int length;
	public Color c;
	private Image pole;
	
	public Obstacle(int x, int y, int width, int length, Boolean isTop) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.length=length;
		if(isTop) {
			pole = getImage("image.png");
		}else {
			pole = getImage("pole.png");
		}
		
	}
	
	
	
	public void paint(Graphics g) {
		g.drawImage(pole, x, y, null);
	}
	
	public int collide(int vx, int x, int y, int w) {
		Rectangle r = new Rectangle(this.width, this.length);
		Rectangle bird = new Rectangle(w,w);
		if(r.intersects(bird)) {
			return -vx;
		}
		return vx;
	}
	
	public void oscillate() {
		int val = (int)Math.random()*(50+1);
		int curr = y;
		while(y>0) {
			y++;
		}
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Obstacle.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
}
