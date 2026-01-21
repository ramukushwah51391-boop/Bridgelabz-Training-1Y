import java.util.Scanner;

class NumberOfStudents{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("the number of studens");
		int n = sc.nextInt();
		int  hand  = n*(n-1)/2;
		 
		System.out.println("the number of possible handshakes:" +hand);
		}
		}
		 