import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception (no try-catch)
    public static void generateException(String text, int start, int end) {

        // Manually throw IllegalArgumentException
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index!");
        }

        // This line uses substring
        String result = text.substring(start, end);
        System.out.println("Substring: " + result);
    }

    // Method to handle exception using try-catch
    public static void handleException(String text, int start, int end) {

        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index!");
            }

            String result = text.substring(start, end);
            System.out.println("Substring: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
            System.out.println("Message: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        System.out.println("\nCalling method to generate exception:");
        // Uncomment to see program crash
        // generateException(text, start, end);

        System.out.println("\nCalling method to handle exception:");
        handleException(text, start, end);

        sc.close();
    }
}
