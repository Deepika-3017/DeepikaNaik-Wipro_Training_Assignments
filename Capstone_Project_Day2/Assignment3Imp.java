import java.util.Scanner;

class Assignment3 {

    public double findPrice(int itemId) {

        switch (itemId) {

            case 1001: return 25.0;

            case 1002: return 20.0;

            case 1003: return 23.0;

            case 1004: return 18.0;

            default: return 0.0;

        }

    }

    public double findPrice(String brandName, String itemType, int size) {
        if ("puma".equalsIgnoreCase(brandName) && "T-shirt".equalsIgnoreCase(itemType) && size == 34) {
            return 25.0;
        } else if ("puma".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) && size == 38) {
            return 20.0;
        } else if ("puma".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) && size == 40) {
            return 20.0;
        } else if ("Reebok".equalsIgnoreCase(brandName) && "T-shirt".equalsIgnoreCase(itemType) && size == 34) {
            return 23.0;
        } else if ("Reebok".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) && size == 36) {
            return 18.0;
        } else if ("Reebok".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) && size == 38) {
            return 18.0;
        } else if ("Reebok".equalsIgnoreCase(brandName) && "Skirt".equalsIgnoreCase(itemType) && size == 40) {
            return 18.0;
        } else {
            return 0.0;
        }
    }
}

public class Assignment3Imp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Assignment3 assignment3 = new Assignment3();

        System.out.println("Enter itemId:");

        int itemId = scanner.nextInt();

        double priceById = assignment3.findPrice(itemId);

        System.out.println("Price of the selected item is $" + priceById);

        scanner.nextLine(); // Consume newline

        System.out.println("Enter brandName:");

        String brandName = scanner.nextLine();

        System.out.println("Enter itemType:");

        String itemType = scanner.nextLine();

        System.out.println("Enter size:");

        int size = scanner.nextInt();

        double priceByDetails = assignment3.findPrice(brandName, itemType, size);

        System.out.println("Price of the selected item is $" + priceByDetails);


    }

}