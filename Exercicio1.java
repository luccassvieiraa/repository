package Treinamentos;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numA;
		int numB;
		int numC;
		int numD;
		int[] vetor = new int[4];

		System.out.print("Digite um valor para A: ");
		numA = leia.nextInt();
		vetor[0] = numA;
		System.out.print("Digite um valor para B: ");
		numB = leia.nextInt();
		vetor[1] = numB;
		System.out.print("Digite um valor para C: ");
		numC = leia.nextInt();
		vetor[2] = numC;
		System.out.print("Digite um valor para D: ");
		numD = leia.nextInt();
		vetor[3] = numD;
		int resultadoSoma = 0;
		int resultadoImpar = 0;
		int resultadoPar = 0;

		for (int i = 0; i < vetor.length; i++) {
			int result;
			result = vetor[i] % 2;

			if (vetor[i] <= 9) {
				resultadoSoma += vetor[i];
			}

			if (result == 0) {
				resultadoPar += vetor[i];
			}
			if (result != 0) {
				resultadoImpar += vetor[i];
			}

		}

		System.out.println("Soma decimal: " + resultadoSoma);

		int hexaTotal = resultadoPar / 16;
		int hexaResto = resultadoPar % 16;
		if (resultadoPar <= 15) {
			System.out.println("numero em hexadecimal: " + hexaResto);
		} else {
			System.out.println("numero em hexadecimal: " + hexaTotal + hexaResto);
		}

		int octaTotal = resultadoImpar / 8;
		int octaResto = resultadoImpar % 8;
		if (resultadoImpar <= 7) {
			System.out.println("numero em octal: " + octaResto);
		} else {
			System.out.println("numero em octal: " + octaTotal + octaResto);
		}

	}

}
