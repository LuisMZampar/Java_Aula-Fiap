import java.util.Locale;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

		int quantidadeDeFilhos;
		double altura;
		String nome;

		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine();

		System.out.print("Quantos Filhos você tem: ");
		quantidadeDeFilhos = entrada.nextInt();

		System.out.print("Digite sua altura: ");
		altura = entrada.nextDouble();

		System.out.println(
				"Prazer " + nome + " você tem " + quantidadeDeFilhos + " filhos, " + altura + " metros de altura");

		entrada.close();

	}

}