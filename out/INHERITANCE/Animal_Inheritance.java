public class Animal_Inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.age=5;
        d.name="tommy";
        d.dis();
        d.sound();
        cat c = new cat();
        c.age=10;
        c.name="mais";
        c.dis();
        c.sound();

    }

}
class animal{
    String name;
    int age;
     void dis(){
        System.out.println("age of an Animal  " +age);
        System.out.println("NAme of an animal  " +name);
     }
     void sound(){
        System.out.println("Animals make sound");
     }

}
class dog extends animal{
    void sound(){
        System.out.println("Dogs barks");
    }

}
class cat extends animal{
    void sound(){
        System.out.println("miuo");
    }
}

