import java.util.Scanner;

class UnitPrice{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit price of the item:");
		double up =  sc.nextDouble();
		System.out.println("Enter the quantity of the item:");
		double quantity =  sc.nextDouble();
		double total_price = up * quantity;
		System.out.println("The total price of items = " +total_price);
		}
}