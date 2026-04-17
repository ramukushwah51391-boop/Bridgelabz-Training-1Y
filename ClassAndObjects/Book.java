public class Book {
    public static void main(String[] args) {
        math m = new math();
        m.price(500);
        m.name = "raj";
    }

}
class math{
    String name;
    String authar;
     
    void price(int x){
        System.out.println(x);
    }
}
