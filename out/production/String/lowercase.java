import java.util.Scanner;
public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.toLowerCase();
        System.out.println(result);
        sc.close();
    }

}
