package ExercicioUm;

public class TesteAnimal {
	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Bruno", 6, "preto");
		Preguica preguica = new Preguica("Bela", 10, "Preguiça de coleira");
		Cachorro cao = new Cachorro("Amora", 7, "pequines", "preto");
	
		cavalo.imprimir();
		cavalo.fazerCarinho();
		
		preguica.imprimir();
		
		System.out.println("Idade humana: "+cao.calcularIdade());
		cao.imprimir();
		
		cao.acao();
		cavalo.emitirSom();
		preguica.emitirSom();
	}
}
