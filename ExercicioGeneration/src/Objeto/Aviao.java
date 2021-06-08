package Objeto;

public class Aviao {
	private String nomeFabricante;
	private String modelo;
	private int numAssento;
	
	public Aviao(String nome, String modelo, int assento) {
		this.nomeFabricante = nome;
		this.modelo = modelo;
		this.numAssento = assento;
	}
	
	public void imprimir() {
		System.out.println("Fabricante: "+nomeFabricante+" Modelo: "+modelo+"Números de assentos: "+numAssento);
	}
	
}	
