package collectionsIPDF;

import java.util.Iterator;
import java.util.LinkedList;

public class ManipulaList02 {
	public static void main(String[] args) {
		String argumentos[] = { "23", "34", "45", "12" };
		// convertir
		LinkedList<Integer> lista = new LinkedList<Integer>();
		// Para no tener que hcaer un for que vuelque el contenido del array
		// en la lista uso asList
//	LinkedList<String> listaII=new LinkedList<String>(Arrays.asList(argumentos));
		// no se puede hacer directamente esta conversion
//	LinkedList<String> listaIII=(LinkedList<String>) Arrays.asList(argumentos);
		for (String elemento : argumentos) {
			lista.add(Integer.valueOf(elemento));
		}
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, (int) Math.pow(lista.get(i), 2));
		}
		// Este caso no funciona porque saco los elementos de la lista
		// en la variable integer y pro lo tanto la modificacion (elevar al cuadrado)
		// no funciona sobre la propia lista
//	for (Integer integer : lista) {
//		Math.pow(integer, 2);
//	}
		System.out.println(lista);
		//En este caso no bloquea porque los elementos de la lista
		//no son objetos y por lo tanto no se pasa una referencia
		//si no un valor
//		for (int i = 0; i < lista.size(); i++) {
//			if(lista.get(i)>1000) {
//				lista.remove(i);
//				//Pero aun asi hacer esto de i-- no esta bien
//				i--;
//			}
//		}
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			if((Integer) iterator.next()>1000) {
				iterator.remove();
			}
			
		}
		System.out.println(lista);
		
	}
	
}
