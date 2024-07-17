import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input upper limit: ");
		int n = scanner.nextInt();

		System.out.print("Odd numbers between 1 to " + n + ":\n");
		for (int i = 1; i <= n; i += 2) {
			System.out.print(i);
			if (i < n - 1) {
				System.out.print(", ");
			} 
		}
	}

}