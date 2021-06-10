import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.image.*;
import java.net.URL;
import java.awt.geom.AffineTransform;

public class Driver extends JPanel implements ActionListener, KeyListener, MouseListener {

	//object declarations
	Bird bird;
	ArrayList<Obstacle> top;
	ArrayList<Obstacle> bottom;
	ArrayList<Coin> coins;
	int level;


	public Driver() {
		
		//frame setup
		JFrame f = new JFrame();
		f.setTitle("Flappy");
		f.setSize(1600, 700);
		f.setResizable(true);
		f.addKeyListener(this);

		f.addMouseListener(this);
		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		//instantiations and arrays
		top = new ArrayList<Obstacle>();
		bottom = new ArrayList<Obstacle>();
		coins = new ArrayList<Coin>();
		bird = new Bird();
		level = bird.getLevel();
		
		for(int i=0; i<10; i++) {
			coins.add(new Coin());
		}
		
		
	
		
		//level 1
		if(bird.getLevel()==0) {
			int x = 100;
			int prev = 300;
			for(int i=0; i<3; i++) {
				int l = (int)(Math.random()*200)+200;
				
				//makes sure that obstacles are not too far apart
				while(Math.abs(l-prev)>130) {
					l = (int)(Math.random()*200)+200;
				}
				prev = l;
				
				x+=250;
				bottom.add(new Obstacle(x, 900-200-l, 100, l, false));
				top.add(new Obstacle(x, -300-l, 100, l, true));
			}
		}
		
		//collision
		for(Obstacle t: top) {
			if(t.collide(bird)) {
				bird.setVx(0);
				bird.setVy(0);
		for(Obstacle b: bottom){
			if(b.collide(bird)) {
				bird.setVx(0);
				bird.setVy(0);
			}
		}
		
		
		//level 2
		if(bird.getLevel()==1) {
			//clear previous lvl obstacles
			for(Obstacle ob: top) {
				top.remove(ob);
			}
			for(Obstacle ob: bottom) {
				top.remove(ob);
			}
			
			//new obstacles
			int x=0;
			int prev = 300;
			for(int i=0; i<4; i++) {
				int l = (int)(Math.random()*200)+200;

				//makes sure that obstacles are not too far apart
				while(Math.abs(l-prev)>130) {
					l = (int)(Math.random()*200)+200;
				}
				prev = l;
				
				x+=250;
				bottom.add(new Obstacle(x, 900-200-l, 100, l, false));
				top.add(new Obstacle(x, -300-l, 100, l, true));
			}
		}
		
				//level 3
				if(level==2) {
					//clear previous lvl obstacles
					for(Obstacle ob: top) {
						top.remove(ob);
					}
					for(Obstacle ob: bottom) {
						top.remove(ob);
					}
					
					//new obstacles
					int x=0;
					int prev = 300;
					for(int i=0; i<5; i++) {
						int l = (int)(Math.random()*200)+200;
						
						//makes sure that obstacles are not too far apart
						while(Math.abs(l-prev)>130) {
							l = (int)(Math.random()*200)+200;
						}
						prev = l;
						
						x+=200;
						bottom.add(new Obstacle(x, 900-200-l, 100, l, false));
						top.add(new Obstacle(x, -300-l, 100, l, true));
					}
				}
				
				
				//level 4
				if(level==3) {
					//clear previous lvl obstacles
					for(Obstacle ob: top) {
						top.remove(ob);
					}
					for(Obstacle ob: bottom) {
						top.remove(ob);
					}
					
					//new obstacles
					int x=0;
					int prev = 300;
					for(int i=0; i<6; i++) {
						int l = (int)(Math.random()*200)+200;
						
						//makes sure that obstacles are not too far apart
						while(Math.abs(l-prev)>130) {
							l = (int)(Math.random()*200)+200;
						}
						prev = l;
						
						x+=175;
						bottom.add(new Obstacle(x, 900-200-l, 100, l, false));
						top.add(new Obstacle(x, -300-l, 100, l, true));
					}
				}
		
	
			}
	
	
		
		


	//background & images
	private Image grass = null;
	private Image ocean = null;
	private Image sunset = null;
	private Image mountain = null;
	private Image score = null;
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; 
		Font font = new Font("VERDANA", 1, 50); 
		
		this.setSize(1600, 700);
		grass = getImage("grass.png");
		ocean = getImage("ocean.png");
		sunset = getImage("sunset.png");
		mountain = getImage("mountain.png");
		score = getImage("score.png");
		
		//g.drawRect(200, 200,400, 400);
		if(level==0) {
			g2.drawImage(grass, 0, 0, 1275, 695, this);
		}
		if(level==1) {
			g2.drawImage(ocean, 0, 0, 1300, 700, this);
		}
		if(level==2) {
			g2.drawImage(mountain, 0, 0, 1300, 700, this);
		}
		if(level==3) {
			g2.drawImage(sunset, 0, 0, 1275, 695, this);
		}

		
		//paint obstacles
		for(Obstacle ob: top) {
			ob.paint(g2);
		}  
		for(Obstacle ob: bottom) {
			ob.paint(g2);
		}  
		
		g2.drawImage(score, 1100, 50, 130, 130, this);
		bird.paint(g2);
		
		//paint coins
		for(Coin c: coins) {
			c.paint(g2);
		}
		
		g.setFont(font);
		g.setColor(Color.white);
		
		g.drawString(""+bird.getScore(), 1140, 140);
		
	}

	

	public static void main(String[] arg) {
		Driver d = new Driver();
	
	}	
	
	
	// converts image to make it drawable in paint
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
	

	
	public void update() {

	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

	

	
	
	
	
	Timer t;

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
			case KeyEvent.VK_SPACE:
				bird.update();
				
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		/*
		 * turn off velocity for Frog if you don't want it moving when you have stopped
		 * pressing the keys
		 */

		// do the same thing for the other keys
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}