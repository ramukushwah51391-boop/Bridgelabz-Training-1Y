package program1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int nums = sc.nextInt();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        System.out.println("table of given number:");
        for (int i = 0; i < num.length; i++) {
            int table = nums * num[i];
            System.out.println(  nums + "x" + num[i]+"=  " + table);
        }
    }
}
