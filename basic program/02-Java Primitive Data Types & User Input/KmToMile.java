import java.util.Scanner;

class KmToMile{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double  km = sc.nextDouble();
		double miles = km/1.6;
		System.out.println("convert into km to miles =" +miles);
		}
}