import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input upper limit: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers 1-" + n + ": " + sum);

	}

}