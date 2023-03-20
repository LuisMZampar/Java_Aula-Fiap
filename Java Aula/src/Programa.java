import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

		String nome = null, email = null, idade = null;

		JOptionPane.showMessageDialog(null, "Olá");

		nome = JOptionPane.showInputDialog(nome, "Digite seu nome: ");

		email = JOptionPane.showInputDialog(email, "Digite seu email: ");

		idade = JOptionPane.showInputDialog(idade, "Digite sua idade: ");

		JOptionPane.showMessageDialog(null,
				"Prazer " + nome + ", seu email é: " + email + " e você tem: " + idade + " anos!");

	}

}
