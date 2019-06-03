package controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import model.Ground;
import model.Player;
import model.Rock;
import contract.Direction;
import view.Board;

public class Map extends Board{
	GenerateMap m = new GenerateMap();
	private Player p;
	private Ground gr;
	private Timer timer;
	int Checks = 0, FPS, totalChecks = 0;
	int Nbrock=0 ;
	
	Rock[] rock = new Rock[2];
	/**
	 * the real fonction which create the map with the player and all the cases of ground, rock , wall etc
	 * @author Groupe10
	 */
	public Map() {
		p = new Player();
		m.GMap();

	}
	/**
	 * the DP Factory which build the map and decide where is walls , ground etc ...
	 * @author Groupe10
	 */
	public void paint(Graphics g) {
		super.paint(g);

		for(int y=0;y<15;y++) {
			for(int x=0;x<23;x++) {

				if(m.getMap(x, y).equals("w")) {

					g.drawImage(m.GetWall(), x*32, y*32, null);
				}
				if (m.getMap(x, y).equals("r")){
					/**
					Nbrock++;
					rock[Nbrock-1].tileX = x;
					rock[Nbrock-1].tileY = y;
					*/
					g.drawImage(m.GetRock(), x*32, y*32, null);
					
				}

				if(m.getMap(x, y).equals("b")) {  
					g.drawImage(m.GetBlack(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("d")) {  
					g.drawImage(m.GetDiamond(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("e")) {  
					g.drawImage(m.GetExit(), x*32, y*32, null);
				}
				if(m.getMap(x, y).equals("g")) {  
					int w= 0;
					w++;
					Ground[] ground = new Ground[23];
					ground[w-1] = new Ground();
					g.drawImage(m.GetGround(), x*32, y*32, null);
				}

			}

		}
		g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
		Player_Move();
		SleepRefresh();
		Ground_destruct(g);
		
	}



	public void SleepRefresh() {
		try {
			Thread.sleep(1);	
		}
		catch(Exception e) {

		}
		repaint();
	}

	public void Ground_destruct(Graphics g) {
		if (m.getMap(p.getTileX(), p.getTileY()).equals("g")) {
			g.drawImage(m.GetBlack(), p.getTileX()*32, p.getTileY()*32, null);
			g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
		}
		repaint();
	}

	public void Player_Move() {
		if (Board.Keys[0]) {
			if(m.getMap(p.getTileX(), p.getTileY()-1).equals("g") | m.getMap(p.getTileX(), p.getTileY()-1).equals("b")) {
				p.move(0,-1);
				repaint(p.getTileX(), p.getTileY(), 0, 0);
			}
		}
		if (Board.Keys[1] == true) {
			if(m.getMap(p.getTileX(), p.getTileY()+1).equals("g") | m.getMap(p.getTileX(), p.getTileY()+1).equals("b")) {
				p.move(0,+1);
				repaint(p.getTileX(), p.getTileY(), 0, 0);
			}
		}
		if (Board.Keys [2]) {
			if(m.getMap(p.getTileX()-1, p.getTileY()).equals("g") | m.getMap(p.getTileX()-1, p.getTileY()).equals("b")) {
				p.move(-1, 0);
				repaint(p.getTileX(), p.getTileY(), 0, 0);
			}
		}
		if (Board.Keys[3]){
			if(m.getMap(p.getTileX()+1, p.getTileY()).equals("g") | m.getMap(p.getTileX()+1, p.getTileY()).equals("b")) {
				p.move(1, 0);
				repaint(p.getTileX(), p.getTileY(), 0, 0);
			}
			
		}
	}
/**
	public void  Rockfall() {
		for (int i = 0; i<Nbrock; i++) {
			if (m.getMap(rock[i].getTileX(),rock[Nbrock].getTileY()-1).equals("b")) {
				rock[i-1].tileY--;
				repaint();
			}
		}
	} */
	//public void actionPerformed(ActionEvent e) {
		//repaint();
	//}

}



