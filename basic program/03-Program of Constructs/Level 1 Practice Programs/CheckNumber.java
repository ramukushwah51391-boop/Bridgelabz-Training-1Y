import java.util.Scanner;

public class CheckNumber{
			public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			if(num>=0)
			{
			System.out.print("positive");
			}
			else if(num<=0)
			{
			System.out.print("negitive");
			}
			else
			{
			System.out.print("zero");
			}
			}

}