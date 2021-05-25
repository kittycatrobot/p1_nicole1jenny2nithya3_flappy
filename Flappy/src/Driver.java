
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

	//Froggy froggy;
	//Piggy piggy;

	
	//create in a row and display them
	Obstacle o = new Obstacle(100, 200, 100, 400 );
	//Piggy pigs[] = new Piggy[3];

	public static void main(String[] arg) {
		Driver d = new Driver();
	
	}

	
	Font big = new Font("Courier New", 1, 50);
	Font font2 = new Font("Courier New", 1, 30);
	Font biggest = new Font("Courier New", 1, 80);
	
	
	// ****************************paint
	// method******************************************
	

	private Image city = null;
	private Image sunset = null;
	int level = 1;
	
	public void paint(Graphics g) {
		this.setSize(1600, 900);
		city = getImage("City.jpg");
		sunset = getImage("sunset.png");
		if(level==0) {
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(city, 0, 0, 1600, 900, this);
		}
		if(level==1) {
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(sunset, 0, 0, 1600, 900, this);
		}
		
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
	
	public void paint1(Graphics g) {

		super.paintComponent(g);
		
		//for(Piggy p: pigs) {
		//	p.paint(g);
		//}
		g.drawRect(100, 1000, 200, 600);
		o.paint(g);
		g.setColor(Color.black);
		//call upon the paint method of the object
		//piggy.paint(g);
			
		
		
		//call upon the paint method of the object
		//froggy.paint(g);
			
		

	}

	public void update() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

	
	
	public Driver() {
		JFrame f = new JFrame();
		f.setTitle("Flappy");
		f.setSize(1600, 900);
		f.setResizable(false);
		f.addKeyListener(this);

		//set up objects and arrays here
	
	
		f.addMouseListener(this);
		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
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
