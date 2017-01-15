package capitulo.c5p10.exercicio0;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Shapes extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0){
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);				
			} else {
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
			}
		}
	}
}
