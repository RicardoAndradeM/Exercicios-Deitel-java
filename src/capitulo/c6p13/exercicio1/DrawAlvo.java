package capitulo.c6p13.exercicio1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawAlvo extends JPanel{
	Random gerator = new Random();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Color fistColor = new Color(gerator.nextInt(256), gerator.nextInt(256), gerator.nextInt(256));
		Color secondColor = new Color(gerator.nextInt(256), gerator.nextInt(256), gerator.nextInt(256));
		
		g.setColor(fistColor);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(secondColor);
		g.fillOval(30, 30, 160, 160);
		
		g.setColor(fistColor);
		g.fillOval(50, 50, 120, 120);

		g.setColor(secondColor);
		g.fillOval(70, 70, 80, 80);
		
		g.setColor(fistColor);
		g.fillOval(90, 90, 40, 40);
	}
}
