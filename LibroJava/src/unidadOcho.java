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

	//--------------------------------------aqui voy xd
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
		while(true) {
			System.out.println("x");
			if(comprobacionEspacios(tablero)) {
				break;
			}
			flagTiro = false;
			while(flagTiro == false) {
				System.out.print("Turno de X, ingresa (0,1 o 2) fila: ");
				x = sc.nextInt();
				System.out.print("Turno de X, ingresa (0,1 o 2) columna: ");
				y = sc.nextInt();
				flagTiro = tiroX(tablero, x, y);
			}
			flagTiro = false;
			imprime(tablero);
			if(comprobacionEspacios(tablero)) {
				break;
			}
			flagTiro = false;
			while(flagTiro == false) {
				System.out.print("Turno de O, ingresa (0,1 o 2) fila: ");
				x = sc.nextInt();
				System.out.print("Turno de O, ingresa (0,1 o 2) columna: ");
				y = sc.nextInt();
				flagTiro = tiroO(tablero, x, y);;
			}
			flagTiro = false;
			imprime(tablero);
		}
	}
	//-----------------------------------------
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
				if(m[i][j] != ' ')
					cont++;
			}
		}
		if(cont == 9) {
			return true;
		}
		return false;
	}
	public static boolean tiroX(char[][] m, int x, int y) {
		if(m[x][y] == ' ') {
			m[x][y] = 'X';
			return true;
		}else {
			System.out.println("Tiro invalido");
			return false;
		}
	}
	public static boolean tiroO(char[][] m, int x, int y) {
		if(m[x][y] == ' ') {
			m[x][y] = 'O';
			return true;
		}else {
			System.out.println("Tiro invalido");
			return false;
		}
	}
	public static void hayGanador(char[][] m) {
		
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

	public static void treintayseis() {

	}

	public static void treintaysiete() {

	}
}
