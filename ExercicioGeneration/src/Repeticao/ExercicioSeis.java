package Repeticao;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).*/

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, cont=0, soma=0, media;
		
		do {
			System.out.println("Entre com o valor: ");
			num = ler.nextInt();
			
			if(num%3==0 && num!=0) {
				soma += num;
				cont++;
			}
		}while(num!=0);
		media = soma/cont;
		
		System.out.println("Média dos números múltiplos de 3: "+media);
	}

}
