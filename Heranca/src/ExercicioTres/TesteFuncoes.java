package ExercicioTres;

import java.util.Scanner;

public class TesteFuncoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Estoque estoque = new Estoque();
		int op;
				
		do {
			System.out.println("\n***Entre com sua op??o***\n");
			System.out.println("[1] Armazenar Dados");
			System.out.println("[2] Atualizar Dados");
			System.out.println("[3] Remover Dados");
			System.out.println("[4] Imprimir Dados");
			System.out.println("[5] Ordenar Dados");
			System.out.println("[0] Sair");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("Qual produto voc? que armazenar: ");
				String n = ler.next();
				estoque.armazenarDados(n);
				break;
			case 2:
				ler.nextLine();
				System.out.println("Qual produto deseja alterar: ");
				String altera = ler.next();
				estoque.atualizarDados(altera);
				break;
			case 3:
				ler.nextLine();
				System.out.println("Qual produto voc? quer remover: ");
				String r = ler.next();
				estoque.removerDados(r);
				break;
			case 4:
				estoque.imprimir();
				break;
			case 5:
				estoque.ordenar();
				break;
			default:
				System.out.println("Finalizou");
			
			}
			
		}while(op!=0);
	}

}
