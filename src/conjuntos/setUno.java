package conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class setUno {
	public static void main(String[] args) {
		//Sin repeticiones y ordenado
		//ordena por compareTo
		TreeSet<String> palabras=new TreeSet<String>();
		String palabrica=new String("columna");
		System.out.println(palabras.add("columna"));
		System.out.println(palabras.add("zalamero"));
		System.out.println(palabras.add("fila"));
		System.out.println("== "+("columna"==palabrica));
		System.out.println("equals "+("columna".equals(palabrica)));
		System.out.println(palabras.add(palabrica));
		System.out.println(palabras);
		
		//Si intentamos crear un treeset de elementos sin la implementacion de comparable
		//da error
		TreeSet<Persona> elementoSet=new TreeSet<Persona>();
		elementoSet.add(new Persona());
	}

}
