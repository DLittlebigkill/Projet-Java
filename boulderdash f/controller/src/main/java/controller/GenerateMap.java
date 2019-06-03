package controller;
import contract.IModel;
import model.Player;
import view.Board;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class GenerateMap extends Board implements IModel{
	

	private static final long serialVersionUID = 3L;
	private Scanner n;
	public String Map[] = new String[15];
	private Image ground,
	wall,
	rock,
	diamond,
	black,
	exit;
	public Board b;
	/**
	 * this part load the image of the rock, diamond, ground etc ...
	 * @author Groupe 10
	 * @return GMap
	 */	
	public  Component GMap() {
		
		
		ImageIcon img = new ImageIcon("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//wall.png");
		wall = img.getImage();
		img = new ImageIcon("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//rock.png");
		rock = img.getImage();
		img = new ImageIcon("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//diamond.png");
		diamond = img.getImage();
		img = new ImageIcon("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//black.png");
		black = img.getImage();
		img = new ImageIcon("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//ground.png");
		ground = img.getImage();
		img = new ImageIcon("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//exit.png");
		exit = img.getImage();
		openFile();
		readFile();
		closeFile();
		return b;
	}
	/**
	 * @author Groupe10
	 * @return a Image of a ground case 
	 */
	public Image GetGround() {
		return ground;
	}
	/**
	 * @author Groupe10
	 * @return a Image of an exit case 
	 */
	public Image GetExit() {
		return exit;
	}
	/**
	 * @author Groupe10
	 * @return a Image of a wall case
	 */
	public Image GetWall() {
		return wall;
	}
	/**
	 * @author Groupe10
	 * @return a Image of a rock 
	 */
	public Image GetRock() {
		return rock;
	}
	/**
	 * @author Groupe10
	 * @return a Image of a diamond 
	 */
	public Image GetDiamond() {
		return diamond;
	}
	/**
	 * @author Groupe10
	 * @return a Image of a black void case
	 */
	public Image GetBlack() {
		return black;
	}
	/**
	 * @author Groupe10
	 * @return getMap
	 *@param x the coordinates of the case we want to print on the X axe
	 *@param y the coordinates of the case we want to print on the Y axe
	 */
	public String getMap(int x,int y) {
		String index = Map[y].substring(x,x+1);
		return index;
	}
	/**
	 * all is in the name
	 * @author Groupe 10
	 */
	public void openFile() {
		try {
			n = new Scanner(new File("C:/Users/PC_PORT/Downloads/Nouveau dossier/image//Map.txt"));
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	/**
	 * read the file and set the .txt file in a table
	 * @author Groupe10
	 */
	public void readFile() {
		while(n.hasNext()) {
			for(int i = 0; i < 15; i++) {
				Map[i] = n.next();
			}
		}
	}
	/**
	 * all in the name 
	 * @author Groupe10
	 * 
	 */
	public void closeFile() {
		n.close();

	}
	
	}
