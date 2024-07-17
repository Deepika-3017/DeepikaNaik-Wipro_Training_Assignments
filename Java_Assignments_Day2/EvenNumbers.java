import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input upper range: ");
		int n = scanner.nextInt();

		System.out.print("Even numbers between 1 to " + n + ":\n");
		for (int i = 2; i <= n; i += 2) {
			System.out.print(i);
			if (i < n - 1) {
				System.out.print(", ");
			} 
		}

	}

}