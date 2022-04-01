import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class unidadTres {

	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void tresUno() {
		System.out.print("Ingresa a, b, c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double discriminante = Math.pow(b, 2) - (4 * a * c);
		System.out.print("La ecuacion ");
		if (discriminante > 0) {
			double raiz1 = ((-1 * b) + Math.sqrt(discriminante)) / (2 * a);
			double raiz2 = ((-1 * b) - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("tiene dos raices " + raiz1 + " y " + raiz2);
		} else if (discriminante == 0) {
			double raiz = ((-1 * b) + Math.sqrt(discriminante)) / (2 * a);
			System.out.println("tiene solo una raiz " + raiz);
		} else
			System.out.println("tiene raices imaginarias");
	}

	public static void tresDos() {
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);
		int number3 = (int) (System.currentTimeMillis() / 100 % 10);
		System.out.print(" ¿Cuanto es " + number1 + " x " + number2 + " x " + number3 + "? ");
		int resultado = sc.nextInt();
		if (resultado == (number1 * number2 * number3)) {
			System.out.println("El resultado de la multiplicacion es verdadero");
		} else
			System.out.println("Te equivocaste");
	}

	public static void tresTres() {
		System.out.print("Ingresa a, b, c, d, e, f: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		double factor = (a * d) - (b * c);
		if (factor != 0) {
			double x = ((e * d) - (b * f)) / factor;
			double y = ((a * f) - (e * c)) / factor;
			System.out.println("x es " + x + " e y es " + y);
		} else
			System.out.println("La ecuacion no tiene solucion");
	}

	public static void tresCuatro() {
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(12 + 1) + 1;
		if (valor == 1) {
			System.out.println("January");
		} else if (valor == 2) {
			System.out.println("February");
		} else if (valor == 3) {
			System.out.println("March");
		} else if (valor == 4) {
			System.out.println("April");
		} else if (valor == 5) {
			System.out.println("May");
		} else if (valor == 6) {
			System.out.println("June");
		} else if (valor == 7) {
			System.out.println("July");
		} else if (valor == 8) {
			System.out.println("August");
		} else if (valor == 9) {
			System.out.println("September");
		} else if (valor == 10) {
			System.out.println("October");
		} else if (valor == 11) {
			System.out.println("November");
		} else
			System.out.println("December");
	}

	// -----------------------------------------------------------------
	public static void tresCinco() {
		System.out.print("Ingresa el numero del dia: ");
		int diaInicial = sc.nextInt();
		System.out.print("Ingresa el numero de dias transcurridos a partir de ese dia: ");
		int diasAdicionados = sc.nextInt();
		int flag = diaInicial;
		for (int i = 0; i < diasAdicionados; i++) {
			if (flag < 6) {
				flag++;
			} else
				flag = 0;
		}
		String dia1 = dia(diaInicial);
		String dia2 = dia(flag);
		System.out.println("Hoy es " + dia1 + " y tras los dias sera " + dia2);
	}

	public static String dia(int x) {
		if (x == 0) {
			return "Lunes";
		} else if (x == 1) {
			return "Martes";
		} else if (x == 2) {
			return "Miercoles";
		} else if (x == 3) {
			return "Jueves";
		} else if (x == 4) {
			return "Viernes";
		} else if (x == 5) {
			return "Sabado";
		} else
			return "Domingo";

	}

	// ------------------------------------------------------------------
	public static void tresSeis() {
		System.out.print("Ingresa tu peso en libras: ");
		double peso = sc.nextDouble();
		System.out.print("Ingresa tu altura en pies: ");
		double alturapies = sc.nextDouble();
		System.out.print("Ingresa tu restante en pulgadas: ");
		double altura = sc.nextDouble();
		double pesokg = peso * 0.45359237;
		double alturam = altura / 39.370;
		alturam = alturam + (0.3048 * alturapies);
		double bmi = pesokg / (alturam * alturam);
		System.out.println("BMI es de " + df3.format(bmi));
		if (bmi < 18.5)
			System.out.println("Bajo peso");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Pasado de peso");
		else
			System.out.println("Obesidad");
	}

	public static void siete() {
		System.out.print("Ingresa un monto flotante. Por ejemplo 11.56: ");
		double amount = sc.nextDouble();
		int remainingAmount = (int) (amount * 100);
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;
		System.out.println("El monto " + amount + " consiste de");
		if (numberOfOneDollars != 0)
			System.out.println(" " + numberOfOneDollars + " dollars");
		if (numberOfQuarters != 0)
			System.out.println(" " + numberOfQuarters + " quarters ");
		if (numberOfDimes != 0)
			System.out.println(" " + numberOfDimes + " dimes");
		if (numberOfNickels != 0)
			System.out.println(" " + numberOfNickels + " nickels");
		if (numberOfPennies != 0)
			System.out.println(" " + numberOfPennies + " pennies");
	}

	public static void ocho() {
		System.out.print("Ingresa 3 valores enteros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b && b < c)
			System.out.println(a + " < " + b + " < " + c);
		else if (a < b && c < b)
			System.out.println(a + " < " + c + " < " + b);
		else if (b < a && a < c)
			System.out.println(b + " < " + a + " < " + c);
		else if (b < a && c < a)
			System.out.println(b + " < " + c + " < " + a);
		else if (c < b && b < a)
			System.out.println(c + " < " + b + " < " + a);
		else
			System.out.println(c + " < " + a + " < " + b);
	}

	public static void nueve() {
		System.out.print("Ingresa los primeros digitos del ISBN: ");
        String isbn1 = sc.next();
        char digito0 = isbn1.charAt(0);
        int isbn = Integer.parseInt(isbn1);
        int digito1;
        if (digito0 == 0) {
            digito1 = 0;
        } else
            digito1 = isbn % 10;
        isbn = isbn / 10;
        int digito2 = isbn % 10;
        isbn = isbn / 10;
        int digito3 = isbn % 10;
        isbn = isbn / 10;
        int digito4 = isbn % 10;
        isbn = isbn / 10;
        int digito5 = isbn % 10;
        isbn = isbn / 10;
        int digito6 = isbn % 10;
        isbn = isbn / 10;
        int digito7 = isbn % 10;
        isbn = isbn / 10;
        int digito8 = isbn % 10;
        isbn = isbn / 10;
        int digito9 = isbn % 10;
        int res = ((digito9 * 1) + (digito8 * 2) + (digito7 * 3) + (digito6 * 4) + (digito5 * 5) + (digito4 * 6)
                + (digito3 * 7) + (digito2 * 8) + (digito1 * 9)) % 11;
        res = res % 10;
        if (res != 0) {
            isbn1 += res;
        } else
            isbn1 += "X";
        System.out.println("El ISBN-10 es " + isbn1);
	}

	public static void diez() {
		Random aleatorio = new Random();
		int valor1 = aleatorio.nextInt(1000 + 1) + 1;
		int valor2 = aleatorio.nextInt(1000 + 1) + 1;
		System.out.print("¿Cual es el resultado de " + valor1 + " x " + valor2 + "? ");
		int res = sc.nextInt();
		if (res == (valor1 * valor2))
			System.out.println("Correcto!!!!");
		else
			System.out.println("Incorrecto, el resultado era: " + (valor1 * valor2));
	}

	public static void once() {
		System.out.print("Ingresa el numero de mes y año: ");
		int mesactual = sc.nextInt();
		int anio = sc.nextInt();

		boolean isLeapYear = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

		System.out.println("En el año " + anio + " " + mes(mesactual, isLeapYear));
		;

	}

	public static String mes(int x, boolean isLeapYear) {
		if (x == 1) {
			return "Enero tuvo 31 dias";
		} else if (x == 2 && isLeapYear == true) {
			return "Febrero tuvo 29 dias";
		} else if (x == 2 && isLeapYear != true) {
			return "Febrero tuvo 28 dias";
		} else if (x == 3) {
			return "Marzo tuvo 31 dias";
		} else if (x == 4) {
			return "Abril tuvo 30 dias";
		} else if (x == 5) {
			return "Mayo tuvo 31 dias";
		} else if (x == 6) {
			return "Junio tuvo 31 dias";
		} else if (x == 7) {
			return "Julio tuvo 30 dias";
		} else if (x == 8) {
			return "Agosto tuvo 31 dias";
		} else if (x == 9) {
			return "Septiembre tuvo 30 dias";
		} else if (x == 10) {
			return "Octubre tuvo 31 dias";
		} else if (x == 11) {
			return "Noviembre tuvo 30 dias";
		} else {
			return "Diciembre tuvo 31 dias";
		}
	}

	public static void doce() {
		System.out.print("Ingresa un numero de tres digitos: ");
		int x = sc.nextInt();
		int y = x;
		int digito1 = x % 10;
		x = x / 10;
		int digito2 = x % 10;
		x = x / 10;
		int digito3 = x % 10;

		if (digito1 == digito3) {
			System.out.println(y + " es palindromo");
		} else
			System.out.println(y + " no es palindromo");
	}

	public static void trece() {
		System.out.print("(0-single filer, 1-married jointly or " +
				 "qualifying widow(er), 2-married separately, 3-head of " +
				 "household) Enter the filing status: ");

		int status = sc.nextInt();
		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = sc.nextDouble();

		 // Compute tax
		double tax = 0;

		if (status == 0) { // Compute tax for single filers
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				 (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				 (income - 171550) * 0.33;
			else
				 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				 (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				 (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 1) { // Left as an exercise
			tax += (income <= 16700) ? income * 0.10 : 16700 * 0.10;
			if (income > 16700)
				tax += (income <= 67900) ? (income - 16700) * 0.15 :
				(67900 - 16700) * 0.15;
			if (income > 67900)
				tax += (income <= 137050) ? (income - 67900) * 0.25 :
				(137050 - 67900) * 0.25;
			if (income > 137050)
				tax += (income <= 208850) ? (income - 137050) * 0.28 :
				(208850 - 137050) * 0.28;
			if (income > 208850)
				tax += (income <= 372950) ? (income - 208850) * 0.33 :
				(372950 - 208850) * 0.33;
			if (income > 372950)
				tax += (income - 372950) * 0.35;
		}
		else if (status == 2) { // Compute tax for married separately
			tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
			if (income > 8350)
				tax += (income <= 33950) ? (income - 8350) * 0.15 :
				(33950 - 8350) * 0.15;
			if (income > 33950)
				tax += (income <= 68525) ? (income - 33950) * 0.25 :
				(68525 - 33950) * 0.25;
			if (income > 68525)
				tax += (income <= 104425) ? (income - 68525) * 0.28 :
				(104425 - 68525) * 0.28;
			if (income > 104425)
				tax += (income <= 186475) ? (income - 104425) * 0.33 :
				(186475 - 104425) * 0.33;
			if (income > 186475)
				tax += (income - 186475) * 0.35;
		}
		else if (status == 3) { // Compute tax for head of household
			tax += (income <= 11950) ? income * 0.10 : 11950 * 0.10;
			if (income > 11950)
				tax += (income <= 45500) ? (income - 11950) * 0.15 :
				(45500 - 11950) * 0.15;
			if (income > 45500)
				tax += (income <= 117450) ? (income - 45500) * 0.25 :
				(117450 - 45500) * 0.25;
			if (income > 117450)
				tax += (income <= 190200) ? (income - 117450) * 0.28 :
				(190200 - 117450) * 0.28;
			if (income > 190200)
				tax += (income <= 372950) ? (income - 190200) * 0.33 :
				(372950 - 190200) * 0.33;
			if (income > 372950)
				tax += (income - 372950) * 0.35;
		}
		else { 
			System.out.println("Error: invalid status");
			System.exit(1);
		}

		// Display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
	public static void catorce() {
		Random aleatorio = new Random();
		int valor1 = aleatorio.nextInt(1 + 1) + 1;
		valor1--;
		System.out.print("cara(0), cruz(1): ");
		int valor2 = sc.nextInt();
		if(valor1 == valor2) {
			System.out.println("Acertaste");
		} else
			System.out.println("Lastima");
	}
	
	public static void quince() {
		int lottery = (int)(Math.random() * 1000);
		 
		  // Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (3 digits): ");
		int guess = input.nextInt(); 

		 // Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		int lotteryDigit3 = lottery % 100;

		 // Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		int guessDigit3 = guess % 100;

		System.out.println("The lottery number is " + lottery);

		 // Check the guess
		if (guess == lottery) 
			System.out.println("Exact match: you win $12,000");
		else if (guessDigit2 == lotteryDigit1 
		&& guessDigit1 == lotteryDigit2
		|| guessDigit3 == lotteryDigit1 
		&& guessDigit1 == lotteryDigit3
		|| guessDigit3 == lotteryDigit2 
		&& guessDigit2 == lotteryDigit3) 
			System.out.println("Match all digits: you win $5,000");
		else if (guessDigit1 == lotteryDigit1 
		 || guessDigit1 == lotteryDigit2 
		 || guessDigit2 == lotteryDigit1 
		 || guessDigit2 == lotteryDigit2
		 || guessDigit1 == lotteryDigit3 
		 || guessDigit3 == lotteryDigit1 
		 || guessDigit3 == lotteryDigit3
		 || guessDigit3 == lotteryDigit2 
		 || guessDigit2 == lotteryDigit3) 
			System.out.println("Match one digit: you win $2,000");
		else
			System.out.println("Sorry, no match");
	}
	
	public static void dieciseis() {
		Random aleatorio = new Random();
		int valor1 = aleatorio.nextInt(51 + 1) + 1;
		int valor2 = aleatorio.nextInt(151 + 1) + 1;
		valor1--;
		valor2--;
		int valor3 = aleatorio.nextInt(2 + 1) + 1;
		int valor4 = aleatorio.nextInt(2 + 1) + 1;
		if(valor3 == 1) {
			valor1 = valor1 * -1;
		}
		if(valor4 == 1) {
			valor2 = valor2 * -1;
		}
		System.out.println("Las cordenadas generadas son (" + valor1 + "," + valor2 +")");
	}

	public static void diecisiete() {
		Random aleatorio = new Random();
		int valor1 = aleatorio.nextInt(3 + 1) + 1;
		valor1--;
		//System.out.println(valor1);
		System.out.print("piedra(0), papel(1), tijeras(2): ");
		int valor2 = sc.nextInt();
		if(valor2 == 0 && valor1 == 2 || valor2 == 1 && valor1 == 0 || valor2 == 2 && valor1 == 1) {
			System.out.println("Ganaste");
		} else
			System.out.println("Perdiste");
	}
	
	public static void dieciocho() {
		System.out.print("Ingresa el peso del paquete en libras:");
		double peso = sc.nextDouble();
		if(peso <= 2) {
			System.out.println("El costo en dolares es de 2.5");
		} else if(peso <= 4 && peso > 2) {
			System.out.println("El costo en dolares es de 4.5");
		} else if(peso <= 10 && peso > 4) {
			System.out.println("El costo en dolares es de 7.5");
		} else if(peso <= 20 && peso > 10) {
			System.out.println("El costo en dolares es de 10.5");
		} else
			System.out.println("No se puede realizar el envio");
	}
	
	public static void diecinueve() {
		System.out.print("Ingresa el largo de cada arista del triangulo: ");
		double arista1 = sc.nextDouble();
		double arista2 = sc.nextDouble();
		double arista3 = sc.nextDouble();
		
		if((arista1 + arista2) > arista3 ||(arista3 + arista2) > arista1 || (arista1 + arista3) > arista2) {
			System.out.println("El perimetro del triangulo es " + (arista3 + arista2 + arista3));
		}else
			System.out.println("Entrada invalida");
	}
	
	public static void veinte() {
		System.out.print("Ingresa la temperatura en grados Fahrenheit entre "
				+ "-58°F y 41°F:");
		double temperatura = sc.nextDouble();
		if(temperatura > -58 && temperatura < 41) {
			System.out.print("Ingresa la velocidad del viento ( >= 2 ) en millas por hora:");
			double viento = sc.nextDouble();
			double sensacionTermica = 35.74 + (0.6215 * temperatura) - (35.75 * Math.pow(viento, 0.16)) + (0.4275 * temperatura * Math.pow(viento, 0.16));
			System.out.println("La sensacion termica ees de " + sensacionTermica);
		} else
			System.out.println("Temperatura fuera de rango");
		
	}
	
	public static void veintiuno() {
		System.out.print("Ingresa el año: ");
		int año = sc.nextInt();
		System.out.print("Ingresa el mes (1 - 12): ");
		int mesesito = sc.nextInt();
		System.out.print("Ingresa el dia (1 - 31): ");
		int dia = sc.nextInt();
		if(mesesito == 1 || mesesito == 2)
			mesesito += 12;
		int resultado = (dia + ((26 * (mesesito + 1)) / 10) + (año % 100) + ((año % 100) / 4) + ((año / 100) / 4) + (5 * (año / 100))) % 7;
		System.out.println("El dia de la semana es " + diaSabadaba(resultado - 1));
	}
	
	public static String diaSabadaba(int x) {
		if (x == 2) {
			return "Lunes";
		} else if (x == 3) {
			return "Martes";
		} else if (x == 4) {
			return "Miercoles";
		} else if (x == 5) {
			return "Jueves";
		} else if (x == 6) {
			return "Viernes";
		} else if (x == 0) {
			return "Sabado";
		} else
			return "Domingo";
	}
	
	public static void veintidos() {
		System.out.print("Ingresa dos coordenadas: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double rango = Math.sqrt( (Math.pow(x, 2)) + (Math.pow(y, 2)));
		
		if(rango <= 10) {
			System.out.println("La coordenada esta dentro del circulo");
		} else
			System.out.println("La coordenada esta fuera del circulo");
	}
	
	public static void veintitres() {
		System.out.print("Ingresa dos coordenadas: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if( x <= 6 && y <= 3.5 && x >= -4 && y >= -1.5) {
			System.out.println("La coordenada esta dentro del rectangulo");
		} else
			System.out.println("La coordenada esta fuera del rectangulo");
	}
	
	public static void vienticuatro() {
		Random aleatorio = new Random();
		int valor1 = aleatorio.nextInt(13 + 1) + 1;
		int valor2 = aleatorio.nextInt(4 + 1) + 1;
		String nombre = "", figura = "";
		if(valor1 == 1) {
			nombre += "As";
		} else if(valor1 == 11) {
			nombre += "Comodin";
		} else if(valor1 == 12) {
			nombre += "Reina";
		} else if(valor1 == 13) {
			nombre = "Rey";
		} else
			nombre += valor1;
		
		if(valor2 == 1) {
			figura += "Trebol";
		} else if(valor2 == 2) {
			figura += "Diamantes";
		} else if(valor2 == 3) {
			figura += "Corazones";
		} else
			figura += "Picas";
		
		System.out.println("La carta agarrada fue el " + nombre + " de " + figura);
	}
	
	public static void veinticinco() {
		System.out.print("Ingresa x1, y1, x2 ,y2, x3, y3, x4 ,y4: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double x4 = sc.nextDouble();
		double y4 = sc.nextDouble();
		
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		if (a * d - b * c == 0){
			System.out.println("Las lineas son paralelas");
		} else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("El punto de interseccion es (" + x + ", " + y + ")");
		}
	}
	
	public static void veintiseis() {
		System.out.print("Ingresa un entero: ");
		int numero = sc.nextInt();
		boolean flag = false;
		if(numero % 5 == 0) {
			flag = true;
		}
		System.out.println( numero + " es divisible entre 5? " + flag);
		flag = false;
		if(numero % 4 == 0) {
			flag = true;
		}
		System.out.println( numero + " es divisible entre 4? " + flag);
		flag = false;
		if(numero % 5 == 0 && numero % 4 != 0 || numero % 4 == 0 && numero % 5 != 0) {
			flag = true;
		}
		System.out.println( numero + " es divisible entre 5 o 4 pero no ambos? " + flag);
	}
	
	public static void veintisiete() {
		System.out.print("Ingresa las coordenadas de un punto X e Y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double triangulo = (100 * 200) / 2;
		double rango1 = Math.sqrt( (Math.pow(x, 2)) + (Math.pow(y, 2)));
		double rango2 = 200;
		double rango3 = Math.sqrt( (Math.pow((200 - x), 2)) + (Math.pow(y, 2)));
		double semiPerimetro1 = (rango1 + rango2 + rango3) / 2;
		double area1 = (Math.sqrt(semiPerimetro1 * (semiPerimetro1 - rango1) * (semiPerimetro1 - rango2) * (semiPerimetro1 - rango3)));
		rango1 = Math.sqrt( (Math.pow(x, 2)) + (Math.pow(y, 2)));
		rango2 = 100;
		rango3 = Math.sqrt( (Math.pow(x, 2)) + (Math.pow((100 - y), 2)));
		double semiPerimetro2 = (rango1 + rango2 + rango3) / 2;
		double area2 = (Math.sqrt(semiPerimetro2 * (semiPerimetro2 - rango1) * (semiPerimetro2 - rango2) * (semiPerimetro2 - rango3)));
		rango1 = Math.sqrt( (Math.pow((200 - x), 2)) + (Math.pow(y, 2)));
		rango2 = Math.sqrt( (Math.pow(200, 2)) + (Math.pow(100, 2)));
		rango3 = Math.sqrt( (Math.pow(x, 2)) + (Math.pow((100 - y), 2)));
		double semiPerimetro3 = (rango1 + rango2 + rango3) / 2;
		double area3 = (Math.sqrt(semiPerimetro3 * (semiPerimetro3 - rango1) * (semiPerimetro3 - rango2) * (semiPerimetro3 - rango3)));
		double sumaArea = area1 + area2 + area3;
		if((int) sumaArea == 9999) {
			sumaArea += 1;
		}
		if(x > 0 && y > 0 && x <= 200 & y <= 100 && (int) sumaArea == (int) triangulo) {
			System.out.println("El punto esta dentro del triangulo");
		} else
			System.out.println("El punto NO esta dentro del triangulo");
	}
	
	public static void veintiocho() {
		System.out.print("Ingresa la coordenada del centro X e Y, asi como "
				+ "el ancho y la altura de un rectangulo: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double ancho1 = sc.nextDouble();
		double alto1 = sc.nextDouble();
		System.out.print("Ingresa la coordenada del centro X e Y, asi como "
				+ "el ancho y la altura de un rectangulo: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double ancho2 = sc.nextDouble();
		double alto2 = sc.nextDouble();
		
		double limiteizq1 = x1 - (ancho1 / 2);
		double limiteder1 = x1 + (ancho1 / 2);
		double limitearr1 = y1 + (alto1 / 2);
		double limiteabj1 = y1 - (alto1 / 2);
		
		double limiteizq2 = x2 - (ancho2 / 2);
		double limiteder2 = x2 + (ancho2 / 2);
		double limitearr2 = y2 + (alto2 / 2);
		double limiteabj2 = y2 - (alto2 / 2);
		
		if(limiteabj1 <= limiteabj2 && limitearr1 >= limitearr2 && limiteizq1 <= limiteizq2 && limiteder1 >= limiteder2) {
			System.out.println("El rectangulo b esta dentro del rectangulo a");
		}else if(ancho1 < ancho2 || alto1 < alto2) {
			System.out.println("El rectangulo b es mas grande que el rectangulo a");
		}else
			System.out.println("El rectangulo b NO esta dentro del rectangulo a");
	}
	
	public static void veintinueve() {
		System.out.print("Ingresa la coordenada del centro X e Y, asi como "
				+ "el radio de un circulo: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radio1 = sc.nextDouble();
		System.out.print("Ingresa la coordenada del centro X e Y, asi como "
				+ "el radio de un circulo: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radio2 = sc.nextDouble();
		
		double rangoCirculoA = Math.sqrt( (Math.pow((x2 + radio2), 2)) + (Math.pow((y2 + radio2), 2)));
		
		
		if(rangoCirculoA <= radio1) {
			System.out.println("El circulo a esta dentro del circulo b");
		} else if(radio1 < radio2) {
			System.out.println("El circulo b es mas grande que el circulo a");
		} else
			System.out.println("El circulo a NO esta dentro del circulo b");
	}
	
	public static void treinta() {
		long totalMilisegundos = System.currentTimeMillis();
		long totalSegundos = totalMilisegundos / 1000;
		long segundoActual = totalSegundos % 60;
		long totalMinutos = totalSegundos / 60;
		long minutoActual = totalMinutos % 60;
		long totalHoras = totalMinutos / 60;
		long horaActual = totalHoras % 24;
		System.out.print("Ingresa el desface horario de GTM: ");
		long gtm = sc.nextLong();
		if(horaActual < 13) {
			System.out.println("La Hora actual es: " + (horaActual+gtm) + ":" + minutoActual
					+ ":" + segundoActual + " AM");
		} else {
			horaActual = horaActual - 12;
			System.out.println("La Hora actual es: " + (horaActual+gtm) + ":" + minutoActual
					+ ":" + segundoActual + " PM");
		}
	}
	
	public static void treintayuno() {
		System.out.print("Ingresa el equivalente del dolar a el yuan: ");
		double valor = sc.nextDouble();
		System.out.print("Ingresa 0 si va a ser de dolar a yuan y 1 si sera viceversa: ");
		int opcion = sc.nextInt();
		double res;
		if(opcion == 0) {
			System.out.print("Ingresa el monto en dolarukis: ");
			double dolar = sc.nextDouble();
			res = dolar * valor;
			System.out.println("$" + df.format(dolar) + " son " + df.format(res) + " yuanes");
		} else {
			System.out.print("Ingresa el monto en yuancitos: ");
			double yuan = sc.nextDouble();
			res = yuan * valor;
			System.out.println("$" + df.format(yuan) + " yuanes" + " son $" + df.format(res));
		}
	}
	
	public static void treintaydos() {
		System.out.print("Ingresa las coordenadas de los puntos l0, l1, l2: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double verificacion = ((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1));
		
		if(verificacion > 0) {
			System.out.println("l2 esta a la izquieda");
		} else if(verificacion == 0) {
			System.out.println("l2 esta sobre la linea");
		} else
			System.out.println("l2 esta a la derecha");
	}
	
	public static void treintaytres() {
		System.out.print("Ingresa el precio y peso del primer costal de arroz: ");
		double peso1 = sc.nextDouble();
		double precio1 = sc. nextDouble();
		System.out.print("Ingresa el precio y peso del segundo costal de arroz: ");
		double peso2 = sc.nextDouble();
		double precio2 = sc. nextDouble();
		if((peso1 / precio1) > (peso2 / precio2)) {
			System.out.print("Esta mejor el primer costal");
		} else if((peso1 / precio1) < (peso2 / precio2)) {
			System.out.print("Esta mejor el segundo costal");
		} else
			System.out.print("Los costales son similaresl");
	}
	
	public static void treintaycuatro() {
		System.out.print("Ingresa las coordenadas de los puntos l0, l1, l2: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double verificacion = ((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1));
		
		if(verificacion == 0 && x1 < x3 && x3 < x2 && y1 < y3 && y3 < y2
				|| verificacion == 0 && x1 > x3 && x3 > x2 && y1 > y3 && y3 > y2
				|| verificacion == 0 && x1 > x3 && x3 > x2 && y1 < y3 && y3 < y2
				|| verificacion == 0 && x1 < x3 && x3 < x2 && y1 > y3 && y3 > y2) {
			System.out.println("(" + x3 + ", " + y3 + ")" + " esta sobre la linea"
					+ " del punto en (" + x1 + ", " + y1 + ") y ("
							+ x2 + ", " + y2 + ")");
		} else{
			System.out.println("(" + x3 + ", " + y3 + ")" + " NO esta sobre la linea"
					+ " del punto en (" + x1 + ", " + y1 + ") y ("
							+ x2 + ", " + y2 + ")");
		}
	}
	
	public static void treintaycinco() {
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println(numero + " es par");
		} else
			System.out.println(numero + " es impar");
	}
}
