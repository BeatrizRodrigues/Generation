package Repeticao;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). :*/


import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n=0, idade, opSexo, op, calma=0, contMN=0, contMA=0, contOC=0, cont40N=0, cont18C=0;
		String sexo = "", humor = "";
		
		while(n!=6) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("*****SEXO*****");
			System.out.println("1 - FEMININO");
			System.out.println("2 - MASCULINO");
			System.out.println("3 - OUTRO");
			opSexo = ler.nextInt();
			
			switch(opSexo){
			case 1:
				sexo = "FEMININO";
				break;
			case 2:
				sexo = "MASCULINO";
				break;
			case 3:
				sexo = "OUTRO";
				break;
			default: 
				System.out.println("Entre com um valor valido");
			}
			System.out.println("*****Humor*****");
			System.out.println("1 - CALMA");
			System.out.println("2 - NERVOSA");
			System.out.println("3 - AGRESSIVA");
			op = ler.nextInt();
			
			switch(op){
			case 1:
				humor = "CALMA";
				break;
			case 2:
				humor = "NERVOSA";
				break;
			case 3:
				humor = "AGRESSIVA";
				break;
			default: 
				System.out.println("Entre com um valor valido");
			}
			
			if(humor == "CALMA") {
				calma++;
			}
			if(sexo == "FEMININO" && humor == "NERVOSA") {
				contMN++;
			}
			if(sexo == "MASCULINO" && humor == "AGRESSIVA") {
				contMA++;
			}
			if(sexo == "OUTRO" &&humor == "CALMA") {
				contOC++;
			}
			if(idade>40 && humor == "NERVOSA") {
				cont40N++;
			}
			if(idade<18 && humor == "CALMA") {
				cont18C++;
			}
			
			n++;
			
		}
		
		System.out.println("Número de pessoas calmas: "+calma);
		System.out.println("Número de mulheres nervosas: "+contMN);
		System.out.println("Número de homens agressivos: "+contMA);
		System.out.println("Número de outros calmos: "+contOC);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+cont40N);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+cont18C);

	}

}
