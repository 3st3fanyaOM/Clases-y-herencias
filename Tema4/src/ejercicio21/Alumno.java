package ejercicio21;

import ejercicio22.Curso;

public class Alumno  {

	private String dni;
	private Double nota;
	private Curso curso;


	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alumno(String dni) {
		super();
		this.dni = dni;
	}

	public Alumno() {
		super();
	}

	public Alumno(String dni, String nombre, Integer edad, Double nota) {
		super();
		this.dni = dni;

		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void aprobar() {
		nota = 5.0;
	}

}
