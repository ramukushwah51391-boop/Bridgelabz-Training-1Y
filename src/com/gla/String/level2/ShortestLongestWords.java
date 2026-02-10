import java.util.Scanner;

public class ShortestLongestWords {

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
            result[i][0] = words[i];

            int len = findLengthWithoutLength(words[i]);
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // e. Find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] wordLen2D) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLen = Integer.parseInt(wordLen2D[0][1]);
        int longestLen = Integer.parseInt(wordLen2D[0][1]);

        for (int i = 1; i < wordLen2D.length; i++) {
            int currentLen = Integer.parseInt(wordLen2D[i][1]);

            if (currentLen < shortestLen) {
                shortestLen = currentLen;
                shortestIndex = i;
            }

            if (currentLen > longestLen) {
                longestLen = currentLen;
                longestIndex = i;
            }
        }

        // Return indexes of shortest and longest
        return new int[] { shortestIndex, longestIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // b. Split words
        String[] words = splitUsingCharAt(text);

        // d. Create 2D array
        String[][] wordLen2D = createWordLength2D(words);

        // e. Find shortest and longest
        int[] resultIndexes = findShortestAndLongest(wordLen2D);

        int shortestIdx = resultIndexes[0];
        int longestIdx = resultIndexes[1];

        // f. Display result
        System.out.println("\nShortest Word: "
                + wordLen2D[shortestIdx][0]
                + " (Length = "
                + Integer.parseInt(wordLen2D[shortestIdx][1]) + ")");

        System.out.println("Longest Word: "
                + wordLen2D[longestIdx][0]
                + " (Length = "
                + Integer.parseInt(wordLen2D[longestIdx][1]) + ")");

        sc.close();
    }
}
