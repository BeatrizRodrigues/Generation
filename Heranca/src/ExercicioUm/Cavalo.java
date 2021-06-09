package ExercicioUm;

public class Cavalo extends Animal{
	private String pelagem;
	
	public Cavalo(String nome, int idade, String pelagem) {
		super(nome, idade);
		this.pelagem = pelagem;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Cor da pelagem: "+pelagem);
	}
	
	public void fazerCarinho() {
		System.out.println("::: (_(");
		System.out.println("*: (=’ :’) :*");
		System.out.println("•.. (,(”)(”)¤°.¸¸.•´¯`»");
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	
}
