package basic;
import java.util.Scanner;
public class sumequalornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  First number");
		int a=sc.nextInt();
		System.out.println("enter the Second number");
		int b=sc.nextInt();
		int sum=0;
		sum=a+b;
			if(sum%2==0) {
				System.out.println("Sum is even");
			}
			else
				System.out.println("Sum is odd");
		
       sc.close();
	}

}
