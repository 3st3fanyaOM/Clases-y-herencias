package ejercicio21;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		Alumno alumno = new Alumno();

		System.out.println("Dime el dni");
		String dni = sc.nextLine();
		alumno.setDni(dni);

		System.out.println("Dime el identificador");
		Integer id = sc.nextInt();
		alumno.setIdentificador(id);
		
		sc.nextLine();

		System.out.println("Dime la descripción");
		String desc = sc.nextLine();
		alumno.setDescripcion(desc);

		System.out.println("Dime la nota");
		Double nota = sc.nextDouble();
		alumno.setNota(nota);

		System.out.println("DNI : " + alumno.getDni() + " ID : " + id + " DESCRIPCION : " + desc + " NOTA : " + nota);

		

		sc.close();

	}

}
