package program1;

import java.util.Scanner;

public class
ArrayOfMultipleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {

                System.out.print("Enter the number" + (i + 1) + ":");
                num[i] = sc.nextInt();
            if(num[i]<=0){
                break;
                }
        }
            int i = 0;
            for (i = 0; i < num.length; i++) {
                sum = sum + num[i];
            }
            System.out.println("sum :" + sum);
        }
    }

