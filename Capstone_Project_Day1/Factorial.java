public class Factorial {
	public static void main(String[] args) {
        int[] sampleInputs = {5, 7};

        for (int number : sampleInputs) {
            System.out.println("The factorial of " + number + " is " + factorial(number));
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

}