package program1;

import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] heigth = new int[11];
        int i=0;
        float sum = 0;
        for(i=0; i<heigth.length; i++){
           System.out.print("Enter the heigth of player" +(i+1)+":");
           heigth[i] = sc.nextInt();
            sum = sum+heigth[i];
        }
        // sum = sum+heigth[i];
        float mean = sum/heigth.length;
        System.out.print("The mean of players :" +mean);
    }
}
