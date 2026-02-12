import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {
        int[] numbers = takeInput();
        int max = findMaximum(numbers);
        displayResult(numbers, max);
    }

    // Method to take input from user
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();

        return nums;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // Method to display result
    public static void displayResult(int[] nums, int max) {
        System.out.println("\nNumbers entered:");
        System.out.println(nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println("Maximum number is: " + max);
    }
}
