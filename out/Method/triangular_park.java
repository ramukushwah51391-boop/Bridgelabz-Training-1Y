import java.util.*;
public class triangular_park {
    static void Round( float a ,  float b , float c){
        float NoRound = (5000/(a+b+c));
        System.out.println(NoRound);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        Round(a,b,c);

    }

}
