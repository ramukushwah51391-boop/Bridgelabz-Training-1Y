import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;   // 5 km = 5000 meters
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input! All sides must be positive.");
        } else {
            double rounds = calculateRounds(side1, side2, side3);
            System.out.println("\nThe athlete must complete " + rounds + " rounds to run 5 km.");
        }

        sc.close();
    }
}
