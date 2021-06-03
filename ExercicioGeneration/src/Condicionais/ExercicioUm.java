package Condicionais;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class ExercicioUm {

	public static void main(String[] args) {
		int n1, n2, n3, maiorValor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		n3 = leia.nextInt();
		
		maiorValor = n1;
		
		if(maiorValor < n2) {
			maiorValor = n2;
		}
		if(maiorValor < n3) {
			maiorValor = n3;
		}
		
		System.out.println("Maior valor: "+maiorValor);
		
	}

}
