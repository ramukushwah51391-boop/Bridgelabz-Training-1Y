import java.util.Scanner;

public class WordsAndLengths2D {

    // c. Find length without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    // b. Split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int len = findLengthWithoutLength(text);

        // Count spaces
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        // Store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            start = end + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, len);

        return words;
    }

    // d. Create 2D array of word and its length
    public static String[][] createWordLength2D(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // word

            int len = findLengthWithoutLength(words[i]);

            // Convert int length to String
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // b. Split words
        String[] words = splitUsingCharAt(text);

        // d. Create 2D array
        String[][] wordLength2D = createWordLength2D(words);

        // e. Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < wordLength2D.length; i++) {
            String word = wordLength2D[i][0];

            // Convert String to Integer for display
            int length = Integer.parseInt(wordLength2D[i][1]);

            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}
