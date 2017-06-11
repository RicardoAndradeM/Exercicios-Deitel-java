package capitulo.c6p13;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawCarinha extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.YELLOW);
		
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.black);
		
		g.fillOval(50, 50,30, 30);
		g.fillOval(140, 50,30, 30);
	}
}
