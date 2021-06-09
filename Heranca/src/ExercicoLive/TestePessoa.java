package ExercicoLive;

public class TestePessoa {

	public static void main(String[] args) {
		Empregado felipe = new Empregado ("Felipe","Rua Que Sobe e Desce,1222","23344455566",976654433,20,111,4500,15);
		felipe.imprimirInfo();
		felipe.calcularSalario();
		
		Operario caio = new Operario("Caio", "Rua do caixa prego", "45678912385", 33654892, 25, 500, 100);
		 caio.imprimirInfo();
		 caio.calcularValorArtigo();
		 
		 Fornecedor carlos = new Fornecedor("Carlos", "Rua bota do judas", "78952014736", 95823641, 45, 3000, 5000);
		 carlos.obterSaldo();
		 carlos.imprimirInfo();
		 carlos.validarCpf();
	}

}
