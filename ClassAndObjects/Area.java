public class Area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area(5,2);
    }


}
class Rectangle{
     int length;
     int breath;
    void area(int l , int b){
        length=l;  
        breath=b;
        int Area = length*breath;
        System.out.println(Area);
    }
}
