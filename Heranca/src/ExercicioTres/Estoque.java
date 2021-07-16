package ExercicioTres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Estoque implements Funcoes{
	Scanner ler = new Scanner(System.in);
	List<String> list = new ArrayList<String>();

	public Estoque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void armazenarDados(String n) {
		list.add(n);
	}
	public void removerDados(String n) {
		for(int i = 0; i < list.size(); i++) {
			if(list.contains(n)) {
				list.remove(n);
			}else {
				System.out.println("Valor não encontrado");
			}
		}
	}
	@Override
	public void atualizarDados(String n) {
		System.out.println("Digite o novo produto: ");
		String novo = ler.next();
		if(list.contains(n)) {
			list.remove(n);
			list.add(novo);
		}else {
			System.out.println("Produto não existe!");
		}
	}
	@Override
	public void ordenar() {
		Collections.sort(list);
	}
	@Override
	public void imprimir() {
		System.out.println(list);
	}
	
}
