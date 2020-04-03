package collectionsIPDF;

import java.util.Stack;

public class StackInviertePalabra {
	public static void main(String[] args) {
		String palabra= "sopos";
		Stack<Character> palabreja=new Stack<Character>();
		for (int i = 0; i < palabra.length(); i++) {
			palabreja.push(palabra.charAt(i));
		}
		boolean resultado=true;
		for (int i = 0; i < palabra.length()&&resultado; i++) {
			if(palabra.charAt(i)!=palabreja.pop()) {
				resultado=false;
			}
		}
		System.out.println("son palindromas "+resultado);
	}
}
