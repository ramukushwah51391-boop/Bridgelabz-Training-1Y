import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter numbers (0 or negative number to stop):");

        while (true) {
            num = sc.nextInt();

            if (num <= 0) {
                break;   // stops loop if 0 or negative number is entered
            }

            sum = sum + num;
        }

        System.out.println("The sum of entered numbers is: " + sum);
    }
}
