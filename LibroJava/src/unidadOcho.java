import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class unidadOcho {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");
	private static final DecimalFormat df1 = new DecimalFormat("0.0");

	public static void uno() {
		System.out.println("Ingresa los valores de una matriz de 4x3: ");
		double[][] m = new double[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("la suma de la fila 1 es: " + sumRow(m, i));
		}

	}

	public static double sumRow(double[][] m, int rowIndex) {
		double res = 0;
		for (int i = 0; i < 4; i++) {
			res += m[rowIndex][i];
		}
		return res;
	}

	public static void dos() {
		System.out.println("Ingresa los valores de una matriz de 4x4: ");
		double[][] m = new double[3][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
	}

	public static double averageMajorDiagonal(double[][] m) {
		double res = 0;
		for (int i = 0; i < 4; i++) {
			res += m[i][i];
		}
		return res / 4;
	}

	public static void tres() {
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		// Students' number and correct answers
		int[][] correctCounts = new int[answers.length][2];

		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					correctCounts[i][0] = i;
					correctCounts[i][1]++;
				}
			}

		}
	}

	public static void ordena(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int columna1 = m[i][1];
			int columna0 = m[i][0];
			int temp = i;
			for (int j = i + 1; j < m.length; j++) {
				if (columna1 > m[j][1]) {
					columna1 = m[j][1];
					columna0 = m[j][0];
					temp = j;
				}
			}
			if (temp != i) {
				m[temp][1] = m[i][1];
				m[temp][0] = m[i][0];
				m[i][1] = columna1;
				m[i][0] = columna0;
			}
		}
	}

	public static void cuatro() {
		int[][] m = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 }, };

		int[][] total = new int[m.length][2];

		for (int i = 0; i < m.length; i++) {
			total[i][0] = i;
			total[i][1] = 0;
			for (int col = 0; col < m[i].length; col++) {
				total[i][1] += m[i][col];
			}
		}
		ordena(total);
		System.out.println("Empleado\tHorasSemanales");
		for (int i = 0; i < m.length; i++) {
			System.out.println(total[i][0] + "\t\t" + total[i][1]);
		}
	}

	public static void cinco() {
		System.out.print("Ingresa los valores de una matriz de 2x2: ");
		double[][] m = new double[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		System.out.print("Ingresa los valores de una matriz de 2x2: ");
		double[][] m2 = new double[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				m2[i][j] = sc.nextDouble();
			}
		}
		double[][] m3 = addMatrix(m, m2);

		for (int i = 0; i < 2; i++) {
			System.out.println(m[i][0] + "\t" + m[i][1] + "\t+\t" + m2[i][0] + "\t" + m2[i][1] + "\t=\t" + m3[i][0]
					+ "\t" + m3[i][1]);
		}

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] m = new double[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				m[i][j] = a[i][j] + b[i][j];
			}
		}
		return m;
	}

	public static void seis() {
		System.out.print("Ingresa los valores de una matriz de 3x3: ");
		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		System.out.print("Ingresa los valores de una matriz de 3x3: ");
		double[][] m2 = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m2[i][j] = sc.nextDouble();
			}
		}
		double[][] m3 = multiplyMatrix(m, m2);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.print((i == 1 ? "*\t" : "\t"));
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + "\t");
			}
			System.out.print((i == 1 ? "=\t" : "\t"));
			for (int j = 0; j < m3[i].length; j++) {
				System.out.print(df1.format(m3[i][j]) + "\t");
			}
			System.out.println();
		}
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] m = new double[3][3];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int h = 0; h < m.length; h++) {
					m[i][j] += a[i][h] * b[h][j];
				}
			}
		}
		return m;
	}

	public static void siete() {
		double[][] points = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 },
				{ -1.5, 4, 2 }, { 5.5, 4, -0.5 } };

		// p1 and p2 are the indices in the points' array
		int p1 = 0, p2 = 1, p3 = 3; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][p1],
				points[p3][p2]); // Initialize shortest Distance

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
						points[j][2]); // Find distance

				if (shortestDistance > distance) {
					p1 = i; // Update p1
					p2 = j; // Update p2
					shortestDistance = distance; // Update shortestDistance
				}
			}
		}

		// Display result
		System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and ("
				+ points[p2][0] + ", " + points[p2][1] + ")");
	}

	/** Compute the distance between two points (x1, y1) and (x2, y2) */
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2));
	}

	public static void ocho() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		// p1 and p2 are the indices in the points' array
		int p1 = 0, p2 = 1; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][p1]); // Initialize
																											// shortest
																											// Distance

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance

				if (shortestDistance > distance) {
					p1 = i; // Update p1
					p2 = j; // Update p2
					shortestDistance = distance; // Update shortestDistance
				}
			}
		}

		// Display result
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (distance(points[i][0], points[i][1], points[j][0], points[j][1]) == shortestDistance)
					System.out.println("The closest two points are " + "(" + points[i][0] + ", " + points[i][1]
							+ ") and (" + points[j][0] + ", " + points[j][1] + ")");
			}
		}
		System.out.println("Ther distance is " + shortestDistance);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static void nueve() {
		char[][] tablero = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero[i][j] = ' ';
			}
		}
		boolean flag = false, flagTiro = false;
		imprime(tablero);
		int x = 0, y = 0;
		char ganador;
		while (true) {
			if (comprobacionEspacios(tablero)) {
				break;
			}
			flagTiro = false;
			while (flagTiro == false) {
				System.out.print("Turno de X, ingresa (0,1 o 2) fila: ");
				x = sc.nextInt();
				System.out.print("Turno de X, ingresa (0,1 o 2) columna: ");
				y = sc.nextInt();
				flagTiro = tiroX(tablero, x, y);
			}
			flagTiro = false;
			imprime(tablero);
			ganador = hayGanador(tablero);
			if (ganador == 'X') {
				System.out.println("Gano jugador X");
				break;
			} else if (ganador == 'O') {
				System.out.println("Gano jugador O");
				break;
			}
			if (comprobacionEspacios(tablero)) {
				break;
			}
			flagTiro = false;
			while (flagTiro == false) {
				System.out.print("Turno de O, ingresa (0,1 o 2) fila: ");
				x = sc.nextInt();
				System.out.print("Turno de O, ingresa (0,1 o 2) columna: ");
				y = sc.nextInt();
				flagTiro = tiroO(tablero, x, y);
				;
			}
			flagTiro = false;
			imprime(tablero);
			ganador = hayGanador(tablero);
			if (ganador == 'X') {
				System.out.println("Gano jugador X");
				break;
			} else if (ganador == 'O') {
				System.out.println("Gano jugador O");
				break;
			}
		}
	}

	public static void imprime(char[][] m) {
		System.out.println("\n+-+-+-+");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("|" + m[i][j]);
			}
			System.out.println("|\n+-+-+-+");
		}
	}

	public static boolean comprobacionEspacios(char[][] m) {
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m[i][j] != ' ')
					cont++;
			}
		}
		if (cont == 9) {
			return true;
		}
		return false;
	}

	public static boolean tiroX(char[][] m, int x, int y) {
		if (m[x][y] == ' ') {
			m[x][y] = 'X';
			return true;
		} else {
			System.out.println("Tiro invalido");
			return false;
		}
	}

	public static boolean tiroO(char[][] m, int x, int y) {
		if (m[x][y] == ' ') {
			m[x][y] = 'O';
			return true;
		} else {
			System.out.println("Tiro invalido");
			return false;
		}
	}

	public static char hayGanador(char[][] m) {
		char flag = 'n';
		if ((m[0][0] == 'X' && m[0][1] == 'X' && m[0][2] == 'X') || (m[0][0] == 'X' && m[1][0] == 'X' && m[2][0] == 'X')
				|| (m[0][0] == 'X' && m[1][1] == 'X' && m[2][2] == 'X')
				|| (m[2][0] == 'X' && m[2][1] == 'X' && m[2][2] == 'X')
				|| (m[1][0] == 'X' && m[1][1] == 'X' && m[1][2] == 'X')
				|| (m[2][0] == 'X' && m[1][1] == 'X' && m[0][2] == 'X')
				|| (m[0][1] == 'X' && m[1][1] == 'X' && m[2][1] == 'X')
				|| (m[0][2] == 'X' && m[1][2] == 'X' && m[2][2] == 'X')) {
			flag = 'X';
		} else if ((m[0][0] == 'O' && m[0][1] == 'O' && m[0][2] == 'O')
				|| (m[0][0] == 'O' && m[1][0] == 'O' && m[2][0] == 'O')
				|| (m[0][0] == 'O' && m[1][1] == 'O' && m[2][2] == 'O')
				|| (m[2][0] == 'O' && m[2][1] == 'O' && m[2][2] == 'O')
				|| (m[1][0] == 'O' && m[1][1] == 'O' && m[1][2] == 'O')
				|| (m[2][0] == 'O' && m[1][1] == 'O' && m[0][2] == 'O')
				|| (m[0][1] == 'O' && m[1][1] == 'O' && m[2][1] == 'O')
				|| (m[0][2] == 'O' && m[1][2] == 'O' && m[2][2] == 'O')) {
			flag = 'O';
		}
		return flag;
	}

	public static void diez() {
		int[][] m = new int[5][5];
		int contX = 0, contY = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		System.out.println("La fila con mas 1 es: " + buscarLineaLarga(m));
		System.out.println("La columna con mas 1 es: " + buscarColumnaLarga(m));
	}

	public static int buscarLineaLarga(int[][] m) {
		int numFila = 0;
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				numFila = i;
			}
		}
		return numFila;
	}

	public static int buscarColumnaLarga(int[][] m) {
		int numColumna = 0;
		int max = 0;
		for (int col = 0; col < m[0].length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				numColumna = col;
			}
		}
		return numColumna;
	}

	public static void once() {
		System.out.print("Ingresa un valor decimal (0 - 511): ");
		int decimal = sc.nextInt();
		String binario = "";
		for (int i = decimal; i > 0; i /= 2) {
			binario = (i % 2) + binario;
		}
		binario = "1" + binario;
		int cont = 0, limite = binario.length() - 1;
		int[][] m = new int[3][3];
		if (decimal == 0) {
			for (int i = (m.length - 1); i >= 0; i--) {
				for (int j = (m[i].length - 1); j >= 0; j--) {
					m[i][j] = 0;
				}
			}
		} else {
			for (int i = (m.length - 1); i >= 0; i--) {
				for (int j = (m[i].length - 1); j >= 0; j--) {
					if (limite > 0)
						m[i][j] = Character.getNumericValue(binario.charAt(limite));
					if (limite != 0)
						limite--;
				}
			}
		}
		imprimirMatrizTransformada(m);
	}

	public static void imprimirMatrizTransformada(int[][] m1) {
		char[][] m = new char[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m1[i][j] == 0) {
					m[i][j] = 'H';
				} else
					m[i][j] = 'T';
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void doce() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Tax rates
		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };

		// The brackets for each rate for all the filing statuses
		int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, // Single filer
				{ 16700, 67900, 137050, 20885, 372950 }, // Married jointly
															// -or qualifying widow(er)
				{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
				{ 11950, 45500, 117450, 190200, 372950 } // Head of household
		};

		// Prompt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly or "
				+ "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");
		int status = getStatus();

		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		// Display the result
		System.out.printf("Tax is $%6.2f\n", computeTax(brackets, rates, status, income));
	}

	/**
	 * computeTax computes and returns the total tax for the filing status brackets
	 */
	public static double computeTax(int[][] brackets, double[] rates, int status, double income) {
		double tax = 0, incomeTaxed = 0;
		for (int i = 4; i >= 0; i--) {
			if (income > brackets[status][i])
				tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
			income -= incomeTaxed;
		}
		return tax += brackets[status][0] * rates[0];
	}

	/** getStatus returns a valid status */
	public static int getStatus() {
		Scanner input = new Scanner(System.in);
		int status;
		do {
			status = input.nextInt();
			if (status < 0 || status > 3)
				System.out.println("Error: invalid status");
		} while (status < 0 || status > 3);
		return status;
	}

	public static void trece() {
		System.out.print("Ingresa el numero de filas y columnas de una matriz: ");
		int fila = sc.nextInt();
		int columna = sc.nextInt();
		double[][] m = new double[fila][columna];
		System.out.println("Ingresa los numeros:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		int[] minimo = locateSmallest(m);
		System.out.println("Las cordenadas del valor mas pequeño es: (" + minimo[0] + ", " + minimo[1] + ")");
	}

	public static int[] locateSmallest(double[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					l[0] = i;
					l[1] = j;
					min = a[i][j];
				}
			}
		}
		return l;
	}

	public static void catorce() {
		System.out.print("Ingresa el numero de filas de una matriz cuadrada: ");
		int num = sc.nextInt();
		int[][] m = new int[num][num];
		int contX = 0, contY = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		int[] filasv = filas(m);
		int cont = 0;
		for (int i = 0; i < filasv.length; i++) {
			if (filasv[i] >= 0)
				System.out.println("Todos los " + filasv[i] + "s estan en la fila " + (i + 1));
			else
				cont++;
			if (cont == filasv.length)
				System.out.println("Sin coincidencias en filas");
		}
		int[] columnasv = columnas(m);
		cont = 0;
		for (int i = 0; i < columnasv.length; i++) {
			if (columnasv[i] >= 0)
				System.out.println("Todos los " + columnasv[i] + "s estan en la columna " + (i + 1));
			else
				cont++;
			if (cont == columnasv.length)
				System.out.println("Sin coincidencias en columnas");
		}
		int v = diagonal(m);
		if (v == 1 || v == 0) {
			System.out.println("Todos los " + v + "s estan en la diagonal");
		} else {
			System.out.println("Sin coincidencias en la diagonal");
		}
		v = diagonalInvertida(m);
		if (v == 1 || v == 0) {
			System.out.println("Todos los " + v + "s estan en la diagonal invertida");
		} else {
			System.out.println("Sin coincidencias en la diagonal invertida");
		}
	}

	public static int diagonalInvertida(int[][] m) {
		int[] arreglo = new int[2];
		arreglo[0] = 0;
		arreglo[1] = 0;
		for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
			arreglo[m[i][j]]++;
			if (arreglo[0] == m.length)
				return 0;
			if (arreglo[1] == m.length)
				return 1;
		}
		return 2;
	}

	public static int diagonal(int[][] m) {
		int[] arreglo = new int[2];
		arreglo[0] = 0;
		arreglo[1] = 0;
		for (int i = 0; i < m.length; i++) {
			arreglo[m[i][i]]++;
			if (arreglo[0] == m.length)
				return 0;
			if (arreglo[1] == m.length)
				return 1;
		}
		return 2;
	}

	public static int[] columnas(int[][] m) {
		int[] res = new int[m.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = -1;
		}

		int[] arreglo = new int[2];
		for (int i = 0; i < m.length; i++) {
			arreglo[0] = 0;
			arreglo[1] = 0;

			for (int j = 0; j < m[i].length; j++) {
				arreglo[m[j][i]]++;
				if (arreglo[0] < j + 1 && arreglo[1] < j + 1) {
					break;
				}
			}

			if (arreglo[0] >= m.length || arreglo[1] >= m.length)
				res[i] = arreglo[0] > arreglo[1] ? 0 : 1;
		}
		return res;
	}

	public static int[] filas(int[][] m) {
		int[] res = new int[m.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = -1;
		}
		int[] arreglo = new int[2];
		for (int i = 0; i < m.length; i++) {
			arreglo[0] = 0;
			arreglo[1] = 0;

			for (int j = 0; j < m[i].length; j++) {
				arreglo[m[i][j]]++;
				if (arreglo[0] < j + 1 && arreglo[1] < j + 1) {
					break;
				}
			}

			if (arreglo[0] >= m.length || arreglo[1] >= m.length)
				res[i] = arreglo[0] > arreglo[1] ? 0 : 1;
		}
		return res;
	}

	public static void quince() {
		double[][] puntos = new double[5][2];
		System.out.print("Ingresa los 5 puntos: ");
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Los 5 puntos" + (sameLine(puntos) ? " " : " no ") + "estan en la misma linea");
	}

	public static boolean sameLine(double[][] puntos) {
		for (int i = 0; i < puntos.length - 2; i += 3) {
			if (pointPosition(puntos[i][0], puntos[i][1], puntos[i + 1][0], puntos[i + 1][1], puntos[i + 2][0],
					puntos[i + 2][1]) != 0) {
				return false;
			}
		}
		return true;
	}

	public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}

	public static void dieciseis() {
		int[][] arreglo = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sort(arreglo);
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.print(arreglo[i][j] + " ");
			}
			System.out.print(" ");
		}
	}

