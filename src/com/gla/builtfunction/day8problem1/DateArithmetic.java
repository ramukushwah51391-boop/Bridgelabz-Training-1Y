import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        System.out.println("Original Date: " + date);

        // Add 7 days
        LocalDate newDate = date.plusDays(7);
        System.out.println("After adding 7 days: " + newDate);

        // Add 1 month
        newDate = newDate.plusMonths(1);
        System.out.println("After adding 1 month: " + newDate);

        // Add 2 years
        newDate = newDate.plusYears(2);
        System.out.println("After adding 2 years: " + newDate);

        // Subtract 3 weeks
        newDate = newDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + newDate);

        sc.close();
    }
}
