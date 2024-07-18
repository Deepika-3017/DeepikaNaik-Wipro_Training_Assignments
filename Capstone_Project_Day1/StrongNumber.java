import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is NOT STRONG NUMBER");
        }
        scanner.close();
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

	}
}