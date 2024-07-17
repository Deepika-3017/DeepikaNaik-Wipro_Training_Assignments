import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input num: ");
        int num = scanner.nextInt();

        int count = 0;
        int temp = num; 

        while (temp != 0) {
            temp = temp / 10; 
            count++; 
        }

        System.out.println("Number of digits: " + count);

	}

}