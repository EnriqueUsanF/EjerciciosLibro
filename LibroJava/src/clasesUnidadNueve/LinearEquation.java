package clasesUnidadNueve;

public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquation(double A, double B, double C, double D, double E, double F) {
		a = A;
		b = B;
		c = C;
		d = D;
		e = E;
		f = F;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		return a * d - b * c != 0;
	}

	public double getX() {
		double x = (this.getE() * this.getD() - this.getB() * this.getF())
				/ (this.getA() * this.getD() - this.getB() * this.getC());

		return x;
	}

	public double getY() {
		double y = (this.getA() * this.getF() - this.getE() * this.getC())
				/ (this.getA() * this.getD() - this.getB() * this.getC());
		return y;
	}
}
