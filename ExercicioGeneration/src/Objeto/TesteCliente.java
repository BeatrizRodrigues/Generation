package Objeto;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente [] lista = new Cliente[2];
		lista[0] = new Cliente("Beatriz Rodrigues", "29/08/1998");
		lista[1] = new Cliente("Izabelle Santos", "01/12/1995");
		
		for(Cliente n : lista) {
			n.imprimir();
		}
 
	}

}
