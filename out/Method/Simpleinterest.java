import java.util.*;
public class Simpleinterest{
static void Interest(float p, float r, float t){
    float total = ((p*r*t)/100);
    System.out.println(total);
    return;
}


   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        Interest(p,r,t);
    }

}
  
