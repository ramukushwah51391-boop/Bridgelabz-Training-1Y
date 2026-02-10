import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException (no try-catch)
    public static void generateException(String[] names) {

        // Accessing invalid index (greater than array length)
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {

        try {
            // Accessing invalid index
            System.out.println("Accessing invalid index: " + names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e);

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
            System.out.println("Message: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for array
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("\nCalling method to generate exception:");
        // Uncomment to see program crash
        // generateException(names);

        System.out.println("\nCalling method to handle exception:");
        handleException(names);

        sc.close();
    }
}
