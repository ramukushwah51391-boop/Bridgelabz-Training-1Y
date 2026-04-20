public class cartypecast {
    public static void main(String[] args) {
        vehicle obj = new maruti();
        maruti m = (maruti)obj;
        obj.display();
        m.speed();
        
    }

}
class vehicle{
    String car;
    void display(){
        System.out.println("vehicle");
    }
    
}
class maruti extends vehicle{
    String speed;


 void speed(){
System.out.println("run fast");

}
}