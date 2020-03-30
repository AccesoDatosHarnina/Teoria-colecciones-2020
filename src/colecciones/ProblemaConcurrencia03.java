package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ProblemaConcurrencia03 {

	public static void main(String[] args) {
		ArrayList<PersonaDos> listado = new ArrayList<PersonaDos>();
		listado.add(new PersonaDos("Luis", 12));
		listado.add(new PersonaDos("Esteban", 18));
		listado.add(new PersonaDos("Arturo", 14));
		listado.add(new PersonaDos("Roberto", 19));
		System.out.println(listado);
		// Collections es una clase de utlidades para Collections
		Collections.sort(listado);
		System.out.println(listado);
		PersonaDos person = new PersonaDos("Benito", 12);
		// insertar ordenado
		// error por mnodificationexception
//		for (PersonaDos personaDos : listado) {
//			if (person.compareTo(personaDos) > 0) {
//				listado.add(person);
//			}
//		}
		//concurrent fallo porque inserto con listado aunque recorra con iterator
//		for (Iterator iterator = listado.iterator(); iterator.hasNext();) {
//			PersonaDos personaDos = (PersonaDos) iterator.next();
//			//por lo tanto el fallo de concuerrencia persiste si trabajo con la lista
//			if(person.compareTo(personaDos)>0) listado.add(person);
//		}
		// anado el elemento a traves de iterator
		// cuya funcion es senalar elementos de la lista, pero no es la lista
		for (ListIterator listIterator = listado.listIterator(); listIterator.hasNext();) {
			PersonaDos personaDos = (PersonaDos) listIterator.next();
			if(person.compareTo(personaDos)>0) listIterator.add(person);
		}
		System.out.println(listado);
	}

}
