package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {
		
	public static void main(String[] args) {
		
		int x = 0;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor tabuada: "));
		do {
			x++;
			System.out.println("Tabuada do: " + valor + " x " + x + " = " + valor * x);
		} while (x < 100);
		
	}

}
