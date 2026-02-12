import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        int terms = takeInput();
        generateFibonacci(terms);
    }

    // Method to take number of terms from user
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    // Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int n) {

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1;

        System.out.println("\nFibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
