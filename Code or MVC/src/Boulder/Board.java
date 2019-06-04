package Boulder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Board extends JPanel implements ActionListener{
	private Timer timer;
	private Map m;
	public Player p;
	public Diamond d;
	public int diamondcounter;
	
	public Board() {
		m = new Map();
		p = new Player();
		d = new Diamond();

		
		addKeyListener(new Al());
		setFocusable(true);
		timer = new Timer(25, this);  
		timer.start();
	}

	public void actionPerformed(ActionEvent e) { 
		if(m.getMap(p.getTileX(), p.getTileY()).equals("d")) {
			diamondcounter = diamondcounter + 1;
			 try {
				 Thread.sleep(500);
			 }catch(InterruptedException ex) {
					 ex.printStackTrace();
				 }
			 
			 }
		
		if(m.getMap(p.getTileX(), p.getTileY()).equals("e")){
            if(diamondcounter >= 5) {
                JFrame w = new JFrame();
                JOptionPane.showMessageDialog(w, "GG ", "Result", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
		}
	}
        
		
		
			
		

	
	public void paint(Graphics g) {
		super.paint(g);

		for(int y=0;y<15;y++) {
			for(int x=0;x<15;x++) {

				if(m.getMap(x, y).equals("w")) {
					g.drawImage(m.GetWall(), x*32, y*32, null);
				}

				if(m.getMap(x, y).equals("b")) {  
					g.drawImage(m.GetBlack(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("g")) {  
					g.drawImage(m.GetGround(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("d")) {  
					g.drawImage(m.GetDiamond(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("r")) {  
					g.drawImage(m.GetRock(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("e")) {  
					g.drawImage(m.GetExit(), x*32, y*32, null);
				}
				if(m.getMap(p.getTileX(), p.getTileY()).equals("d")) {
					g.drawImage(m.GetRectangle(), x*32, y*32, null);
				}
				
				}
		}

		g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
		g.drawImage(d.getDiamond(), d.getTileX()*32, d.getTileY()*32, null);
		repaint();
		
		
		
			if(p.getTileX()==d.getTileX() && p.getTileY() == d.getTileY()) {
				d.SetVisible(false);
			
				
			}
		
		
	}
	

	public class Al extends KeyAdapter{

		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();

			if(keycode == KeyEvent.VK_Z) {	
				if(!m.getMap(p.getTileX(), p.getTileY()-1).equals("w"))
					p.move(0, -1);
			}
			if(keycode == KeyEvent.VK_S) {	
				if(!m.getMap(p.getTileX(), p.getTileY()+1).equals("w"))
					p.move(0, 1);				
			}
			if(keycode == KeyEvent.VK_Q) {
				if(!m.getMap(p.getTileX()-1, p.getTileY()).equals("w"))
					p.move(-1, 0);
			}
			if(keycode == KeyEvent.VK_D) {
				if(!m.getMap(p.getTileX()+1, p.getTileY()).equals("w"))
					p.move(1, 0);
			}
		}

		public void keyrelased(KeyEvent e) {	
		}
		public void keyTyped(KeyEvent e) {

		}
		
	}
	
}
	
	

	

