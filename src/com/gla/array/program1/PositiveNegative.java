package program1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0; i<num.length; i++){
            System.out.print("Enter the number" +(i+1)+ ":");
             num[i] = sc.nextInt();
        }
        System.out.print("\ncheck the number is positive or not: ");
        for(int i=0; i<num.length; i++){
            if(num[i]==0){
                System.out.print("\nzero:"+num[i]);
            }
            else if(num[i]<0){
                System.out.print("\nnegative number:"+num[i]);
            }
            else{
                System.out.print("\npositive number:"+num[i]);
            }

        }

            System.out.print("\nTo check even or odd :");
            for (int i = 0; i < num.length; i++) {
                if (num[i] > 0) {
                    if (num[i] % 2 == 0) {
                        System.out.print("\neven :"+num[i]);
                    } else {
                        System.out.print("\nodd :"+num[i]);
                    }
                }
            }
            System.out.print("\nsum of first and last element of array");
            int sum = num[0]+num[4];
            System.out.print("sum = "+sum);
    }
}
