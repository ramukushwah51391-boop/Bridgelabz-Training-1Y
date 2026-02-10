import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsStats {

    // Method to get computer choice
    public static String getComputerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3); // 0,1,2

        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to decide winner
    public static String decideWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        for (int i = 1; i <= games; i++) {

            System.out.println("\nGame " + i);
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();

            System.out.println("Computer choice: " + computerChoice);

            String winner = decideWinner(userChoice, computerChoice);

            if (winner.equals("Player")) {
                playerWins++;
                System.out.println("Result: Player Wins!");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Result: Computer Wins!");
            } else {
                draws++;
                System.out.println("Result: Draw!");
            }
        }

        // Display stats in tabular format
        System.out.println("\n===== Game Statistics =====");
        System.out.println("Player Wins\tComputer Wins\tDraws");
        System.out.println("--------------------------------------");
        System.out.println(playerWins + "\t\t" + computerWins + "\t\t" + draws);

        sc.close();
    }
}
