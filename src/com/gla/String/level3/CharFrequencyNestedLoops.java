import java.util.Scanner;

public class CharFrequencyNestedLoops {

    // a) Method to find frequency using nested loops
    public static String[] findCharFrequency(String text) {

        // i) Convert string to char array
        char[] chars = text.toCharArray();
        int len = chars.length;

        int[] freq = new int[len];

        // ii) Nested loops to count frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') {
                continue; // skip already counted characters
            }

            freq[i] = 1; // initialize frequency

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // iii) Create 1D String array for result
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count * 2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = String.valueOf(chars[i]);
                result[index + 1] = String.valueOf(freq[i]);
                index += 2;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findCharFrequency(text);

        System.out.println("\nCharacter   Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < result.length; i += 2) {
            System.out.println("    " + result[i] + "           " + result[i + 1]);
        }

        sc.close();
    }
}
