package Relationship_HAS_A;

public class Engine {
	int hp;
	int stroke;
	String type;
	
	Engine(){
		
	}
	
	Engine(int hp , int stroke, String type){
		this.hp = hp;
		this.stroke = stroke;
		this.type = type;
	}
	
	public void start() {
		System.out.println("Start the Engine");
	}

}
