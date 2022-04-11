package clasesUnidadDiez;

public class BMI {
	public BMI(String name, int age, double weight, double feet, double inches) {
		this(name, age, weight, (feet / 12) + inches);

	}

	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	public static final double kg_lbs = 0.45359237;
	public static final double mts_plg = 0.0254;

	public BMI(String nombre, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public BMI(String nombre, double peso, double altura) {
		this(nombre, 20, peso, altura);
	}

	public double getBMI() {
		double bmi = peso * kg_lbs / ((altura * mts_plg) * (altura * mts_plg));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Bajo de peso";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Sobre peso";
		else
			return "Obesidad";
	}

	public String getName() {
		return nombre;
	}

	public int getAge() {
		return edad;
	}

	public double getWeight() {
		return peso;
	}

	public double getHeight() {
		return altura;
	}
}
