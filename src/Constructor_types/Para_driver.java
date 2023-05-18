package Constructor_types;

public class Para_driver {

	public static void main(String[] args) {
		Para p1 = new Para("Mango", 140, 4.87);
		System.out.println(p1.name);
		System.out.println(p1.price);
		System.out.println(p1.weight);
		
		Para p2 = new Para("Orange", 80, 2.87);
		System.out.println("====================");
		System.out.println(p2.name);
		System.out.println(p2.price);
		System.out.println(p2.weight);
	}
}
