public class Transport_System {
public static void main(String[] args) {
    car c = new car();
    truck t = new truck();
    moto m = new moto();
    c.fuel="petrol/CNG";
    c.speed=120;
    c.dis();


    t.tyre();
    t.fuel="diseal";
    t.speed=40;
    t.dis();

    
    m.fuel="petrol";
    m.speed=160;
    m.dis();
    
}

}
class vehicle{
    int speed;
    String fuel;
    void dis(){
        System.out.println("Speed of the velicle  :" +speed);
        System.out.println("Fuel type of the vehicle  :" +fuel);

    }
}
class car extends vehicle{

}
class truck extends vehicle{
    void tyre(){
        System.out.println("there are 20 tyres");
    }
}
class moto extends vehicle{
    void col(){
        System.out.println("color of the bike is black  ");
    }
}
