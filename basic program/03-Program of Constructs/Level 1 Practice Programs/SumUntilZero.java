import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num = 1;   // initialize with non-zero value

        System.out.println("Enter numbers (enter 0 to stop):");

        while (num != 0) {
            num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("The sum of entered numbers is: " + sum);
    }
}
