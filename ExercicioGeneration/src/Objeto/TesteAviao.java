package Objeto;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao [] lista = new Aviao[2];
		lista[0] = new Aviao("TAM", "A-747", 100);
		lista[1] = new Aviao("Gol", "Z-961", 150);
		
		for(Aviao n : lista) {
			n.imprimir();
		}

	}

}
