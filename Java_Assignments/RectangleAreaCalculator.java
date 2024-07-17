import java.util.*;

public class RectangleAreaCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter length");
	System.out.println("Enter width ");
        float length = s.nextInt();
        float width = s.nextInt();

        float area = length * width;

        System.out.println("Area of the rectangle is: " + area);
    }
}