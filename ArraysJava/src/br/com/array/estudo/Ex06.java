package br.com.array.estudo;

public class Ex06 {
	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" vetor : " + vetor[i]);
		}

		System.out.println("=======vetor 2 for each========");

		int vetor2[] = { 1, 2, 3, 4, 5 };
		for (int value : vetor2) {
			System.out.println(" vetor : " + value);
		}

	}
}
