public class Rectangle{

	private float  Length;
	private float Width;

	public double getLength() {
		return Length;
	}

	public void setLength(float Length) {
		this.Length = Length;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(float Width) {
		this.Width = Width;
	}

	Rectangle(){
		Length=Width=1.0f;
	}

	Rectangle(float length, float width){
		Length = length;
		Width=width;
	}

	public void getArea() {
		double area = Length*Width;
		System.out.println("Area = " +area);
	}

	public void getPerimeter() {
		double P = (Length+Width)*2;
		System.out.println("Perimeter = " +P);
	}

	public String toString() {
		return "Rectangle [Length = " + Length + " , Width =" +Width + " ]";
	}

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(1.0f,1.0f);
		System.out.println(rec);
		rec.getArea();
		rec.getPerimeter();
	}
}