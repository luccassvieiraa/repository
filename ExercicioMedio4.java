package Treinamentos;

import java.util.Scanner;

public class ExercicioMedio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] vet = new String[15];
		//String[] vetB = new String[15];
		
		String palavra;
		String palavraa = "";
		
		System.out.println("Digite: ");
		palavra = leia.next();
		System.out.println(palavra.length());
		if(palavra.length() % 2  == 0) {
		String[] vetB = palavra.split(2) : palavra;
		System.out.println(vetB[0]);
		
		System.out.println(vetB[1]);
		
			
		}
		
			
		
		
		

	}

}
