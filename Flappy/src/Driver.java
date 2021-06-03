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
	ArrayList<Obstacle> o;


	public Driver() {
		
		//frame setup
		JFrame f = new JFrame();
		f.setTitle("Flappy");
		f.setSize(1600, 900);
		f.setResizable(false);
		f.addKeyListener(this);

		f.addMouseListener(this);
		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		//instantiations and arrays
		o = new ArrayList<Obstacle>();
		bird = new Bird();
		
		int x = 100;
		for(int i=0; i<7; i++) {
			int l = (int)(Math.random()*200)+200;
			x+=200;
			o.add(new Obstacle(x, 900-200-l, 100, l ));
			o.add(new Obstacle(x, 0, 100, 900-l-450));
		}
	}

	
	Font big = new Font("Courier New", 1, 50);
	Font font2 = new Font("Courier New", 1, 30);
	Font biggest = new Font("Courier New", 1, 80);
	
	//background & images
	private Image grass = null;
	private Image ocean = null;
	private Image sunset = null;
	private Image mountain = null;
	private Image score = null;
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; 
		
		this.setSize(1600, 900);
		grass = getImage("grass.png");
		ocean = getImage("ocean.png");
		sunset = getImage("sunset.png");
		mountain = getImage("mountain.png");
		score = getImage("score.png");
		
		if(bird.getLevel()==0) {
			g2.drawImage(grass, 0, 0, 1275, 695, this);
		}
		if(bird.getLevel()==1) {
			g2.drawImage(ocean, 0, 0, 1300, 700, this);
		}
		if(bird.getLevel()==2) {
			g2.drawImage(mountain, 0, 0, 1300, 700, this);
		}
		if(bird.getLevel()==3) {
			g2.drawImage(sunset, 0, 0, 1275, 695, this);
		}

		//g2.fillRect(100, 100, 1000, 100);
		for(Obstacle ob: o) {
			ob.paint(g2);
		}  
		
		
		g2.drawImage(score, 1500, 0, 50, 50, this);
		bird.paint(g2);
		
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
		//froggy.methodHop();

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