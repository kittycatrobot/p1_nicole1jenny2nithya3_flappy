import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class coin {

	private int x, y;

	private int width;//not completly sure
	
	private int height;//not completly sure

	private int radius;
	

	private Image img;

	public coin() {
	img = getImage("pixil-frame-0(1).png");		   
	   
}
	
	public coin("pixil-frame-0(1).png") {
		for(int i = 0; i < 15;i++) {
			// make coing appear, in a random spot 15 times 
			

	public coin(Graphics g) {
		radius=10;
		y=(int)(Math.random()*900);
		x=(int)(Math.random()*1600);
	   g.drawOval(x, y, radius, radius);

	}
	
	

}


}