package Boulder;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Diamond {
	public int tileX, tileY;

	public Image diamond;

	public Diamond(){

		ImageIcon img = new ImageIcon("C://test/tutorials//diamond.png");
		diamond = img.getImage();


		tileX = 4;
		tileY = 2;
	}
	public Image getDiamond() {
		return diamond;
	}


	public int getTileX() {
		return tileX;
	}
	public int getTileY() {
		return tileY;
	}

	public void move(int dx, int dy) {



		tileX += dx;
		tileY += dy;
	}
	boolean visible = true;
	public void SetVisible(boolean visible) {
		this.visible = visible;
	}
	
	public boolean isVisible(){
		return this.visible;
	}
	//bon du coup faut trouver un moyen de changer le boolean en false des que l'on est sur la meme case
}
