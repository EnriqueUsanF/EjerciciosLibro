import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class unidadCuatro {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void uno() {
		System.out.print("Ingresa la distancia del centro a uno de los vertices del pentagono: ");
		double r = sc.nextDouble();
		double s = (2 * r) * (Math.sin(Math.PI / 5));
		double area = (5 * (Math.pow(s, 2))) / ( 4 * (Math.tan(Math.PI / 5)));
		System.out.println("El area del pentagono es de " + df.format(area));
	}

	public static void dos() {
		System.out.print("Ingresa el punto 1 (latitud y longitud) en grados: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("Ingresa el punto 2 (latitud y longitud) en grados: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double radioTierra = 6371.01;
		double distancia = radioTierra * (Math.acos((Math.sin(x1)) * (Math.sin(x2)) + ((Math.cos(x1)) * (Math.cos(x2)) * (Math.cos(y1 - y2)))));
		System.out.println("La distancia entre los dos puntos es de " + distancia + "km");
		//d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
	}

	public static void tres() {
		double x1 =33.83720034254027, x2 = 28.539253662940062, x3 = 32.109035731400475, 
				x4 = 35.26808397669458, y1 = -84.38432032641718, y2 = -81.38544079584398,
				y3 = -81.08311512417056, y4 = -80.84176252373324;
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		x3 = Math.toRadians(x3);
		y3 = Math.toRadians(y3);
		x4 = Math.toRadians(x4);
		y4 = Math.toRadians(y4);
		
		double distanciaAO = distanciaMetodo(x1, x2, y1, y2);
		double distanciaOS = distanciaMetodo(x2, x3, y2, y3);
		
		double distanciaAS = distanciaMetodo(x1, x3, y1, y3);
		
		double distanciaAC = distanciaMetodo(x1, x4, y1, y4);
		double distanciaSC = distanciaMetodo(x3, x4, y3, y4);
		
		double s = (distanciaAO + distanciaOS + distanciaAS) / 2;
		double area1 = Math.sqrt(s * (s - distanciaAO) * (s - distanciaOS) * (s - distanciaAS));
		System.out.println("El area del triangulo 1 es de " + df.format(area1));
		
		s = (distanciaSC + distanciaAC + distanciaAS) / 2;
		double area2 = Math.sqrt(s * (s - distanciaSC) * (s - distanciaAC) * (s - distanciaAS));
		System.out.println("El area del triangulo 2 es de " + df.format(area2));
		
		System.out.println("El area conjunta es de " + (area1 + area2) + "km");
		
	}
	
	public static double distanciaMetodo (double x1, double x2, double y1, double y2) {
		double radioTierra = 6371.01;
		return radioTierra * (Math.acos((Math.sin(x1)) * (Math.sin(x2)) 
				+ ((Math.cos(x1)) * (Math.cos(x2)) * (Math.cos(y1 - y2)))));
	}

	public static void cuatro() {
		System.out.print("Ingresa la distancia del centro a uno de los vertices del hexagono: ");
		double r = sc.nextDouble();
		double s = (2 * r) * (Math.sin(Math.PI / 6));
		double area = (6 * (Math.pow(s, 2))) / ( 4 * (Math.tan(Math.PI / 6)));
		System.out.println("El area del pentagono es de " + df.format(area));
	}

	public static void cinco() {
		System.out.print("Ingresa el numero de lados del poligono: ");
		double n = sc.nextInt();
		System.out.print("Ingresa la distancia del centro a uno de los vertices del poligono: ");
		double r = sc.nextDouble();
		double s = (2 * r) * (Math.sin(Math.PI / 6));
		double area = (n * (Math.pow(s, 2))) / ( 4 * (Math.tan(Math.PI / n)));
		System.out.println("El area del pentagono es de " + df.format(area));
	}

	public static void seis() {

	}

	public static void siete() {

	}

	public static void ocho() {

	}

	public static void nueve() {

	}

	public static void diez() {

	}

	public static void once() {

	}

	public static void doce() {

	}

	public static void trece() {

	}
	public static void catorce() {

	}
	
	public static void quince() {

	}
	
	public static void dieciseis() {

	}

	public static void diecisiete() {

	}
	
	public static void dieciocho() {

	}
	
	public static void diecinueve() {

	}
	
	public static void veinte() {
		
	}
	
	public static void veintiuno() {

	}
	
	public static void veintidos() {

	}
	
	public static void veintitres() {

	}
	
	public static void vienticuatro() {

	}
	
	public static void veinticinco() {

	}
	
	public static void veintiseis() {

	}
	
	public static void veintisiete() {

	}
	
	public static void veintiocho() {

	}
	
	public static void veintinueve() {

	}
	
	public static void treinta() {

	}
	
	public static void treintayuno() {

	}
	
	public static void treintaydos() {

	}
	
	public static void treintaytres() {

	}
	
	public static void treintaycuatro() {

	}
	
	public static void treintaycinco() {

	}
}
