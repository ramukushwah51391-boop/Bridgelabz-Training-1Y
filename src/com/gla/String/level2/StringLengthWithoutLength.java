import java.util.Scanner;

public class StringLengthWithoutLength {

    // User-defined method to find length without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;

        try {
            while (true) {   // infinite loop
                text.charAt(count); // will throw exception at end
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index is out of range
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // b. Call user-defined method
        int customLength = findLengthWithoutLength(text);

        // c. Built-in length() method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        // Compare results
        if (customLength == builtInLength) {
            System.out.println("Both lengths are SAME.");
        } else {
            System.out.println("Both lengths are DIFFERENT.");
        }

        sc.close();
    }
}
