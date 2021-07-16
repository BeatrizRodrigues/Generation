package Animal;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {	
		Scanner read = new Scanner(System.in);
		int op, op2;
		
		do {
			System.out.println("***Qual operação deseja realizar***");
			System.out.println("[1] Armazenar animal");
			System.out.println("[2] Excluir animal");
			System.out.println("[3] Imprimir");
			System.out.println("[0] Sair");
			op = read.nextInt();
			
			switch(op) {
			case 1:
				do {
					System.out.println("***Qual especie do animal***");
					System.out.println("[1] Anfibio");
					System.out.println("[2] Arachnidea");
					System.out.println("[3] Ave");
					System.out.println("[4] Inseto");
					System.out.println("[5] Mamifero");
					System.out.println("[6] Peixe");
					System.out.println("[7] Repteis");
					op2 = read.nextInt();
					
					
					
				}while(op2 > 0 && op2 < 8);
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Finalizou o programa !!");
				break;
			}
			
		}while(op!=0);
		
		Peixe animalDados = new Peixe("bia", "bia", "cafe", "sdbi", "hefbwi", "vaeif", "sdhfb");
		animalDados.armazenarDados(animalDados);
		Peixe animal = new Peixe("shjdvf","shjdvf", "shjdvf", "shjdvf","shjdvf", "shjdvf","shjdvf");
		animalDados.armazenarDados(animal);
		
		animalDados.imprimir();
		animalDados.removerDados(animal);
		animalDados.imprimir();
	}


}
