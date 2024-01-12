package practicos;




public class Calculadora {

	public static Integer sumar (Integer num1,Integer num2) {
		return num1+num2;
	}
	
	public static Integer restar (Integer num1,Integer num2) {
		return num1-num2;
	}
	
	public static Integer multiplicar (Integer num1,Integer num2) {
		return num1*num2;
	}
	
	public static Integer dividir (Integer num1,Integer num2) {
		if (num2 ==0) {
			return 0;
		}
		else {
			return num1/num2;
		}
	}
	public static Integer calcular (String cadena,Integer num1,Integer num2) {
		Integer resultado = 0;
		if (cadena.equalsIgnoreCase("add")) {
			resultado = sumar(num1,num2);
		}
		else if (cadena.equalsIgnoreCase("sub")) {
			resultado = restar(num1,num2);
		}
		else if (cadena.equalsIgnoreCase("mul")) {
			resultado = multiplicar(num1,num2);
		}
		else if (cadena.equalsIgnoreCase("div")) {
			resultado = dividir(num1,num2);
		}
		return resultado;
	}

}