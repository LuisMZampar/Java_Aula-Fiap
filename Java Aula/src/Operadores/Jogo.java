package Operadores;

public class Jogo {

	public static void main(String[] args) {
		int vidas = 3;
		int level = 15;
		boolean temEspada = false;
		boolean temMagia = true;
		boolean levelAlto = level > 10;
		boolean acabouOJogo = vidas <= 0;

		boolean podeAtacar = levelAlto && (temEspada || temMagia) && !acabouOJogo;

		System.out.println("Pode atacar = " + podeAtacar);

	}

}
