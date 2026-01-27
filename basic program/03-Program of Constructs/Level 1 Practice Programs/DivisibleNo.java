import java.util.Scanner;

public class DivisibleNo{
			public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n%5==0){
			System.out.print("No. is divisible by 5:" +n);
			}
			else
			{
			System.out.print("No. is not divisible by 5:" +n);
			}
			}
} 