import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
        if(ch >= '0' && ch <='9')       
        count++;
        }
        System.out.println(count);
    }

}
