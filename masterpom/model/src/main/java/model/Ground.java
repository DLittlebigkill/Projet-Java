package model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Ground{

	public int tileX, tileY;
		
	private Image imgGround;
	private ImageIcon icoGround;
	

	public Ground(){
		
		this.icoGround = new ImageIcon("C:/Users/PC_PORT/Downloads/Test/Sprites//ground.png");
		this.imgGround =this.icoGround.getImage();
		
	}
	

	public Image getImgGround() {
		return imgGround;
	}
	
	
}
