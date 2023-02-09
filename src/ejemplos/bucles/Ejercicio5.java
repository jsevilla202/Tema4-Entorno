package ejemplos.bucles;

import java.util.Scanner;

/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 
 * MAYOR/MENOR/MAYOR/IGUAL : ¡¡ENHORABUENA!! Has acertado
 * IGUAL : ¡¡ENHORABUENA!! Has acertado
 * MENOR/MENOR/MENOR/MENOR/MENOR/MENOR/IGUAL : ¡¡ENHORABUENA!! Has acertado
 */ 
public class Ejercicio5 {

	public static void main(String[] args) {
		int numero;
		String respuesta="";
		Scanner sc = new Scanner(System.in);
		int menor=0;
		int mayor=101;
		do {
			numero = (int)(Math.random()*(mayor-menor)+menor);
			System.out.println("¿Es el número " + numero + "?");
			respuesta = sc.nextLine();
			
			if(respuesta.equals("MENOR")) {
				mayor = numero;
			} else if(respuesta.equals("MAYOR")) {
				menor = numero;
			}
			
		}while(!respuesta.equals("IGUAL"));
		
		System.out.println("¡¡ENHORABUENA!! Has acertado");
	}

}
