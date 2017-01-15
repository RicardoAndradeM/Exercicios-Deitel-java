package capitulo.c5p10;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Shapes extends JPanel{
	private int choise;
	
	public Shapes(int userChoise) {
		this.choise = userChoise;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		for (int i = 1; i <= 10; i++) {
			switch (choise) {
			case 1:
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
				
			case 2:
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			}			
		}
	}
}
