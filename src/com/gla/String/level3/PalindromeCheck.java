import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Using start and end index (Iterative)
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Using Recursion
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        // i) Base condition
        if (start >= end) {
            return true;
        }

        // ii) If characters not equal
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // iii) Recursive call
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Logic 3 (i): Reverse string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reverse = new char[len];

        int index = 0;
        for (int i = len - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    // Logic 3 (ii): Using character arrays
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeLogic1(text);
        boolean result2 = isPalindromeLogic2(text, 0, text.length() - 1);
        boolean result3 = isPalindromeLogic3(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("---------------------------");
        System.out.println("Logic 1 (Iterative)  : " + result1);
        System.out.println("Logic 2 (Recursive)  : " + result2);
        System.out.println("Logic 3 (Char Array) : " + result3);

        sc.close();
    }
}
