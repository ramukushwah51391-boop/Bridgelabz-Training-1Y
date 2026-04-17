

public class Circle {
        double rad;
 
        Circle(double r){
          rad = r;

        }
        void dis(){
            System.out.println("Radius of the circle  " +rad);
        }
        public static void main(String[] args) {
            Circle c1 = new Circle(25);
            c1.dis();
            System.out.println("............................");
             Circle c2 = new Circle(548);
            c2.dis();
        }

}
