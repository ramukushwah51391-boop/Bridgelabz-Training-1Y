class Discount{
		public static void main(String[] args){
		 double fee = 125000;
		 double discount = 10.0/100.0;
		 double discount_amount = 125000*discount;
		 double pay_fee = fee - discount_amount;
		System.out.println("the discounted amount =" +discount_amount);
		System.out.println("the  discounted price =" +pay_fee);
		}
}