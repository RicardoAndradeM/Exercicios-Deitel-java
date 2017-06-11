package capitulo.c6p13.exercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawObjectsTest {
	public static void main(String[] args) {
		JFrame application = new JFrame("fomas");
		DrawObjects panel = new DrawObjects();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(500, 500);
		
		application.add(panel);
		
		application.setVisible(true);
	}
}
