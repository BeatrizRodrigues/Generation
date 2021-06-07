package Array;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float soma[][] = new float[2][2];
		float subtracao[][] = new float[2][2];
		int c, l, n;
		float cont;
		
		System.out.println("matriz 1: ");
		for(c = 0; c < 2; c++) {
			for(l = 0; l < 2; l++) {
				matriz1[l][c] = ler.nextInt();
			}
		}
		
		System.out.println("matriz 2: ");
		for(c = 0; c < 2; c++) {
			for(l = 0; l < 2; l++) {
				matriz2[l][c] = ler.nextInt();
			}
		}
		
		do {
			System.out.println("1 - somar as duas matrizes");
			System.out.println("2 - subtrair a primeira matriz da segunda");
			System.out.println("3 - adicionar uma constante as duas matrizes");
			System.out.println("4 - imprimir as matrizes");
			n = ler.nextInt();
			
			switch(n) {
			case 1:
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						soma[l][c] = matriz1[l][c] + matriz2[l][c];
					}
				}				
				break;
				
			case 2:
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						subtracao[l][c] = matriz1[l][c] - matriz2[l][c];
					}
				}
				break;
				
			case 3:
				System.out.println("Entre com a constante: ");
				cont = ler.nextFloat();
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						matriz1[l][c] += cont;
						matriz2[l][c] += cont;
					}
				}
				break;
			case 4:
				System.out.println("Matriz 1");
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						System.out.print(matriz1[l][c]+" | ");
					}
					System.out.print("\n");
				}
				System.out.println("Matriz 2");
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						System.out.print(matriz2[l][c]+" | ");
					}
					System.out.print("\n");
				}
				System.out.println("Soma das matrizes");
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						System.out.print(soma[l][c]+" | ");
					}
					System.out.print("\n");
				}	
				System.out.println("Subtração das matrizes");
				for(c = 0; c < 2; c++) {
					for(l = 0; l < 2; l++) {
						System.out.print(subtracao[l][c]+" | ");
					}
					System.out.print("\n");
				}
				break;
			}
		}while(n!=0);
		
		
		
	}

}
