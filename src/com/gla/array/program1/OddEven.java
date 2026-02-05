package program1;

import java.util.Scanner;

public class  OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int[] even = new int[num];
        int[] odd = new int[num];
        int oddcount = 0;
        int evencount = 0;
        int i = 0;
        for (i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                even[evencount] = i;
                evencount++;
            }
            else {
                odd[oddcount] = i;
                oddcount++;
            }
        }
            System.out.println("Even Numbers:");
            for (i = 0; i < evencount; i++) {
                System.out.print(even[i] + " ");
            }

            System.out.println();

            // Print Odd Numbers
            System.out.println("Odd Numbers:");
            for ( i = 0; i < oddcount; i++) {
                System.out.print(odd[i] + " ");
            }


    }
}
