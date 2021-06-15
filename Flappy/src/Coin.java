import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;

public class Coin {

	private int x, y;
	private int radius;
	private Color c;
	
	private Image img;
	
	
	public Coin(int x, int y) {
		this.x=x;
		this.y=y;
		radius=50;
		img=getImage("coin.png");
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(img, x, y, radius, radius, null);
		//g.setColor(c);
		//g.drawOval(x, y, radius, radius);
	}


	public boolean collide(Bird b) {
		Rectangle r = new Rectangle(this.x, this.y,this.radius, this.radius);
		
		if(b.getRect().intersects(r)) {
			return true;
		}return false;
	}
	

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Bird.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}