package maps;

import java.util.HashMap;

public class MapaTres {
public static void main(String[] args) {
	HashMap<Long, Cliente> mapaClienteSeguro=new  HashMap<Long, Cliente>();
	Cliente unoCliente=new Cliente("jose", 1, 0);
	mapaClienteSeguro.put(unoCliente.numeroCuenta, unoCliente);
	
	//Cuidado con los tipos, si pones solo 1, entiende que es un int
	//y "no coinciden los tipos" la L de 1L lo convierte en Long
	Cliente mioCliente=mapaClienteSeguro.get(1L);
	System.out.println(mioCliente.nombre);
}
}
