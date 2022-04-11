import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

import clasesUnidadDiez.BMI;
import clasesUnidadDiez.Circle2D;
import clasesUnidadDiez.Course;
import clasesUnidadDiez.MyDate;
import clasesUnidadDiez.MyInteger;
import clasesUnidadDiez.MyPoint;
import clasesUnidadDiez.MyRectangle2D;
import clasesUnidadDiez.Queue;
import clasesUnidadDiez.StackOfIntegers;
import clasesUnidadDiez.Tax;
import clasesUnidadDiez.Time;
import clasesUnidadDiez.Triangle2D;
import clasesUnidadNueve.Account;

public class unidadDiez {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void uno() {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		Time t3 = new Time(5, 23, 55);
		System.out.println("El resultado del constructor sin inicializar " + t1.getHour() + ":" + t1.getMin() + ":"
				+ t1.getSec() + ".");
		System.out.println("El resultado del constructor inizializado con un valor " + t2.getHour() + ":" + t2.getMin()
				+ ":" + t2.getSec() + ".");
		System.out.println("El resultado del constructor inizializado con tres valores " + t3.getHour() + ":"
				+ t3.getMin() + ":" + t3.getSec() + ".");
	}

	public static void dos() {
		BMI bmi1 = new BMI("Ejemplar1", 21, 70, 70, 10);
		System.out.println(bmi1.getStatus());
	}

	public static void tres() {
		MyInteger test = new MyInteger(581);
		MyInteger test2 = new MyInteger(42);
		String txt = "";
		System.out.println("Test numero 1");
		if (test.isEven()) {
			txt += "Par";
		} else if (test.isOdd()) {
			txt += "Impar";
		} else if (test.isPrime()) {
			txt += "Primo";
		}
		System.out.println("Test numero 2");
		String txt2 = "";
		if (test2.isEven()) {
			txt2 += "Par";
		} else if (test2.isOdd()) {
			txt2 += "Impar";
		} else if (test2.isPrime()) {
			txt2 += "Primo";
		}
		System.out.println("Test numero 3");
		String txt3 = "";
		int j = sc.nextInt();
		if (test.equals(j)) {
			txt3 += "igual";
		} else if (!test.equals(j)) {
			txt3 += "no son iguales";
		}
		System.out.println("Test numero 4");
		char[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Del arreglo de caracteres 1 2 3 4 5 6 7 8 9"
				+ " se realizara la suma cambiando su valor a enteros: " + MyInteger.parseInt(testArray));
		System.out.println("Test numero 5");
		System.out.println("Ingresa una cadena para que sea convetida a entero: ");
		String testString = sc.next();
		System.out.println("La cadena ahora es un entero " + MyInteger.parseInt(testString));
	}

	public static void cuatro() {
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println("La distancia de p1 y p2 es de " + df.format(p2.distance(p1)));
	}

	public static void cinco() {
		System.out.print("Ingresa un entero para encontrar sus factores mas pequeños: ");
		int n = sc.nextInt();
		StackOfIntegers pila = new StackOfIntegers();
		StackOfIntegers pilaVolteada = new StackOfIntegers();
		for (int i = 2; n != 1; i++) {
			if (n % i == 0) {
				pila.push(i);
				n /= i;
				i = 1;
			}
		}
		while (!pila.empty()) {
			pilaVolteada.push(pila.pop());
		}
		while (pilaVolteada.getSize() > 1) {
			System.out.print(pilaVolteada.pop() + ", ");
		}
		System.out.print(pilaVolteada.pop());
	}

	public static void seis() {
		StackOfIntegers pila = new StackOfIntegers();
		StackOfIntegers pilaVolteada = new StackOfIntegers();
		int n = 120;
		for (int i = 2; i < n; i++) {
			if (checkPrime(i)) {
				pila.push(i);
			}
		}
		System.out.println("Todos los valores primos menores a 120 en orden invertido: ");
		while (pila.getSize() > 1) {
			System.out.print(pila.pop() + ", ");
		}
		System.out.print(pila.pop());
	}

	static boolean checkPrime(int num) {
		boolean prime = true;
		for (int f = 2; f * f <= num; f++) {
			if (num % f == 0) {
				prime = false;
				break;
			}
		}
		return prime;

	}

	public static void siete() {
		Account[] cuentas = new Account[10];
		balanceInicial(cuentas);
		do {
			System.out.print("Ingresa un ID: ");
			int id = sc.nextInt();

			if (idValida(id, cuentas)) {
				int opcion;
				do {
					opcion = mostratMenu(sc);
					if (verificaTransaccion(opcion)) {
						ejecutaTransaccion(opcion, cuentas, id, sc);
					}
				} while (opcion != 4);
			}
		} while (true);
	}

