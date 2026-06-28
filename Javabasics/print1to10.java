package basic;
import java.util.Scanner;
public class print1to10 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++) {
		 System.out.print(i+" ");
		 }
	 System.out.println(" ");
	 for(int i=n;i>=1;i--) {
		 System.out.print(i+" ");
	 }
	 sc.close();
 }
}
