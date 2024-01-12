package practicos;

import java.util.Scanner;


public class calculadora_prueba {
	
	public static final String SUMAR = "ADD";
	public static final String RESTAR = "SUB";
	public static final String MULTIPLICAR = "MUL";
	public static final String DIVIDIR = "DIV";


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Boolean ncorrecto = false;
		Integer numero1 = 0;
		Integer numero2 = 0;
		String operacion = "";
		Integer resultado = 0;
		
		do {
			System.out.println("Dame un numero");
			numero1 = sc.nextInt();
			System.out.println("Dame otro numero");
			numero2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Para sumar escribe add \nPara restar escribe sub\nPara multiplicar escribe mul\nPara dividir escribe div");
			operacion = sc.nextLine();
			
			if (numero1>0 && numero2>0) {
				ncorrecto=true;
			
			}
			else {
				System.out.println("El numero no es positivo, introduce otro");
				ncorrecto = false;
			}
		}
		while (!ncorrecto);
		
		if (operacion.equalsIgnoreCase(SUMAR)) {
			resultado = Calculadora.sumar(numero1, numero2);
			System.out.println(numero1+ " + " +numero2+ " = " +resultado);
		}
		else if (operacion.equalsIgnoreCase(RESTAR)) {
			resultado = Calculadora.restar(numero1, numero2);
			System.out.println(numero1+ " - " +numero2+ " = " +resultado);
		}
		else if (operacion.equalsIgnoreCase(MULTIPLICAR)) {
			resultado = Calculadora.multiplicar(numero1, numero2);
			System.out.println(numero1+ " x " +numero2+ " = " +resultado);
		}
		else if (operacion.equalsIgnoreCase(DIVIDIR)) {
			resultado = Calculadora.dividir(numero1, numero2);
			System.out.println(numero1+ " / " +numero2+ " = " +resultado);
		}
		sc.close();

		}
}
