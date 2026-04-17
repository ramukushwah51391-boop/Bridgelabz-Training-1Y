public class Maruti {
    public static void main(String[] args) {

        Alto A = new Alto();
        System.out.println(A.Name);
        System.out.println(A.color);
        System.out.println(A.price);
        A.Milage();
        A.Sound();
        
        
    }

}
class Alto{
    String Name = "Alto 800";
    String color = "Black";
    int price = 21300;
    
    void Milage(){
        System.out.println("The milage of car 20km");
    }
    void Sound(){
        System.out.println("block buster");
    }

}
