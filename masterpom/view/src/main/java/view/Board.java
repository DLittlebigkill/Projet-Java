package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JPanel;
import javax.swing.Timer;

import contract.Direction;


public class Board extends JPanel implements ActionListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private Timer timer;
	protected static boolean[] Keys = new boolean[4];

	public Board() {
		timer = new Timer(25, this);  
		timer.start();
		setFocusable(true);
		this.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	/**

	protected static Direction keyCodeToDirection(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_KP_DOWN:
				return Direction.Down;
			case KeyEvent.VK_KP_UP:
				return Direction.Up;
			case KeyEvent.VK_KP_LEFT:
				return Direction.Left;
			case KeyEvent.VK_KP_RIGHT:
				return Direction.Right;
			default:
			
			return Direction.Here;
		}
		}
*/
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	 public void keyPressed(KeyEvent arg0) {
        if(arg0.getKeyCode() == KeyEvent.VK_Z)
            Keys[0] = true;
        if(arg0.getKeyCode() == KeyEvent.VK_S)
            Keys[1] = true;
        if(arg0.getKeyCode() == KeyEvent.VK_Q)
            Keys[2] = true;
        if(arg0.getKeyCode() == KeyEvent.VK_D)
            Keys[3] = true;
    }
	
 
    public void keyReleased(KeyEvent arg0) {
        if(arg0.getKeyCode() == KeyEvent.VK_Z)
            Keys[0] = false;
        if(arg0.getKeyCode() == KeyEvent.VK_S)
            Keys[1] = false;
        if(arg0.getKeyCode() == KeyEvent.VK_Q)
            Keys[2] = false;
        if(arg0.getKeyCode() == KeyEvent.VK_D)
            Keys[3] = false;
    }
		
	}
	
