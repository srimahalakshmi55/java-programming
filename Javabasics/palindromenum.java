package basic;

import java.util.Scanner;

public class palindromenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);     //% gives the reminder
			n=n/10;   //"/" gives the quotient
		}
		System.out.println("reverse of the number is:"+rev);
		if(temp==rev) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
		sc.close();

	}

}
