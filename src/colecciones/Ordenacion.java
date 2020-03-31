package colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacion {
public static void main(String[] args) {
	ArrayList listaArray=new ArrayList<>();
	listaArray.add(12);
	listaArray.add(22);
	listaArray.add(32);
	listaArray.add(42);
	listaArray.add(25);
	System.out.println(listaArray);

	Collections.sort(listaArray);
	System.out.println(listaArray);
	
	Collections.reverse(listaArray);
	System.out.println(listaArray);
}
}
