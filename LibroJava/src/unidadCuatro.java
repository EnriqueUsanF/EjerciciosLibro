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
		double area = (5 * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI / 5)));
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
		double distancia = radioTierra * (Math
				.acos((Math.sin(x1)) * (Math.sin(x2)) + ((Math.cos(x1)) * (Math.cos(x2)) * (Math.cos(y1 - y2)))));
		System.out.println("La distancia entre los dos puntos es de " + distancia + "km");
		// d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
	}

	public static void tres() {
		double x1 = 33.83720034254027, x2 = 28.539253662940062, x3 = 32.109035731400475, x4 = 35.26808397669458,
				y1 = -84.38432032641718, y2 = -81.38544079584398, y3 = -81.08311512417056, y4 = -80.84176252373324;
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

	public static double distanciaMetodo(double x1, double x2, double y1, double y2) {
		double radioTierra = 6371.01;
		return radioTierra * (Math
				.acos((Math.sin(x1)) * (Math.sin(x2)) + ((Math.cos(x1)) * (Math.cos(x2)) * (Math.cos(y1 - y2)))));
	}

	public static void cuatro() {
		System.out.print("Ingresa la distancia del centro a uno de los vertices del hexagono: ");
		double r = sc.nextDouble();
		double s = (2 * r) * (Math.sin(Math.PI / 6));
		double area = (6 * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI / 6)));
		System.out.println("El area del pentagono es de " + df.format(area));
	}

	public static void cinco() {
		System.out.print("Ingresa el numero de lados del poligono: ");
		double n = sc.nextInt();
		System.out.print("Ingresa la distancia del centro a uno de los vertices del poligono: ");
		double r = sc.nextDouble();
		double s = (2 * r) * (Math.sin(Math.PI / 6));
		double area = (n * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI / n)));
		System.out.println("El area del pentagono es de " + df.format(area));
	}

	public static void seis() {
		double radioBase = 40;

		double angulo1 = (Math.random() * (2 * Math.PI));
		double angulo2 = (Math.random() * (2 * Math.PI));
		double angulo3 = (Math.random() * (2 * Math.PI));

		double x1 = radioBase * Math.cos(angulo1);
		double y1 = radioBase * Math.sin(angulo1);
		double x2 = radioBase * Math.cos(angulo2);
		double y2 = radioBase * Math.sin(angulo2);
		double x3 = radioBase * Math.cos(angulo3);
		double y3 = radioBase * Math.sin(angulo3);

		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		double anguloA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double anguloB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double anguloC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		System.out.println("Los tres angulos son " + Math.round(anguloA * 100) / 100.0 + " "
				+ Math.round(anguloB * 100) / 100.0 + " " + Math.round(anguloC * 100) / 100.0);
	}

	public static void siete() {
		System.out.print("Ingresa el radio del circulo: ");
		double radioBase = sc.nextDouble();
		
		double angulo1 = ((2 * Math.PI));
		double angulo2 = (((2/5) * Math.PI));
		double angulo3 = (((4/5) * Math.PI));
		double angulo4 = (((6/5) * Math.PI));
		double angulo5 = (((8/5) * Math.PI));
		angulo1 = Math.toRadians(angulo1);
		angulo2 = Math.toRadians(angulo2);
		angulo3 = Math.toRadians(angulo3);
		angulo4 = Math.toRadians(angulo4);
		angulo5 = Math.toRadians(angulo5);
		/*---------------- pendiente 
		double x1 = radioBase * Math.cos(angulo1);
		double y1 = radioBase * Math.sin(angulo1);
		double x2 = radioBase * Math.cos(angulo2);
		double y2 = radioBase * Math.sin(angulo2);
		double x3 = radioBase * Math.cos(angulo3);
		double y3 = radioBase * Math.sin(angulo3);
		double x4 = radioBase * Math.cos(angulo4);
		double y4 = radioBase * Math.sin(angulo4);
		double x5 = radioBase * Math.cos(angulo5);
		double y5 = radioBase * Math.sin(angulo5);
		System.out.println("Las coordenadas del pentagono son:");
		System.out.println("(" + x1 + ", " + y1 + ")\n"
				+ "(" + x2 + ", " + y2 + ")\n"
				+ "(" + x3 + ", " + y3 + ")\n"
				+ "(" + x4 + ", " + y4 + ")\n"
				+ "(" + x5 + ", " + y5 + ")\n");
				
		*/
	}

	public static void ocho() {
		System.out.print("Ingresa una letra para conocer su ASCII: ");
		String i = sc.next();
		char c = i.charAt(0);

		System.out.println("Su codigo ASCII es: " + (int) c);
	}

	public static void nueve() {
		System.out.print("Ingresa una letra para conocer su ASCII: ");
		String i = sc.next();
		char c = i.charAt(0);

		System.out.println("Su codigo ASCII es: " + (int) c);
	}

	public static void diez() {
		String set1 =
				" 1  3  5  7\n" +
				" 9 11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31";

			String set2 =
				" 2  3  6  7\n" +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31";

			String set3 =
				" 4  5  6  7\n" +
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";

			String set4 =
				" 8  9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";

			String set5 = 
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31";

			int day = 0;

			// Create a Scanner
			Scanner input = new Scanner(System.in);

			// Prompt the user to answer questions
			System.out.print("Is your birthday in Set1?\n");
			System.out.print(set1);
			System.out.print("\nEnter Y for Yes and N for No: ");
			String s = input.nextLine();
			char answer = s.charAt(0);

			if (Character.toUpperCase(answer) == 'Y')
				day += 1;

			// Prompt the user to answer questions
			System.out.print("Is your birthday in Set2?\n");
			System.out.print(set2);
			System.out.print("\nEnter Y for Yes and N for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toUpperCase(answer) == 'Y')
				day += 2;

			// Prompt the user to answer questions
			System.out.print("Is your birthday in Set3?\n");
			System.out.print(set3);
			System.out.print("\nEnter Y for Yes and N for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toUpperCase(answer) == 'Y')
				day += 4;

			// Prompt the user to answer questions
			System.out.print("Is your birthday in Set4?\n");
			System.out.print(set4);
			System.out.print("\nEnter Y for Yes and N for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toUpperCase(answer) == 'Y')
				day += 8;

			// Prompt the user to answer questions
			System.out.print("Is your birthday in Set5?\n");
			System.out.print(set5);
			System.out.print("\nEnter Y for Yes and N for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toUpperCase(answer) == 'Y')
				day += 16;

			System.out.println("\nYour birthday is " + day + "!");
	}

	public static void once() {
		System.out.print("Ingresa un numero binario (0000 to 1111): ");
		int binario = sc.nextInt();
		int digito1 = binario % 10;
		binario = binario / 10;
		int digito2 = binario % 10;
		binario = binario / 10;
		int digito3 = binario % 10;
		binario = binario / 10;
		int digito4 = binario % 10;
		binario = binario / 10;
		
		digito1 = digito1 * (int) Math.pow(2, 0);
		digito2 = digito2 * (int) Math.pow(2, 1);
		digito3 = digito3 * (int) Math.pow(2, 2);
		digito4 = digito4 * (int) Math.pow(2, 3);
		
		System.out.println("En decimal el numero es " + (digito1 + digito2  + digito3  + digito4));
	}

	public static void doce() {
		System.out.print("Ingresa un digito en hexadecimal: ");
		String hexa = sc.next();
		char digito = hexa.charAt(0);
		int digitoDecimal;
		if(digito != 'A' || digito != 'B' || digito != 'C' || digito != 'D' || digito != 'E' || digito != 'F' ) {
			digitoDecimal = Character.getNumericValue(digito);
		} else {
			if (digito == 'A') {
				digitoDecimal = 10;
			} else if (digito == 'B') {
				digitoDecimal = 11;
			} else if (digito == 'C') {
				digitoDecimal = 12;
			} else if (digito == 'D') {
				digitoDecimal = 13;
			} else if (digito == 'E') {
				digitoDecimal = 14;
			} else{
				digitoDecimal = 15;
			}	
		}
		
		String binario;
		if(digitoDecimal % 2 == 0) {
			binario = "0";
		} else {
			binario = "1";
		}
		digitoDecimal = digitoDecimal / 2;
		if(digitoDecimal % 2 == 0) {
			binario += "0";
		} else {
			binario += "1";
		}
		digitoDecimal = digitoDecimal / 2;
		if(digitoDecimal % 2 == 0) {
			binario += "0";
		} else {
			binario += "1";
		}
		digitoDecimal = digitoDecimal / 2;
		if(digitoDecimal % 2 == 0) {
			binario += "0";
		} else {
			binario += "1";
		}
		
		StringBuilder strb = new StringBuilder(binario);
		binario = strb.reverse().toString();
		
		System.out.println("En decimal el numero es " + binario);
	}

	public static void trece() {
		System.out.print("Ingresa una letra: ");
		String cadena = sc.next();
		char letra = cadena.charAt(0);
		
		if(Character.isLetter(letra)) {
			letra = Character.toUpperCase(letra);
			if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				System.out.println("Es vocal");
			} else
				System.out.println("Es consonante");
		} else
			System.out.println("Caracter invalido");
	}

	public static void catorce() {
		System.out.print("Ingresa una letra: ");
		String cadena = sc.next();
		char letra = cadena.charAt(0);
		int valor;
		if (letra == 'A') {
			valor = 4;
			System.out.println("Su valor es: " + valor);
		} else if (letra == 'B') {
			valor = 3;
			System.out.println("Su valor es: " + valor);
		} else if (letra == 'C') {
			valor = 2;
			System.out.println("Su valor es: " + valor);
		} else if (letra == 'D') {
			valor = 1;
			System.out.println("Su valor es: " + valor);
		} else if (letra == 'F') {
			valor = 0;
			System.out.println("Su valor es: " + valor);
		} else{
			System.out.println("Es invalido");
		}
		
	}

	public static void quince() {
		System.out.print("Ingresa un caracter: ");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        int numero = 0;
        if (Character.isLetter(ch))
        {
            if (ch >= 'W')
                numero = 9;
            else if (ch >= 'T')
                numero = 8;
            else if (ch >= 'P')
                numero = 7;
            else if (ch >= 'M')
                numero = 6;
            else if (ch >= 'J')
                numero = 5;
            else if (ch >= 'G')
                numero = 4;
            else if (ch >= 'D')
                numero = 3;
            else if (ch >= 'A')
                numero = 2;
            System.out.println("El numero donde se encuentra es " + numero);
        }
        else
            System.out.println(ch + " es invalido");
	}

	public static void dieciseis() {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(123 - 97) + 97;

		System.out.println((char)(numero));
	}

	public static void diecisiete() {
		System.out.print("Ingresa un año: ");
        int anio = sc.nextInt();
        System.out.print("Ingresa un mes (Jan, Feb....ingles pueh .-.): ");
        String mes = sc.next();
        boolean aniovi = ((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0);

            System.out.print(mes + " " + anio + " tiene ");
            
            if ( mes.equals("Jan") || mes.equals("Mar") || 
                  mes.equals("May") || mes.equals("Jul") ||
                  mes.equals("Aug") || mes.equals("Oct") ||
                  mes.equals("Dec"))
                System.out.println(31 + " dias");
            else if (mes.equals("Apr") || mes.equals("Jun") || 
                mes.equals("Sep") || mes.equals("Nov"))
                System.out.println(30 + " dias");
            else
                System.out.println(((aniovi) ? 29 : 28) + " dias");
	}

	public static void dieciocho() {
		System.out.print("Enter two characters: ");
		String str = sc.nextLine();

		char m = Character.toUpperCase(str.charAt(0));
		char s = str.charAt(1); 

		if(m == 'M')
			System.out.print("Mathematics ");
		else if (m == 'C')
			System.out.print("Computer Science ");
		else if (m == 'I')
			System.out.print("Information Technology ");
		else
		
		if(s == '1')
			System.out.println("Freshman");
		else if (s == '1')
			System.out.println("Sophomore");
		else if (s == '1')
			System.out.println("Junior");
		else if (s == '1')
			System.out.println("Senior");
		else
			System.out.println("Invalid input");
		
	}

	public static void diecinueve() {
		System.out.print("Ingresa los primeros 9 digitos del ISBN: ");
		String isbn = sc.nextLine();

		int d1 = Integer.parseInt(isbn.substring(0, 1));
		int d2 = Integer.parseInt(isbn.substring(1, 2));
		int d3 = Integer.parseInt(isbn.substring(2, 3));
		int d4 = Integer.parseInt(isbn.substring(3, 4));
		int d5 = Integer.parseInt(isbn.substring(4, 5));
		int d6 = Integer.parseInt(isbn.substring(5, 6));
		int d7 = Integer.parseInt(isbn.substring(6, 7));
		int d8 = Integer.parseInt(isbn.substring(7, 8));
		int d9 = Integer.parseInt(isbn.substring(8));

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		d10 = d10 % 10;
		if (d10 != 0) {
			isbn += d10;
		} else
			isbn += "X";
		System.out.println("El ISBN-10 es " + isbn);
	}

	public static void veinte() {
		System.out.print("Ingresa una cadena: ");
		String cadena = sc.nextLine();
		int longitud = cadena.length();
		System.out.println("La longitud es de " + longitud + " y el ultimo caracter es " + cadena.charAt(longitud - 1));
	}

	public static void veintiuno() {
		System.out.print("Ingresa el SSN: ");
		String ssn = sc.nextLine();

		if((ssn.length() == 11) && (Character.isDigit(ssn.charAt(0))) &&
				(Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2))) &&
				(ssn.charAt(3) == '-') && (Character.isDigit(ssn.charAt(4))) &&
				(Character.isDigit(ssn.charAt(5))) && (Character.isDigit(ssn.charAt(7))) &&
				(ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(8))) &&
				(Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10)))) {
			System.out.println(ssn + " es valido");
		} else {
			System.out.println(ssn + " es invalido");
		}
			
	}

	public static void veintidos() {
		System.out.print("Ingresa una cadena s1: ");
		String s1 = sc.nextLine();
		System.out.print("Ingresa una cadena s2: ");
		String s2 = sc.nextLine();
		
		if(s1.contains(s2)) {
			System.out.println("la cadena " + s2 + " esta dentro de " + s1);
		} else
			System.out.println("la cadena " + s2 + " NO esta dentro de " + s1);
	}

	public static void veintitres() {
		System.out.print("Nombre del empleado: ");
        String nombre = sc.next(); 
        System.out.print("Horas trabajadas en la semana: ");
        double horasTrabajadas = sc.nextDouble();
        System.out.print("Pago por hora: ");
        double pagoxHora = sc.nextDouble();
        System.out.print("Impuesto federal: ");
        double ratioImpuesto = sc.nextDouble();
        System.out.print("Impuesto estatal: ");
        double otroImpuesto = sc.nextDouble();

        double pagoBruto, federal, estado, totalDeducido;
        
        System.out.print(
            "Nombre del empleado: " + nombre + 
            "\nHoras trabajadas: " + horasTrabajadas +
            "\nRatio de pago: $" + pagoxHora +
            "\nPago en bruto: $" + (pagoBruto = horasTrabajadas * pagoxHora) +
            "\nDeducciones:\n   Federales (20.0%): $" +
            (federal = pagoBruto * ratioImpuesto) +
            "\n   Estatal (9.0%): $" + (estado = pagoBruto * otroImpuesto) +
            "\n   Total de deducciones: $" + (totalDeducido = federal + estado) +
            "\nPago neto: $" + (pagoBruto - totalDeducido));
	}

	public static void vienticuatro() {
		System.out.print("Ingesa la primer ciudad: ");
        String ciudad1 = sc.nextLine();
        System.out.print("Ingesa la segunda ciudad: ");
        String ciudad2 = sc.nextLine();
        System.out.print("Ingesa la tercer ciudad: ");
        String ciudad3 = sc.nextLine();

        String flag;
        if ((ciudad2.compareTo(ciudad1) < 0) && (ciudad2.compareTo(ciudad3) < 0)) {
            flag = ciudad1;
            ciudad1 = ciudad2;
            ciudad2 = flag;   
        }
        else if ((ciudad3.compareTo(ciudad1) < 0) && (ciudad3.compareTo(ciudad2) < 0)) {
            flag = ciudad1;
            ciudad1 = ciudad3;
            ciudad3 = flag;
            
        }
        
        if (ciudad3.compareTo(ciudad2) < 0){
            flag = ciudad2;
            ciudad2 = ciudad3;
            ciudad3 = flag;
        }

        System.out.println("El orden alfabetico de las ciudades es " +
            ciudad1 + " " + ciudad2 + " " + ciudad3);
	}

	public static void veinticinco() {
		Random aleatorio = new Random();
		int l1 = aleatorio.nextInt(90 - 65) + 65;
		int l2 = aleatorio.nextInt(90 - 65) + 65;
		int l3 = aleatorio.nextInt(90 - 65) + 65;	

		// Generate four random digits
		int n1 = aleatorio.nextInt(10 - 1) + 1;
		int n2 = aleatorio.nextInt(10 - 1) + 1;
		int n3 = aleatorio.nextInt(10 - 1) + 1;
		int n4 = aleatorio.nextInt(10 - 1) + 1;
		n1--;
		n2--;
		n3--;
		n4--;

		System.out.println("" + (char)(l1) + ((char)(l2)) + 
			((char)(l3)) + n1 + "" + n2 + "" + n3 + "" + n4);
	}

	public static void veintiseis() {
		// Create a Scanner
				Scanner input = new Scanner(System.in);

				// Receive the amount
				System.out.print("Enter an amount, for example 11.56: ");
				String amount = input.nextLine();

				// Extract number of dollars
				String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

				// Extract cents
				int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

				// Find the number of quarters
				int numberOfQuarters = cents / 25;
				cents %= 25;

				// Find the number of dimes
				int numberOfDimes = cents / 10;
				cents %= 10;

				// Find the number of nickels
				int numberOfNickels = cents / 5;
				cents %= 5;

				// Display results
				System.out.println("Your amount " + amount + " consists of\n " 
					+ numberOfOneDollars + " dollars\n " 
					+ numberOfQuarters + " quarters\n "
					+ numberOfDimes + " dimes\n "
					+ numberOfNickels + " nickels\n "
					+ cents + " pennies\n "
					);
	}
}
