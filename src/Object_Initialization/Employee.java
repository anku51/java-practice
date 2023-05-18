package Object_Initialization;

public class Employee {
	String name;
	double salary;
	int age;
	
	public void setValue(String n,double s, int a) {
		name = n;
		salary = s;
		age = a;
	}
	
	public void displayDetail() {
		System.out.println("Name of the employee is : "+ name);
		System.out.println("Salary of the employee is : "+salary);
		System.out.println("Age of the employee is : "+ age);
		System.out.println("============================");
	}

}
