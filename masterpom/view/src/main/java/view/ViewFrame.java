package view;

import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
public final class ViewFrame extends JFrame implements Observer  {
	static JFrame frame = new JFrame();
	private static final long serialVersionUID = 1L;

	public void viewframe(Component generatemap) {
		//Instantiate new frame
		
		// Give a name to frame
		frame.setTitle("Boulderdash");
		//Set the size
		frame.setSize(400, 800);
		frame.setLocationRelativeTo(null);
		//Exit when clicking on the red cross
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Make frame visible
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(generatemap);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		
	}

}
