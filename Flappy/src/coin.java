import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class coin {

	private int x, y;
<<<<<<< HEAD
	private int width;//not completly sure
	
	private int height;//not completly sure
=======
	private int radius;
	
>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
	
	private Image img;
	
<<<<<<< HEAD
	public coin() {
	img = getImage("pixil-frame-0(1).png");		   
	   
}
	
	public coin("pixil-frame-0(1).png") {
		for(int i = 0; i < 15;i++) {
			//randomize placements of the coins (x,y coordinates) 
			// and randomly place coins
=======
	public coin(Graphics g) {
		radius=10;
		y=(int)(Math.random()*900);
		x=(int)(Math.random()*1600);
	   g.drawOval(x, y, radius, radius);
>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
	}
	
	
<<<<<<< HEAD
}
=======

>>>>>>> branch 'Jenny' of https://github.com/kittycatrobot/p1_nicole1jenny2nithya3_flappy.git
}