package Exception;
import java.util.Scanner;
public class finall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);

        }
        finally{
            System.out.println("Operation completed");
        }
    }
}
