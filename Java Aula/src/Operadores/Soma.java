package Operadores;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		int num1, num2;

		num1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro número: ")); // INTEGER.VALUEOF RECEBE UM
																							// TEXTO E DEVOLVE UM
																							// INTEIRO
		num2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo número: "));

		int soma = num1 + num2;
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);

	}

}
