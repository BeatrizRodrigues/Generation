package Condicionais;

import java.util.Scanner;

/*Faça um programa que entre com três números e coloque em ordem crescente.*/

public class ExercicioDois {
	public static void main(String[] args) {
		float n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n2 <= n3){
			System.out.println("A ordem crescente: "+n1+" "+n2+" "+n3);
	    }else if (n1 <= n3 && n3 <= n2){
	    	System.out.println("A ordem crescente: "+n1+" "+n3+" "+n2);
	    }else if (n2 <= n1 && n1 <= n3){
	    	System.out.println("A ordem crescente: "+n2+" "+n1+" "+n3);
	    }else if (n2 <= n3 && n3 <= n1){
	    	System.out.println("A ordem crescente: "+n2+" "+n3+" "+n1);
	    }else if (n3 <= n1 && n1 <= n2){
	    	System.out.println("A ordem crescente: "+n3+" "+n1+" "+n2);
	    }else {/* n3 <= n2 && n2 < n1 */
	    	System.out.println("A ordem crescente: "+n3+" "+n2+" "+n1);
	    }
	}
}
