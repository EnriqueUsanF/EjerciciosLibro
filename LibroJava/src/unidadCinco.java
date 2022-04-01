import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class unidadCinco {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void uno() {
		int puntaje = 10;
		while (puntaje != -1) {
			System.out.print("Ingresa tu puntuacion:");
			puntaje = sc.nextInt();
			if (puntaje > 60) {
				System.out.println("Pasaste");
			} else
				System.out.println("Fallaste");
		}
	}

	public static void dos() {
		final int NUMBER_OF_QUESTIONS = 10; // Number of questions
		int correctCount = 0; // Count the nubmer of correct answers
		int count = 0; // Count the number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; // output string is initially empty
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
			// 1. Generate two random single-digit integers
			int number1 = 1 + (int) (Math.random() * 15);
			int number2 = 1 + (int) (Math.random() * 15);

			// 2. Prompt the student to answer "What is number1 + number2?"
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			// 3. Grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct!");
				correctCount++; // Increase the correct answer count
			} else
				System.out.println(
						"Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));

			// Increase the question count
			count++;

			output += "\n" + number1 + "+" + number2 + "=" + answer
					+ ((number1 + number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(
				"Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}

	public static void tres() {
		System.out.println("celsius\tfarenheit");
		double j;
		for (int i = 0; i <= 100; i += 2) {
			j = i;
			j = (j * 9 / 5) + 32;
			System.out.println(i + "\t" + j);
		}
	}

	public static void cuatro() {
		System.out.println("Pulgada\tCentimetros");
		double j;
		for (int i = 1; i <= 10; i++) {
			j = i;
			j = j * 2.54;
			System.out.println(i + "\t" + j);
		}
	}

	public static void cinco() {
		System.out.println("celsius\tfarenheit\t|\tfarenheit\tcelsius");
		double j, y;
		for (int i = 0, x = 20; i <= 100; i += 2, x += 5) {
			j = i;
			j = (j * 9 / 5) + 32;
			y = x;
			y = (y - 32) * 5 / 9;
			System.out.println(i + "\t" + j + "\t\t|\t" + x + "\t\t" + df.format(y));
		}
	}

	public static void seis() {
		System.out.println("pyong\tmetros\t\t|\tmetros\tpyong");
		double j, y;
		for (int i = 10, x = 30; i <= 80; i += 5, x += 5) {
			j = i;
			j = j * 3.305;
			y = x;
			y = y / 3.305;
			System.out.println(i + "\t" + df.format(j) + "\t\t|\t" + x + "\t" + df.format(y));
		}
	}

	public static void siete() {
		int costoTotal = 0; // Accumulate total cost of four years tution
		int inscripcion = 10000;
		int inscripcionDiezAños = 0;

		for (int year = 1; year <= 14; year++) {
			inscripcion += (inscripcion * 0.06);
			if (year > 10)
				costoTotal += inscripcion;

			if (year == 10)
				inscripcionDiezAños = inscripcion;
		}

		System.out.println("Inscripcion de los primeros 10 años: $" + inscripcionDiezAños);

		System.out.println("Total de costo de inscripcion de los cuatro años" + " despues de los primeros diez años: $"
				+ costoTotal);
	}

	public static void ocho() {
		int mayorPuntaje = 0;
		String nombreMayorPuntaje = "";

		System.out.print("Ingresa el numero de estudiantes: ");
		int numeroEstudiantes = sc.nextInt();

		System.out.println("Ingresa el nombre y puntaje de cada estudiante:");
		for (int i = 0; i < numeroEstudiantes; i++) {
			System.out.print("Estudiante: " + (i + 1) + "\n   Nombre: ");
			String nombre = sc.next();
			System.out.print("   Puntaje: ");
			int puntaje = sc.nextInt();

			if (puntaje > mayorPuntaje) {
				mayorPuntaje = puntaje;
				nombreMayorPuntaje = nombre;
			}

		}
		System.out.println("El estudiante con mayor puntaje es: " + nombreMayorPuntaje);
	}

	public static void nueve() {
		System.out.print("Ingresa el numero de estudiantes: ");
		int numeroEstudiantes = sc.nextInt();

		int puntaje, peor = 100, segundoPeor = 100;
		String nombre = "", peor1 = "", peor2 = "";

		System.out.println("Ingresa el nombre y puntaje de cada estudiante:");
		for (int i = 0; i < numeroEstudiantes; i++) {
			System.out.print("Estudiante: " + (i + 1) + "\n   Nombre: ");
			nombre = sc.next();
			System.out.print("   Puntaje: ");
			puntaje = sc.nextInt();

			if (i == 100) {
				peor = puntaje;
				peor1 = nombre;
			} else if (i == 100 && puntaje < peor) {
				segundoPeor = peor;
				peor = puntaje;
				peor2 = peor1;
				peor1 = nombre;
			} else if (i == 99) {
				segundoPeor = puntaje;
				peor2 = nombre;
			} else if (i < 99 && puntaje < peor && puntaje < segundoPeor) {
				segundoPeor = peor;
				peor2 = peor1;
				peor = puntaje;
				peor1 = nombre;
			} else if (i < 99 && puntaje < segundoPeor) {
				peor2 = nombre;
				segundoPeor = puntaje;
			}
		}

		System.out.println(
				"El alumno con peor puntaje es: " + peor1 + "\nEl alumno con el segundo peor puntaje es: " + peor2);
	}

	public static void diez() {
		for (int i = 100; i <= 1000; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void once() {
		for (int i = 100; i <= 200; i++) {
			if (i % 3 == 0 && i % 4 != 0 || i % 3 != 0 && i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void doce() {
		int n = 0;
		while (Math.pow(n, 2) < 12000) {
			n++;
		}
		System.out.println("El entero más pequeño n cuando n^2 es mayor que 12,000: " + n);
	}

	public static void trece() {
		int n = 0;
		while (Math.pow(n + 1, 2) < 12000) {
			n++;
		}

		System.out.println("El entero más grande n cuando n^2 es menor que 12,000: " + n);
	}

	public static void catorce() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		// Make gcd to be the minimum of n1 and n2
		int gcd = n1 < n2 ? n1 : n2;

		// Find the greatest common divisor
		while (n1 % gcd != 0 || n2 % gcd != 0) {
			gcd--;
		}

		// Display result
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}

	public static void quince() {
		int contador = 0;
		for (int i = 33; i <= 126; i++) {
			contador++;
			if (contador % 10 == 0)
				System.out.println((char) i);
			else
				System.out.print((char) i + " ");
		}
	}

	public static void dieciseis() {
		System.out.print("Ingresa un entero: ");
		int numero = sc.nextInt();
		int i = 2;
		while (numero / i != 1) {
			if (numero % i == 0) {
				System.out.print(i + ", ");
				numero /= i;
			} else
				i++;
		}
		System.out.println(numero + ".");
	}

	public static void diecisiete() {
		System.out.print("Ingresa el numero de lineas: ");
		int numeroLineas = sc.nextInt();
		int flag = numeroLineas;
		for (int r = numeroLineas; r >= 1; r--) {
			System.out.print(flag + " ");
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
			flag--;
		}
	}

	public static void dieciocho() {
		a();
		b();
		c();
		d();
	}

	public static void a() {
		System.out.println("Pattern A");
		for (int lineas = 1; lineas <= 6; lineas++) {
			for (int cols = 1; cols <= lineas; cols++) {
				System.out.print(cols + " ");
			}
			System.out.println();
		}
	}

	public static void b() {
		System.out.println("Pattern B");
		for (int r = 6; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

	public static void c() {
		System.out.println("Pattern C");
		for (int lineas = 1; lineas <= 6; lineas++) {
			for (int s = 6 - lineas; s >= 1; s--) {
				System.out.print("  ");
			}
			for (int col = lineas; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	public static void d() {
		System.out.println("Pattern D");
		for (int lineas = 0; lineas < 6; lineas++) {
			for (int ws = 0; ws < lineas; ws++) {
				System.out.print("  ");
			}
			for (int col = 0; col < 6 - lineas; col++) {
				System.out.print((col + 1) + " ");
			}
			System.out.println();
		}
	}

	public static void diecinueve() {
		int der = 0, ep = 7;
		for (int linea = 1; linea <= 128; linea += linea) {
			for (int sp = 0; sp < ep; sp++) {
				System.out.print("    ");
			}
			for (int l = 1; l <= linea; l += l) {
				System.out.printf("%4d", (l));
			}
			for (int r = der; r > 0; r /= 2) {
				System.out.printf("%4d", (r));
			}
			System.out.println();
			ep--;
			der = linea;
		}
	}

	public static void veinte() {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers

		System.out.println("The prime numbers between 2 and 1,000, inclusive are \n");

		// Repeatedly find prime numbers
		for (int number = 2; number <= 1000; number++) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}

			// Display the prime number and increase the count
			if (isPrime) {
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Display the number and advance to the new line
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
		}
	}

	public static void veintiuno() {
		System.out.print("Prestamo base: ");
		double montoPrestamo = sc.nextDouble();
		System.out.print("Numero de años: ");
		int numeroAnios = sc.nextInt();

		System.out.println("Ratio de interes\tPago Mensual\tPago Total");

		for (double i = 5.0; i <= 10; i += 0.250) {
			System.out.printf(df3.format(i));
			System.out.print("%");
			double ratioMensual = i / 1200;
			double pagoMensual = montoPrestamo * ratioMensual / (1 - 1 / Math.pow(1 + ratioMensual, numeroAnios * 12));
			System.out.print("\t\t\t" + df.format(pagoMensual));
			System.out.println("\t\t" + df.format((pagoMensual * 12) * numeroAnios));
		}
	}

	public static void veintidos() {
		System.out.print("Prestamo: ");
		double montoPrestamo = sc.nextDouble();
		System.out.print("Años: ");
		int anios = sc.nextInt();
		System.out.print("Interes anual: ");
		double ratioAnual = sc.nextDouble();

		double ratioMensual = ratioAnual / 1200;

		double pagoMensual = montoPrestamo * ratioMensual / (1 - 1 / Math.pow(1 + ratioMensual, anios * 12));

		System.out.println("Pago Mensual: " + df.format(pagoMensual));

		System.out.println("Total a pagar: " + df.format((pagoMensual * 12) * anios));

		double balance = montoPrestamo, principal, interes;
		System.out.println("#Pago     interes     Principal     Balance");
		for (int i = 1; i <= anios * 12; i++) {
			interes = ratioMensual * balance;
			principal = pagoMensual - interes;
			balance = balance - principal;
			System.out.println(
					df.format(i) + "\t" + df.format(interes) + "\t" + df.format(principal) + "\t" + df.format(balance));
		}
	}

	public static void veintitres() {
		double sumaID = 0.0;
		double sumaDI = 0.0;
		for (double i = 1.0; i <= 50000.0; i++) {
			sumaID += 1 / i;
		}
		System.out.println("Suma de izquierda a derecha: " + sumaID);

		for (double i = 50000.0; i >= 1.0; i--) {
			sumaDI += 1 / i;
		}
		System.out.println("Suma de derecha a izquierda: " + sumaDI);

		System.out.println("Suma de derecha a izquierda - " + "Suma de izquierda a derecha: " + (sumaDI - sumaID));
	}

	public static void vienticuatro() {
		double sum = 0.0;
		for (double n = 1.0; n <= 97.0; n += 2) {
			sum += n / (n + 2);
		}
		System.out.println("Suma de la serie: " + sum);
	}

	public static void veinticinco() {
		double sum = 0;
		double valor = 10000.0;
		for (double d = 1; d <= (2 * valor - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d;
		}
		double pi = 4 * sum;

		System.out.println("Valor de PI cuando i = 10000: " + pi);

		sum = 0;
		valor = 20000.0;
		for (double d = 1; d <= (2 * valor - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d;
		}
		pi = 4 * sum;

		System.out.println("Valor de PI cuando i = 20000: " + pi);

		sum = 0;
		valor = 100000.0;
		for (double d = 1; d <= (2 * valor - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d;
		}
		pi = 4 * sum;

		System.out.println("Valor de PI cuando i = 100000: " + pi);
	}

	public static void veintiseis() {
		double e = 0.0, valor = 10000.0;
		for (double i = 1; i <= valor; i++) {
			double denominador = i;
			for (double k = i - 1; k >= 1; k--) {
				denominador *= k;
			}
			e += 1 / denominador;
		}
		System.out.println("Cuando i = 10000: " + e);
		e = 0.0;
		valor = 20000.0;
		for (double i = 1; i <= valor; i++) {
			double denominador = i;
			for (double k = i - 1; k >= 1; k--) {
				denominador *= k;
			}
			e += 1 / denominador;
		}
		System.out.println("Cuando i = 20000: " + e);
		e = 0.0;
		valor = 100000.0;
		for (double i = 1; i <= valor; i++) {
			double denominador = i;
			for (double k = i - 1; k >= 1; k--) {
				denominador *= k;
			}
			e += 1 / denominador;
		}
		System.out.println("Cuando i = 100000: " + e);
	}

	public static void veintisiete() {
		System.out.println("Los años bisiestos desde 2014 hasta 2114:");
		int count = 0;
		for (int anio = 2014; anio <= 2114; anio++) {
			if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
				count++;
				System.out.print(anio + (count % 10 == 0 ? "\n" : " "));
			}
		}
	}

	public static void veintiocho() {
		System.out.print("Ingresa el año: ");
		int anio = sc.nextInt();
		System.out.print("Ingresa el primer dia del año: ");
		int dia = sc.nextInt();

		String output;
		for (int mes = 1; mes <= 12; mes++) {
			output = "";
			switch (mes) {
			case 1:
				output += "January ";
				break;
			case 2:
				output += "February ";
				break;
			case 3:
				output += "March ";
				break;
			case 4:
				output += "April ";
				break;
			case 5:
				output += "May ";
				break;
			case 6:
				output += "June ";
				break;
			case 7:
				output += "July ";
				break;
			case 8:
				output += "August ";
				break;
			case 9:
				output += "September ";
				break;
			case 10:
				output += "October ";
				break;
			case 11:
				output += "November ";
				break;
			case 12:
				output += "December ";
				break;
			}
			output += "1, " + anio + " is ";
			dia %= 7;
			switch (dia) {
			case 0:
				System.out.println(output + "Sunday");
				break;
			case 1:
				System.out.println(output + "Monday");
				break;
			case 2:
				System.out.println(output + "Tuesday");
				break;
			case 3:
				System.out.println(output + "Wednesday");
				break;
			case 4:
				System.out.println(output + "Thursday");
				break;
			case 5:
				System.out.println(output + "Friday");
				break;
			case 6:
				System.out.println(output + "Saturday");
				break;
			}
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
				dia += 31;
			else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
				dia += 30;
			else {
				if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0))
					dia += 29;
				else
					dia += 28;
			}
		}
	}

	public static void veintinueve() {
		System.out.print("Enter year: ");
		int anio = sc.nextInt();
		System.out.print("Enter first day of the year: ");
		int dia = sc.nextInt();

		String mesImprimir;
		System.out.println();
		for (int mes = 1; mes <= 12; mes++) {
			mesImprimir = "";
			switch (mes) {
			case 1:
				mesImprimir += "January ";
				break;
			case 2:
				mesImprimir += "February ";
				break;
			case 3:
				mesImprimir += "March ";
				break;
			case 4:
				mesImprimir += "April ";
				break;
			case 5:
				mesImprimir += "May ";
				break;
			case 6:
				mesImprimir += "June ";
				break;
			case 7:
				mesImprimir += "July ";
				break;
			case 8:
				mesImprimir += "August ";
				break;
			case 9:
				mesImprimir += "September ";
				break;
			case 10:
				mesImprimir += "October ";
				break;
			case 11:
				mesImprimir += "November ";
				break;
			case 12:
				mesImprimir += "December ";
				break;
			}
			mesImprimir += anio + "";
			for (int b = 0; b < 23 - (mesImprimir.length() / 2); b++) {
				System.out.print(" ");
			}
			System.out.println(mesImprimir + "\n-----------------------------------------------\n "
					+ "Sun    Mon    Tue    Wed    Thu    Fri    Sat");
			dia %= 7;
			for (int b = 0; b <= dia * 7; b++) {
				System.out.print(" ");
			}
			int ultimoDia = 0;
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
				ultimoDia += 31;
			else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
				ultimoDia += 30;
			else {
				if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0))
					ultimoDia += 29;
				else
					ultimoDia += 28;
			}
			for (int d = 1; d <= ultimoDia; d++) {
				if (d < 10)
					System.out.print(" ");
				if (dia % 7 == 6)
					System.out.print(d + "\n ");
				else {
					System.out.print(d + "     ");
					if (d == ultimoDia)
						System.out.println();
				}
				dia++;

			}
			System.out.println();
		}
	}

	public static void treinta() {
		System.out.print("Ingresa un monto: ");
		double monto = sc.nextDouble();
		System.out.print("Ingresa la taza de interes anual: ");
		double ratioAnual = sc.nextDouble();
		System.out.print("Ingresa el numero de meses: ");
		int meses = sc.nextInt();
		double ratioMensual = ratioAnual / 1200;
		double valorCompuesto = 0;
		for (int m = 1; m <= meses; m++) {
			valorCompuesto = (monto + valorCompuesto) * (1 + ratioMensual);
		}

		System.out.println("Monto guardado en " + meses + " meses: " + df.format(valorCompuesto));
	}

	public static void treintayuno() {
		System.out.print("Ingresa el monto del primer deposito: ");
		double monto = sc.nextDouble();
		System.out.print("Ingrese el porcentaje de rendimiento anual: ");
		double porcentajeProduccion = sc.nextDouble();
		System.out.print("Numero de meses: ");
		int meses = sc.nextInt();

		System.out.println("Month\tCD Value");
		for (int m = 1; m <= meses; m++) {
			monto += monto * (porcentajeProduccion / 1200);
			System.out.println(df.format(m) + "\t" + df.format(monto));
		}
	}

	public static void treintaydos() {
		// Generate a lottery number
		int lotteryDigit1, lotteryDigit2;
		lotteryDigit1 = (int) (Math.random() * 10);

		do {
			lotteryDigit2 = (int) (Math.random() * 10);
		} while (lotteryDigit1 == lotteryDigit2);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two distinct digits): ");
		int guess = input.nextInt();

		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);

		// Check the guess
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}

	public static void treintaytres() {
		System.out.println("Los numeros perfectos por debajo de 10,000 son:");

		int sum;
		for (int i = 1; i < 10000; i++) {
			sum = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0)
					sum += k;
			}
			if (i == sum)
				System.out.println(i);
		}
	}

	public static void treintaycuatro() {
		Random aleatorio = new Random();
		int cpuWins = 0, playerWins = 0;
		for (int i = 0; i < 100; i++) {
			int valor1 = aleatorio.nextInt(3 + 1) + 1;
			valor1--;
			// System.out.println(valor1);
			System.out.print("piedra(0), papel(1), tijeras(2): ");
			int valor2 = sc.nextInt();
			if (valor2 == 0 && valor1 == 2 || valor2 == 1 && valor1 == 0 || valor2 == 2 && valor1 == 1) {
				System.out.println("Ganaste");
				playerWins++;
			} else if (valor1 == valor2) {
				System.out.println("Empate");
			} else {
				System.out.println("Perdiste");
				cpuWins++;
			}
			if (cpuWins == 3 || playerWins == 3) {
				break;
			}
		}

		if (cpuWins == 3) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Ganaste");
		}

	}

	public static void treintaycinco() {
		double suma = 0.0;
		for (double i = 1.0; i <= 1000.0; i++) {
			suma += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println("Suma total: " + suma);
	}

	public static void treintayseis() {
		System.out.print("Ingresa los primeros digitos del ISBN: ");
		String isbn1 = sc.next();
		char digito0 = isbn1.charAt(0);
		int digitoActual = 0, x = 9, suma = 0, isbn = Integer.parseInt(isbn1), res;

		if (digito0 == 0) {
			digitoActual = 0;
		} else {
			digitoActual = isbn % 10;
			isbn = isbn / 10;
		}

		for (int i = 0; i < 9; i++) {
			suma = suma + (digitoActual * x);
			isbn = isbn / 10;
			digitoActual = isbn % 10;
			x--;
		}
		res = suma % 11;
		res = res % 10;
		if (res != 0) {
			isbn1 += res;
		} else
			isbn1 += "X";
		System.out.println("El ISBN-10 es " + isbn1);
	}

	public static void treintaysiete() {
		System.out.print("Ingresa un valor decimal: ");
		int decimal = sc.nextInt();

		String binario = "";
		for (int i = decimal; i > 0; i /= 2) {
			binario = (i % 2) + binario;
		}
		System.out.println("El valor binario es " + binario);
	}

	public static void treintayocho() {
		System.out.print("Ingresa un valor decimal: ");
		int decimal = sc.nextInt();

		String octal = "";
		for (int i = decimal; i > 0; i /= 2) {
			octal = (i % 8) + octal;
		}
		System.out.println("El valor octal es " + octal);
	}

	public static void treintaynueve() {
		final double comisionBuscada = 30000;
		double montoVenta, comision = 0, balance;
		montoVenta = 0;
		do {
			balance = comision = 0;
			montoVenta += 0.01;
			if (montoVenta > 10000)
				comision += (balance = montoVenta - 10000) * 0.12;

			if (montoVenta > 5000)
				comision += (balance -= balance - 5000) * 0.10;

			if (montoVenta > 0)
				comision += balance * 0.08;
		} while (comision < comisionBuscada);

		System.out.println("Ventas mínimas para ganar $30,000: $" + df.format(montoVenta));
	}

	public static void cuarenta() {
		Random aleatorio = new Random();
		int volado = 0, cara = 0, cruz = 0;
		for (int i = 0; i < 2000000; i++) {
			volado = aleatorio.nextInt((2 - 1) + 1);
			if (volado == 1) {
				cara++;
			} else
				cruz++;
		}
		System.out.println("Numero de veces que salio cara: " + cara);
		System.out.println("Numero de veces que salio cruz: " + cruz);
	}

	public static void cuarentayuno() {
		System.out.print("Ingresa los numeros: ");
		int max = sc.nextInt();
		int count = 1;
		int num = 0;

		while (num > 0) {
			num = sc.nextInt();
			if (num > max) {
				max = num;
				count = 1;
			}
			if (num == max)
				count++;
		}

		System.out.println("El numero mayor es " + max);
		System.out.println("Las veces que se repite son " + count);
	}

	public static void cuarentaydos() {
		System.out.println("Ingresa la comision buscada");
		double comisionBuscada = sc.nextDouble();
		double montoVenta, comision = 0, balance;
		montoVenta = 0;
		while (comision < comisionBuscada) {
			balance = comision = 0;
			montoVenta += 0.01;
			if (montoVenta > 10000)
				comision += (balance = montoVenta - 10000) * 0.12;

			if (montoVenta > 5000)
				comision += (balance -= balance - 5000) * 0.10;

			if (montoVenta > 0)
				comision += balance * 0.08;
		}
		System.out.println("Ventas mínimas para ganar $30,000: $" + df.format(montoVenta));
	}

	public static void cuarentaytres() {
		int count = 0;
		for (int numero1 = 1; numero1 < 7; numero1++) {
			for (int numero2 = numero1 + 1; numero2 <= 7; numero2++) {
				System.out.println(numero1 + " " + numero2);
				count++;
			}
		}
		System.out.println("El numero total de combinaciones es " + count);
	}

	public static void cuarentaycuatro() {
		System.out.print("Ingresa un entero: ");
		short numero = sc.nextShort();
		String bits = "";
		for (int i = 0; i < 8; i++) {
			bits = (numero & 1) + bits;
			numero >>= 1;
		}

		System.out.println("Los bits son " + bits);
	}

	public static void cuarentaycinco() {
		double media, desviacionEstandar, num;
		media = 0;
		desviacionEstandar = 0;

		System.out.print("Ingresa diez numeros: ");
		for (int i = 1; i <= 10; i++) {
			num = sc.nextDouble();
			media += num;
			desviacionEstandar += Math.pow(num, 2);
		}
		desviacionEstandar = Math.sqrt((desviacionEstandar - (Math.pow(media, 2) / 10)) / (10 - 1));
		media = media/10;

		System.out.println("La media es " + media);
		System.out.println("La desviacion estandar es" + df.format(desviacionEstandar));
	}

	public static void cuarentayseis() {
		System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        String cvolteada = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cvolteada += cadena.charAt(i);
        }
        System.out.println("La cadena al revez es " + cvolteada);
	}

	public static void cuarentaysiete() {
		System.out.print("Ingresa los primeros 12 digitos del ISBN-13: ");
        String isbn = sc.nextLine();
        int verificacion = 0;
        if (isbn.length() != 12) {
            System.out.println(isbn + " no es valido");
        } else {
        	for (int i = 0; i < isbn.length(); i++) {
                verificacion += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + "") 
                    : Integer.parseInt(isbn.charAt(i) + "");  
            }
            verificacion = 10 - verificacion % 10;
            System.out.println("El ISBN-13 es " + isbn + 
                (verificacion == 10 ? 0 : verificacion));
        }
	}

	public static void cuarentayocho() {
		System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        String cadena2 = "";
        for (int i = 0; i < cadena.length() ; i+=2) {
			cadena2 += cadena.charAt(i);
		}
        System.out.println("La cadena resultante es: " + cadena2);
	}

	public static void cuarentaynueve() {
		System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        int vocal = 0, consonante = 0;
        for (int i = 0; i < cadena.length() ; i++) {
			if(Character.isLetter(cadena.charAt(i)) && Character.toUpperCase(cadena.charAt(i)) == 'A'
					|| Character.isLetter(cadena.charAt(i)) && Character.toUpperCase(cadena.charAt(i)) == 'E'
					|| Character.isLetter(cadena.charAt(i)) && Character.toUpperCase(cadena.charAt(i)) == 'I'
					|| Character.isLetter(cadena.charAt(i)) && Character.toUpperCase(cadena.charAt(i)) == 'O'
					|| Character.isLetter(cadena.charAt(i)) && Character.toUpperCase(cadena.charAt(i)) == 'U'){
				vocal++;
			}else if(Character.isLetter(cadena.charAt(i))) {
				consonante++;
			} else {
				
			}
		}
        System.out.println("Numero de vocales: " + vocal);
        System.out.println("Numero de consonantes: " + consonante);
	}

	public static void cincuenta() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " ");
			}
			System.out.println();
		} 
		int y = 1;
		int comienzo = 4;
		while (comienzo < 7) {
			y = 1;
			while (y < 10) {
				System.out.print(comienzo + " * " + y + " = " + (comienzo * y) + " ");
				y++;
			}
			comienzo++;
			System.out.println();
		}
		do{
			y = 1;
			do{
				System.out.print(comienzo + " * " + y + " = " + (comienzo * y) + " ");
				y++;
			}while (y < 10);
			comienzo++;
			System.out.println();
		}while (comienzo < 10);
	}

	public static void cincuentayuno() {
		System.out.print("Ingresa la primer cadena: ");
        String cadena1 = sc.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = sc.nextLine();
        int i = 0; 
        String prefijo = "";
        while (cadena1.charAt(i) == cadena2.charAt(i)) {
            prefijo += cadena1.charAt(i);
            i++;
        }
        if (prefijo.length() > 0)
            System.out.println("El prefijo comun es: " + prefijo);
        else
            System.out.println(cadena1 + " y " + cadena2 + " no comparte prefijo");
	}
}
