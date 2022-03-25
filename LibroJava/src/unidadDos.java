import java.text.DecimalFormat;
import java.util.Scanner;

public class unidadDos {
	private static Scanner scanner = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	
	public static void dosUno() {
		System.out.print("Ingresa las millas: ");
		double millas = scanner.nextDouble();
		double kilometros = millas * 1.6;
		System.out.println(millas + " millas son " + df.format(kilometros) + " Kilometros");
	}
	
	public static void dosDos() {
		System.out.print("Ingresa el largo de uno de un lado y la altura"
				+ "(para el prisma) de un triangulo equilatero: ");
		double lado = scanner.nextDouble();
		double altura = scanner.nextDouble();
		double area = (Math.sqrt(3) / 4) * (Math.pow(lado, 2));
		System.out.println("El area es: " + df.format(area));
		double volumen = area * altura;
		System.out.println("El volumen del prima triangular es: " + df.format(volumen));
	}
	
	public static void dosTres() {
		System.out.print("Ingresa un valor en metros para convertirlos a pies: ");
		double metros = scanner.nextDouble();
		double pies = 3.2786;
		System.out.println(metros + " metros son " + df3.format(pies * metros) + " pies");
	}
	
	public static void dosCuatro() {
		System.out.print("Ingresa un numero referente a metros cuadrados:");
		double metros = scanner.nextDouble();
		double pyeong = 0.3025;
		System.out.println(metros + " metros son " + df3.format(pyeong * metros) + " pyeongs");
	}
	
	public static void dosCinco() {
		System.out.print("Ingresa el subtotal y la tasa de propina: ");
		double subtotal = scanner.nextDouble();
		double tasapropina = scanner.nextDouble();
		double propina = (subtotal * tasapropina) / 100;
		System.out.println("De la propina son $" + propina + " y el total es $" + df.format(propina + subtotal));
	}
	
	public static void dosSeis() {
		System.out.print("Ingresa un numero entre 0 y 1000: ");
		int cantidad = scanner.nextInt();
		int resultado;
		if(cantidad > 0 && cantidad < 10) {
			resultado = cantidad;
		} else if(cantidad >= 10 && cantidad < 100) {
			resultado = (cantidad % 10) * (cantidad / 10);
		} else {
			resultado = (cantidad % 10) * (((cantidad / 10) % 10) * ((cantidad / 10) / 10));
		}
		System.out.println("La multiplicacion de todos los digitos es: " + resultado);
	}
	
	public static void dosSiete() {
		System.out.print("Ingresa el numero de minutos: ");
		int minutos = scanner.nextInt();
		int anios, dias, totalDias;
		//1440 es un dia
		totalDias = minutos / 1440;
		anios = totalDias / 365;
		dias = totalDias % 365;
		System.out.println(minutos + " minutos son aproximadamente " + anios + " años"
				+ " y " + dias + " dias");
	}
	
	public static void dosOcho() {
		long totalMilisegundos = System.currentTimeMillis();
		long totalSegundos = totalMilisegundos / 1000;
		long segundoActual = totalSegundos % 60;
		long totalMinutos = totalSegundos / 60;
		long minutoActual = totalMinutos % 60;
		long totalHoras = totalMinutos / 60;
		long horaActual = totalHoras % 24;
		System.out.print("Ingresa el desface horario de GTM: ");
		long gtm = scanner.nextLong();
		System.out.println("La Hora actual es: " + (horaActual+gtm) + ":" + minutoActual
				+ ":" + segundoActual);
	}
	
	public static void dosNueve() {
		System.out.print("Ingresa v0, v1 y t: ");
		double v0 = scanner.nextDouble();
		double v1 = scanner.nextDouble();
		double t = scanner.nextDouble();
		double aceleracion = (v1 - v0) / t;
		System.out.println("La aceleracion es " + df3.format(aceleracion));
	}
	
	public static void dosDiez() {
		System.out.print("Ingresa la cantidad de agua en Kilogramos: ");
		double kilogramos = scanner.nextDouble();
		System.out.print("Ingresa la temperatura inicial: ");
		double temperaturaInicial = scanner.nextDouble();
		System.out.print("Ingresa la temperatura final: ");
		double temperaturaFinal = scanner.nextDouble();
		double energia = kilogramos * (temperaturaFinal - temperaturaInicial) * 4184;
		System.out.println("La energia requerida es: " + df3.format(energia));
	}
	
	public static void dosOnce() {
		int poblacionActual = 312032486;
        System.out.print("Ingresa la cantidad de años: ");
        int cantidadAnios = scanner.nextInt();
        int segundosPorAnio = 31536000;
        int anio = 0;
        for (int i = 0; i <= segundosPorAnio*cantidadAnios; i++) {
                if(i % 7 == 0){
                    anio++;
                }
                if(i % 13 == 0){
                    anio--;
                }
                if(i % 45 == 0){
                    anio++;
                }
        }
        poblacionActual = poblacionActual + anio;
        System.out.println("Crecimiento total de la poblacion: " + poblacionActual);
	}
	
	public static void dosDoce() {
		System.out.print("Ingresa la velocidad y aceleracion: ");
		double velocidad = scanner.nextDouble();
		double aceleracion = scanner.nextDouble();
		double largo = Math.pow(velocidad, 2) / (2 * aceleracion);
		System.out.println("La longitud minima para el despegue del aeroplano es de ");
	}
	
	public static void dosTrece() {
		System.out.print("Ingresa la cantidad de ahorro mensual: ");
		double cantidad = scanner.nextDouble();
		double cantidadIncremento;
		cantidadIncremento = (cantidad) * (1 + 0.003125);
		System.out.println("Despues del primer mes el valor de la cuenta va a ser de " + cantidadIncremento);
		cantidadIncremento = (cantidad + cantidadIncremento) * (1 + 0.003125);
		System.out.println("Despues del segundo mes el valor de la cuenta va a ser de " + cantidadIncremento);
		cantidadIncremento = (cantidad + cantidadIncremento) * (1 + 0.003125);
		System.out.println("Despues del tercer mes el valor de la cuenta va a ser de " + cantidadIncremento);
		cantidadIncremento = (cantidad + cantidadIncremento) * (1 + 0.003125);
		System.out.println("Despues del cuarto mes el valor de la cuenta va a ser de " + cantidadIncremento);
		cantidadIncremento = (cantidad + cantidadIncremento) * (1 + 0.003125);
		System.out.println("Despues del quinto mes el valor de la cuenta va a ser de " + cantidadIncremento);
		cantidadIncremento = (cantidad + cantidadIncremento) * (1 + 0.003125);
		System.out.println("Despues del sexto mes el valor de la cuenta va a ser de " + cantidadIncremento);
	}
}
