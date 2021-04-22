package Treinamentos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double[] vetor = new double[4];
		int num =0 ;
		double result;
		double valorVetor = 0 ;
		
		System.out.println("Digite os numeros: ");
		
		for (int i = 0; i < vetor.length; i++) {
			num = leia.nextInt();
			vetor[i] = num;
			
			if (vetor[i] < 1000) {
				valorVetor += vetor[i];
			} else {
				System.out.println("Valor informado excede o valor suportado que e 1000");
			}
			
		}
		result = valorVetor / vetor.length;
		System.out.println("Resultado media aritmetica : " + result);
		
		

	}

}
