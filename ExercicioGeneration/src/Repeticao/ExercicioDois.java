package Repeticao;

/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n;
		int par=0, impar=0;
	
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com o valor: ");
			n = ler.nextFloat();
		
			if(n%2==0) {
				par++;
			}else {
				impar++;
			}
		}
	
		System.out.println("N�meros pares = "+par);
		System.out.println("N�meros impares = "+impar);
	
	}	
}
