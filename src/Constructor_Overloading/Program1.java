package Constructor_Overloading;

public class Program1 {
	String name;
	int age;
	double salary;
	char id;
	
	// By changing the arguments
	
	Program1(String n,int a){
		this.name = n;
		this.age = a;
		
	}
	
	Program1(String n,int a,double s){
		this.name = n;
		this.age = a;
		this.salary = s;
		
	}
	
	// By changing the data type
	
		Program1(String n){
			this.name = n;
			
		}
		
		Program1(char i){
			this.id= i;
		}
		
		// By changing the Sequence
		
			Program1(int a){
				this.age = a;
				
			}
			
			Program1(double s){
				this.salary = s;
			}
	

}
