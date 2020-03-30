package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;

public class MetodosLinkedList {

	public static void main(String[] args) {
		LinkedList lista=new LinkedList();
		ArrayList listaArray=new ArrayList<>();
		listaArray.add(12);
		listaArray.add(22);
		listaArray.add(32);
		listaArray.add(42);
		listaArray.add(25);
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		lista.add(2, 10);
		System.out.println(lista);
		System.out.println(lista.get(0));
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		System.out.println(listaArray.get(0));
		
		lista.removeFirstOccurrence(10);
		for (Object object : lista) {
			System.out.println(object);
		}
	}

}
