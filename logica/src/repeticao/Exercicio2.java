package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String func= "";
		//float cont=0;
		float salario=0;
		float somaSalario=0;
		float qtdePessoas=0;
		float maior=0;
		
		do {
			//cont = salario;
			String cargo = JOptionPane.showInputDialog("Qual o cargo: ").toUpperCase();
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salario: "));
			somaSalario = (salario+somaSalario);
			qtdePessoas++;
			System.out.println(cargo + "=" + salario);
			//System.out.println(salario);
			if (salario > maior) {
				maior = salario;
				func = cargo;
			}
		} while(JOptionPane.showConfirmDialog(
				null, "Deseja adicionar algo?", "Funcionarios", JOptionPane.YES_NO_CANCEL_OPTION)==0);
				System.out.println("Soma dos sal?rios: " + somaSalario);
				System.out.println("M?dia: " + (somaSalario / qtdePessoas));
				System.out.println("Maior sal?rio ?: " + maior + " do: " + func);				
	}
}
