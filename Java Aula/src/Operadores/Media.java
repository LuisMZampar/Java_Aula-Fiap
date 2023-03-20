package Operadores;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		double num1;
		double num2;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = entrada.nextDouble();

		System.out.println("Digite um numero: ");
		num2 = entrada.nextDouble();

		double media = (num1 + num2) / 2;

		System.out.println("A média é: " + media);
		
		entrada.close();

	}

}
