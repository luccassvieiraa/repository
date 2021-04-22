package Treinamentos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero limite: ");
		num = leia.nextInt();
		int total = 0;

		for (int i = 0, a = 1, b = 0; i < num; i++) {
			b = b + a;
			a = b - a;

			System.out.println(a);
		}
	}
}
