import java.util.Scanner;

public class VowelConsonantCounter {

    // a. Method to check vowel or consonant
    public static String checkCharType(char ch) {

        // i. Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {

            // ii. Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

    // b. Method to count vowels and consonants in string
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String type = checkCharType(ch);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }

            } catch (RuntimeException e) {
                break; // End of string
            }
        }

        // Return counts in array
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // c. Take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call user-defined method
        int[] result = countVowelsAndConsonants(text);

        // Display result
        System.out.println("\nNumber of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        sc.close();
    }
}
