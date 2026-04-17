
public class Motor {
    String  company;
    String name;
    double price;

    Motor(){
      company = "unknown";
      name = "unknown";
      price = 0.0;
    }
    Motor(String c, String n, double p){
       // System.out.println("Every thing is here");
        company = c;
        name = n;
        price = p;
    }
    void Dis(){
        System.out.println("company of the motor  "  +company);
        System.out.println("Name of the company  "  +name);
        System.out.println("price of the car   "  +price);

    }
    public static void main(String[] args) {
        Motor m1 = new Motor();
        m1.Dis();
        System.out.println();
        Motor m2 = new Motor("otamas", "benger", 56000);
        m2.Dis();
         
    }

}
