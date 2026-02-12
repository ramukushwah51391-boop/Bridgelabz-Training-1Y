import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        int choice = showMenuAndGetChoice();
        double temp = takeTemperatureInput();
        double result = convertTemperature(choice, temp);
        displayResult(choice, temp, result);
    }

    // Method to show menu and take user choice
    public static int showMenuAndGetChoice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        return sc.nextInt();
    }

    // Method to take temperature input
    public static double takeTemperatureInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        return sc.nextDouble();
    }

    // Method to convert temperature
    public static double convertTemperature(int choice, double temp) {

        if (choice == 1) {
            // Celsius to Fahrenheit
            return (temp * 9 / 5) + 32;
        }
        else if (choice == 2) {
            // Fahrenheit to Celsius
            return (temp - 32) * 5 / 9;
        }
        else {
            System.out.println("Invalid choice!");
            return 0;
        }
    }

    // Method to display result
    public static void displayResult(int choice, double original, double converted) {

        if (choice == 1) {
            System.out.println(original + " °C = " + converted + " °F");
        }
        else if (choice == 2) {
            System.out.println(original + " °F = " + converted + " °C");
        }
    }
}
