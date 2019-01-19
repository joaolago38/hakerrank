package br.com.resolucao.exercicio;

import java.util.Arrays;

public class ResolucaoExercicioUdemy2 {

	public static void main(String[] args) {
		boolean duplicado = false;
		int vetor[] = { 1, 3, 3, 8, 4, 10 };
		for (int i = 1; i < vetor.length; i++) {
			Arrays.sort(vetor);
			if (vetor[i] == vetor[i - 1]) {
				duplicado = true;
			}
		}
		if (duplicado) {
			System.out.println("vetor  duplicado");
		} else {
			System.out.println("vetor nao duplicado");
		}

	}

}
