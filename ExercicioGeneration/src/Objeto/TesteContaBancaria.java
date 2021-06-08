package Objeto;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria [] lista = new ContaBancaria[2];
		lista[0] = new ContaBancaria("Beatriz Rodrigues", 1500.0, "NuBank");
		lista[1] = new ContaBancaria("Izabelle Guiotti", 2500.0, "Banco do Brasil");
		
		
		System.out.println(lista[0].depositar(500));
		System.out.println(lista[1].sacar(250));
		
		for(ContaBancaria n : lista) {
			n.imprimir();
		}

	}

}
