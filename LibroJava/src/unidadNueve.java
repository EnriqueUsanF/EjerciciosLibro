import java.text.DecimalFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

import clasesUnidadNueve.Account;
import clasesUnidadNueve.Fan;
import clasesUnidadNueve.LinearEquation;
import clasesUnidadNueve.Location;
import clasesUnidadNueve.QuadraticEquation;
import clasesUnidadNueve.Rectangle;
import clasesUnidadNueve.RegularPolygon;
import clasesUnidadNueve.Stock;
import clasesUnidadNueve.StopWatch;

public class unidadNueve {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void uno() {
		Rectangle rectangulo1 = new Rectangle(4, 40);
		Rectangle rectangulo2 = new Rectangle(3.5, 35.9);
		System.out.println(" Rectangulo 1");
		System.out.println("Ancho:\t\t" + df.format(rectangulo1.width));
		System.out.println("Alto:\t\t" + df.format(rectangulo1.height));
		System.out.println("Area:\t\t" + df.format(rectangulo1.getArea()));
		System.out.println("Perimetro:\t" + df.format(rectangulo1.getPerimeter()));
		System.out.println("\n Rectangulo 2");
		System.out.println("Ancho:\t\t" + df.format(rectangulo2.width));
		System.out.println("Alto:\t\t" + df.format(rectangulo2.height));
		System.out.println("Area:\t\t" + df.format(rectangulo2.getArea()));
		System.out.println("Perimetro:\t" + df.format(rectangulo2.getPerimeter()));
	}

	public static void dos() {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		System.out.println("Nombre:\t" + stock.name);
		System.out.println("Abreviacion:\t" + stock.symbol);
		System.out.println("Porcentaje de cambio: " + df.format(stock.getChangePercent()));
	}

	public static void tres() {
		Date fecha = new Date();
		for (long tiempo = inicio; tiempo < termino; tiempo *= 10) {
			fecha.setTime(tiempo);
			System.out.println(fecha.toString());
		}
	}

	static long inicio = 10000;
	static long termino = 100000000000l;

	public static void cuatro() {
		Random random = new Random(numAle);
		for (int i = 0; i < 50; i++) {
			if (i % 10 == 0)
				System.out.println();
			System.out.print(random.nextInt(rango) + " ");
		}
	}

	static int numAle = 1000;
	static int rango = 100;

	public static void cinco() {
		GregorianCalendar calendarioG = new GregorianCalendar();
		int anio = calendarioG.get(GregorianCalendar.YEAR);
		int mes = calendarioG.get(GregorianCalendar.MONTH);
		int dia = calendarioG.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Fecha actual");
		System.out.println("Año: " + anio + ", Mes: " + mes + ", Dia: " + dia);
		calendarioG.setTimeInMillis(1234567898765L);
		anio = calendarioG.get(GregorianCalendar.YEAR);
		mes = calendarioG.get(GregorianCalendar.MONTH);
		dia = calendarioG.get(GregorianCalendar.DAY_OF_MONTH);

		System.out.println("Año: " + anio + ", Mes: " + mes + ", Dia: " + dia);
	}

