package basic;

public class overloading {
	int add(int x,int y) {
		return x+y;
		}
	float add(float x,float y) {
		return x+y;
	}
	int add(int x,int y,int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		overloading s1=new overloading();
		System.out.println(s1.add(10, 10));
		System.out.println(s1.add(10.0f,19.5f));
		System.out.println(s1.add(10,27,45));
		
	}

}
