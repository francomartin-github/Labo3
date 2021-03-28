package ejercicios;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	static Scanner scan = new Scanner(System.in); //Variable scanner para ingreso de datos
	
	public static void main(String[] args) { //metodo principal main
		// TODO Auto-generated method stub
 
		System.out.println("Bienvenido a la Guia 0");
		
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
			case 2: {
				System.out.println("\nEjercicio 02\n========");
				haciendoEj02();
				break;
			}
			case 3: {
				System.out.println("\nEjercicio 03\n========");
				haciendoEj03();
				break;
			}
			case 4: {
				System.out.println("\nEjercicio 04\n========");
				haciendoEj04();
				break;
			}
			case 5: {
				System.out.println("\nEjercicio 05\n========");
				haciendoEj05();
				break;
			}
			case 6: {
				System.out.println("\nEjercicio 06\n========");
				haciendoEj06();
				break;
			}
			case 7: {
				System.out.println("\nEjercicio 07\n========");
				haciendoEj07();
				break;
			}
			case 8: {
				System.out.println("\nEjercicio 08\n========");
				haciendoEj08();
				break;
			}
			case 9: {
				System.out.println("\nEjercicio 09\n========");
				haciendoEj09();
				break;
			}
			case 10: {
				System.out.println("\nEjercicio 10\n========");
				haciendoEj10();
				break;
			}
			case 11: {
				System.out.println("\nEjercicio 11\n========");
				haciendoEj11();
				break;
			}
			case 12: {
				System.out.println("\nEjercicio 12\n========");
				haciendoEj12();
				break;
			}
			case 13: {
				System.out.println("\nEjercicio 13\n========");
				haciendoEj13();
				break;
			}
			case 14: {
				System.out.println("\nEjercicio 14\n========");
				haciendoEj14();
				break;
			}
			case 15: {
				System.out.println("\nEjercicio 15\n========");
				haciendoEj15();
				break;
			}
			case 16: {
				System.out.println("\nEjercicio 16\n========");
				haciendoEj16();
				break;
			}
			case 17: {
				System.out.println("\nEjercicio 17\n========");
				haciendoEj17();
				break;
			}
			case 18: {
				System.out.println("\nEjercicio 18\n========");
				haciendoEj18();
				break;
			}
			default:
				System.out.println("Valor ingresado no valido");
				break;
			}		
		}				
	}


	 private static void haciendoEj01() {
		 
		 //Ingresar y mostrar variables
		 
		 int N = 4;
		 double A = 5.7;
		 char C = 'D';

		 System.out.println("Valor variable N: " + N);
		 System.out.println("Valor variable A: " + A);
		 System.out.println("Valor variable C: " + C);

		 System.out.println("Valor de N + A: " + (N+A));
		 System.out.println("Valor de A - N: " + (A-N));
		 System.out.println("Valor correspondiente a la letra " + C + ": " + (int)C);
	 }

	 private static void haciendoEj02() {
		
		 //Ingresar, operar y mostrar variables
		 
		int X=5, Y=4;
		double N=4.5, M=5.5;
			
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println("N = " + N);
		System.out.println("M = " + M);
		
		
		System.out.println("X + N = " + (X+N));
		System.out.println("Y * M = " + (Y*M));
		System.out.println("Y - M = " + (Y-M));
		System.out.println("M / X = " + (M/X));		
	 }

	 private static void haciendoEj03() {
		 
		//Ingresar valor, incrementarlo, decrementarlo y multiplicarlo. Mostrarlo 
		 
		int N=5;
		System.out.println("N inicial = " + N);
		N+=77;
		N-=3;
		N*=2;	
		System.out.println("El valor final de N es: " + N); 
	 }
	 
	 private static void haciendoEj04() {
		 
		//Ingresar valores e intercambiarlos 
		 
		int A=2, B=4, C=6, D=8;
		int aux;
		aux=B;
		B=C;
		C=A;
		A=D;
		D=aux;
		
		System.out.println("Valor de A: " + A);
		System.out.println("Valor de B: " + B);
		System.out.println("Valor de C: " + C);
		System.out.println("Valor de D: " + D);
	 }
	 
	 private static void haciendoEj05() {
		
		//Indicar si un numero es par o impar 
		 
		int A=15;	
		if (A%2 == 0) {
			System.out.println("El numero " + A + " es par");
		}
		else {
			System.out.println("El numero" + A + " es impar"); 
		}
	 }
 
	 private static void haciendoEj06() {
		
		//Indicar si un numero es positivo, negativo o nulo 
		 
		Random random = new Random();
		//int B = random.nextInt();
		int B = random.nextInt(100) - 200;
		String respuesta;
		
		//String respuesta = (B > 0) ? "positivo" : "negativo o nulo";

		if (B > 0) {
			respuesta="positivo";
		}
		else if (B < 0){
			respuesta="negativo";
		}
		else {
			respuesta="nulo (ni positivo ni negativo)";
		}
		 
		System.out.println("El numero " + B + " es " + respuesta );
	 }
	 
	 private static void haciendoEj07() {
		 
		//Indicar si un numero es positivo, negativo, multiplo de 5 o multiplo de 10 
		 
		Random random = new Random();
        int C = random.nextInt();

        String positivo = (C > 0) ? "positivo" : "negativo"; //ternario, si condicion es true almacena primera opcion en String, sino la segunda
        String paridad = (C % 2 == 0) ? "par" : "impar";
        String multiplo5 = (C % 5 == 0) ? "multiplo de 5" : "no es multiplo de 5";
        String multiplo10 = (C % 10 == 0) ? "multiplo de 10" : "no es multiplo de 10";

        System.out.println((String.format("C: %s, es un numero %s, %s, %s y %s.", C, positivo, paridad, multiplo5, multiplo10))); 
	 }
	 
	 private static void haciendoEj08() {
		
		//Ingresa nombre y saluda
		
		String nombre;
		System.out.println("Ingrese nombre: ");
		nombre = scan.next();
		System.out.println("Buenos dias " + nombre); 
	 }
	 
	 private static void haciendoEj09() {
		
		//INgresa numero e indica su doble y su triple
		 
		System.out.println("Ingrese un numero: ");
		int num = scan.nextInt();
		
		System.out.println("El numero ingresado, su doble y su triple respectivamente son: " + num + ", " + 2*num + ", " + 3*num);
	 }
	 
	 private static void haciendoEj10() {
		 
		 //Convierte temperatura ingresada de Farenheit a Celsius
		 
		 System.out.println("Ingrese una temperatura en grados Farenheit para convertir a Celsius: ");
		 double faren = scan.nextDouble();
		 double celsius = (faren - 32) * (5.0 / 9.0);
		 System.out.println(faren + " Farenheit son " + celsius + " grados Celsius"); 
	 }
	 
	 private static void haciendoEj11() {
		 
		 //Calcula longitud de circunferencia con radio ingresado
		 
		 System.out.println("Ingrese el radio de una circunferencia (en centimetros): ");
		 double radio = scan.nextDouble();
		 double pi = Math.PI;
		 double longitud = 2*pi*radio;
		 double area = pi*Math.pow(radio, 2);
		 System.out.println("La longitud de una circunferencia de radio " + radio + " es " + longitud + " y su area es " + area);
	 }
	 
	 private static void haciendoEj12() {
		 
		 //Convierte velocidad ingresada de Km/h a M/s
		 
		 System.out.println("Ingrese una velocidad en KM/h para pasar a M/s: ");
		 double veloK = scan.nextDouble();
		 double veloM = veloK*1000/3600;
		 System.out.println(veloK + " Km/h son " + veloM + " M/s");
	 }
	 
	 private static void haciendoEj13() {
		 
		 //Calcula hipotenusa ingresando dos catetos
		 
		 System.out.println("Ingrese la medida del primer cateto: ");
		 double cat1 = scan.nextDouble();
		 System.out.println("Ingrese la medida del otro cateto: ");
		 double cat2 = scan.nextDouble();
		 double hipo =  Math.sqrt((Math.pow(cat1, 2) + Math.pow(cat2, 2)));
		 
		 System.out.println("La hipotenusa es: " + hipo);
	 }
	 
	 private static void haciendoEj14() {
		 
		 //Calcula volumen de esfera ingresando radio
		 
		 System.out.println("Ingrese el radio de una esfera (en centimetros) para calcular su volumen: ");
		 double radio = scan.nextDouble();
		 double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
		 System.out.println("El volumen de la esfera de radio " + radio + " es " + volumen + " cm3");
	 }
	 
	 private static void haciendoEj15() {
		 
		 //Calcula area de triangulo ingresando lados
		 
		 System.out.println("Ingrese longitud del lado uno del triangulo: ");
		 double l1 = scan.nextDouble();
		 System.out.println("Ingrese longitud del lado dos del triangulo: ");
		 double l2 = scan.nextDouble();
		 System.out.println("Ingrese longitud del lado tres del triangulo: ");
		 double l3 = scan.nextDouble();
		 
		 double P = (l1 + l2 + l3) / 2;
	     double A = Math.sqrt((P * (P - l1) * (P - l2) * (P - l3)));
		 
		 System.out.println("El area del triangulo es: " + A);
	 }
	 
	 private static void haciendoEj16() {
		 
		 //Muestra las cifras de un numero de 3 cifras ingresado
		 
		 System.out.println("Ingrese numero de 3 cifras: ");
		 int num = scan.nextInt();
		 
		 while (num > 999 || num < 100) {
			System.out.println("El numero no es de 3 cifras, ingrese lo pedido: ");
			num = scan.nextInt();
		}
		String number = String.valueOf(num);
		char[] digitos = number.toCharArray();
		System.out.println(digitos[0] + " + " + digitos[1] + " + " + digitos[2]);

	 }
	 
	 private static void haciendoEj17() {
		 
		 //Muestra las cifras de posicion impar de un numero de 5 cifras ingresado
		 
		 System.out.println("Ingrese numero de 5 cifras: ");
		 int num = scan.nextInt();
		 while (num > 99999 || num < 10000) {
				System.out.println("El numero no es de 5 cifras, ingrese lo pedido: ");
				num = scan.nextInt();
			}
		String number = String.valueOf(num);
		char[] digitos = number.toCharArray();
		for (int i=0; i<5; i++) {
			if (i%2 == 0) {
				System.out.println(digitos[i] + " ");
			}
		}
	 }
	 
	 private static void haciendoEj18() {
		 
		 //Controla que el formato de una hora ingresada sea valido
		 
		 System.out.println("Ingrese hora: ");
		 int H = scan.nextInt();
		 System.out.println("Ingrese minutos: ");
		 int M = scan.nextInt();
		 System.out.println("Ingrese segundos: ");
		 int S = scan.nextInt();
		 
		 if (H >= 0 && H <= 24) {
			 if (M >= 0 && M <= 60) {
				 if (S >= 0 && S <= 60) {
					 System.out.println("La hora ingresada es valida");
					 System.out.println((String.format("La hora es: %s:%s:%s", H, M, S)));
				 }
			 }	 
		 }
	 }
	 
}