package capitulo.c4p14.exercicio4;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		int width = super.getWidth();
		int height = super.getHeight();
		
		int widthPass = width/15;
		int heightPass = height/15;
		
		for (int i = 0; i < 15; i++) {
			g.drawLine(0, 0, width - widthPass*i, heightPass*i);
			g.drawLine(width, 0, widthPass*i, heightPass*i);
			g.drawLine(width, height, width - widthPass*i, heightPass*i);
			g.drawLine(0, height, widthPass*i, heightPass*i);
		}
	}
}
