package basic;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int s=1;
	for(int i=1;i<n;i++) {
		
		s=s*i;
	}
	System.out.println(s);
    sc.close();
	}

}
