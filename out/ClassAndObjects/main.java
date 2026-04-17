public class main {
 
public static void main(String[] args) {
    Dog d1 = new Dog();
     d1.walk();
     d1.bark();
     System.out.println(d1.age);
     d1.name = "Tommy";
     System.out.println(d1.legs);
     System.out.println(d1.color);
   }
}
class Dog{
    String name = "Tommy";
    int age = 12;
    int legs  = 4;
    String color = "Black";
    void walk(){
        System.out.println("Dog is walking");
    }
    void bark(){
        System.out.println("Dog id barking");
    }
}

