
//-----GUIA 02 LABORATORIO DE COMPUTACIÓN III-----

package ejercicios_guia02;

import java.util.Scanner;


public class Ejercicios02 {

	static Scanner scan = new Scanner(System.in); //Variable scanner para ingreso de datos
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a la Guia 2");
		
		int opcionMenu = 1;
		
		while (opcionMenu != 0) {
			System.out.println("\nIngrese el ejercicio a realizar, o 0 (cero) para finalizar: \n");
			opcionMenu = scan.nextInt();
			
			switch (opcionMenu) {
			case 0: {
				System.out.println("\nEjecucion finalizada\n");
				break;
			}
			case 1: {
				System.out.println("\nEjercicio 01\n========");
				haciendoEj01();
				break;
			}
			default:
				System.out.println("Valor ingresado no valido");
				break;
			}	
			
		}
	}
	
	
	private static void haciendoEj01() {
		Rectangulo rect = new Rectangulo(3,5); //instancio nuevo rectangulo con ancho 3 y alto 5;
		
		System.out.println("El ancho del rectangulo es: " + rect.getAncho()); //obtengo el ancho como el retorno de getAncho
		System.out.println("El alto del rectangulo es: " + rect.getAlto()); //obtengo el alto como el retorno de getAlto
			
		System.out.println("El area del rectangulo es: " + rect.calcularArea());
		System.out.println("El perimetro del rectangulo es: " + rect.calcularPerim());
		
		rect.setAncho(7); // modifico ancho del objeto
		rect.setAlto(3); //modifico alto del objeto
		
		System.out.println("El nuevo ancho del rectangulo es: " + rect.getAncho()); //obtengo el ancho como el retorno de getAncho
		System.out.println("El nuevo alto del rectangulo es: " + rect.getAlto()); //obtengo el alto como el retorno de getAlto
		System.out.println("El nuevo area del rectangulo es: " + rect.calcularArea());
		System.out.println("El nuevo perimetro del rectangulo es: " + rect.calcularPerim());
		
		Rectangulo rectDefault = new Rectangulo();
		System.out.println("El ancho del rectangulo default es: " + rectDefault.getAncho()); //obtengo el ancho como el retorno de getAncho
		System.out.println("El alto del rectangulo default es: " + rectDefault.getAlto()); //obtengo el alto como el retorno de getAlto
	}
	

}
