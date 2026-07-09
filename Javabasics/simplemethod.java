package basic;
class calculator{
	public int sum(int n1,int n2) {
		return n1+n2;
	}
}
public class simplemethod {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		calculator obj=new calculator();
        int r1=obj.sum(num1,num2);
        System.out.println(r1);
        }

}
