import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principle: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principle * time * rate) / 100.0;

        System.out.printf("Simple Interest = %.6f\n", simpleInterest);

    }
}
