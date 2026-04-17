package Exception;
import java.util.Scanner;
public class age {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("Access granted");
            }
            else{
                throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("Age must be 18 or above");
        }

    }
}
