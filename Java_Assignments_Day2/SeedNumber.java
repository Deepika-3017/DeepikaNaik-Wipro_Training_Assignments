import java.util.Scanner;

public class SeedNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the seed number X: ");
        int seed = scanner.nextInt();
        System.out.print("Enter the number Y to check if it is a seed of X: ");
        int numberY = scanner.nextInt();
        scanner.close();

        int product = seed;
        int originalSeed = seed;
        while (seed != 0) {
            int digit = seed % 10;
            product *= digit;
            seed /= 10;
        }

        if (product == numberY) {
            System.out.println(originalSeed + " is a seed of " + numberY);
        } else {
            System.out.println(originalSeed + " is not a seed of " + numberY);
        }

	}

}