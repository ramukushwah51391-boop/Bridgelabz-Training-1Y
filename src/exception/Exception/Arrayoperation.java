package Exception;
import java.util.*;
public class Arrayoperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         try{
             int n = sc.nextInt();
             int[] arr=new int[n];

             for(int i=0; i<n; i++){
                 arr[i] = sc.nextInt();
             }
             int index = sc.nextInt();
             System.out.println("Value at index X: " +arr[index]);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Invalid index");
         }
         catch(NullPointerException e){
             System.out.println("null");
         }
         sc.close();
    }
}
