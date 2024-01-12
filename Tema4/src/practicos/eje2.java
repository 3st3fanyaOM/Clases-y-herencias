package practicos;

public class eje2 {

	public static void main(String[] args) {
	String frase = "   ESTEFANIA";
	String nombre = getMinusculas(frase);
	System.out.println(nombre);

	}
	public static String getMinusculas(String cadena) {
		return cadena.trim().toLowerCase();
	}

}
