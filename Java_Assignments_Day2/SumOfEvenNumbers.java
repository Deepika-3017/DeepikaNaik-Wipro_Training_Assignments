import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input upper limit of even number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers between 1 to " + n + ": " + sum);

	}

}