import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // a. Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            // Generate random 2-digit age (10 to 99)
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    // b. Method to create 2D array of age and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            result[i][0] = String.valueOf(age); // age as String

            // Validate negative age
            if (age < 0) {
                result[i][1] = "false";
            }
            // Check voting eligibility
            else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // c. Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // d. Take user input for number of students (default 10)
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayTable(result);

        sc.close();
    }
}
