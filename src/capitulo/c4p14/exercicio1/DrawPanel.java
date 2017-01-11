package capitulo.c4p14.exercicio1;

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
		
		for (int i = 1; i < 16; i++) {
			g.drawLine(0, lastHeigth, lastWidth, height);
			
			lastHeigth += height/15;
			lastWidth += width/15;
		}
	}

}
