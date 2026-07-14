package basic;
import java.util.Scanner;
public class Greaternumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a number");
		int a=s.nextInt();
		System.out.println("Enter the b number");
		int b=s.nextInt();
		if(a>b) 
			System.out.println(a+" is maximum number");
		
		else
			System.out.println(b+" is maximum number");
		s.close();
	}

}
