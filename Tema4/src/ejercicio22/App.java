package ejercicio22;

import java.util.Scanner;

import ejercicio21.Alumno;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Curso curso = new Curso();
		Alumno alumno = new Alumno();
		curso.setDescripcion("Entornos");
		curso.setIdentificador(10);

		// relaciona alumno con curso
		alumno.setCurso(curso);

		System.out.println("Dime el nombrer");
		String dni = sc.nextLine();
		alumno.setDni(dni);

		alumno.setNota(6.7);

		System.out.println("El alumno con dni: " + alumno.getDni() + " está cursando : " + curso.getDescripcion());

		System.out.println(alumno.getCurso());

		// me traigo del curso la descripcion
		System.out.println(alumno.getCurso().getDescripcion());

		// me traigo el identificador
		System.out.println(alumno.getCurso().getIdentificador());

		// imprimir todo el curso
		System.out.println(alumno);
		sc.close();
	}

}