	public static void seis() {
		int[] pruebas = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			pruebas[i] = random.nextInt(10000);
		}
		StopWatch cronometro = new StopWatch();
		cronometro.start();
		System.out.println("Tiempo de inicio: " + cronometro.getStratTime() + " ms");
		ordenarPruebas(pruebas);
		cronometro.stop();
		System.out.println("Tiempo de Termino: " + cronometro.getEndTime() + " ms");
		System.out.println("Tiempo de ejecucion de ordenamiento: " + cronometro.getElapsedTime() + " ms");
	}

	public static void ordenarPruebas(int[] pruebas) {
		for (int n = 0; n < pruebas.length - 1; n++) {
			int min = pruebas[n];
			int minIdx = n;
			for (int k = n + 1; k < pruebas.length; k++) {
				if (pruebas[k] < min) {
					min = pruebas[k];
					minIdx = k;
				}
			}
			if (minIdx != n) {
				pruebas[minIdx] = pruebas[n];
				pruebas[n] = min;
			}
		}
	}

	public static void siete() {
		Account cuenta = new Account(1122, 20000);
		cuenta.setAnnualInterestRate(4.5);
		cuenta.withdraw(2500);
		cuenta.deposit(3000);
		System.out.println("Balance: " + cuenta.getBalance());
		System.out.println("Monto mensual: " + df.format(cuenta.getMonthlyInterest()));
		System.out.println("Fecha de creacion: " + cuenta.getDateCreated());
	}

	public static void ocho() {
		Fan ventilador1 = new Fan();
		Fan ventilador2 = new Fan();
		ventilador1.setSpeed(3);
		ventilador1.setRadius(10);
		ventilador1.setColor("Amarillo");
		ventilador1.setOn(true);
		ventilador2.setSpeed(2);
		ventilador2.setRadius(5);
		ventilador2.setColor("Azul");
		ventilador2.setOn(false);
		System.out.println("Ventilador 1:\n" + ventilador1.toString());
		System.out.println("Ventilador 2:\n" + ventilador2.toString());
	}

	public static void nueve() {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6, 4);
		RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("El preimetro del primer poligono es " + df.format(p1.getPerimeter()) + " y su area es de "
				+ df.format(p1.getArea()));
		System.out.println("El preimetro del segundo poligono es " + df.format(p2.getPerimeter()) + " y su area es de "
				+ df.format(p2.getArea()));
		System.out.println("El preimetro del tercer poligono es " + df.format(p3.getPerimeter()) + " y su area es de "
				+ df.format(p3.getArea()));
	}

	public static void diez() {
		System.out.print("Ingresa 'a', 'b', y 'c': ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		QuadraticEquation ecuacion = new QuadraticEquation(a, b, c);
		double d = ecuacion.getDiscriminant();
		System.out.println("El valor del discriminante es: " + df.format(d));

		if (d > 0) {
			System.out.println("Sus raices son: ");
			System.out.println(df.format(ecuacion.getRoot1()));
			System.out.println(df.format(ecuacion.getRoot2()));
		} else if (d == 0) {
			System.out.println("Su unica raiz es: ");
			System.out.println(ecuacion.getRoot1());
		} else {
			System.out.println("La ecuacion no tiene raices");
		}
	}

	public static void once() {
		double a, b, c, d, e, f;
		System.out.print("Ingresa 'a', 'b', 'c', 'd', 'e', y 'f': ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		LinearEquation ecuacion = new LinearEquation(a, b, c, d, e, f);
		if (ecuacion.isSolvable()) {
			System.out.println("x = " + ecuacion.getX());
			System.out.println("y = " + ecuacion.getY());
		} else {
			System.out.println("La ecuacion no tiene solucion");
		}
	}

	public static void doce() {
		System.out.print("Ingresa los siguientes puntos(x1, y1, x2, y2, x3, y3, x4, y4): ");
		double[] valores = new double[8];
		for (int i = 0; i < 8; i++) {
			valores[i] = sc.nextDouble();
		}
		double a = valores[1] - valores[3];
		double b = -(valores[0] - valores[2]);
		double c = valores[5] - valores[7];
		double d = -(valores[4] - valores[6]);
		double e = (valores[1] - valores[3]) * valores[0] - (valores[0] - valores[2]) * valores[1];
		double f = (valores[5] - valores[7]) * valores[4] - (valores[4] - valores[6]) * valores[5];
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		if (linearEquation.isSolvable()) {
			System.out.printf("El punto de interseccion es (" + linearEquation.getX() 
			+ ", " + linearEquation.getY() + ")");

		} else {
			System.out.println("La ecuacion no tiene solucion");
		}
	}

	public static void trece() {
		System.out.print("Ingresa el numero de filas y columnas para el arreglo: ");
        int numFilas = sc.nextInt();
        int numColumnas = sc.nextInt();
        double[][] valores = new double[numFilas][numColumnas];
        System.out.println("Ingresa los valores: ");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
            	valores[i][j] = sc.nextDouble();
            }
        }
        Location coordenadas = Location.locateLargest(valores);
        System.out.println("El valor mas grande es: " + coordenadas.maxValue + " en (" + coordenadas.row + ", " + coordenadas.column + ")");
	}
}
