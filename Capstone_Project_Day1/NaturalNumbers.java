import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        	System.out.print("Input upper limit: ");
        	int n = scanner.nextInt();

        	System.out.print("Natural numbers from 1 to " + n + ": ");
        	for (int i = 1; i <= n; i++) {
            		System.out.print(i);
            		if (i != n) {
                		System.out.print(", ");
            		}
        	}

	}

}
