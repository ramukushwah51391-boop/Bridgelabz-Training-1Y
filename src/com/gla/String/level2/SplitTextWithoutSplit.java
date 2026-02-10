import java.util.Scanner;
import java.util.Arrays;

public class SplitTextWithoutSplit {

    // b. Find length without using length()
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

    // c. Split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int len = findLengthWithoutLength(text);

        // i. Count spaces to find number of words
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        // Store indexes of spaces
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // ii. Extract words using indexes
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

    // d. Compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input using nextLine()
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] customWords = splitUsingCharAt(text);

        // Built-in split()
        String[] builtInWords = text.split(" ");

        // Display both results
        System.out.println("\nWords using user-defined method:");
        System.out.println(Arrays.toString(customWords));

        System.out.println("\nWords using built-in split() method:");
        System.out.println(Arrays.toString(builtInWords));

        // e. Compare both arrays
        boolean result = compareStringArrays(customWords, builtInWords);

        if (result) {
            System.out.println("\nBoth methods give the SAME result.");
        } else {
            System.out.println("\nBoth methods give DIFFERENT results.");
        }

        sc.close();
    }
}
