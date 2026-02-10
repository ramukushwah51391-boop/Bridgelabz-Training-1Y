package program2;

import java.util.Scanner;

public class SalaryOfEmployees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] year = new int[10];
        int i =0;
        int bonus = 0;
        for(i=0; i<year.length; i++){
            System.out.print("Enetr the working year of a emp" +(i+1)+ ":");
            year[i] = sc.nextInt();
            bonus = year/year.length;
        }
        System.out.print("Bonus of a emp" +bonus);
    }
}
