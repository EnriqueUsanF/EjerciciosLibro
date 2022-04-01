import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class unidadSeis {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void uno() {
		System.out.println("Primeros 100 numeros pentagonales: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0)
				System.out.printf("%7d\n", getPentagonalNumber(i));
			else
				System.out.printf("%7d", getPentagonalNumber(i));
		}
	}

	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}

	public static void dos() {
		System.out.print("Ingresa un numero: ");
		long numero = sc.nextLong();
		System.out.println("La suma de sus digitos es " + sumDigits(numero));
	}

	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void tres() {
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();

		System.out.println(numero + (isPalindrome(numero) ? " si es " : " no es ") + "un palindromo");
	}

	public static int reverse(int number) {
		String cadInvertida = "";
		String n = number + "";
		for (int i = n.length() - 1; i >= 0; i--) {
			cadInvertida += n.charAt(i);
		}
		return Integer.parseInt(cadInvertida);
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	public static void cuatro() {
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();
		reverse2(numero);
	}

	public static void reverse2(int number) {
		String cadInvertida = "";
		String n = number + "";
		for (int i = n.length() - 1; i >= 0; i--) {
			cadInvertida += n.charAt(i);
		}
		System.out.println(cadInvertida);
	}

	public static void cinco() {
		System.out.print("Ingresa tres numeros: ");
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		double numero3 = sc.nextDouble();
		displaySortedNumbers(numero1, numero2, numero3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;

		if (num2 > num1 && num2 > num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num3 > num1 && num3 > num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 > num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println(num1 + " " + num2 + " " + num3);
	}

	public static void seis() {
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();

		displayPattern(numero);
	}

	public static void displayPattern(int n) {
		for (int lineas = 1; lineas <= n; lineas++) {
			for (int cols = 1; cols <= lineas; cols++) {
				System.out.print(cols + " ");
			}
			System.out.println();
		}
	}

	public static void siete() {
		System.out.print("Ingresa el monto de inversion: ");
		double inversion = sc.nextDouble();
		System.out.print("Ingresa el ratio de interes anual en porcentaje: ");
		double interes = sc.nextDouble();

		double interesMensual = interes / 1200;

		System.out.println("Años     Valor en futuro");
		for (int anios = 1; anios <= 30; anios++) {
			System.out.printf("%-10d", anios);
			System.out.printf("%11.2f\n", futureInvestmentValue(inversion, interesMensual, anios));
		}
		System.out.print("Ingresa el numero de años: ");
		int anios = sc.nextInt();
		System.out
				.print("Los futuros valores seran de $" + df3.format(futureInvestmentValue(inversion, interes, anios)));
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * (Math.pow((1 + (monthlyInterestRate * 0.00083)), (years * 12)));
	}

	public static void ocho() {
		System.out.println("milla\tkilometro\t|\tkilometro\tmilla");
		for (double milla = 1.0, kilometro = 20.0; milla <= 10.0; milla++, kilometro += 5) {
			System.out.println(milla + "\t" + df.format(mileToKilometer(milla)) + "\t|\t" + kilometro + "\t"
					+ df.format(kilometerToMile(kilometro)));
		}
	}

	public static double mileToKilometer(double mile) {
		return mile * 1.6;
	}

	public static double kilometerToMile(double kilometer) {
		return kilometer / 1.6;
	}

	public static void nueve() {
		System.out.println("libra\tkilogramo\t|\tkilogramo\tlibra");
		for (double libra = 1.0, kilo = 20.0; libra <= 10.0; libra += 2, kilo += 5) {
			System.out.println(libra + "\t" + df.format(poundToKilogram(libra)) + "\t|\t" + kilo + "\t"
					+ df.format(kilogramToPound(kilo)));
		}
	}

	public static double poundToKilogram(double pound) {
		return 2.204 * pound;
	}

	public static double kilogramToPound(double kilogram) {
		return 0.453 * kilogram;
	}

	public static void diez() {
		int numeroPrimos = 0;
		for (int i = 1; i < 10000; i++) {
			if (isPrime(i))
				numeroPrimos++;
		}
		System.out.println("La cantidad de numeros primos menores a 10000: " + numeroPrimos);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		// Repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime number and increase the count
			if (isPrime(number)) {
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				} else
					System.out.printf("%-5s", number);
			}

			// Check whether the next number is prime
			number++;
		}
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime
	}

	public static void once() {
		System.out.println("Monto de venta     Comision");
		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf(" %-16.0f", salesAmount);
			System.out.printf("%8.1f\n", computeCommission(salesAmount));
		}
	}

	public static double computeCommission(double salesAmount) {

		double comision = 0, balance;
		balance = comision = 0;

		if (salesAmount > 10000)
			comision += (balance = salesAmount - 10000) * 0.12;

		if (salesAmount > 5000)
			comision += (balance -= balance - 5000) * 0.10;

		if (salesAmount > 0)
			comision += balance * 0.08;

		return comision;
	}

	public static void doce() {
		System.out.print("Ingresa un numero inicial, uno final y la cantidad de caracteres por linea: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		printNumbers(numero1, numero2, numero3);
	}

	public static void printNumbers(int num1, int num2, int numberPerLine) {
		for (int i = num1; i <= num2; i++) {
			if (i % numberPerLine == 0)
				System.out.println(i);
			else
				System.out.print(i + " ");
		}
	}

	public static void trece() {
		System.out.println("\ni         m(i)     ");
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sumSeries(i));
		}
	}

	public static double sumSeries(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}

	public static void catorce() {
		System.out.println("\ni         m(i)     ");
		for (double i = 1; i <= 901; i += 100) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", valorPI(i));
		}
	}

	public static double valorPI(double n) {
		double pi = 0;
		for (double i = 1; i <= n; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		pi = pi * 4;
		return pi;
	}

	public static void quince() {
		// Print tax table
		double from = 50000; // Start table taxable income range at $50,000
		double to = 60000; // End table taxable income range at $60,000
		double interval = 50; // Increase each row by $50

		// Print header
		System.out.println("\nTaxable      Single      Married Joint       Married        Head of\n"
				+ "Income                   or Qualifying       Separate       a House\n"
				+ "                         Widow(er)\n"
				+ "---------------------------------------------------------------------");
		// Print Data
		for (double taxableIncome = from; taxableIncome <= to; taxableIncome += interval) {
			System.out.printf("%-13.0f", taxableIncome);
			System.out.printf("%-12d", Math.round(computeTax(0, taxableIncome)));
			System.out.printf("%-20d", Math.round(computeTax(1, taxableIncome)));
			System.out.printf("%-15d", Math.round(computeTax(2, taxableIncome)));
			System.out.printf("%-10d\n", Math.round(computeTax(3, taxableIncome)));
		}
	}

	public static double computeTax(int status, double taxableIncome) {
		double tax, // Total tax
				taxRate, // Tax rate
				incomeTaxed, // Taxed income
				incomeUntaxed, // Untaxed income
				taxAt15Pecent, // Minimum marginal amount of 15% tax bracket
				taxAt25Pecent, // Minimum marginal amount of 25% tax bracket
				taxAt28Pecent, // Minimum marginal amount of 28% tax bracket
				taxAt33Pecent, // Minimum marginal amount of 33% tax bracket
				taxAt35Pecent; // Minimum marginal amount of 35% tax bracket

		// Initialize variables to 0
		taxAt15Pecent = taxAt25Pecent = taxAt28Pecent = taxAt33Pecent = taxAt35Pecent = incomeUntaxed = taxRate = tax = 0.0;

		switch (status) { // Get minimum taxableIncome for tax brackets
		case 0: // Single
			taxAt15Pecent = 8351;
			taxAt25Pecent = 33951;
			taxAt28Pecent = 82251;
			taxAt33Pecent = 171551;
			taxAt35Pecent = 372951;
			break;

		case 1: // Married Joint or Qualifying Widow(er)
			taxAt15Pecent = 16701;
			taxAt25Pecent = 67901;
			taxAt28Pecent = 137051;
			taxAt33Pecent = 208851;
			taxAt35Pecent = 372951;
			break;

		case 2: // Married Filing Separately
			taxAt15Pecent = 8351;
			taxAt25Pecent = 33951;
			taxAt28Pecent = 68526;
			taxAt33Pecent = 104426;
			taxAt35Pecent = 186476;
			break;

		case 3: // Head of house
			taxAt15Pecent = 11951;
			taxAt25Pecent = 45501;
			taxAt28Pecent = 117451;
			taxAt33Pecent = 190201;
			taxAt35Pecent = 372951;
		}

		// Compute tax
		while (taxableIncome >= taxAt15Pecent) {

			// Compute tax rate and untaxed income
			if (taxableIncome >= taxAt35Pecent) {
				taxRate = 0.35;
				incomeUntaxed = taxAt35Pecent - 1;
			} else if (taxableIncome >= taxAt33Pecent) {
				taxRate = 0.33;
				incomeUntaxed = taxAt33Pecent - 1;
			} else if (taxableIncome >= taxAt28Pecent) {
				taxRate = 0.28;
				incomeUntaxed = taxAt28Pecent - 1;
			} else if (taxableIncome >= taxAt25Pecent) {
				taxRate = 0.25;
				incomeUntaxed = taxAt25Pecent - 1;
			} else if (taxableIncome >= taxAt15Pecent) {
				taxRate = 0.15;
				incomeUntaxed = taxAt15Pecent - 1;
			}

			// Accumulate tax for income above the 10% tax bracket
			tax += (incomeTaxed = taxableIncome - incomeUntaxed) * taxRate;
			taxableIncome -= incomeTaxed; // Update taxable income
		}

		// Accumulate tax for income in the 10% tax bracket
		return tax += taxableIncome * 0.10;
	}

	public static void dieciseis() {
		int flag = 0;
		for (int anio = 2014; anio <= 2034; anio++) {
			flag += numberOfDaysInAYear(anio);
		}
		System.out.println("La cantidad de dias entre esos años es de " + flag);
	}

	public static int numberOfDaysInAYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return 366;
		else
			return 365;
	}

	public static void diecisiete() {
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();
		printMatrix(numero);
	}

	public static void printMatrix(int n) {
		Random ale = new Random();
		int valor;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				valor = ale.nextInt((2 - 1) + 1);
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	}

	public static void dieciocho() {
		System.out.print("Ingresa una cadena valida: ");
		String cadena = sc.next();
		verificaPwd(cadena);
	}

	public static void verificaPwd(String pass) {
		boolean flag = false;
		int digitos = 0;
		if (pass.length() >= 9) {
			for (int i = 0; i < pass.length(); i++) {
				if (Character.isLetter(pass.charAt(i)) || Character.isDigit(pass.charAt(i))) {
					flag = true;
					if (Character.isDigit(pass.charAt(i))) {
						digitos++;
					}
				} else {
					flag = false;
					break;
				}
			}

		}

		if (digitos < 3 && flag == true) {
			flag = false;
		}
		System.out.println("La cadena" + (flag ? " si " : " no ") + "es valida");
	}

	public static void diecinueve() {
		System.out.print("Ingresa la medida de los lados de un triangulo: ");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		System.out.println("El area del triangulo solicitado "
				+ (isValid(lado1, lado2, lado3) ? ("es " + area(lado1, lado2, lado3)) : "no es valido"));

	}

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2) > side3 && (side3 + side2) > side1 && (side1 + side3) > side2) {
			return true;
		} else {
			return false;
		}
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static void veinte() {
		System.out.print("Ingresa una cadena: ");
		String cad = sc.nextLine();
		System.out.println("el numero de letras es " + countLetters(cad));
	}

	public static int countLetters(String s) {
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				cont++;
			}
		}
		return cont;
	}

	public static void veintiuno() {
		System.out.print("Ingresa una cadena: ");
		String cadena = sc.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isLetter(cadena.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(cadena.charAt(i))));
			else
				System.out.print(cadena.charAt(i));
		}
	}

	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else
			return 2;
	}

	public static void veintidos() {
		System.out.print("Ingresa un numero: ");
		long numero = sc.nextLong();

		System.out.println("The approximated square root of " + numero + " is: " + sqrt(numero));
	}

	public static double sqrt(long n) {
		long lastGuess = 1;
		long nextGuess = (lastGuess + n / lastGuess) / 2;
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}

	public static void veintitres() {
		System.out.print("Ingresa una cadena: ");
		String cadena = sc.nextLine();
		int k = cadena.indexOf(", ");
		String str = cadena.substring(0, k);
		char ch = cadena.charAt(k + 2);
		System.out.println("El numero de veces que aparece la \"" + ch + "\" en \'" + str + "\" es de  "
				+ count(str, ch) + " veces");
	}

	public static int count(String str, char a) {
		int cont = 0;
		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i))
				cont++;
		}
		return cont;
	}

	public static void vienticuatro() {
		System.out.println(time());
		System.out.println(date());
		System.out.println(month());
		System.out.println(day());
	}

	public static String time() {
		final long TIME_ZONE_OFFSET = -4; // USA Time zone offset to GMT

		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalTime = System.currentTimeMillis();

		// Obtain total seconds since midnight, Jan 1, 1970
		totalTime /= 1000;

		// Obtain current minute and second
		String currentMinuteAndSecond = ""; // Holds Minutes and Seconds
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = (totalTime % 60 < 10 ? ":0" + totalTime % 60 : ":" + totalTime % 60)
					+ currentMinuteAndSecond;
			totalTime /= 60;
		}

		String setAmOrPm = "";
		// Obtain current hour in 12 format
		long currentHour = totalTime % 24;
		if (currentHour == 0)
			currentHour = 24;

		if (currentHour > 12) {
			currentHour -= 12;
			setAmOrPm = " PM";
		} else
			setAmOrPm = " AM";

		// Add time zone offset to GMT
		currentHour += TIME_ZONE_OFFSET;

		return currentHour + currentMinuteAndSecond + setAmOrPm;
	}

	public static String date() {

		return year() + "";
	}

	public static int year() {
		// Obtain the current year
		int currentYear = (int) (System.currentTimeMillis() / millisecondPerYear()) + 1970;

		return currentYear;
	}

	public static int month() {
		// Obtain the current month
		int currentMonth = (int) ((System.currentTimeMillis() % millisecondPerYear()) / millisecondsPerMonth());
		return currentMonth + 1;
	}

	public static int day() {
		// Obtain the current day
		return getTotalNumberOfDays(year(), month());
	}

	public static double millisecondPerYear() {
		return 3.15569E10;
	}

	public static double millisecondsPerMonth() {
		return 2.63E9;
	}

	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 400 != 0);
	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	public static void veinticinco() {
		System.out.print("Ingresa los milisegundos: ");
		long millis = sc.nextLong();

		System.out.println("horas:minutos:segundos: " + convertMillis(millis));
	}

	public static String convertMillis(long millis) {
		millis /= 1000;

		String minutoSegundoActual = "";
		for (int i = 0; i < 2; i++) {
			minutoSegundoActual = ":" + millis % 60 + minutoSegundoActual;
			millis /= 60;
		}
		return millis + minutoSegundoActual;
	}

	public static void veintiseis() {
		int count = 0;
		int n = 2;

		while (count < 100) {
			if (isPalindromoPrimo(n)) {
				count++;
				System.out.print(count % 10 == 0 ? n + "\n" : n + " ");
			}
			n++;
		}
	}

	public static boolean isPalindromoPrimo(int num) {
		return isPrime(num) && isPalindrome(num);
	}

	public static void veintisiete() {
		int count = 0;
		int n = 2;

		while (count < 120) {
			if (esEmirp(n)) {
				count++;
				System.out.print(count % 10 == 0 ? n + "\n" : n + " ");
			}
			n++;
		}
	}

	public static boolean esEmirp(int num) {
		return isPrime(num) && isPalindrome(num) && isPrime(reverse(num));
	}

	public static void veintiocho() {
		System.out.println("\np\t2^p-1");
		for (int p = 2; p <= 31; p++) {
			if (isPrime(p)) {
				System.out.println(p + "\t" + mersennePrimo(p));
			}
		}
	}

	public static int mersennePrimo(int num) {
		return (int) Math.pow(2, num) - 1;
	}

	public static void veintinueve() {
		for (int p = 2; p < 1200; p++) {
			if (sonPrimosHermanos(p))
				System.out.println("(" + p + ", " + (p + 2) + ")");
		}
	}

	public static boolean sonPrimosHermanos(int num) {
		return isPrime(num) && isPrime(num + 2);
	}

	public static void treinta() {
		int punto = tiraDosDados();
		int resultado = obtenerResultado(punto);
		if (naturaloCraps(resultado))
			imprimeResultado(resultado);
		else {
			tiradeNuez(resultado);
		}
	}

	public static int tiraDado() {
		return (int) (1 + Math.random() * 6);
	}

	public static int tiraDosDados() {
		int dado1 = tiraDado();
		int dado2 = tiraDado();
		int sum = dado1 + dado2;
		System.out.println("You rolled " + dado1 + " + " + dado2 + " = " + sum);
		return sum;
	}

	public static int obtenerResultado(int punto) {
		switch (punto) {
		case 2:
		case 3:
		case 12:
			punto = 0;
			break;
		case 7:
		case 11:
			punto = 1;
			break;
		}
		return punto;
	}

	public static void imprimeResultado(int resultado) {
		if (resultado == 0)
			System.out.println("Perdiste");
		else if (resultado == 1)
			System.out.println("Ganaste");
	}

	public static boolean naturaloCraps(int resultado) {
		return resultado == 0 || resultado == 1;
	}

	public static void tiradeNuez(int punto) {
		int resultado;

		do {
			resultado = tiraDosDados();
		} while (resultado != punto && resultado != 7);
		if (resultado == 7)
			imprimeResultado(0);
		else
			imprimeResultado(1);
	}

	public static void treintayuno() {
		System.out.print("Ingresa el numero de una tarjeta de credito: ");
		long number = sc.nextLong();

		System.out.println(number + " es " + (isValid(number) ? "valida" : "invalida"));
	}

	public static boolean isValid(long number) {
		if ((getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
						|| prefixMatched(number, 6))
				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)) {
			return true;
		} else
			return false;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}

	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}

	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
		return number;
	}

	public static void treintaydos() {
		int cont = 0;
		int punto = 0;
		int resultado = 0;
		;
		for (int i = 1; i <= 13000; i++) {
			punto = tiraDosDados();
			resultado = obtenerResultado(punto);
			if (naturaloCraps(resultado))
				imprimeResultado(resultado);
			else {
				tiradeNuez(resultado);
			}
			if (resultado == 1) {
				cont++;
			}
		}
		System.out.println("Numero de juegos ganados: " + cont);
	}

	public static void treintaytres() {
		// pendiente
	}

	public static void treintaycuatro() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter full year (e.g., 2012): ");
		int year = keyboard.nextInt();
		while (!isValidYear(year)) { // validate input
			System.out.println("Invalid Year!");
			System.out.print("Enter full year (e.g., 2012): ");
			year = keyboard.nextInt();
		}

		// get & validate user month
		System.out.print("Enter month as number between 1 and 12: ");
		int month = keyboard.nextInt();
		while (!isValidMonth(month)) { // validate input
			System.out.println("Invalid Month!");
			System.out.print("Enter month as number between 1 and 12: ");
			month = keyboard.nextInt();
		}

		printCalendarHeader(month, year); // print the calendar header

		printFirstDay(month, year); // print the calendar first day

		printCalendarItself(month, year); // print the calendar itself
	}

	public static boolean isValidYear(int year) {
		return year > 0; // might want to check an upper bound, not sure if this formula works for HUGE
							// numbers
	}

	public static boolean isValidMonth(int month) {
		return month > 0 && month <= 12;
	}

	public static void printCalendarHeader(int month, int year) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "Septemter",
				"October", "November", "December" };

		System.out.print("\t\t" + months[month - 1] + "\t"); // access the month array with a -1 offset since arrays
																// count from 0
		System.out.println(year);
		System.out.println("---------------------------");

		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	}

	public static void printFirstDay(int month, int year) {
		int firstDay = dayOfWeek(1, month, year); // calculate the 1st day

		String leadingTabs = "1"; 
		for (int i = 1; i < firstDay; i++) {
			leadingTabs = "\t" + leadingTabs;
		}
		if (firstDay == 0) { 
			leadingTabs = "\t\t\t\t\t\t1";
		}

		System.out.print(leadingTabs + "\t");
	}

	public static void printCalendarItself(int month, int year) {
		// find out the last day of that month
		// whether it's 28/29/30/31 days
		int lastDayOfMonth = lastDayOfMonth(month, year);

		// print the calendar itself
		for (int i = 2; i <= lastDayOfMonth; i++) {
			int printedDay = dayOfWeek(i, month, year);
			if (printedDay == 1) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}
	}

	// Implement Zeller's Algorithm
	public static int dayOfWeek(int dayOfMonth, int month, int year) {
		if (month == 1 || month == 2) {
			month = month + 12;
			year--;
		}
		int q, m, j, k;
		q = dayOfMonth;
		m = month; // adjusted month (corrected for January & February being 13 & 14 respectively)
		j = year / 100; // century
		k = year % 100; // year of the century
		int dayOfTheWeek = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + (5 * j)) % 7; // performs integer division
																						// where appropriate (like the
																						// Algorithms wants)
		return dayOfTheWeek;
	}

	public static int lastDayOfMonth(int month, int year) {
		int lastDayOfMonth;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastDayOfMonth = 31;
		} else if (month == 2) {
			if (isLeapYear(year)) {
				lastDayOfMonth = 29;
			} else {
				lastDayOfMonth = 28;
			}
		} else {
			lastDayOfMonth = 30;
		}
		return lastDayOfMonth;
	}

	public static void treintaycinco() {
		System.out.print("Ingresa la distancia de un lado del pentagono: ");
		double r = sc.nextDouble();
		System.out.println("El area del pentagono es de " + df.format(area(r)));
	}
	public static double area(double side) {
		return (5 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI / 5)));
	}

	public static void treintayseis() {
		System.out.print("Ingresa el numero de lados del poligono: ");
		int n = sc.nextInt();
		System.out.print("Ingresa la distancia de un lado del poligono: ");
		double r = sc.nextDouble();
		System.out.println("El area del pentagono es de " + df.format(area2(r, n)));
	}
	public static double area2(double side, int n) {
		return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
	}

	public static void treintaysiete() {
		System.out.print("Ingresa un numero y su longitud: ");
		int numero = sc.nextInt();
		int ancho = sc.nextInt();

		System.out.println(numero + " formatted to width " + ancho 
				+ ": " + format(numero, ancho));
	}
	public static String format(int number, int width) {
		String num = number + "";
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}

	public static void treintayocho() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(getRandomUpperCaseLetter());
			System.out.print(i % 10 == 0 ? "\n" : " ");
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(getRandomDigitCharacter());
			System.out.print(i % 10 == 0 ? "\n" : " ");
		}
	}
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

	public static void treintaynueve() {
		System.out.print("Ingresa las coordenadas para p0, p1, y p2: ");
		double x0 = sc.nextDouble();
		double y0 = sc.nextDouble();
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		System.out.print("(" + x2 + ", " + y2 + ") esta ");
		if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
			System.out.print("sobre la linea ");
		else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
			System.out.print("a la izquierda de la linea ");
		else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
			System.out.print("en linea con el segmento ");
		else 
			System.out.print("a la derecha de la linea ");
		System.out.println(
			"formada por " + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}
	public static boolean leftOfTheLine(double x0, double y0,
	double x1, double y1, double x2, double y2){
		return pointPosition(x0, y0, x1, y1, x2, y2) > 0;
	}
	public static boolean onTheSameLine(double x0, double y0,
	double x1, double y1, double x2, double y2){
		return pointPosition(x0, y0, x1, y1, x2, y2) == 0;
	}
	public static boolean onTheLineSegment(double x0, double y0,
	double x1, double y1, double x2, double y2) {
		return (pointPosition(x0, y0, x1, y1, x2, y2) == 0 &&
				 (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1));
	}
	public static double pointPosition(double x0, double y0,
	double x1, double y1, double x2, double y2) {
		// Calculate point position
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
}
