package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}
}
