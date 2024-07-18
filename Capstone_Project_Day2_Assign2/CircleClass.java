class Circle {

	private double radius;
	private String Color;

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setColor(String color) {
		Color = color;
	}
	public String getColor() {
		return Color;
	}

	Circle() {
		this.radius = 1.0;
		this.Color = "red";
	}

	Circle(double radius) {
		this.radius = radius;
	}

	Circle(double radius,String Color) {
		this.radius = radius;
		this.Color=Color;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return "Circle [ radius = " + getRadius() + " , color = " + getColor()+" ]";
	}
}

class Cylinder extends Circle {
	private double height;

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	Cylinder() {
		super();
		this.height = 1.0;
	}

	Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	Cylinder(double radius, double height, String Color) {
		super(radius,Color);
		this.height = height;
	}

	public double getVolume() {
		return getArea() * height;
	}

}

public class CircleClass {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Circle circle1 = new Circle();
		System.out.println(circle1);

		System.out.println("Circle Radius: " + circle.getRadius());
		System.out.println("Circle Area: " + circle.getArea());

		Cylinder cylinder = new Cylinder(5, 10);
		System.out.println("Cylinder Volume: " + cylinder.getVolume());
	}

}
