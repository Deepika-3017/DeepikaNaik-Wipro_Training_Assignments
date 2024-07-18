import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a lucky number: ");
        long number = scanner.nextLong();
        scanner.close();

        String numStr = Long.toString(number);
        int length = numStr.length();
        long sumOfSquares = 0;

        for (int i = 1; i < length; i += 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sumOfSquares += digit * digit;
        }

        if (sumOfSquares % 9 == 0) {
            System.out.println("The number " + number + " is a lucky number.");
        } else {
            System.out.println("The number " +number + " is not a lucky number.");
        }

	}

}