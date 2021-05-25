import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Obstacle {

	public int x;
	public int y;
	public int width;
	public int length;
	public Color c;
	
	public Obstacle(int x, int y, int width, int length) {
		x=this.x;
		y=this.y;
		width=this.width;
		length=this.length;
		
	}
	
	public void paint(Graphics g) {
		g.drawRoundRect(x, y, width, length, 2, 2);
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
}
