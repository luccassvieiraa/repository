package Treinamentos;

import java.util.Scanner;

public class ExercicioMedio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		int seq;

		// Parte 1
		System.out.print("Digite o numero de sequencias desejadas:");
		seq = leia.nextInt();
		int[] vetA = new int[seq];
		System.out.println("Digite 5 numeros inteiros (Part 1):");

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = leia.nextInt();
		}

		for (int i = 0; i < vetA.length; i++) {
			for (int j = 0; j < vetA.length - 1; j++) {
				if (vetA[j] > vetA[j + 1]) {
					numero = vetA[j];
					vetA[j] = vetA[j + 1];
					vetA[j + 1] = numero;
				}
			}
		}

		// Parte 2
		System.out.print("Digite o numero de sequencias desejadas: ");
		seq = leia.nextInt();
		int[] vetB = new int[seq];
		System.out.println("Digite 5 numeros inteiros (Part 2):");
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = leia.nextInt();
		}

		for (int i = 0; i < vetB.length; i++) {
			for (int j = 0; j < vetB.length - 1; j++) {
				if (vetB[j] < vetB[j + 1]) {
					numero = vetB[j];
					vetB[j] = vetB[j + 1];
					vetB[j + 1] = numero;
				}
			}
		}

		// Parte 3
		System.out.print("Digite o numero de sequencias desejadas: ");
		seq = leia.nextInt();
		int[] vetC = new int[seq];
		System.out.println("Digite 5 numeros inteiros (Part 3):");
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = leia.nextInt();
		}

		for (int i = 0; i < vetC.length; i++) {
			for (int j = 0; j < vetC.length - 1; j++) {
				if (vetC[j] > vetC[j + 1]) {
					numero = vetC[j];
					vetC[j] = vetC[j + 1];
					vetC[j + 1] = numero;
				}
			}
		}

		// Parte 4
		System.out.print("Digite o numero de sequencias desejadas: ");
		seq = leia.nextInt();
		int[] vetD = new int[seq];
		System.out.println("Digite 5 numeros inteiros (Part 4):");
		for (int i = 0; i < vetD.length; i++) {
			vetD[i] = leia.nextInt();
		}

		for (int i = 0; i < vetD.length; i++) {
			for (int j = 0; j < vetA.length - 1; j++) {
				if (vetD[j] < vetD[j + 1]) {
					numero = vetD[j];
					vetD[j] = vetD[j + 1];
					vetD[j + 1] = numero;
				}
			}
		}

		System.out.println(" ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i] + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < vetC.length; i++) {
			System.out.print(vetC[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < vetD.length; i++) {
			System.out.print(vetD[i] + " ");
		}

	}

}
