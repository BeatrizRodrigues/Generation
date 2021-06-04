package Repeticao;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

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
	
		System.out.println("Números pares = "+par);
		System.out.println("Números impares = "+impar);
	
	}	
}
