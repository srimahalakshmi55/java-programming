package basic;
import java.util.Scanner;
public class countdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);
			n=n/10;
			count+=1;
		}
		System.out.println(count);
sc.close();
	}

}
