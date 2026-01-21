import java.util.Scanner;

class Calculator{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		double a = sc.nextDouble();
		System.out.println("enter the second number");
		double b = sc.nextDouble();
		double add = a+b;
		double sub = a-b;
		double div = a/b;
		double mul = a*b;
		System.out.println("The sum of numbers =" +add);
		System.out.println("The substract of numbers =" +sub);
		System.out.println("The multiply of numbers =" +mul);
		System.out.println("The divide of numbers =" +div);
		}
}