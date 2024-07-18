import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber = originalNumber / 10;
        }

        System.out.println("Reverse of " + number + " = " + reversedNumber);

	}

}