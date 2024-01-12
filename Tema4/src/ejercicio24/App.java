package ejercicio24;

public class App {

	public static void main(String[] args) {
		
	Profesor profesor = new Profesor();	

	profesor.setNombre("juan");
	profesor.setEdad(40);
	
	System.out.println("Nombre: "+profesor.getNombre()+" Edad: "+profesor.getEdad());
	}

}
