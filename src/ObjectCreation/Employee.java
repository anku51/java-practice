package ObjectCreation;

public class Employee {

	String name = "Ankit"; // states
	int age; // states
	String cmpname; // states
	double salary; // states
	
	public void work() {
		System.out.println("Do your work");
	} // behavior
	
	public void department() {
		System.out.println("Testing");
	} // behavior
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.department();
		e1.work();
		System.out.println(e1.name);
	}
}
