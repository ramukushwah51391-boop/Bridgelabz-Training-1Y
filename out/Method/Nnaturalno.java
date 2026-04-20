import java.util.*;
public class Nnaturalno {
    static void sum(int n){
        int total = 0;
        for(int i=0; i<=n; i++){
            total = total+i;
        }
        System.out.println(total);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
    }

}
