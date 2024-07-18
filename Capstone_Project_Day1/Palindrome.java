import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter a number to check if it is a palindrome: ");
        	long number = scanner.nextLong();
        	scanner.close();

        	String numStr = Long.toString(number);

        	int n = numStr.length();

        	boolean isPalindrome = true;

        	for (int i = 0; i < n / 2; i++) {
            		if (numStr.charAt(i) != numStr.charAt(n - 1 - i)) {
                		isPalindrome = false;
                		break;
            		}
        	}

        	if (isPalindrome) {
            		System.out.println(number + " is a palindrome.");
        	} else {
            		System.out.println(number + " is not a palindrome.");
        	}
	}
}
