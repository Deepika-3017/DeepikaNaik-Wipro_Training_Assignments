import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        	System.out.print("Input number of terms: ");
        	int terms = scanner.nextInt();

        	int a = 0; 
        	int b = 1; 
        	int c;     

        	System.out.print("Fibonacci series: ");
        	System.out.print(a + ", " + b);

        	for (int i = 3; i <= terms; i++) {
            		c = a + b;
            		System.out.print(", " + c);
            		a = b;
            		b = c;
        	}
        	System.out.println();
	}
}