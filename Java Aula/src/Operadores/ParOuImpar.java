package Operadores;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {

		boolean ehPar;
		int numero;
		int resposta = 0;

		while (resposta == 0) {
			numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero: "));
			ehPar = numero % 2 == 0;
			JOptionPane.showMessageDialog(null, ehPar ? "É par" : "É impar");
			resposta = JOptionPane.showConfirmDialog(null, "Quer digitar outro número? ");
			System.out.println(resposta);

		}
	}
}

