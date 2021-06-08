package Objeto;

public class Cliente {
	private String nome;
	private String dataNasc;
	
	public Cliente(String nome, String dataNasc){
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public void imprimir() {
		System.out.println("Cliente: "+nome+" Data de nascimento: "+dataNasc);
	}
}
