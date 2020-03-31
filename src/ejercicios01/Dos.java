package ejercicios01;

import java.util.ArrayList;

public class Dos {
	char numeros[] = { 'a','c','f','h'};
	ArrayList<Character> lista = new ArrayList<Character>();

	public Dos() {
		for (int j = 0; j < numeros.length; j++) {
			lista.add(numeros[j]);
		}

	}

	public static void main(String[] args) {
		Dos instanciaDos = new Dos();
		instanciaDos.rotar();
		System.out.println(instanciaDos.lista);
		for (Character car : instanciaDos.lista) {
			System.out.println(car);
		}
	}

	private void rotar() {
		lista.add(lista.remove(0));
		
	}
}
