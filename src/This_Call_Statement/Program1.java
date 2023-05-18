package This_Call_Statement;

public class Program1 {
	String name;
	int price;
	int hp;
	String color;
	
	Program1(String name){
		this.name = name;
	}
	
	Program1(String name, int price){
		this(name);
		this.price = price;
	}

	Program1(String name, int price, int hp){
		this(name, price);
		this.hp = hp;
	}
	
	Program1(String name, int price, int hp, String color){
		this(name, price, hp);
		this.color = color;
	}
}
