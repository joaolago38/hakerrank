package br.com.resolucao.exercicio;

import java.util.Arrays;

public class ResolucaoExercicioUdemy5 {

	public static void main(String[] args) {
		int valor = 6;
		int vetor[] = { 1, 3, 8, 4, 10 };
		int qtd = vetor.length;
		int vetorNovo[] = new int[qtd + 1];
		System.arraycopy(vetor, 0, vetorNovo, 0, qtd);
		while (qtd > 0 && vetorNovo[qtd - 1] > valor) {

		}
		Arrays.sort(vetorNovo);

	}

}
