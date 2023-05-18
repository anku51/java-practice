package Relationship_HAS_A;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car("Hyundai Creta", 2000000, "Black");
		
		System.out.println("Car name is : "+c1.brand);
		System.out.println("Car price is : "+c1.price);
		System.out.println("Car color is : "+c1.color);
		System.out.println("Car Engine hp is : "+c1.e1.hp);
		System.out.println("Car Engine Stroke is : "+c1.e1.stroke);
		System.out.println("Car Engine type is : "+c1.e1.type);
	}
}
