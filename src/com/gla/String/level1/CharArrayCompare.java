import java.util.Scanner;
import java.util.Arrays;

public class CharArrayCompare {

    // User-defined method to return characters using charAt()
    public static char[] getCharsUsingCharAt(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method result
        char[] userChars = getCharsUsingCharAt(text);

        // Built-in method result
        char[] builtInChars = text.toCharArray();

        // Display both arrays
        System.out.println("Characters using user-defined method:");
        System.out.println(Arrays.toString(userChars));

        System.out.println("Characters using toCharArray() method:");
        System.out.println(Arrays.toString(builtInChars));

        // Compare both results
        if (Arrays.equals(userChars, builtInChars)) {
            System.out.println("Both methods return the SAME result.");
        } else {
            System.out.println("Both methods return DIFFERENT results.");
        }

        sc.close();
    }
}
