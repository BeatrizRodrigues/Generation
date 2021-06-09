package ExercicioUm;

public class Preguica extends Animal{
	private String especie;
	
	public Preguica(String nome, int idade, String especie) {
		super(nome, idade);
		this.especie = especie;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Especie: "+especie);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
