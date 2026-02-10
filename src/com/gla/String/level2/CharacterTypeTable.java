import java.util.Scanner;

public class CharacterTypeTable {

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

    // b. Method to create 2D array of character and type
    public static String[][] findCharTypes(String text) {

        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (RuntimeException e) {
            // length found
        }

        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);   // character
            result[i][1] = checkCharType(ch);    // type
        }

        return result;
    }

    // c. Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {

        System.out.println("\nChar\tType");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // d. Take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call user-defined methods
        String[][] result = findCharTypes(text);

        // Display result
        displayTable(result);

        sc.close();
    }
}
