package capitulo.c5p10.exercicio1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	public static void main(String[] args) {
		Shapes panel = new Shapes();
		
		JFrame application = new JFrame("Desenho");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}
