import java.util.Scanner;

public class TrimUsingCharAt {

    // a. Find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

        // Find start (first non-space)
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) != ' ') {
                    start = i;
                    break;
                }
            } catch (RuntimeException e) {
                break;
            }
        }

        // Find end (last non-space)
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (RuntimeException e) {
            end = i - 1;
        }

        for (int j = end; j >= 0; j--) {
            if (text.charAt(j) != ' ') {
                end = j;
                break;
            }
        }

        return new int[] { start, end };
    }

    // b. Create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // c. Compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (RuntimeException e) {
            // Reached end
        }

        // Check if both ended at same time
        try {
            s2.charAt(i);
            return false;
        } catch (RuntimeException e) {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // d. Take input
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // Trim using user-defined method
        int[] indexes = findTrimIndexes(text);
        String customTrim = substringUsingCharAt(text, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrim = text.trim();

        // Compare both trimmed strings
        boolean isSame = compareUsingCharAt(customTrim, builtInTrim);

        // Display results
        System.out.println("\nCustom Trim Result: [" + customTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrim + "]");
        System.out.println("Both results are same: " + isSame);

        sc.close();
    }
}
