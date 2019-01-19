package br.com.resolucao.exercicio;

public class ResolucaoExercicioUdemy4 {

	public static void main(String[] args) {
		int vetor[] = { 1, 3, 8, 4, 10 };
		int maior = -1000;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println(maior);

	}

}
