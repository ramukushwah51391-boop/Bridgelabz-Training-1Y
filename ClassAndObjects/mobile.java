public class mobile {
    public static void main(String[] args) {
        Iphone i = new Iphone();
        System.out.println(i.name);
        System.out.println(i.color);
        System.out.println(i.size);
        i.battary();
        i.price(150000);
    }

}
class Iphone{
    String name = "15 Pro max";
    String color = "white";
    String size = "5.9 inch";
    void price(int x){
        System.out.println(x);
    }
    void battary(){
        System.out.println("5 Hour");
    }
}
