package capitulo.c6p13.exercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawAlvoTest {
	public static void main(String[] args) {
		JFrame application = new JFrame("Alvo");
		DrawAlvo panel = new DrawAlvo();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(220, 250);
		
		application.add(panel);
		
		application.setVisible(true);
	}
}
