import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency and return in 2D array
    public static int[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency array

        // Step i & ii: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step iii: Create 2D array to store characters & frequencies
        int[][] result = new int[uniqueCount][2];

        // Step iv: Store character and frequency
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Store only first time we encounter the character
            if (freq[ch] > 0) {
                result[index][0] = ch;        // character ASCII
                result[index][1] = freq[ch]; // frequency
                index++;

                freq[ch] = 0; // set to 0 to avoid duplicates
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[][] result = findCharFrequency(text);

        System.out.println("\nCharacter   Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < result.length; i++) {
            char ch = (char) result[i][0];
            int count = result[i][1];

            System.out.println("    " + ch + "           " + count);
        }

        sc.close();
    }
}
