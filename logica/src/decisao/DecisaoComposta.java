package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
	
	public static void main(String[] args) {
	
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		float media = (nota1+nota2)/2;
		
		if(media >= 6) {
			System.out.println("Parab?ns sua m?dia em: " + disciplina + " foi: " + media + " \nVoc? foi aprovado!" );
		} else if (media < 4) {
			System.out.println("Voc? tem que se esfor?ar mais! \nVoc? foi reprovado! \nSua m?dia em: " + disciplina + " foi: " + media);
		} else {			
			System.out.println("Voc? ainda tem uma chance, \nV? estudar!!!");
		}
		
		
		
		
}
} 
// && = and
// || = or