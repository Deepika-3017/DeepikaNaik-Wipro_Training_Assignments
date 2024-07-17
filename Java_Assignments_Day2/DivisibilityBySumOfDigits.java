import java.util.Scanner;

public class DivisibilityBySumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        scanner.close();

        int sumOfDigits = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is divisible by the sum of its digits" );
        } else {
            System.out.println(originalNumber + " is not divisible by the sum of its digits");
        }

	}

}
