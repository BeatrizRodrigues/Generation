package ModuloUm;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias
 *e mostre-a expressa em anos, meses e dias. */

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		int anos, meses, dias, idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		
		System.out.println(anos+" Anos "+meses+" Meses "+dias+"Dias");

	}
}
