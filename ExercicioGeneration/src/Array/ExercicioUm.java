package Array;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int A[], soma;
		A = new int[6];
		
		for (int i=0; i<6; i++) {
		      System.out.println("Informe um valor: ");
		      A[i] = ler.nextInt();
		}
		
		soma = A[0]+A[1]+A[5];
		
		A[4] = 100;
		
		for (int i=0; i<6; i++) {
		      System.out.println(A[i]);
		}
		
		System.out.println("Soma: "+soma);

	}

}
