 

public class Rentalservice {
    String carname;
    double carmodel;
    int rentalday;
    Rentalservice(String CN, double CM, int r){
        carname = CN;
        carmodel = CM;
        rentalday = r;

    }
    void dis(){
        System.out.println("car anme with proper detail  =" +carname);
        System.out.println("The model of the car  =" +carmodel);
        System.out.println("Day for which car on rent  =" +rentalday);
    }
    void total(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
       Rentalservice r = new Rentalservice("ferari", 154.15, 15);
       r.dis();
       System.out.println("Total money = ");
       r.total(4500);
    }

}
