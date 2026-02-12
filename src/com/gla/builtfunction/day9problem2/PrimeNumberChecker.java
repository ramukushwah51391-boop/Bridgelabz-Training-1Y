import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        int number = takeInput();
        boolean isPrime = checkPrime(number);
        displayResult(number, isPrime);
    }

    // Method to take input from user
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Method to check if number is prime
    public static boolean checkPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to display result
    public static void displayResult(int num, boolean isPrime) {
        if (isPrime) {
            System.out.println(num + " is a PRIME number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}
