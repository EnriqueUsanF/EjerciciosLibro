package clasesUnidadNueve;

public class RegularPolygon {
	private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int numeroLados, double largoLados) {
        n = numeroLados;
        side = largoLados;
    }

    public RegularPolygon(int numeroLados, double largoLados, double x, double y) {
        n = numeroLados;
        side = largoLados;
        this.x = x;
        this.y = y;

    }

    public void setNumSides(int numeroLados) {
        n = numeroLados;
    }

    public int getNumSides() {
        return n;
    }

    public void setSide(double largoLados) {
        side = largoLados;
    }

    public double getSide() {
        return side;
    }

    public void setX(int x) {
    	this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
    	this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return n * (Math.pow(side, 2) / 4 * Math.tan(Math.PI / n));
    }
}
