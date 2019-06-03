package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rock{

	public int tileX, tileY;
	private Image imgRock;
	private ImageIcon icoRock;
	

	public Rock() {
		
		this.icoRock = new ImageIcon("C://test//tutorials//rock.png");
		this.imgRock =this.icoRock.getImage();
		
	}
	
	public Image getImgRock() {
		return imgRock;
	}


	public int getTileX() {
		return tileX;
	}
	public int getTileY() {
		return tileY;
	}


}
