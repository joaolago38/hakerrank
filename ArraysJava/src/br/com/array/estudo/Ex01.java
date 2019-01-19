package br.com.array.estudo;

public class Ex01 {

	public static void main(String[] args) {
		int[] idade; // declaracao de array
		idade = new int[4]; // instaciando o array
		// inicializar o array;
		idade[0] = 25;
		idade[1] = 30;
		idade[2] = 10;
		idade[3] = 3;
		// consultando os arrays
		for (int i = 0; i < 4; i++) {
			System.out.println("idade  [ " + i + " ]= " + idade[i]);

		}
		
		System.out.println("===========================================");
		
		String nome[] = new String[4];
		nome[0] = "joao";
		nome[1] = "maria";
		nome[2] = "jose";
		nome[3] = "aline";

		for (int i = 0; i < 4; i++) {
			System.out.println("nome  [ " + i + " ]= " + nome[i]);
		}
		System.out.println("===========================================");
		
		char letras[] = { 'A', 'B', 'K', 'H', 'I', 'i' };

		for (int i = 0; i < letras.length; i++) {
			System.out.println("letras  [ " + i + " ]= " + letras[i]);
		}

	}

}
