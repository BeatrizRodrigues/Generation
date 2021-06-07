package Array;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[],vetorPar[],vetorImpar[], somaPares=0, impar=0;
		vetor = new int[6];
		vetorPar = new int[6];
		vetorImpar = new int[6];
		
		for (int i=0; i<6; i++) {
		      System.out.println("Informe um valor: ");
		      vetor[i] = ler.nextInt();
		      if(vetor[i]%2==0) {
		    	  somaPares+=vetor[i];
		    	  vetorPar[i] = vetor[i];
		      }else {
		    	  impar++;
		    	  vetorImpar[i] = vetor[i];
		      }
		}
		
		for (int i=0; i<6; i++) {
		      System.out.println(vetor[i]);
		}
		System.out.println("Números pares");
		for (int i=0; i<6; i++) {
			if(vetorPar[i]!=0) {
				System.out.println(vetorPar[i]);
			}		      
		}
		System.out.println("Números impares");
		for (int i=0; i<6; i++) {
			if(vetorImpar[i]!=0) {
				System.out.println(vetorImpar[i]);
			}		      
		}
		System.out.println("Soma dos números pares: "+somaPares);		
		System.out.println("Quantidade de números impares: "+impar);

	}

}
