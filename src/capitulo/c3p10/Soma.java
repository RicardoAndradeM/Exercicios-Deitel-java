package capitulo.c3p10;

import javax.swing.JOptionPane;

public class Soma {
	public static void main(String[] args) {
		String nun1 =
				JOptionPane.showInputDialog("Digite o Primeiro a ser somado:");
		String nun2 =
				JOptionPane.showInputDialog("Digite o Primeiro a ser somado:");
		
		int soma = Integer.parseInt(nun1) + Integer.parseInt(nun2);
		
		JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma);
	}
}
