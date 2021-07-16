package Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	private static Scanner s;

		    public static void main(String[] args) {

		        s = new Scanner(System.in);
		        ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();    

		        for(int i=0; i < 10; i++){  
		            Pessoa pessoa = new Pessoa();
		            System.out.println("\nDigite o nome:");
		            pessoa.nome = s.next();
		            System.out.println("\nDigite a idade:");
		            pessoa.idade = s.nextInt();
		            listaPessoa.add(pessoa);

		        }
		        System.out.println(listaPessoa);
	}

}
