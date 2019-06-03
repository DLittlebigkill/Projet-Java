package controller;
import contract.IModel;
import model.Player;
import view.Board;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Map implements IModel{
	private Scanner n;
	private String Map[] = new String[15];
	private Image ground,
	wall,
	rock,
	diamond,
	black;
	private Timer timer;
	private Map m;
	public Player p;
	public Board b;
	
	
	public Map() {
		
		m = new Map();
		p = new Player();
		ImageIcon img = new ImageIcon("C:/Users/PC_PORT/Downloads/Test/Sprites//wall.png");
		wall = img.getImage();
		img = new ImageIcon("C:/Users/PC_PORT/Downloads/Test/Sprites//rock.png");
		rock = img.getImage();
		img = new ImageIcon("C:/Users//PC_PORT/Downloads/Test/Sprites//diamond.png");
		diamond = img.getImage();
		img = new ImageIcon("C:/Users//PC_PORT/Downloads/Test/Sprites//black.png");
		black = img.getImage();
		img = new ImageIcon("C:/Users//PC_PORT/Downloads/Test/Sprites//ground.png");
		ground = img.getImage();
		openFile();
		readFile();
		closeFile();
	}
	public Image GetGround() {
		return ground;
	}
	public Image GetWall() {
		return wall;
	}
	public Image GetRock() {
		return rock;
	}
	public Image GetDiamond() {
		return diamond;
	}
	public Image GetBlack() {
		return black;
	}
	public String getMap(int x,int y) {
		String index = Map[y].substring(x,x+1);
		return index;
	}
	public void openFile() {
		try {
			n = new Scanner(new File("C://Users//PC_PORT//Downloads//Test//Sprites//Map.txt"));
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public void readFile() {
		while(n.hasNext()) {
			for(int i = 0; i < 15; i++) {
				Map[i] = n.next();
			}
		}
	}
	public void closeFile() {
		n.close();

	}
	public void paint(Graphics g) {
		

		for(int y=0;y<15;y++) {
			for(int x=0;x<15;x++) {

				if(m.getMap(x, y).equals("w")) {
					g.drawImage(m.GetWall(), x*16, y*16, null);
				}

				if(m.getMap(x, y).equals("b")) {  
					g.drawImage(m.GetBlack(), x*16, y*16, null);
				}
				if(m.getMap(x, y).equals("g")) {  
					g.drawImage(m.GetGround(), x*16, y*16, null);
				}
			}
		}
	}
}