import java.util.Scanner;

public class NumberSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("First number after swapping: " + firstNumber);
        System.out.println("Second number after swapping: " + secondNumber);

    }
}
