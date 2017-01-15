package capitulo.c5p10;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	public static void main(String[] args) {
		int choise = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se quiser que a tela desenhe quadrados,\n"
																+ "digite 2 sequiser que a tela desenhe circulos."));
		Shapes panel = new Shapes(choise);
		
		JFrame application = new JFrame("Desenho");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}
