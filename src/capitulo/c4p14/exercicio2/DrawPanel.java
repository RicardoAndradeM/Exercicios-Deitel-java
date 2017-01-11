package capitulo.c4p14.exercicio2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		int width = super.getWidth();
		int height = super.getHeight();
		
		int lastWidth = 0;
		int lastHeigth = 0;
		
		for (int i = 0; i < 15; i++) {
			g.drawLine(0, lastHeigth, lastWidth, height);
			g.drawLine(lastWidth, 0, width, lastHeigth);
			g.drawLine(width, lastHeigth, width - lastWidth, height);
			g.drawLine(width - lastWidth, 0, 0, lastHeigth);
			
			lastHeigth += height/15;
			lastWidth += width/15;
		}
	}
}
