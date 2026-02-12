import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        int choice = showMenuAndGetChoice();
        double[] numbers = takeInput();
        double result = calculate(choice, numbers[0], numbers[1]);
        displayResult(choice, numbers[0], numbers[1], result);
    }

    // Method to show menu and get operation choice
    public static int showMenuAndGetChoice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");

        return sc.nextInt();
    }

    // Method to take two numbers as input
    public static double[] takeInput() {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[2];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextDouble();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextDouble();

        return nums;
    }

    // Method to perform calculation
    public static double calculate(int choice, double a, double b) {

        switch (choice) {
            case 1:
                return a + b;

            case 2:
                return a - b;

            case 3:
                return a * b;

            case 4:
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid choice!");
                return 0;
        }
    }

    // Method to display result
    public static void displayResult(int choice, double a, double b, double result) {

        switch (choice) {
            case 1:
                System.out.println("Result: " + a + " + " + b + " = " + result);
                break;

            case 2:
                System.out.println("Result: " + a + " - " + b + " = " + result);
                break;

            case 3:
                System.out.println("Result: " + a + " * " + b + " = " + result);
                break;

            case 4:
                System.out.println("Result: " + a + " / " + b + " = " + result);
                break;
        }
    }
}
