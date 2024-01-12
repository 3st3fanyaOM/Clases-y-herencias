package practicos;

public class ArrayUtils {

	public static void main(String[] args) {
	String [] palabras = new String [] {"perro","gato","tortuga","conejo","pez"};
	
	
	imprimirArray(palabras);
	System.out.println();
	System.out.println(obtenerPalabra(palabras,2));
	System.out.println(buscarPalabra(palabras,"tortuga"));
	

}
	public static void imprimirArray (String [] palabras) {
		for (String palabra: palabras) {
			System.out.println(palabra);
		}
	}
	
	public static String obtenerPalabra (String [] palabras, Integer n) {
		String palabraBuscada ="";
			if (n>= 0 && n<palabras.length) {
				palabraBuscada = palabras[n];
			}
			return palabraBuscada;	
	}


	public static Integer buscarPalabra (String [] palabras,String palabra) {
		Integer posicion = -1;
		for (int i =0;i<palabras.length;i++) {
			if (palabras[i].equals(palabra)) {
				posicion = i;
			}
		}
		return posicion;	
	}
}