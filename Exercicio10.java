package Treinamentos;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		int[] vetor = new int[20];
		int total = 0;
		int multi = 0;

		System.out.println("Digite um numero inteiro:");

		for (int i = 1; i < vetor.length; i++) {

			numero = leia.nextInt();
			vetor[i] = numero;

			for (int j = 2; j < 50; j++) {
				multi = j * j;

				if (multi == vetor[i] && vetor[i] != 0) {

					int a = 1;
					total = total + a;

				}
				if (vetor[i] == 0) {

					System.out.println("Total de quadrado perfeito: " + total);
					break;

				}

			}
		}
	}
}