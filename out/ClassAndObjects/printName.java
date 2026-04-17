public class printName {
    public static void main(String[] args) {
        MyName mn = new MyName();
        mn.display();
        
    }

}
class MyName{
    String name = "Ramu kushwah";
    void display(){
        System.out.println(name);
    }
}
