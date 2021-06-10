
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class Bird {

	private int x;
	private static int y;
	private int vx, vy;
	private int width;
	private int height;
	public int level,score;
	private boolean gameOver;
	private boolean win;

	
	private Image img;
	
	public Bird() {
		x = 70;
		y = 250;
		
		vx = 1;
		vy = 1;
		
		width = 100;
		height = 100;
		
		gameOver = false;
		win = false;
		level = 0;
		score = 0;
		
		img = getImage("bird.png");
	
	}
	
	
	public int getLevel() {
		
		return level;
	}
	
	
	public void reset() {
		x = 70;
		y = 250;
	}

	public void update() {
		int counter = 10;
		while(counter >=0) {
			y--;
			counter--;
		}
	}
	public static void main(String args[]) {
		/*Timer t = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				y++;
			}
		};
		
		t.scheduleAtFixedRate(task, 0, 500);
		*/
	}
	

	public void move() {
		
		if(y<=600 && y>=0) {
			y += vy;
			x += vx;
			if(x>1400) {
				win = true;
				level++;
				reset();
			}
			if(y>600 || y<0) {
				reset();
			}
		}

	}



	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);

	// draw the affine transform
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(img, x, y, width, height, null);
		move(); //ask bird to update its location variables

	}

	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
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

	public void setVx(int vx) {
		this.vx = vx;
	}

	public void setVy(int vy) {
		this.vy = vy;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		tx.setToTranslation(x, y);
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setY(int y) {
		this.y = y;
		tx.setToTranslation(x, y);
	}

	public int getScore() {
		return score;
	}
	


	/* Helper function for collision detection later */
	public Rectangle getRect() {
		Rectangle temp = new Rectangle(x,y,width,height);
		return temp;
	}
	
}
