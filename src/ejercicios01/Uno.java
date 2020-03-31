package ejercicios01;

import java.util.ArrayList;

public class Uno {
	int numeros[] = { 4, 7, 34, 25, 12 };
	ArrayList<Integer> lista = new ArrayList<Integer>();
	public Uno() {
		for (int j = 0; j < numeros.length; j++) {
			lista.add(numeros[j]);
		}

	}

//Calcula la suma y la media aritmetica
	public static void main(String[] args) {
		Uno uno=new Uno();
		System.out.println(uno.suma());
		System.out.println(uno.media());
	}

	private float media() {
		return (float)suma()/lista.size();
	}

	private int suma() {
		int acumulador=0;
		for (Integer numero : lista) {
			acumulador+=numero;
		}
		return acumulador;
	}
	
}
