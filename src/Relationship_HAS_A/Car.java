package Relationship_HAS_A;

public class Car {

	String brand;
	int price;
	String color;
	
	Engine e1 = new Engine(1080,4,"Petrol");
	
	Car(){
		
	}
	
	Car(String brand, int price, String color){
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
}
