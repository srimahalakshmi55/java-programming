package basic;
public class reverse100to1skipping2 {
	public static void main(String[] args) {
    int count=0;
		for(int i=100;i>=1;i-=3) {
			System.out.print(i+" ");
      count++;
		}
    System.out.println("\ncount="+count);
	}

}
