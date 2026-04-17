
public class HotelBooking {
        String guast;
        String roomtype;
        int night;
        HotelBooking(String g, String r, int n){
             guast = g;
              roomtype = r;
              night = n;

        }
        HotelBooking( HotelBooking H){
            guast = H.guast;
              roomtype = H.roomtype;
              night =  H.night;
        }
        void dis(){
            System.out.println("Guast   = " +guast+       " Roomtype    =   " +roomtype+         "   NIght     ="+night) ;
        }
        public static void main(String[] args) {
            HotelBooking h = new HotelBooking("Raj", "AC" , 5);
            HotelBooking h1 = new HotelBooking(h);
            System.out.println("p.........................");
            h.dis();
            System.out.println("p1.........................");
            h1.dis();

        }

}
