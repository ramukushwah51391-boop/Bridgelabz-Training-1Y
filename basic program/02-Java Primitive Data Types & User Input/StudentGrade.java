import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks = sc.nextInt();

            if (marks >= 90 && marks <= 100) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 40) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }

    }
	}
}

