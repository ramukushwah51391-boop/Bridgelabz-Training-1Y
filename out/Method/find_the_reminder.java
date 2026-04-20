import java.util.*;
public class find_the_reminder {
    static void fun(int num, int divisor){
        int result1 = num/divisor;
        int result2 = num%divisor;
        System.out.println("Divisor");
        System.out.println(result1);
        System.out.println("Reminder");
        System.out.println(result2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        fun(x,y);
    }

}
