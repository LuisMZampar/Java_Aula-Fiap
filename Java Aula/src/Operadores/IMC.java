package Operadores;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		double peso;
		double altura;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um peso: ");
		peso = entrada.nextDouble();

		System.out.println("Digite um altura: ");
		altura = entrada.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		System.out.println("A média é: " + imc);
		
		entrada.close();

	}

}
