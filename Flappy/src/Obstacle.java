import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Obstacle {

	private int x;
	private int y;
	private int width;
	private int length;
	private Color c;
	private Image pole;
	private ArrayList<Obstacle> top = new ArrayList<Obstacle>();
	private ArrayList<Obstacle> bottom = new ArrayList<Obstacle>();
	
	
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
		g.drawRect(x, y, width, length);
	}
	
	public boolean collide(Bird b) {
		Rectangle r = new Rectangle(this.x, this.y,this.width, this.length);
		
		if(b.getRect().intersects(r)) {
			return true;
		}return false;
	}
	


	public ArrayList<Obstacle> getTop(){
		return top;
	}
	
	public ArrayList<Obstacle> getBottom(){
		return bottom;
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
