package Condicionais;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra*/

public class ExercicioTres {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("**********CATEGORIAS***********");
		System.out.println("10-14 anos - Categoria infantil");
		System.out.println("15-17 anos - Categoria juvenil");
		System.out.println("18-25 anos - Categoria adulto");
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		}else {
			System.out.println("Sinto muito mas não temos categorias para sua idade");
		}
	}

}
