import java.util.Scanner;

public class UniqueCharacters {

    // a. Find length without using length()
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

    // b. Find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int len = findLengthWithoutLength(text);

        // i. Temporary array to store possible unique characters
        char[] temp = new char[len];
        int uniqueCount = 0;

        // ii. Nested loop to check uniqueness
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // iii. Create new array to store only unique characters
        char[] uniqueChars = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // c. Take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call user-defined method
        char[] uniqueChars = findUniqueCharacters(text);

        // Display result
        System.out.println("\nUnique characters in the string:");

        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close();
    }
}
