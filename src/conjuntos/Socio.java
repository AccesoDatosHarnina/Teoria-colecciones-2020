package conjuntos;


public class Socio implements Comparable<Socio>{
	private String nombre;
	private int edad;

	public Socio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	@Override
	public boolean equals(Object obj) {
		Socio socio=(Socio)obj;
		return nombre.equals(socio.nombre)&&edad==socio.edad;
	}

	@Override
	public int hashCode() {
		return nombre.charAt(0)+edad;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Socio() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Socio o) {
		int comparacionNombre=nombre.compareTo(o.nombre);
		int comparaEdad=edad-o.edad;
		return (comparacionNombre*100)+comparaEdad;
	}

}
