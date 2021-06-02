import java.awt.Font;
import java.awt.Graphics;

public class Frame {

	
	
	
	int score = 0;
	
	   int count = 0; //for displaying a countofcoins
	   Font Verdana = new Font("Verdana", Font.BOLD,40);
		int textX = 100;
		public void paint(Graphics g) {
			   super.paintComponent(g); //do not remove
			   /*paint method runs roughly 60x per seconed 
			    * 
			    */
			   g.setFont(Verdana);
			   //drawing test on the lock screen + using varibles
			   g.drawString(""+Score,textX,);
			 
			   //add variables for paddles!
			   int pole = 0; //for counting poles
			   if (bird <= pole)
				  {
					  //game ends
				  }
				  
				  if (bird != pole) {
					  score++;
					  pole++;
				  }
				  
				  if (bird == coin) {
					  score = score + 5;
				  }
				  
				  
				  if(polescrossed == 10 ) {
					  background switch thing;
				  }
				  if( poles corssed == 20) {
					  switch to a diffeent background
					  
				  }
				  if( poles crossed == 30) {
					  then switch to a win screen background
				  }
				  else {
					  background remains the same, so no changes
				  }
	   
				  
				  public void music() {
					  
				  }
}
}
