import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = takeInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    // Method to take input from user
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or number: ");
        return sc.nextLine();
    }

    // Method to check palindrome
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase();  // to ignore case
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(str + " is a PALINDROME.");
        } else {
            System.out.println(str + " is NOT a palindrome.");
        }
    }
}
