import java.awt.Rectangle;

public class Obstacle {

	public int x;
	public int y;
	public int width;
	public int length;
	
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
		while(y<val) {
			y++;
		}
	}
}
