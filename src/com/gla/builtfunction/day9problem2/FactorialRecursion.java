import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = takeInput();
        long result = factorial(number);
        displayResult(number, result);
    }

    // Method to take input from user
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {

        if (n < 0) {
            return -1; // Invalid for factorial
        }

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    // Method to display result
    public static void displayResult(int num, long fact) {

        if (fact == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}
