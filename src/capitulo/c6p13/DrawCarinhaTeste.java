package capitulo.c6p13;

import javax.swing.JFrame;

public class DrawCarinhaTeste {
	public static void main(String[] args) {
		JFrame application = new JFrame("Carinha");
		DrawCarinha panel = new DrawCarinha();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(250, 250);
		
		application.add(panel);
		
		application.setVisible(true);
	}
}
