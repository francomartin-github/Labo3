package ejercicios_guia02;

public class Rectangulo {
		
	public double ancho = 1.0;
	public double alto = 1.0;
	
	public Rectangulo() {
    }
	
	public Rectangulo (double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double getAncho() {
        return ancho;
    }
	
	public double getAlto() {
		return alto;
	}
	
	public void setAncho(double ancho) {
        this.ancho = ancho;
    }
	
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public double calcularArea() {
		return ancho*alto;
	}
	
	public double calcularPerim() {
		return 2.0*(ancho+alto);
	}

}