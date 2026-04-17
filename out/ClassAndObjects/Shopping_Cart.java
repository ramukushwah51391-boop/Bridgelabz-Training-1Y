import java.util.*;
public class Shopping_Cart {
    public static void main(String[] args) {
         CartItem c = new CartItem();
        System.out.println(c.name);
        System.out.println(c.color);
        c.price(500);
        }

}
 class CartItem{
    String name = "Tshirt";
    String color = "Black";
    void price(int x){
        System.out.println(x);
    }

}
