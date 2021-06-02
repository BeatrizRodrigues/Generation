package ModuloUm;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *meses e dias e mostre-a expressa apenas em dias. */

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		int anos, meses, dias, idade;

		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com ano: ");
		anos = leia.nextInt();
		System.out.println("\nEntre com meses: ");
		meses = leia.nextInt();
		System.out.println("Entre com dia: ");
		dias = leia.nextInt();
		
		idade = (anos*365) + (meses*30)+dias;
		
		System.out.println("Idade em dias: "+idade);

	}
}
