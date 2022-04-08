package clasesUnidadNueve;

public class Rectangle {
	public double width;
	public double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	} 

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height; 
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}
}
