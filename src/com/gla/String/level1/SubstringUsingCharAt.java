import java.util.Scanner;

public class SubstringUsingCharAt {

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Take start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String subCharAt = substringUsingCharAt(text, start, end);

        // Substring using built-in method
        String subBuiltIn = text.substring(start, end);

        // Display results
        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);

        // Compare both substrings
        if (subCharAt.equals(subBuiltIn)) {
            System.out.println("Both substrings are SAME.");
        } else {
            System.out.println("Both substrings are DIFFERENT.");
        }

        sc.close();
    }
}
