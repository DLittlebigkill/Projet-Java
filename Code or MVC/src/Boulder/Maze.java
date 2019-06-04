package Boulder;

import javax.swing.JFrame;

public class Maze {

	public static void main(String[] args) {
		new Maze();

	}

		public Maze() {
			JFrame f = new JFrame();
			f.setTitle("Boulder dash");
			f.add(new Board());
			f.setSize(490, 512);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
}
