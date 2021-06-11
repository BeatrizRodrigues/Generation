package ExercicioUm;

public class Cachorro extends Animal{
	private String raca;
	private String corPelo;
	
	public Cachorro(String nome, int idade, String raca, String corPelo) {
		super(nome, idade);
		this.raca = raca;
		this.corPelo = corPelo;
	}
	
	public int calcularIdade() {
		int idadeHum = getIdade()*7;
		return idadeHum;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au...Au...Au..");
	}
	
	@Override
	public void acao() {
		System.out.println("O cachorrinho est� correndo");
	}
	
	public void imprimir() {
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Ra�a: "+raca);
		System.out.println("Cor da pelagem: "+corPelo);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
