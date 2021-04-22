package Treinamentos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int number;

		System.out.print("Digite um numero par: ");
		number = leia.nextInt();
		if (number % 2 == 0) {
			System.out.println("");
		} else {
			System.out.print("Erro! - Numero impar inserido, favor inserir numero par.");
		}
// PARTE A
			out: for (int i = 3; i <= number; i++) {
				for (int k = 2; k < i; k++) {
					if (i % k == 0)
						continue out;
				}
				int realA = i;
// PARTE B 			
				outi: for (int w = 3; w <= number; w++) {
					for (int k = 2; k < w; k++) {
						if (w % k == 0)
							continue outi;
					}
					int realB = w;

					int real = realA + realB;
					if (real == number) {

						System.out.println(realA + " + " + realB + " = " + number);
					}
				}
			}
		}
	}

