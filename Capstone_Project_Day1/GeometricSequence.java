import java.util.Scanner;

public class GeometricSequence {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sequence: ");
        int n = scanner.nextInt();      
        scanner.close();
        int current = 1;
        final int maxTerm = 1024;
        final int ratio = 2;

        System.out.print("Geometric sequence: ");
        int count = 0;
        while (current <= maxTerm && count < n) {
            System.out.print(current);

            count++;
            if (count < n) {
                System.out.print(", ");
            } 
            current *= ratio;
        }
        System.out.println(); 
	}
}
