 import java.util.Scanner;

class Fee{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ener the fee =");
		double  fee = sc.nextDouble();
		System.out.println("enter the discount percentage =");
		double discount = sc.nextDouble(); 
		
		double discount_money = fee*discount/100;
		double  fee_pay =  fee - discount_money ;
		System.out.println("The discount money =" +discount_money);
		System.out.println("The fee pay after discount =" +fee_pay);
		}
}