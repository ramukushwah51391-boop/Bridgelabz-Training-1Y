import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException (no try-catch)
    public static void generateException(String text) {

        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);

        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Invalid number format: " + text);

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
            System.out.println("Message: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input as String
        System.out.print("Enter a value (as String): ");
        String text = sc.next();

        System.out.println("\nCalling method to generate exception:");
        // Uncomment to see program crash
        // generateException(text);

        System.out.println("\nCalling method to handle exception:");
        handleException(text);

        sc.close();
    }
}
