import java.util.Scanner;

public class BMICalculatorTeam {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to get BMI Status
    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display result in tabular format
    public static void displayTable(double[] heights, double[] weights,
                                    double[] bmis, String[] status) {

        System.out.println("\nHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    heights[i], weights[i], bmis[i], status[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] status = new String[n];

        // Take input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Member " + (i + 1));

            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weights[i] = sc.nextDouble();

            // Calculate BMI
            bmis[i] = calculateBMI(weights[i], heights[i]);

            // Get status
            status[i] = getBMIStatus(bmis[i]);
        }

        // Display final table
        displayTable(heights, weights, bmis, status);

        sc.close();
    }
}