	public static void balanceInicial(Account[] a) {
		int balanceInicial = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, balanceInicial);
		}
	}

	public static boolean verificaTransaccion(int opcion) {
		return opcion > 0 && opcion < 4;
	}

	public static boolean idValida(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getID())
				return true;
		}
		return false;
	}

	public static int mostratMenu(Scanner sc) {
		System.out.print("\nMenu\n1: mostrar balance\n2: retiro" + "\n3: deposito\n4: salir\nIngresa una opcion: ");
		return sc.nextInt();
	}

	public static void ejecutaTransaccion(int c, Account[] a, int id, Scanner sc) {
		switch (c) {
		case 1:
			System.out.println("El balance es  " + a[id].getBalance());
			break;
		case 2:
			System.out.print("Ingresa el monto a retirar: ");
			a[id].withdraw(sc.nextDouble());
			break;
		case 3:
			System.out.print("ingresa el monto a depositar: ");
			a[id].deposit(sc.nextDouble());
		}
	}

	public static void ocho() {
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax();
		double[] ratios2001 = { 15, 27.5, 30.5, 35.5, 39.1 };
		tax2001.setRates(ratios2001);

		int[][] brackets2001 = { { 27050, 65550, 136750, 297350 }, { 45200, 109250, 166500, 297350 },
				{ 22600, 54625, 83250, 148675 }, { 36250, 93650, 151650, 297350 } };
		tax2001.setBrackets(brackets2001);
		final double desde = 50000;
		final double hasta = 60000;
		final double intervalos = 1000;
		System.out.println("\n2001 tax tables for taxable income from $50,000 to $60,000");
		imprimeTabla(tax2001, desde, hasta, intervalos);
		System.out.println("\n2009 tax tables for taxable income from $50,000 to $60,000");
		imprimeTabla(tax2009, desde, hasta, intervalos);
	}

	public static void imprimeTabla(Tax tax, double from, double to, double interval) {
		System.out.println("---------------------------------------------------------------------\n"
				+ "Taxable       Single      Married Joint       Married        Head of\n"
				+ "Income                    or Qualifying       Separate       a House\n"
				+ "                          Widow(er)\n"
				+ "---------------------------------------------------------------------");
		for (double taxableIncome = from; taxableIncome <= to; taxableIncome += interval) {
			tax.setTaxableIncome(taxableIncome);
			System.out.printf("%-13.0f", taxableIncome);
			tax.setFilingStatus(tax.SINGLE_FILER);
			System.out.printf("%8.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%15.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_SEPARATELY);
			System.out.printf("%18.2f", tax.getTax());
			tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%15.2f\n", tax.getTax());
		}
	}

	public static void nueve() {
		Course curso = new Course("POO");
		curso.addStudent("Esteban");
		curso.addStudent("Ricardo");
		curso.addStudent("Julian");
		curso.dropStudent("Julian");

		System.out.println("Los alumnos son en el curso de " + curso.getCourseName() + " son:");
		String[] students = curso.getStudents();
		for (int i = 0; i < curso.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
	}

	public static void diez() {
		Queue cola = new Queue();
		for (int i = 1; i <= 20; i++) {
			cola.enqueue(i);
		}
		while (!cola.empty()) {
			System.out.print(cola.dequeue() + " ");
		}
	}

	public static void once() {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area del circulo: " + c1.getArea());
		System.out.println("Perimetro del circulo: " + c1.getPerimeter());
		System.out.println("Dentro del circulo esta el punto (3, 3)? " + c1.contains(3, 3));
		System.out.println("Dentro del circulo se encuentra el circulo con centro en (4, 5) con radio de 10.5? "
				+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
				"Se superpone el circulo con centro (3, 5) con radio de 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

	public static void doce() {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("Area del triangulo: " + t1.getArea());
		System.out.println("Perimetro del triangulo: " + t1.getPerimeter());
		System.out.println("Dentro del triangulo se encuentra el punto (3, 3)? " + t1.contains(new MyPoint(3, 3)));
		System.out.println(
				"Dentro del triangulo se encuentra el triangulo formado por los puntos (2.9, 2), (4, 1), (1, 3.4)?"
						+ t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.println("El triangulo formado por los puntos (2, 5.5), (4, -3), (2, 6.5) se superpone al primero? "
				+ t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
	}

	public static void trece() {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("Area del rectangulo: " + r1.getArea());
		System.out.println("Perimetro del rectangulo: " + r1.getPerimeter());
		System.out.println("Dentro del rectangulo se encuentra el punto (3, 3)? " + r1.contains(3, 3));
		System.out.println("Dentro del triangulo se encuentra el triangulo formado por los puntos(4, 5, 10.5, 3.2)?"
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("El triangulo formado por los puntos (3, 5, 2.3, 5.4) se superpone al primero? "
				+ r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}

	public static void catorce() {
		MyDate fecha1 = new MyDate();
		MyDate fecha2 = new MyDate(34355555133101L);
		MyDate fecha3 = new MyDate(561555550000L);
		System.out.println(
				"Primer fecha:\naño=" + fecha1.getYear() + " mes=" + fecha1.getMonth() + " dia=" + fecha1.getDay());
		System.out.println(
				"Segunda fecha:\naño=" + fecha2.getYear() + " mes=" + fecha2.getMonth() + " dia=" + fecha2.getDay());
		System.out.println(
				"Tercer fecha:\naño=" + fecha3.getYear() + " mes=" + fecha3.getMonth() + " dia=" + fecha3.getDay());
	}

	public static void quince() {
		System.out.print("Ingresa 5 puntos:");
		double[][] puntos = new double[5][2];
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();
			}
		}
		MyRectangle2D r = getRectangle(puntos);
		System.out.print("\nEl centro del rectangulo es (" + r.getX() + "," + r.getY() + ")" + "," + " ancho: "
				+ r.getWidth() + "," + " alto: " + r.getHeight() + ")");
	}

	public static MyRectangle2D getRectangle(double[][] puntos) {
		double[] puntoBajo = puntoBajo(puntos);
		double[] puntoAlto = puntoAlto(puntos);
		double[] puntoIzq = puntoIzquierda(puntos);
		double[] puntoDer = PuntoDerecha(puntos);
		double alto = Math.abs(puntoAlto[1]) - Math.abs(puntoBajo[1]);
		double ancho = Math.abs(puntoDer[0]) - Math.abs(puntoIzq[0]);
		MyRectangle2D res = new MyRectangle2D();
		res.setHeight(alto);
		res.setWidth(ancho);
		double centroX = puntoIzq[0] + (ancho / 2);
		double centroY = puntoBajo[1] + (alto / 2);
		res.setX(centroX);
		res.setY(centroY);
		return res;
	}

	static double[] puntoBajo(double[][] puntos) {
		double[] puntosBajos = puntos[0];
		for (int n = 1; n < puntos.length; n++) {
			puntosBajos = puntos[n][1] < puntosBajos[1] ? puntos[n] : puntosBajos;
		}
		return puntosBajos;
	}

	static double[] puntoAlto(double[][] puntos) {
		double[] puntosAltos = puntos[0];
		for (int n = 1; n < puntos.length; n++) {
			puntosAltos = puntos[n][1] > puntosAltos[1] ? puntos[n] : puntosAltos;
		}
		return puntosAltos;
	}

	static double[] PuntoDerecha(double[][] puntos) {
		double[] puntosDerecha = puntos[0];
		for (int n = 1; n < puntos.length; n++) {
			puntosDerecha = puntos[n][0] > puntosDerecha[0] ? puntos[n] : puntosDerecha;
		}
		return puntosDerecha;
	}

	static double[] puntoIzquierda(double[][] puntos) {
		double[] puntosIzq = puntos[0];
		for (int n = 1; n < puntos.length; n++) {
			puntosIzq = puntos[n][0] < puntosIzq[0] ? puntos[n] : puntosIzq;
		}
		return puntosIzq;
	}

	public static void dieciseis() {
		int count = 0;
		BigInteger n = new BigInteger("10000000000000000000000000000000000000000000000000");
		BigInteger z = new BigInteger("0");
		while (count < 10) {
			if (z.compareTo(n.remainder(new BigInteger("2"))) == 0
					|| z.compareTo(n.remainder(new BigInteger("3"))) == 0) {
				System.out.println(n);
				count++;
			}
			n = n.add(new BigInteger("1"));
		}
	}

	public static void diecisiete() {
		BigInteger i = new BigInteger(Long.MAX_VALUE + "");
		BigInteger fin = i.add(new BigInteger("10"));
		for (i = new BigInteger(Long.MAX_VALUE + ""); i.compareTo(fin) <= 0; i = i.add(new BigInteger("1"))) {
			System.out.println(i.multiply(i));
		}
	}

	public static void dieciocho() {
		final BigInteger lowerBound = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger[] primeBigIntegers = new BigInteger[5];
		BigInteger testNum = lowerBound;
		int idx = 0;
		while (idx < 5) {
			testNum = testNum.nextProbablePrime();
			primeBigIntegers[idx] = testNum;
			idx++;
		}
		for (int i = 0; i < primeBigIntegers.length; i++) {
			System.out.println(primeBigIntegers[i]);
		}

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
}
