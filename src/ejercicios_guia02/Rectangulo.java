package ejercicios_guia02;

public class Rectangulo {
		
	public double ancho = 1.0;
	public double alto = 1.0;
	
	public void calcularArea() {
		System.out.println("El area del rectangulo es: " + ancho*alto);
	}
	
	public void calcularPerim() {
		System.out.println("El perimetro del rectangulo es: " + 2.0*(ancho+alto));
	}

}