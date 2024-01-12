package practicos;

import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Boolean ncorrecto = false;
	Integer numero1 = 0;
	Integer numero2 = 0;
	do {
		System.out.println("Dame un numero");
		numero1 = sc.nextInt();
		System.out.println("Dame otro numero");
		numero2 = sc.nextInt();
		if (numero1>0 && numero2>0) {
			ncorrecto=true;
		
		}
		else {
			System.out.println("El numero no es entero, introduce otro");
			ncorrecto = false;
		}
	}
	while (!ncorrecto);
	Integer resultado = sumar(numero1,numero2);
	System.out.println(resultado);
	sc.close();

	}

	public static Integer sumar (Integer num1,Integer num2) {
		Integer suma = num1+num2;
		return suma;
		
	}

}
