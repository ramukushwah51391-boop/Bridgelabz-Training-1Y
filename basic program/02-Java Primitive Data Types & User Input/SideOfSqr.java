import java.util.Scanner;

class SideOfSqr{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double perimeter = sc.nextDouble();
		double side = perimeter/4;
		System.out.println("The length of the side of sqr is=" +side);
		System.out.println("perimeter of sqr is =" +perimeter);
		}
}