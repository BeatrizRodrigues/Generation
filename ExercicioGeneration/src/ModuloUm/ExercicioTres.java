package ModuloUm;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em
 *segundos e mostre-o expresso em horas, minutos e segundos.*/

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		int horas, minutos, segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o tempo de dura��o em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println(horas+" Horas, "+minutos+" minutos e "+segundos+" segundos.");
	}

}
