package practicos;

import java.util.Scanner;

public class eje1 {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String cadena = sc.nextLine();
		String enMayusculas = getMayusculas(cadena);
		System.out.println(enMayusculas);
		sc.close();
	}

	public static String getMayusculas(String cadena) {
	 
	 return cadena.trim().toUpperCase();
	}
	
}