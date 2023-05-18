package Global_Hiding;

public class Program1 {
	static int a = 18;
	
	public static void main(String[] args) {
		System.out.println(a);
		a = 67;
		System.out.println(a);
		int a = 657;
		System.out.println(a);
		a = 98;
		System.out.println(a);
		Program1.a = 345;
		System.out.println(a);
		System.out.println(Program1.a);
		
	}

}
