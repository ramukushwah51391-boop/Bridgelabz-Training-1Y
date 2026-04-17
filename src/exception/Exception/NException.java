import java.util.Scanner;

 public class NException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       try {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int index = sc.nextInt();

            System.out.println(arr[index]);
            try{
                int div = sc.nextInt();
                int res = arr[index]/div;
                System.out.println("Array is divisible");
            }
            catch(ArithmeticException e){
                System.out.println("Error" +e);
            }

        }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Error" +e);
       }

    }
}