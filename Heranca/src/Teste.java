import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
	    lista.add("João da Silva");
	    lista.add("Antonio Sousa");
	    lista.add("Lúcia Ferreira");
	    System.out.println(lista);
	    Collections.sort(lista);
	    System.out.println(lista);
	}

}
