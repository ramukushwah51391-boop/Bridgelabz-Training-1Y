package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class divede {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        int a = sc.nextInt();
        int b = sc.nextInt();

            int c = a/b;
            System.out.println("resutl  =  "+c);
        }
        catch(ArithmeticException e){
            System.out.println("mistake");
        }
        catch(InputMismatchException e){
            System.out.println("invade no.");
        }
    }
}
