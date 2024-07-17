import java.util.Scanner;

public class LengthConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double lengthInCentimeters = scanner.nextDouble();

        double lengthInMeters = lengthInCentimeters / 100.0; // 1 meter = 100 centimeters

        double lengthInKilometers = lengthInCentimeters / 100000.0; // 1 kilometer = 100000 centimeters

        System.out.printf("Length in meters = %.2f m\n", lengthInMeters);
        System.out.printf("Length in kilometers = %.2f km\n", lengthInKilometers);

    }
}
