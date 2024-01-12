package ejercicio18;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alumno alumno = new Alumno();

		System.out.println("Dime el dni");
		String dni = sc.nextLine();
		alumno.setDni(dni);

		System.out.println("Dime el nombre");
		String nombre = sc.nextLine();
		alumno.setNombre(nombre);

		System.out.println("Dime la edad");
		Integer edad = sc.nextInt();
		alumno.setEdad(edad);

		System.out.println("Dime la nota");
		Double nota = sc.nextDouble();
		alumno.setNota(nota);

		System.out.println("DNI : " + dni + " NOTA : " + nota + " EDAD : " + edad + " NOTA : " + nota);

		Alumno alumno2 = new Alumno(dni, nombre, edad, nota);

		alumno.aprobar();

		System.out.println("La nota del alumno ahora es " + alumno.getNota());

		System.out.println("Dime el dni");
		String dni2 = sc.nextLine();
		Alumno alumno3 = new Alumno(dni2);
		alumno3.setDni(dni);
		System.out.println("El DNI de Inma es : " + alumno3.getDni());
		sc.close();

	}

}
