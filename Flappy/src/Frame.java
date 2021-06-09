import java.awt.Font;
import java.awt.Graphics;

import frog.Background;
import frog.Death;
import frog.Music;

public class Frame {

	//ADD THIS TO THE DRIVER 
	// Set background and music
		Background background = new Background();
		Music soundBackground = new Music("2160p-1.mp3", true);
		Death death  = new Death();
		Music soundDeath = new Music("die.mp3", true);
		Point pount = new Point();
		Music pointSound = new Music("point.mp3",true);
		Hit hit = new Hit();
		Music hitSound = new Music("hit.mp3",true);
		Wing wing = new Wing();
		Music wingSound = new Music("wing.mp3",true);
	/*
	int score = 0;
	  int pole = 0; //for counting poles
	   int count = 0; //for displaying a countofcoins
	   Font Verdana = new Font("Verdana", Font.BOLD,40);
		int textX = 100;
		public void paint(Graphics g) {
			   super.paintComponent(g); //do not remove
			   /*paint method runs roughly 60x per seconed 
			    
			
			   g.setFont(Verdana);
			   //drawing test on the lock screen + using varibles
			   g.drawString(""+Score,textX,);
			 
			   //add variables for paddles!
			 
			   if (bird <= pole)
				  {
				   //play die sound
					  //game ends
				  }
				  
				  if (bird != pole) {
					  play point audio!
					  score++;
					  pole++;
				  }
				  
				  if (bird == coin) {
					  score = score + 5;
					  //play point audio
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

			 */  

}
