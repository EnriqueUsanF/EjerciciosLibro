import java.text.DecimalFormat;
import java.util.Scanner;

public class unidadDos {
	private static Scanner scanner = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");
	
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
		System.out.println("La longitud minima para el despegue del aeroplano es de " + largo);
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
	
	public static void dosCatorce() {
		System.out.print("Ingresa tu peso en libras: ");
		double peso = scanner.nextDouble();
		System.out.print("Ingresa tu altura en pulgadas: ");
		double altura = scanner.nextDouble();
		double pesokg = peso * 0.45359237;
		double alturam = altura / 39.370;
		double bmi = pesokg / (alturam * alturam);
		System.out.println("BMI es de " + df3.format(bmi));
	}
	
	public static void dosQuince() {
		System.out.print("Ingresa x1 y y1: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		System.out.print("Ingresa x2 y y2: ");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("La distancia entre los dos puntos es de " + distancia);
	}
	
	public static void dosDieciseis() {
		System.out.print("Ingresa la longitud de un lado: ");
		double lado = scanner.nextDouble();
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(lado, 2);
		System.out.println("el area del Hexagono es de " + df3.format(area));
	}
	
	public static void dosDiecisiete() {
		System.out.print("Ingresa la temperatura en grados Fahrenheit entre "
				+ "-58°F y 41°F:");
		double temperatura = scanner.nextDouble();
		System.out.print("Ingresa la velocidad del viento ( >= 2 ) en millas por hora:");
		double viento = scanner.nextDouble();
		double sensacionTermica = 35.74 + (0.6215 * temperatura) - (35.75 * Math.pow(viento, 0.16)) + (0.4275 * temperatura * Math.pow(viento, 0.16));
		System.out.println("La sensacion termica ees de " + sensacionTermica);
	}
	
	public static void dosDieciocho() {
		System.out.println("   a\t   b\tPunto medio");
		double a=0, b=1, c=2, d=3, e=4, f=5, g=6, h=7, i=9, j=10, k=11, l=12;
		System.out.println("(" + df0.format(a) + ", " + df0.format(a) + ")\t" + "(" + df0.format(c) + ", " + df0.format(b) + ")\t" + "(" + (((c-a)/2) + a) + ", " + (((b-a)/2) + a) + ")");
		System.out.println("(" + df0.format(b) + ", " + df0.format(e) + ")\t" + "(" + df0.format(e) + ", " + df0.format(c) + ")\t" + "(" + (((e-b)/2) + b) + ", " + (((c-e)/2) + e) + ")");
		System.out.println("(" + df0.format(c) + ", " + df0.format(h) + ")\t" + "(" + df0.format(g) + ", " + df0.format(d) + ")\t" + "(" + (((g-c)/2) + c) + ", " + (((d-h)/2) + h) + ")");
		System.out.println("(" + df0.format(d) + ", " + df0.format(i) + ")\t" + "(" + df0.format(j) + ", " + df0.format(f) + ")\t" + "(" + (((j-d)/2) + d) + ", " + (((f-i)/2) + i) + ")");
		System.out.println("(" + df0.format(e) + ", " + df0.format(k) + ")\t" + "(" + df0.format(l) + ", " + df0.format(h) + ")\t" + "(" + (((l-e)/2) + e) + ", " + (((h-k)/2) + k) + ")");
	}
	
	public static void dosDiecinueve() {
		System.out.print("Ingresa las coordenadas de tres puntos cardinales separados "
				+ "por espacios de la siguiente manera x1 y1 x2 y2 x3 y3: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double lado2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double lado3 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double s = (lado1 + lado2 + lado3) / 2;
		double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
		System.out.println("El area del triangulo es de " + df.format(area));
	}
	
	public static void dosVeinte() {
		System.out.print("Ingresa el balance y la taza de intereses (e.g., 3 con 3%) -> (3 3): ");
		double balance = scanner.nextDouble();
		double taza = scanner.nextDouble();
		double interes = balance * (taza / 1200);
		System.out.println("Los intereses son de " + df3.format(interes));
	}
	
	public static void dosVeintiuno() {
		System.out.print("Ingresa el monto de inversion: ");
		double inversion = scanner.nextDouble();
		System.out.print("Ingresa el ratio de interes anual en porcentaje: ");
		double interes = scanner.nextDouble();
		System.out.print("Ingresa el numero de años: ");
		int anios = scanner.nextInt();
		double valores = inversion * (Math.pow((1 + (interes* 0.00083)), (anios*12)));
		System.out.print("Los futuros valores seran de $" + df3.format(valores));
	}
	
	public static void dosVeintidos() {
		System.out.print("Igresa una cantidad entera: ");
		int cantidad = scanner.nextInt();
		int dolar = cantidad /100;
		int centavo = cantidad % 100;
		System.out.println("Dolares: " + dolar + "\nCentavos: " + centavo);
	}
	
	public static void dosVeintitres() {
		System.out.print("Ingrasa la distancia conducida: ");
		double distancia = scanner.nextDouble();
		System.out.print("Ingresa las cantidad de millas por galon: ");
		double millasGalon = scanner.nextDouble();
		System.out.print("Ingresa el precio del galon: ");
		double precioGalon = scanner.nextDouble();
		double costoCamino = (distancia / millasGalon) * precioGalon;
		System.out.println("El costo del camino fue de $" + df.format(costoCamino));
	}
}
