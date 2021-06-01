import java.awt.Image;

public class Bird {

	private int x, y;
	private int vx, vy;
	private int width;
	private int height;
	public int level;
	private boolean gameOver;
	
	private Image img;
	
	public Bird() {
		x = 300;
		y = 100;
		
		vx = 0;
		vy = y;
		
		width = 50;
		height = 50;
		gameOver = false;
		level = 0;
	
	}
	
	public int getLevel() {
		if(gameOver) {
			level++;
		}
		return level;
	}
}