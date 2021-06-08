package Objeto;

public class ContaBancaria {
	private String nome;
	private Double saldo;
	private String banco;
	
	public ContaBancaria (String nome, Double saldo, String banco) {
		this.nome = nome;
		this.saldo = saldo;
		this.banco = banco;
	}
	
	public Double depositar(double valor) {
		saldo += valor;
		return saldo;
	}
	
	public Double sacar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
		}else {
			System.out.println("Valor indisponivel");
		}
		
		return saldo;
	}
	
	public void imprimir() {
		System.out.println("Nome do cliente: "+nome+" Saldo: "+saldo+" Banco: "+banco);
	}
}
