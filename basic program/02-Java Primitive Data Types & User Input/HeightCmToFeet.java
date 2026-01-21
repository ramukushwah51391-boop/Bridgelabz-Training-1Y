import java.util.Scanner;

class HeightCmToFeet{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double cm = sc.nextDouble();
		double inches = cm/2.54;
		double feet = inches/12;
		 
		System.out.println("convert height into inches =" +inches);
		System.out.println("convert height into feet =" +feet);
		}
}