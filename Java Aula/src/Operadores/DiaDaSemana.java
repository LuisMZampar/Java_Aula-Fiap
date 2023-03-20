package Operadores;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero do dia: ");
		int dia = entrada.nextInt();

//		if (dia == 1) System.out.println("Domingo");
//		if (dia == 2) System.out.println("Segunda");
//		if (dia == 3) System.out.println("Terça");
//		if (dia == 4) System.out.println("Quarta");
//		if (dia == 5) System.out.println("Quinta");
//		if (dia == 6) System.out.println("Sexta");
//		if (dia == 7) System.out.println("Sábado");

//------------------------------------------------------------

//		switch (dia) {
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Segunda");
//			break;
//
//		default:
//			System.out.println("Dia inválido");
//			break;
//		}
		
//------------------------------------------------------------
		
		String [] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
		System.out.println(dias [dia]);

		entrada.close();
	}
	

}
