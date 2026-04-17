import java.util.*;
public class Track_Inventory_of_Items {
    public static void main(String[] args) {
           
        String itemcode = "1254";
    String itemName = "maths";
    items i = new items();
         i.itemcode = itemcode;
          i.itemName= itemName;
          System.out.println(i.itemName);
          System.out.println(i.itemcode);
        i.price(5000);
    
    }
}
class items{
    String itemcode;
    String itemName;
    static void price(int n){
        System.out.println(n);
    }
}
