package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MetodosColeccion01 {

	public static void main(String[] args) {
		// si sabes la naturaleza de un objeto no
		// debes usar upcasting
		Collection nideaCollection;
		// muy importante ver la biblioteca que se importa porque puede venir de
		// otro sitio y nosotros solo queremos java.util.*
		nideaCollection = new ArrayList();
		nideaCollection.add(1);
		nideaCollection.add(2);
		nideaCollection.add(3);
		nideaCollection.add(4);
		nideaCollection.add(5);

		// puedes recorrela
		for (Object object : nideaCollection) {
			System.out.println(object);
		}

		LinkedList enlazada = new LinkedList();
		enlazada.add(1);
		enlazada.get(0);

		enlazada.addAll(nideaCollection);
		System.out.println(" el quinto elemento es " + enlazada.get(4));

		// puedes recorrela
		for (Object object : enlazada) {
			System.out.println(object);
		}
	}
}
