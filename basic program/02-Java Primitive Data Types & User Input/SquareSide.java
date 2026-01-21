import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float perimeter, side;

        System.out.print("Enter the perimeter of the square: ");
        perimeter = sc.nextFloat();

        side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        
    }
}
