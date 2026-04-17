import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
             if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' 
             || ch =='A' || ch =='E' || ch =='O' || ch =='U'){
                
                count++;
             }
        }
        System.out.println(count);
        sc.close();
    }

}
