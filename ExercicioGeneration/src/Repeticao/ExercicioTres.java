package Repeticao;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n=0, idade=0, total21=0, total50=0;
		
		while(idade!=-99) {
			System.out.println("Entre com a idade ");
			idade = ler.nextInt();
			
			n++;
			
			if(idade < 21 && idade > 0) {
				total21++;
			}
			if(idade > 50) {
				total50++;
			}
		}
		System.out.println("Quantidade de idades inseridas - "+(n-1));
		System.out.println("Quantidade de idades menores de 21 anos - "+total21);
		System.out.println("Quantidade de idades maiores de 50 anos - "+total50);
		
	}
}
