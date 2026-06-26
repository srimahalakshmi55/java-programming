package basic;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	
	int rev=0;
	while(n!=0) {
		rev=rev*10+(n%10);     //% gives the reminder
		n=n/10;   //  "/" gives the quotient
	}
	System.out.println("reverse of the number is:"+rev);
		sc.close();
}
}
