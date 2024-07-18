import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input base: ");
        int base = scanner.nextInt();

        System.out.print("Input exponent: ");
        int exponent = scanner.nextInt();

        long power = 1;

        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }

        System.out.println(base + " ^ " + exponent + " = " + power);

	}

}
