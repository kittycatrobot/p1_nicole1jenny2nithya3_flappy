<<<<<<< HEAD
=======

>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
<<<<<<< HEAD

=======
>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git

public class Bird {

	private int x, y;
	private int vx, vy;
	private int width;
	private int height;
	public int level;
	private boolean gameOver;
	private boolean win;
	
	private Image img;
	
	public Bird() {
		x = 70;
		y = 250;
		
<<<<<<< HEAD
		vx = 0;
		vy = 0;
=======
		vx = 1;
		vy = 1;
>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
		
<<<<<<< HEAD
		width = 50;
		height = 50;
		
		img = getImage("Bird.png");
=======
		width = 100;
		height = 100;
		gameOver = false;
		level = 0;
		img = getImage("bird.png");
>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
	
	}
	
	
<<<<<<< HEAD
	public void reset() {
		x = 300;
		y = 100;
	}
	
	
	public void move() {
		y -= 50;
		tx.setToTranslation(x, y);
		
		y += 50;
		tx.setToTranslation(x, y);
	}
	
	
	
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);

	// draw the affine transform
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		move(); //ask frog to update its location variables
		g2.drawImage(img, tx, null);
		
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

	public void setY(int y) {
		this.y = y;
		tx.setToTranslation(x, y);
	}
	
	
	/* Helper function for collision detection later */
	public Rectangle getRect() {
		Rectangle temp = new Rectangle(x,y,width,height);
		return temp;
	}
=======
	public int getLevel() {
		if(gameOver) {
			//level++;
		}
		return level;
	}
	
	public void reset() {
		x = 70;
		y = 250;
	}


	public void move() {
		
		
		
		if(y<=600 && y>=0) {
			y += vy;
			x += vx;
			gameOver = true;
		}
		//tx.setToTranslation(x, y);
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

	public void setY(int y) {
		this.y = y;
		tx.setToTranslation(x, y);
	}


	/* Helper function for collision detection later */
	public Rectangle getRect() {
		Rectangle temp = new Rectangle(x,y,width,height);
		return temp;
	}
	
>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
}
