package ejercicios_guia02;

import java.util.Scanner;


public class Ej01_G02 {

	static Scanner scan = new Scanner(System.in); //Variable scanner para ingreso de datos
	
	public static void main(String[] args) {
		
		Rectangulo rect = new Rectangulo();
		System.out.println("Ingrese el alto del rectangulo: ");
		rect.alto = scan.nextDouble(); 
		System.out.println("Ingrese el ancho del rectangulo: ");
		rect.ancho = scan.nextDouble(); 
		
		rect.calcularArea();
		rect.calcularPerim();

	}

}
