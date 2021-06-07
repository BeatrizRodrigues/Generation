package Array;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int l, c, qntd=0;
		Scanner ler = new Scanner(System.in);
		
		for(c = 0; c < 3; c++) {
			for(l = 0; l < 3; l++) {
				matriz[l][c] = ler.nextInt();
				if(matriz[l][c] > 10) {
					qntd++;
				}
			}
		}
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				System.out.print(matriz[l][c]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Quantidade de números maiores que 10: "+qntd);

	}

}
