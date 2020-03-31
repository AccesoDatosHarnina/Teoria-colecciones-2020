package conjuntos;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDos {
public static void main(String[] args) {
	ArrayList ssArrayList;
	Socio socio = new Socio("juan", 21);
	Socio socioTres = new Socio("aLuis", 21);
	Socio socioDos = new Socio("jose", 21);
	//Ojito con las letras mayusculas
	Socio socioCuatro=new Socio("Zigor",23);
	HashSet<Socio> lisDos = new HashSet<>();
	System.out.println(lisDos.add(socio));
	System.out.println(lisDos.add(socio));
	System.out.println(lisDos.add(socioDos));
	System.out.println(lisDos.add(socioTres));
	System.out.println(" iguales por equals "+socio.equals(socioDos));
	//esto pasa despues de sobreescribir hashCode
	// TODO
	System.out.println(" iguales por hashcode "+(socio.hashCode()==socioDos.hashCode()));
	System.out.println(lisDos);
	for (Socio socio2 : lisDos) {
		System.out.println(socio2.getNombre());
		System.out.println(socio2.hashCode());
	}
}
}
