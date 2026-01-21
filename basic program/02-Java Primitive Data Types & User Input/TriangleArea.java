import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        double areaCm, areaIn;

        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        // Area in square centimeters
        areaCm = 0.5 * base * height;

        // Convert square cm to square inches
        areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " 
                            + areaIn + " and sq cm is " + areaCm);


    }
}
