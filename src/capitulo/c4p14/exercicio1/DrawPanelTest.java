package capitulo.c4p14.exercicio1;

import javax.swing.JFrame;

public class DrawPanelTest {
	public static void main(String[] args) {
		DrawPanel panel =  new DrawPanel();
		
		JFrame application =  new JFrame("Desenho");
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}
}