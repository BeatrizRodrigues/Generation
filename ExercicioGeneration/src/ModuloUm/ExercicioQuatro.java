package ModuloUm;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		float d, r, s, a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextFloat();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextFloat();
		
		r = (float) Math.pow(2, a+b);
		s = (float) Math.pow(2, b+c);
		
		d = (r+s)/2;
		
		System.out.println(d);
		
	}
}
