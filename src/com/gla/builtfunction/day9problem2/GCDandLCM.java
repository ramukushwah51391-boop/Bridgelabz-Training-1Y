import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {
        int[] numbers = takeInput();
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);
        displayResult(numbers[0], numbers[1], gcd, lcm);
    }

    // Method to take two numbers as input
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();

        return nums;
    }

    // Method to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return Math.abs(a);  // to handle negative numbers
    }

    // Method to calculate LCM using GCD
    public static int calculateLCM(int a, int b, int gcd) {

        if (gcd == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd;
    }

    // Method to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {

        System.out.println("\nFirst Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("GCD (HCF): " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
