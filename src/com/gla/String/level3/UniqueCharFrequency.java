import java.util.Scanner;

public class UniqueCharFrequency {

    // a) Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Nested loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // b) Method to find frequency using unique characters
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency

        // i & ii: Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // iii: Get unique characters
        char[] unique = uniqueCharacters(text);

        // iv: Create 2D String array
        String[][] result = new String[unique.length][2];

        // v: Store character and frequency
        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // c) Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findCharFrequency(text);

        System.out.println("\nCharacter   Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println("    " + result[i][0] + "           " + result[i][1]);
        }

        sc.close();
    }
}
