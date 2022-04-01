import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class unidadSiete {
	private static Scanner sc = new Scanner(System.in);
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat df3 = new DecimalFormat("0.000");
	private static final DecimalFormat df0 = new DecimalFormat("0");

	public static void uno() {
		System.out.print("Ingresa el numero de estudiantes: ");
		int[] calificaciones = new int[sc.nextInt()];
		char[] notas = new char[calificaciones.length];

		System.out.print("Ingresa " + calificaciones.length + " calificaciones: ");
		for (int i = 0; i < calificaciones.length; i++) {
			calificaciones[i] = sc.nextInt();
		}

		getnotas(calificaciones, notas);

		for (int i = 0; i < calificaciones.length; i++) {
			System.out.println("Alumno " + i + " Obtuvo " + calificaciones[i] + " y su nota es " + notas[i]);
		}
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	public static void getnotas(int[] calificaciones, char[] notas) {
		int best = max(calificaciones);
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] >= best - 10)
				notas[i] = 'A';
			else if (calificaciones[i] >= best - 20)
				notas[i] = 'B';
			else if (calificaciones[i] >= best - 30)
				notas[i] = 'C';
			else if (calificaciones[i] >= best - 40)
				notas[i] = 'D';
			else
				notas[i] = 'F';
		}
	}

	public static void dos() {
		int[] enteros = new int[11];
		for (int i = 0; i < enteros.length; i++) {
			System.out.print("Ingresa un valor entero: ");
			enteros[i] = sc.nextInt();
		}

		for (int i = 0; i < enteros.length; i++) {
			if (enteros[enteros.length - 1] == enteros[i]) {
				System.out.println("El entero en la posicion " + i + " es igual a 11");
			} else if (enteros[enteros.length - 1] < enteros[i]) {
				System.out.println("El entero en la posicion " + i + " es menor a 11");
			} else
				System.out.println("El entero en la posicion " + i + " es mayor a 11");
		}
	}

	public static void tres() {
		int[] n = new int[50];
		System.out.print("Ingresa numeros del 1 al 50: ");
		int num;
		do {
			num = sc.nextInt();
			if (num >= 1 && num <= 50)
				n[num - 1]++;
		} while (num != 0);

		for (int i = 0; i < n.length; i++) {
			if (n[i] > 0)
				System.out.println((i + 1) + " aparece " + n[i] + " ve" + (n[i] > 1 ? "ces" : "z"));
		}
	}

	public static void cuatro() {
		System.out.print("Ingresa puntuaciones(numero negativo para acabar): ");

		int[] puntuaciones = new int[100];
		int num;
		int numeroPuntuaciones;
		int media;
		numeroPuntuaciones = media = 0;
		for (int i = 0; i < 100; i++) {
			num = sc.nextInt();
			if (num < 0)
				break;

			puntuaciones[i] = num;
			media += num;
			numeroPuntuaciones++;
		}
		media /= numeroPuntuaciones;
		int igualMayor;
		int menor;
		igualMayor = menor = 0;
		for (int i = 0; i < numeroPuntuaciones; i++) {
			if (puntuaciones[i] >= media)
				igualMayor++;
			else
				menor++;
		}
		System.out.println("Puntuacion media: " + media);
		System.out.println("Puntuaciones mayores o iguales a la media: " + igualMayor);
		System.out.println("Puntuaciones menores a la media: " + menor);
	}

	public static void cinco() {
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		System.out.print("Ingresa numeros: ");
		int n, contP = 0, contI = 0;
		do {
			n = sc.nextInt();
			if (n > 0)
				arreglo.add(n);
		} while (n != 0);

		for (int i = 0; i < arreglo.size(); i++) {
			if (arreglo.get(i) % 2 == 0) {
				contP++;
			} else
				contI++;
		}
		System.out.println("Numeros pares: " + contP);
		System.out.println("Numeros impares: " + contI);
	}

	public static void seis() {
		// investigar
	}

	public static void siete() {
		int[] contadores = new int[10];
		for (int i = 1; i <= 200; i++) {
			contadores[(int) (Math.random() * 10)]++;
		}
		System.out.println("Cobtador de numeros entre 0 y 9:");
		for (int i = 0; i < contadores.length; i++) {
			System.out.println(i + "s: " + contadores[i]);
		}
	}

	public static void ocho() {
		double[] valores = new double[10];
		System.out.print("Enter ten values of double type: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble(); // este define que metodo se invocara
		}

		System.out.println("El promedio de los valores es: " + average(valores));
	}

	public static int average(int[] array) {
		int promedio = 0;
		for (int i : array)
			promedio += i;
		return promedio / array.length;
	}

	public static double average(double[] array) {
		double promedio = 0;
		for (double i : array)
			promedio += i;
		return promedio / array.length;
	}

	public static void nueve() {
		double[] valores = new double[10];
		System.out.print("Enter ten values of double type: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble(); // este define que metodo se invocara
		}
		System.out.println("El numero mas grande es: " + max(valores));
	}

	public static double max(double[] array) {
		double maximo = array[0];
		for (double i : array) {
			if (maximo < i) {
				maximo = i;
			}
		}
		return maximo;
	}

	public static void diez() {
		double[] valores = new double[10];
		System.out.print("Enter ten values of double type: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble(); // este define que metodo se invocara
		}
		System.out.println("El numero mayor es " + valores[indexOfLargestElement(valores)] + " con indice "
				+ indexOfLargestElement(valores));
	}

	public static int indexOfLargestElement(double[] array) {
		if (array.length >= 10)
			return 0;

		double max = array[0];
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void once() {
		double[] valores = new double[10];
		System.out.print("Enter ten values of double type: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble(); // este define que metodo se invocara
		}
		System.out.println("La media es " + mean(valores));
		System.out.println("La desviacion estandar es " + deviation(valores));
	}

	public static double deviation(double[] x) {
		double desviacion = 0;
		double media = mean(x);
		for (double e : x) {
			desviacion += Math.pow(e - media, 2);
		}
		return Math.sqrt(desviacion / (x.length - 1));
	}

	public static double mean(double[] x) {
		double media = 0;
		for (double e : x) {
			media += e;
		}
		return media / x.length;
	}

	public static void doce() {
		int[] valores = new int[10];
		System.out.print("Ingresa 10 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt(); // este define que metodo se invocara
		}
		reverse(valores);
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		
	}
	public static void reverse(int[] list) {
		int temp;
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}

	public static void trece() {
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1; // este arreglo no se deberian ejecutar
		}
		System.out.println(getRandom(numeros));
		
	}
	public static int getRandom(int... numbers) {
		int num;
		boolean isExcluded;
		do { 
			isExcluded = false;
			num = 1 + (int)(Math.random() * 100);
			for (int e: numbers) {
				if (num == e)
					isExcluded = true;
			}
		} while (isExcluded);
		return num;
	}

	public static void catorce() {
		int[] valores = new int[5];
		System.out.print("Ingresa 5 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt(); // este define que metodo se invocara
		}
		System.out.println("El minimo valor multiplo de los numeros es: " + lcm(valores));
		
	}
	public static int lcm(int... numbers) {
		int[] primos = new int[4];
		int lmc = 1;
		boolean flag = false;
		do {
			for (int i = 0; i < numbers.length; i++) {
				if(numbers[i] % 2 == 0) {
					numbers[i] /= 2;
					primos[0]++;
				} else if(numbers[i] % 3 == 0) {
					numbers[i] /= 3;
					primos[1]++;
				} else if(numbers[i] % 5 == 0) {
					numbers[2] /= 5;
					primos[2]++;
				}else if(numbers[i] % 7 == 0) {
					numbers[3] /= 7;
					primos[3]++;
				}
			}
			flag = verificar1(numbers);
		} while (flag);
		if(primos[0] != 0) {
			lmc = lmc * ((int) Math.pow(2, primos[0]));
		}
		if(primos[1] != 0) {
			lmc = lmc * ((int) Math.pow(3, primos[1]));
		}
		if(primos[2] != 0) {
			lmc = lmc * ((int) Math.pow(5, primos[2]));
		}
		if(primos[3] != 0) {
			lmc = lmc + ((int) Math.pow(7, primos[3]));
		}
		return lmc;
	}
	public static boolean verificar1(int... numbers) {
		int flag = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 1) {
				flag++;
			}
		}
		if(flag == (numbers.length)){
			return true;
		}else
			return false;
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

	public static void treintayocho() {

	}

	public static void treintaynueve() {

	}

	public static void cuarenta() {

	}

	public static void cuarentayuno() {

	}

	public static void cuarentaydos() {

	}

	public static void cuarentaytres() {

	}

	public static void cuarentaycuatro() {

	}

	public static void cuarentaycinco() {

	}

	public static void cuarentayseis() {

	}

	public static void cuarentaysiete() {

	}

	public static void cuarentayocho() {

	}

	public static void cuarentaynueve() {

	}

	public static void cincuenta() {

	}

	public static void cincuentayuno() {

	}

	public static void cincuentaydos() {

	}

	public static void cincuentaytres() {

	}

	public static void cincuentaycuatro() {

	}

	public static void cincuentaycinco() {

	}

	public static void cincuentayseis() {

	}
}
