package ejemplos.condicionales;

import java.util.Scanner;
/*
 * Pruebas (valor/es introducidos) : (respuestas)
 * 
 * 4 : No es casi-cero
 * 1 : No es casi-cero
 * -1 : No es casi-cero
 * 4,2 : No es casi-cero
 * 0,4 : Es casi-cero
 * -0,4 : Es casi-cero
 */ 
public class Ejercicio3 {

	public static void main(String[] args) {
		// En la variable numero guardaremos el número introducido por el usuario
		double numero;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número real por teclado
		System.out.println("Introduzca un número real:");
		numero = sc.nextDouble();
		
		// Un número casi-cero es aquel que está en el rango (-1, 1) y es distinto de 0
		if(numero > -1 && numero < 1 && numero!=0) {
			System.out.println("Es casi-cero");
		} else
			System.out.println("No es casi-cero");
	}

}
