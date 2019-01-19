package br.com.resolucao.exercicio;

public class ResolucaoExercicioUdemy {

	public static void main(String[] args) {
		int vetor[] = { 1, 3, 8, 4, 10 };
		boolean ordenado = true;
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < vetor[i - 1]) {
				ordenado = false;

			}
			if (ordenado) {
				System.out.println("ordenado");
			} else {
				System.out.println("false");
			}

		}
	}

}
