package basic;
import java.util.Scanner;
public class studentmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		System.out.println("enter the elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		float avg=0;
		for(int i=0;i<=n-1;i++) {
			avg=avg+(arr[i]);
		}
		avg=avg/n;

		System.out.println("Average is:"+avg);
		}

}
