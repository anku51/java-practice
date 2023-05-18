package CopyConstructor;

public class Driver {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("Mango", 120, 5.7);
		System.out.println(f1.name);
		
		Fruit f2 = new Fruit(f1);
		System.out.println(f2.price);
		
		Fruit f3 = new Fruit(f1, 100,3.4);
		System.out.println(f3.price);
		System.out.println(f3.weight);
	}
}
