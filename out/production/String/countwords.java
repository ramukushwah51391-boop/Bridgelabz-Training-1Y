import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.println(count);
    
    sc.close();
    }
}
