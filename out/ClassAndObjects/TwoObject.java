public class TwoObject {
    public static void main(String[] args) {
        student s1 =new student();
        student s2 = new student();
        System.out.println(".....................................................................");
        s1.name = "Raj kushwah";
        s2.name = "NAnadani pachaury";
        s1.Standard = "B.tech";
        s2.Standard = "BsC";
        s1.show();
        s2.show();
        System.out.println("They both are love to each othe");
        System.out.println(".........................................................................");
    
    }

}
class student{
    String name;
    int age;
    String Standard;
    void show(){
        System.out.println(name);
         System.out.println(Standard);
    }
}
