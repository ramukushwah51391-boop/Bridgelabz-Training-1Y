import java.util.Scanner;

class FeetToYard{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double  feet = sc.nextDouble();
		double yard = feet/3;
		double miles = yard/1760;
		System.out.println("convert into feet to miles =" +miles);
		System.out.println("convert into feet to yard =" +yard);
		}
}