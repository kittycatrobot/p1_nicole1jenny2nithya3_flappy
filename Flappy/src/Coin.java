import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class Coin {

	private int x, y;
	private int radius;
	private Color c;
	
	private Image img;
	
	
	public Coin() {
		radius=50;
		y=(int)(Math.random()*900);
		x=(int)(Math.random()*1600);
		c=Color.YELLOW;
		img=getImage("coin.png");
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(img, x, y, radius, radius, null);
		//g.setColor(c);
		//g.drawOval(x, y, radius, radius);
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