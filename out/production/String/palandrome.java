import java.util.*;
public class palandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";
        for(int i=str1.length()-1; i>=0; i--){
            str2 = str2+str1.charAt(i);

        }
        System.out.print("Reverse is ");
        System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }

}
