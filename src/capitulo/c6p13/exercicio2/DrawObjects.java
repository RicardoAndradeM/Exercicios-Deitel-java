package capitulo.c6p13.exercicio2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawObjects extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Random gerator = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(gerator.nextBoolean()){
				g.setColor(new Color(gerator.nextInt(226), gerator.nextInt(226), gerator.nextInt(226)));
				g.fillOval(gerator.nextInt(getWidth()), gerator.nextInt(getHeight()), gerator.nextInt(getWidth()/2), gerator.nextInt(getHeight()/2));
			} else {
				g.setColor(new Color(gerator.nextInt(226), gerator.nextInt(226), gerator.nextInt(226)));
				g.fillRect(gerator.nextInt(getWidth()), gerator.nextInt(getHeight()), gerator.nextInt(getWidth()/2), gerator.nextInt(getHeight()/2));
			}
		}
	}
}
