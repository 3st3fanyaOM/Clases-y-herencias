package practicos;

import java.util.Scanner;

public class eje3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Elige 1 o 2");
	Integer numero = sc.nextInt();                                                                           
	System.out.println(getMayMin("CEU Andalucia",numero));
	sc.close();
	}
	
	public static String getMayMin (String cadena,Integer numero) {
	String palabra ="";	
		if (numero ==1) {
			palabra =cadena.trim().toUpperCase();	
		}
		else if (numero ==2) {
			palabra= cadena.trim().toLowerCase();	
		}
		
		return palabra;
	
	}

}
