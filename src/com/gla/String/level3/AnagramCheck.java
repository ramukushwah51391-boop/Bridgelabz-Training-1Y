import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // i) Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // ii) Create frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // iii) Find frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            char ch1 = text1.charAt(i);
            char ch2 = text2.charAt(i);

            freq1[ch1]++;
            freq2[ch2]++;
        }

        // iv) Compare frequency of characters
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        System.out.println("\nAnagram Check Result:");
        System.out.println("----------------------");

        if (result) {
            System.out.println("The two texts ARE Anagrams.");
        } else {
            System.out.println("The two texts are NOT Anagrams.");
        }

        sc.close();
    }
}
