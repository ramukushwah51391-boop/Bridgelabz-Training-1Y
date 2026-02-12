import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("Enter:");
        System.out.println("  h = if my guess is too high");
        System.out.println("  l = if my guess is too low");
        System.out.println("  c = if my guess is correct");

        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess();
            System.out.println("\nMy guess is: " + guess);

            char feedback = getUserFeedback(sc);

            guessedCorrectly = processFeedback(feedback, guess);
        }

        System.out.println("Yay! I guessed your number correctly!");
        sc.close();
    }

    // Method to generate a random guess within range
    public static int generateGuess() {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get feedback from user
    public static char getUserFeedback(Scanner sc) {
        System.out.print("Is my guess High (h), Low (l), or Correct (c)? ");
        return sc.next().toLowerCase().charAt(0);
    }

    // Method to process feedback and update range
    public static boolean processFeedback(char feedback, int guess) {
        if (feedback == 'h') {
            high = guess - 1;
        } else if (feedback == 'l') {
            low = guess + 1;
        } else if (feedback == 'c') {
            return true;
        } else {
            System.out.println("Invalid input. Please enter h, l, or c.");
        }

        // Safety check
        if (low > high) {
            System.out.println("Hmm, something went wrong with the feedback!");
            return true;
        }

        return false;
    }
}
