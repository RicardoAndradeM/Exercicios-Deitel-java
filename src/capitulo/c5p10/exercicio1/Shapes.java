package capitulo.c5p10.exercicio1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Shapes extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		for (int i = 1; i <= 12; i++) {
			g.drawOval(150 - (20 * i)/ 2, 150 - (20 * i)/ 2, 20 * i, 20 * i);
		}
	}
}
