package Condicionais;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class ExercicioQuatro {

	public static void main(String[] args) {
		float n1, n2, quadrada1,quadrada2, potencia1, potencia2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Estre com primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("Estre com segundo valor: ");
		n2 = leia.nextFloat();
		
		if(n1%2==0 && n2%2==0){
			quadrada1 = (float) Math.sqrt(n1);
			quadrada2 = (float) Math.sqrt(n2);
			System.out.println(n1+" - "+"Raiz quadrada: "+quadrada1);
			System.out.println(n2+" - "+"Raiz quadrada: "+quadrada2);
		}else if(n1%2!=0 && n2%2!=0) {
			potencia1 = (float) Math.pow(2, n1);
			potencia2 = (float) Math.pow(2, n2);
			System.out.println(n1+" - "+"Potencia: "+potencia1);
			System.out.println(n2+" - "+"Potencia: "+potencia2);
		}else if(n1%2==0 && n2%2!=0) {
			quadrada1 = (float) Math.sqrt(n1);
			potencia2 = (float) Math.pow(2, n2);
			System.out.println(n1+" - "+"Raiz quadrada: "+quadrada1);
			System.out.println(n2+" - "+"Potencia: "+potencia2);
		}else {
			potencia1 = (float) Math.pow(2, n1);
			quadrada2 = (float) Math.sqrt(n2);
			System.out.println(n1+" - "+"Potencia: "+potencia1);
			System.out.println(n2+" - "+"Raiz quadrada: "+quadrada2);
		}

	}

}
