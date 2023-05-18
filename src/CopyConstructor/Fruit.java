package CopyConstructor;

public class Fruit {
	String name;
	int price;
	double weight;
	
	Fruit(String name, int price, double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;		
	}

	Fruit(Fruit f){
		this.name = f.name;
		this.price = f.price;
		this.weight = f.weight;		
	}
	
	Fruit(Fruit f, int price, double weight){
		this.name = f.name;
		this.price = price;
		this.weight = weight;
	}
}
