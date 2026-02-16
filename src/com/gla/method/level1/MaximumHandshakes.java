import java.util.Scanner;

public class MaximumHandshakes {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        if (students < 0) {
            System.out.println("Invalid number of students.");
        } else {
            int maxHandshakes = calculateHandshakes(students);
            System.out.println("The maximum number of handshakes among "
                    + students + " students is: " + maxHandshakes);
        }

        sc.close();
    }
}
