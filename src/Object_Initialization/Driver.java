package Object_Initialization;

public class Driver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setValue("Ankit", 678900.67, 28);
		
		Employee e2 = new Employee();
		e2.setValue("Harsh", 8778900.67, 30);
		
		e1.displayDetail();
		e2.displayDetail();
	}
}
