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
			num = 1 + (int) (Math.random() * 100);
			for (int e : numbers) {
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
				if (numbers[i] % 2 == 0) {
					numbers[i] /= 2;
					primos[0]++;
				} else if (numbers[i] % 3 == 0) {
					numbers[i] /= 3;
					primos[1]++;
				} else if (numbers[i] % 5 == 0) {
					numbers[2] /= 5;
					primos[2]++;
				} else if (numbers[i] % 7 == 0) {
					numbers[3] /= 7;
					primos[3]++;
				}
			}
			flag = verificar1(numbers);
		} while (flag);
		if (primos[0] != 0) {
			lmc = lmc * ((int) Math.pow(2, primos[0]));
		}
		if (primos[1] != 0) {
			lmc = lmc * ((int) Math.pow(3, primos[1]));
		}
		if (primos[2] != 0) {
			lmc = lmc * ((int) Math.pow(5, primos[2]));
		}
		if (primos[3] != 0) {
			lmc = lmc + ((int) Math.pow(7, primos[3]));
		}
		return lmc;
	}

	public static boolean verificar1(int... numbers) {
		int flag = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1) {
				flag++;
			}
		}
		if (flag == (numbers.length)) {
			return true;
		} else
			return false;
	}

	public static void quince() {
		int[] valores = new int[10];
		System.out.print("Ingresa 10 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		int[] lista2 = eliminateDuplicates(valores);
		for (int i = 0; i < lista2.length; i++) {
			if (lista2[i] != 0)
				System.out.print(lista2[i] + " ");
		}
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] lista2 = new int[list.length];
		int i = 0, valor;
		for (int j = 0; j < list.length; j++) {
			valor = list[j];
			if (comprueba(lista2, valor)) {
				lista2[i] = valor;
				i++;
			}
		}
		return lista2;
	}

	public static boolean comprueba(int[] lista, int valor) {
		for (int i = 0; i < lista.length; i++) {
			if (valor == lista[i])
				return false;
		}
		return true;
	}

	public static void dieciseis() {
		int num;
		int[] numbers = new int[10000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = getRandomInt();
		}
		int key = getRandomInt();

		int searchResult;
		long startTime = System.currentTimeMillis();
		searchResult = linearSearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);

		selectionSort(numbers);

		startTime = System.currentTimeMillis();
		searchResult = binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime + " ");
	}

	public static int getRandomInt() {
		return 1 + (int) (Math.random() * 100000);
	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < mid)
				high = mid - 1;
			else if (key == mid)
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}

	public static void diecisiete() {
		System.out.print("Ingresa el numero de estudiantes: ");
		String[] alumnos = new String[sc.nextInt()];
		int[] calificaciones = new int[alumnos.length];

		System.out.println("Ingresa el nombre y la calificacion del estudiante:");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.print("Alumno " + (i + 1) + ": ");
			alumnos[i] = sc.next();
			System.out.print("Calificacion: ");
			calificaciones[i] = sc.nextInt();
		}

		ordena(alumnos, calificaciones);

		for (String x : alumnos) {
			System.out.println(x);
		}
	}

	public static void ordena(String[] alum, int[] cal) {
		for (int i = 0; i < cal.length; i++) {
			int max = cal[i];
			int temp = i;
			String flag;

			for (int j = i + 1; j < cal.length; j++) {
				if (cal[j] > max) {
					max = cal[j];
					temp = j;
				}
			}

			if (temp != i) {
				flag = alum[i];
				alum[i] = alum[temp];
				alum[temp] = flag;

				cal[temp] = cal[i];
				cal[i] = max;
			}
		}
	}

	public static void dieciocho() {
		double[] valores = new double[10];
		System.out.print("Ingresa 10 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();
		}
		bubbleSort(valores);
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}

	public static void bubbleSort(double arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void diecinueve() {
		int[] valores = new int[10];
		System.out.print("Ingresa 10 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		System.out.println("La lista esta " + (isSorted(valores) ? "ordenada" : "desordenada"));
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}

	public static void veinte() {
		double[] valores = new double[10];
		System.out.print("Ingresa 10 valores: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();
		}
		bubbleSortI(valores);
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}

	public static void bubbleSortI(double arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void veintiuno() {

	}

	public static void veintidos() {
		System.out.println("Ingresa una cadena: ");
		String cadena = sc.nextLine();
		int contlc = 0, contuc = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(0) == 'a' || cadena.charAt(0) == 'e' || cadena.charAt(0) == 'i' || cadena.charAt(0) == 'o'
					|| cadena.charAt(0) == 'u') {
				contlc++;
			} else if (cadena.charAt(0) == 'A' || cadena.charAt(0) == 'E' || cadena.charAt(0) == 'I'
					|| cadena.charAt(0) == 'O' || cadena.charAt(0) == 'U') {
				contuc++;
			}
		}
		System.out.println("Vocales minusculas: " + contlc);
		System.out.println("Vocales mayusculas: " + contuc);
	}

	public static void veintitres() {
		boolean[] arreglo = new boolean[100];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = false;
		}
		lockerscambio(arreglo);
		int j = 1;
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] ? "Abierto " : "Cerrado ");
			if (j % 10 == 0) {
				System.out.println();
			}
			j++;
		}
	}

	public static void lockerscambio(boolean[] lockers) {
		int start = 0;

		for (int s = 1; s <= lockers.length; s++) {
			for (int l = 0; l < lockers.length; l += s) {
				if (lockers[l])
					lockers[l] = false;
				else
					lockers[l] = true;
			}
			start++;
		}
	}

	public static void vienticuatro() {

	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		if (roots[0] != 0) {
			int res = (int) ((eqn[0] * Math.pow(roots[0], 2) + (eqn[1] * roots[0]) + eqn[2]));
			return res;
		} else
			return 0;

	}

	public static double[] raices(double discriminante, double[] abc) {
		double[] raices = new double[2];
		if (discriminante > 0) {
			raices[0] = ((-1 * abc[1]) + Math.sqrt(discriminante)) / (2 * abc[0]);
			raices[1] = ((-1 * abc[1]) - Math.sqrt(discriminante)) / (2 * abc[0]);
		} else if (discriminante == 0) {
			raices[0] = ((-1 * abc[1]) + Math.sqrt(discriminante)) / (2 * abc[0]);
			raices[1] = 0;
		} else {
			raices[0] = 0;
			raices[1] = 0;
		}
		return raices;
	}

	public static void veinticinco() {
		double[] abc = new double[3];
		System.out.print("Ingresa a, b, c: ");
		for (int i = 0; i < abc.length; i++) {
			abc[i] = sc.nextDouble();
		}
		double discriminante = Math.pow(abc[1], 2) - (4 * abc[0] * abc[2]);
		double[] valorx = new double[2];
		valorx = raices(discriminante, abc);
		int x = solveQuadratic(abc, valorx);
		if (x != 0) {
			System.out.println("La solucion es " + x);
		} else
			System.out.println("Sin solucion");
	}

	public static void veintiseis() {
		System.out.print("Ingresa una lista: ");
		int[] lista = new int[sc.nextInt()];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = sc.nextInt();
		}
		System.out.println(isSorted(lista) ? "Esta ordenada" : "No esta oredenada");
	}

	public static void veintisiete() {
		System.out.print("Ingresa una lista: ");
		int[] lista = new int[sc.nextInt()];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = sc.nextInt();
		}
		System.out.println(isSortedConstantInterval(lista) ? "Es constante" : "No es constante");
	}

	public static boolean isSortedConstantInterval(int[] list) {
		int constante = list[0] - list[1];
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1] || (list[i] - list[i + 1]) != constante)
				return false;
		}
		return true;
	}

	public static void veintiocho() {
		int[] numeros = new int[4];
		System.out.print("Ingresa numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		mostrarCombinaciones(numeros);
	}
	public static void mostrarCombinaciones(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				for (int j2 = 0; j2 < numeros.length; j2++) {
					for (int k = 0; k < numeros.length; k++) {
						if (i != j  && i != j2  && i != k && j2 != j  && j != k  && j2 != k )
		                    System.out.println(numeros[i] + " " + numeros[j] + " " + numeros[j2] + " " + numeros[k]);
					}
				}
			}

		}
	}

	public static void veintinueve() {
		int[] dado = new int[6];
		for (int i = 0; i < dado.length; i++) {
			dado[i] = i + 1;
		}
		mostrarCombinacionesdados(dado);
	}
	public static void mostrarCombinacionesdados(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				for (int j2 = 0; j2 < numeros.length; j2++) {
						if (i != j  && i != j2  && j2 != j && (numeros[i] + numeros[j] + numeros[j2]) == 9)
		                    System.out.println(numeros[i] + " " + numeros[j] + " " + numeros[j2]);
					
				}
			}

		}
	}

	public static void treinta() {
		System.out.print("Ingresa el tamaño de un arreglo: ");
		int[] lista = new int[sc.nextInt()];
		System.out.print("Ingresa valores: ");
		for (int i = 0; i < lista.length; i++) {
			lista[i] = sc.nextInt();
		}
		System.out.println((isConsecutiveFour(lista) ? "Si" : "No") + " contiene valores consecutivos");
	}
	public static boolean isConsecutiveFour(int[] values) {
		for (int i = 0; i < values.length - 4; i++) {
			if(values[i] != values[i+1] && values[i] != values[i+2] && values[i] != values[i+3]) {
				return false;
			}
		}
		return true;
	}

	public static void treintayuno() {
		System.out.print("Ingresa el tamaño de un arreglo: ");
		int[] lista = new int[sc.nextInt()];
		System.out.print("Ingresa valores: ");
		for (int i = 0; i < lista.length; i++) {
			lista[i] = sc.nextInt();
		}
		System.out.print("Ingresa el tamaño de un arreglo: ");
		int[] lista2 = new int[sc.nextInt()];
		System.out.print("Ingresa valores: ");
		for (int i = 0; i < lista2.length; i++) {
			lista2[i] = sc.nextInt();
		}
		
		int[] lista3 = new int[lista.length + lista2.length];
		lista3 = merge(lista, lista2);
		System.out.print("Lista mezclada y oredenada: ");
		for (int i = 0; i < lista3.length; i++) {
			System.out.print(lista3[i] + " ");
		}
	}
	public static int[] merge(int[] list1, int[] list2) {
		int[] lista3 = new int[list1.length + list2.length];
		for (int i = 0; i < list1.length; i++) {
			lista3[i] = list1[i];
		}
		int j = list1.length;
		for (int i = 0; i < list2.length; i++) {
			lista3[j] = list2[i];
			j++;
		}
		bubbleSort(lista3);
		return lista3;
	}
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void treintaydos() {

	}

	public static void treintaytres() {
		String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
				"agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		System.out.print("Ingresa un numero del 1 al 12");
		int x = sc.nextInt();
		System.out.println("El mes es " + mes[x+1]);
	}

	public static void treintaycuatro() {
		System.out.print("Ingresa una cadena: ");
		String string = sc.nextLine();
		System.out.println(sort(string));
	}
	public static char[] sort(String s) {
		char[] str = new char[s.length()]; 
		for (int i = 0; i < str.length; i++)
			str[i] = s.charAt(i); 
		for (int i = 0; i < str.length - 1; i++) {
			char min = str[i];
			int minIndex = i;
			for (int j = i + 1; j < str.length; j++) {
				if (min > str[j]) {
					min = str[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				str[minIndex] = str[i];
				str[i] =  min;
			}
		}
		return str;
	}

	public static void treintaycinco() {

	}

	public static void treintayseis() {

	}

	public static void treintaysiete() {

	}
}
