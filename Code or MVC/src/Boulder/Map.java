package Boulder;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;

public class Map {
	private Scanner m;
	private String Map[] = new String[15];
	private Image ground,
				  wall,
				  rock,
				  diamond,
				  black,
				  exit,
				  rectangle;
	public Map() {
		
		ImageIcon img = new ImageIcon("C://test/tutorials//wall.png");
		wall = img.getImage();
		img = new ImageIcon("C://test/tutorials//rock.png");
		rock = img.getImage();
		img = new ImageIcon("C://test/tutorials//diamond.png");
		diamond = img.getImage();
		img = new ImageIcon("C://test/tutorials//black.png");
		black = img.getImage();
		img = new ImageIcon("C://test/tutorials//ground.png");
		ground = img.getImage();
		img = new ImageIcon("C://test/tutorials//exit.png");
		exit = img.getImage();
		img = new ImageIcon("C://test/tutorials//rectangle.png");
		rectangle = img.getImage();
		
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
	public Image GetExit() {
		return exit;
	}
	public Image GetRectangle() {
		return rectangle;
	}
	
	public String getMap(int x,int y) {
		String index = Map[y].substring(x,x+1);
		return index;
	}
	public void openFile() {
		try {
		m = new Scanner(new File("C://test/tutorials//Map.txt"));
	}catch(Exception e) {
		System.out.println("error");
		}
	}
	public void readFile() {
		while(m.hasNext()) {
			for(int i = 0; i < 15; i++) {
				Map[i] = m.next();
			}
		}
	}
	public void closeFile() {
	m.close();
}
	
}
