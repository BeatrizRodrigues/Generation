package Repeticao;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n, soma=0;
		
		do {
			System.out.println("Entre com um valor: ");
			n = ler.nextFloat();
			soma += n;
			
		}while(n!=0);
		
		System.out.println("Soma dos valores = "+soma);
	}

}