//-------------------------------------revision a fondo de algoritmo(checar con BbS)
	public static void sort(int m[][]) {
		int[] min = new int[2];
		for (int row = 0; row < m.length - 1; row++) {
			min[0] = m[row][0];
			min[1] = m[row][1];
			int index = row;
			for (int i = row + 1; i < m.length; i++) {
				if (m[i][0] >= min[0] && (m[i][0] >= min[1] || m[i][1] > min[0] || m[i][1] > min[1])) {
					min[0] = m[i][0];
					min[1] = m[i][1];
					index = i;
				}
			}
			if (index != row) {
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				m[row][0] = min[0];
				m[row][1] = min[1];
			}

		}
	}

	public static void diecisiete() {

	}

	public static void dieciocho() {
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		System.out.println("Original");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("shuffle");
		shuffle(m);
	}

	public static void shuffle(int[][] m) {
		int[] temp = new int[2];
		for (int i = 0; i < m.length; i++) {
			int i1 = (int) (Math.random() * m.length);
			temp[0] = m[i][0];
			temp[1] = m[i][1];
			m[i][0] = m[i1][0];
			m[i][1] = m[i1][1];
			m[i1][0] = temp[0];
			m[i1][1] = temp[1];
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void diecinueve() {
		System.out.print("Ingresa el numero de filas y columnas del arreglo(mayor a 4x4): ");
		int filas = sc.nextInt();
		int columnas = sc.nextInt();
		int[][] m = new int[filas][columnas];
		System.out.println("Ingresa los valores: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextInt();
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println((isConsecutiveFour(m) ? "Si " : "No ") + "hay cuatro numeros consecutivos");
	}

	public static boolean isConsecutiveFour(int[][] values) {
		boolean veredicto = false;
		System.out.println("Ingresa los valores: ");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				if (i < (values.length - 3) && j < (values[i].length - 3)) {
					if ((values[i][j] == values[i][j + 1] && values[i][j] == values[i][j + 2]
							&& values[i][j] == values[i][j + 3])
							|| (values[i][j] == values[i + 1][j] && values[i][j] == values[i + 2][j]
									&& values[i][j] == values[i + 3][j])
							|| (values[i][j] == values[i + 1][j + 1] && values[i][j] == values[i + 2][j + 2]
									&& values[i][j] == values[i + 3][j + 3])) {
						veredicto = true;
					}
				} else if (i < (values.length - 3) && j >= (values[i].length - 3)) {
					if ((values[i][j] == values[i + 1][j] && values[i][j] == values[i + 2][j]
							&& values[i][j] == values[i + 3][j])) {
						veredicto = true;
					}
				} else if (i >= (values.length - 3) && j < (values[i].length - 3)) {
					if ((values[i][j] == values[i][j + 1] && values[i][j] == values[i][j + 2]
							&& values[i][j] == values[i][j] + 3)
							|| (values[i][j] == values[i - 1][j + 1] && values[i][j] == values[i - 2][j + 2]
									&& values[i][j] == values[i - 3][j] + 3)) {
						veredicto = true;
					}
				}
			}
		}
		return veredicto;
	}

	public static void veinte() {
		char[][] tablero = new char[6][7];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = ' ';
			}
		}
		imprime2(tablero);
		int x;
		boolean flag = false;
		while (true) {
			while (true) {
				System.out.print("Truno del jugador R(Ingresa 0-6): ");
				x = sc.nextInt();
				flag = tiroR(tablero, x);
				if (flag) {
					break;
				} else {
					System.out.println("Tiro no valido, tira de nuez");
				}
			}
			imprime2(tablero);
			if (hayGanador2(tablero) == 1) {
				System.out.println("Gano el jugador R");
				break;
			} else if (hayGanador2(tablero) == 2) {
				System.out.println("Gano el jugador Y");
				break;
			}
			while (true) {
				System.out.print("Truno del jugador Y(Ingresa 0-6): ");
				x = sc.nextInt();
				flag = tiroY(tablero, x);
				if (flag) {
					break;
				} else {
					System.out.println("Tiro no valido, tira de nuez");
				}
			}
			imprime2(tablero);
			if (hayGanador2(tablero) == 1) {
				System.out.println("Gano el jugador R");
				break;
			} else if (hayGanador2(tablero) == 2) {
				System.out.println("Gano el jugador Y");
				break;
			}
		}

	}

	public static void imprime2(char[][] m) {
		System.out.println("\n+-+-+-+-+-+-+-+");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("|" + m[i][j]);
			}
			System.out.println("|\n+-+-+-+-+-+-+-+");
		}
	}

	public static boolean tiroR(char[][] m, int x) {
		boolean flag = false;
		if (m[0][x] != ' ') {
			flag = false;
		} else {
			for (int i = (m.length - 1); i >= 0; i--) {
				if (m[i][x] == ' ') {
					m[i][x] = 'R';
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static boolean tiroY(char[][] m, int x) {
		boolean flag = false;
		if (m[0][x] != ' ') {
			flag = false;
		} else {
			for (int i = (m.length - 1); i >= 0; i--) {
				if (m[i][x] == ' ') {
					m[i][x] = 'Y';
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static int hayGanador2(char[][] values) {
		int veredicto = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				if (i < (values.length - 3) && j < (values[i].length - 3)) {
					if ((values[i][j] == values[i][j + 1] && values[i][j] == values[i][j + 2]
							&& values[i][j] == values[i][j + 3])
							|| (values[i][j] == values[i + 1][j] && values[i][j] == values[i + 2][j]
									&& values[i][j] == values[i + 3][j])
							|| (values[i][j] == values[i + 1][j + 1] && values[i][j] == values[i + 2][j + 2]
									&& values[i][j] == values[i + 3][j + 3])) {
						if (values[i][j] == 'R') {
							veredicto = 1;
						} else if (values[i][j] == 'Y') {
							veredicto = 2;
						}
					}
				} else if (i < (values.length - 3) && j >= (values[i].length - 3)) {
					if ((values[i][j] == values[i + 1][j] && values[i][j] == values[i + 2][j]
							&& values[i][j] == values[i + 3][j])) {
						if (values[i][j] == 'R') {
							veredicto = 1;
						} else if (values[i][j] == 'Y') {
							veredicto = 2;
						}
					}
				} else if (i >= (values.length - 3) && j < (values[i].length - 3)) {
					if ((values[i][j] == values[i][j + 1] && values[i][j] == values[i][j + 2]
							&& values[i][j] == values[i][j] + 3)
							|| (values[i][j] == values[i - 1][j + 1] && values[i][j] == values[i - 2][j + 2]
									&& values[i][j] == values[i - 3][j] + 3)) {
						if (values[i][j] == 'R') {
							veredicto = 1;
						} else if (values[i][j] == 'Y') {
							veredicto = 2;
						}
					}
				}
			}
		}
		return veredicto;
	}

	public static void veintiuno() {
		System.out.print("Ingresa el numero de puntos: ");
		double[][] puntos = new double[sc.nextInt()][2];
		System.out.print("Ingresa las coordenadas de los puntos: ");
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();
			}
		}
		double[][] distancia = distanciaTotal(puntos);
		menorPuntos(distancia);
	}

	public static double[][] distanciaTotal(double[][] puntos) {
		double[][] distancia = new double[puntos.length][puntos[0].length];
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				distancia[i][j] = 0;
			}
		}
		for (int i = 0; i < puntos.length; i++) {
			distancia[i][0] = i;
			for (int j = 0; j < puntos.length; j++) {
				if (i != j) {
					distancia[i][1] += Math.sqrt((Math.pow((puntos[j][0] - puntos[i][0]), 2))
							+ (Math.pow((puntos[j][1] - puntos[i][1]), 2)));
				}
			}
		}
		return distancia;
	}

	public static void menorPuntos(double[][] distancia) {
		double[][] min = new double[1][2];
		min[0][0] = distancia[0][0];
		min[0][1] = distancia[0][1];
		for (int i = 1; i < distancia.length; i++) {
			if (min[0][1] > distancia[i][1]) {
				min[0][0] = distancia[i][0];
				min[0][1] = distancia[i][1];
			}
		}
		System.out.println(
				"El punto central es el " + df0.format(min[0][0]) + " con una distancia de " + df.format(min[0][1]));
	}

	public static void veintidos() {
		int[][] m = new int[6][6];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("En las filas" + (filasT1(m) ? " " : " no " + "se conforman de 1s"));
		System.out.println("En las columna" + (columasT1(m) ? " " : " no " + "se conforman de 1s"));
	}

	public static boolean filasT1(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count % 2 != 0)
				return false;
		}
		return true;
	}

	public static boolean columasT1(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1)
					count++;
			}
			if (count % 2 != 0)
				return false;
		}
		return true;
	}

	public static void veintitres() {
		int[][] m = new int[6][6];
		System.out.println("Ingresa los valores de una matriz 6x6:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		int fila = filasImpares(m);
		int columna = columnasImpares(m);
		if (fila < 0 || columna < 0)
			System.out.println("No se ha intercambiado ninguna celda");
		else {
			System.out.println("Las celdas intercambiadas son (" + fila + ", " + columna + ")");
		}
	}

	public static int filasImpares(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int cont = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					cont++;
			}
			if (cont % 2 != 0)
				return i;
		}
		return -1;
	}

	public static int columnasImpares(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int cont = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] == 1)
					cont++;
			}
			if (cont % 2 != 0)
				return i;
		}
		return -1;
	}

	public static void vienticuatro() {

	}

	public static int[][] readASolution() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();

		return grid;
	}
	public static boolean isValid(int[][] grid) {

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
					return false;
		return true;
	}
	public static boolean isValid(int i, int j, int[][] grid) {
		for (int column = 0; column < 9; column++)
			if (column != j && grid[i][column] == grid[i][j])
				return false;

		for (int row = 0; row < 9; row++)
			if (row != i && grid[row][j] == grid[i][j])
				return false;
		for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
			for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
				if (!(row == i && col == j) && grid[row][col] == grid[i][j])
					return false;

		return true; 
	}

	public static void veinticinco() {
		double[][] m = new double[3][3];
		System.out.println("Ingresa un matriz de 3x3:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Esta" + (esMarkov(m) ? " " : " no ") + "es una matriz de Markov");
	}

	public static boolean esMarkov(double[][] m) {
		return esPositivo(m) && columnaSum1(m);
	}

	public static boolean esPositivo(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0)
					return false;
			}
		}
		return true;
	}

	public static boolean columnaSum1(double[][] m) {
		for (int columna = 0; columna < m.length; columna++) {
			double sum = 0;
			for (int fila = 0; fila < m.length; fila++) {
				sum += m[fila][columna];
			}
			if (sum != 1)
				return false;
		}
		return true;
	}

	public static void veintiseis() {
		double[][] m = new double[4][4];
		System.out.println("Ingresa los valores de una matriz 4x4:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		double[][] m2 = sortRows(m);
		System.out.println("Filas ordenadas");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] m) {
		double[][] s = new double[m.length][m[0].length];
		clonarMatriz(m, s);
		for (int filas = 0; filas < s.length; filas++) {
			for (int columnas = 0; columnas < s.length - 1; columnas++) {
				double min = s[filas][columnas];
				int index = columnas;
				for (int j = columnas + 1; j < s.length; j++) {
					if (min > s[filas][j]) {
						min = s[filas][j];
						index = j;
					}
				}
				if (index != columnas) {
					s[filas][index] = s[filas][columnas];
					s[filas][columnas] = min;
				}
			}
		}
		return s;
	}

	public static void clonarMatriz(double[][] original, double[][] copia) {
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				copia[i][j] = original[i][j];
			}
		}
	}

	public static void veintisiete() {
		double[][] m = new double[4][4];
		System.out.println("Ingresa los valores de una matriz 4x4:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		double[][] m2 = sortColumns(m);
		System.out.println("Filas ordenadas");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortColumns(double[][] m) {
		double[][] s = new double[m.length][m[0].length];
		clonarMatriz(m, s);
		for (int columna = 0; columna < s.length; columna++) {
			for (int filas = 0; filas < s.length - 1; filas++) {
				double min = s[filas][columna];
				int index = filas;
				for (int j = filas + 1; j < s.length; j++) {
					if (min > s[j][columna]) {
						min = s[j][columna];
						index = j;
					}
				}
				if (index != filas) {
					s[index][columna] = s[filas][columna];
					s[filas][columna] = min;
				}
			}
		}
		return s;
	}

	public static void veintiocho() {
		System.out.print("Ingresa la primer lista: ");
		int[][] m = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.print("Ingresa la segunda lista: ");
		int[][] m2 = new int[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Los dos arreglos" + (equals(m, m2) ? " " : " no ") + "son identicos");
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}

	public static void veintinueve() {
		System.out.print("Ingresa la primer lista: ");
		int[][] m = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.print("Ingresa la segunda lista: ");
		int[][] m2 = new int[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Los dos arreglos" + (equals(m, m2) ? " " : " no ") + "contienen los mismos valores");
	}

	public static boolean equals2(int[][] m1, int[][] m2) {
		int[] list1 = ordena2(m1);
		int[] list2 = ordena2(m2);
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}

	public static int[] matrizArreglo(int[][] m) {
		int[] list = new int[m.length * m[0].length];
		int k = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				list[k] = m[i][j];
				k++;
			}
		}
		return list;
	}

	public static int[] ordena2(int[][] m) {
		int[] list = matrizArreglo(m);
		for (int i = 0; i < 3; i++) {
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < 3; j++) {
				if (min > list[j]) {
					min = list[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
		return list;
	}

	public static void treinta() {
		double[][] a = new double[2][2];
		double[] b = new double[2];
		System.out.println("Ingresa a00, a01, a10, a11, b0, and b1:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextDouble();
		}
		double[] resultado = linearEquation(a, b);
		if (resultado == null)
			System.out.println("La ecuacion no tiene solucion");
		else {
			System.out.println("x es " + resultado[0] + " e y es " + resultado[1]);
		}
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
			return null;
		double[] r = new double[2];
		r[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		r[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		return r;
	}

	public static void treintayuno() {
		double[][] puntos = new double[4][2];
		System.out.println("Ingresa cuatro puntos:");
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();
			}
		}
		double[] resultado = getIntersectingPoint(puntos);
		if (resultado == null)
			System.out.println("Ambas lineas son paralelas");
		else {
			System.out.println("El punto de interseccion es (" + resultado[0] + ", " + resultado[1] + ")");
		}

	}

	public static double[] getIntersectingPoint(double[][] puntos) {
		double[][] a = new double[2][2];
		double[] b = new double[2];
		a[0][0] = puntos[0][1] - puntos[1][1];
		a[0][1] = -1 * (puntos[0][0] - puntos[1][0]);
		a[1][0] = puntos[2][1] - puntos[3][1];
		a[1][1] = -1 * (puntos[2][0] - puntos[3][0]);
		b[0] = (puntos[0][1] - puntos[1][1]) * puntos[0][0] - (puntos[0][0] - puntos[1][0]) * puntos[0][1];
		b[1] = (puntos[2][1] - puntos[3][1]) * puntos[2][0] - (puntos[2][0] - puntos[3][0]) * puntos[2][1];

		return linearEquation(a, b);
	}

	public static void treintaydos() {
		double[][] puntos = new double[3][2];
		System.out.print("Ingresa x1, y1, x2, y2, x3, y3: ");
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();

			}
		}
		double resultado = getTriangleArea(puntos);
		if (resultado == 0) {
			System.out.println("Los puntos estan en la misma linea");
		} else {
			System.out.println("El area del triangulo es " + df.format(resultado));
		}
	}

	public static double getTriangleArea(double[][] points) {
		if (estanAlineados(points)) {
			return 0;
		}
		double s1 = obtenS(points[0][0], points[0][1], points[1][0], points[1][1]);
		double s2 = obtenS(points[1][0], points[1][1], points[2][0], points[2][1]);
		double s3 = obtenS(points[0][0], points[0][1], points[2][0], points[2][1]);
		double s = (s1 + s2 + s3) / 2;
		return Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));
	}

	public static double obtenS(double x1, double y1, double x2, double y2) {
		return Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
	}

	public static boolean estanAlineados(double[][] puntos) {
		double d = (puntos[1][0] - puntos[0][0]) * (puntos[2][1] - puntos[0][1])
				- (puntos[2][0] - puntos[0][0]) * (puntos[1][1] - puntos[0][1]);
		if (d == 0) {
			return true;
		} else
			return false;
	}

	public static void treintaytres() {
		double[][] puntos = new double[4][2];
		System.out.println("Ingresa x1, y1, x2, y2, x3, y3, x4, y4: ");
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();
			}
		}
		double[] areas = new double[4];
		double[] puntoInterseccion = puntosInterseccion(puntos);
		double[][] t1 = new double[3][3];
		t1[0] = puntos[0];
		t1[1] = puntos[1];
		t1[2] = puntoInterseccion;
		areas[0] = getTriangleArea(t1);
		double[][] t2 = new double[3][3];
		t2[0] = puntos[1];
		t2[1] = puntos[2];
		t2[2] = puntoInterseccion;
		areas[1] = getTriangleArea(t2);
		double[][] t3 = new double[3][3];
		t3[0] = puntos[2];
		t3[1] = puntos[3];
		t3[2] = puntoInterseccion;
		areas[2] = getTriangleArea(t3);
		double[][] t4 = new double[3][3];
		t4[0] = puntos[0];
		t4[1] = puntos[3];
		t4[2] = puntoInterseccion;
		areas[3] = getTriangleArea(t4);

		System.out.println("Las areas son: ");
		for (int i = 0; i < areas.length; i++) {
			System.out.println(areas[i] + " ");
		}
	}

	public static double[] puntosInterseccion(double[][] puntos) {
		double x1 = puntos[0][0];
		double y1 = puntos[0][1];
		double x2 = puntos[2][0];
		double y2 = puntos[2][1];
		double x3 = puntos[1][0];
		double y3 = puntos[1][1];
		double x4 = puntos[3][0];
		double y4 = puntos[3][1];
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double D = a * d - b * c;
		double Dx = e * d - b * f;
		double Dy = a * f - e * c;
		double x = Dx / D;
		double y = Dy / D;

		return new double[] { x, y };
	}

	public static void treintaycuatro() {
		double[][] puntos = new double[6][2];
		System.out.print("Ingresa 6 puntos: ");
		for (int i = 0; i < puntos.length; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				puntos[i][j] = sc.nextDouble();
			}
		}
		double[] res = getRightmostLowestPoint(puntos);
		System.out.print("El punto mas pegado a la derecha es (" + res[0] + ", " + res[1] + ")");
	}

	public static double[] getRightmostLowestPoint(double[][] points) {
		double[] pequeDerecha = points[0];
		double[][] peques = new double[3][2];
		for (int i = 1; i < points.length; i++) {
			if (pequeDerecha[1] > points[i][1]) {
				pequeDerecha = points[i];
			} else if (pequeDerecha[1] == points[i][1]) {
				for (int j = 0; j < peques.length; j++) {
					if (peques[j][0] == 0.0 && peques[j][1] == 0.0) {
						peques[j] = points[i];
						peques[j + 1] = pequeDerecha;
						break;
					}
				}
			}
		}
		if (peques[0][0] != 0.0 && peques[0][1] != 0.0 && peques[1][0] != 0.0 && peques[1][1] != 0.0) {
			for (int i = 0; i < peques.length - 1; i++) {
				if (i == 0) {
					if (peques[i][0] > peques[i + 1][0]) {
						pequeDerecha = peques[i];
					} else {
						pequeDerecha = peques[i + 1];
					}
				} else {
					if (peques[i][0] > pequeDerecha[0]) {
						pequeDerecha = peques[i];
					}
				}
			}
		}
		return pequeDerecha;

	}

	public static void treintaycinco() {

	}

	public static void treintayseis() {

	}

	public static void treintaysiete() {

	}
}
