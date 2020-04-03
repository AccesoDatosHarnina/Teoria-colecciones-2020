package conjuntos;

public class Persona {
 public String dniString;
 public String nombString;
 
 
 @Override
	public boolean equals(Object obj) {
		
		return this.dniString.equals(((Persona)obj).dniString);
	}
}
