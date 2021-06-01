import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class coin {

	private int x, y;
	private int radius;
	
	
	private Image img;
	
	public coin(Graphics g) {
		radius=10;
		y=(int)(Math.random()*900);
		x=(int)(Math.random()*1600);
	   g.drawOval(x, y, radius, radius);
	}
	
	

}