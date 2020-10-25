package finalActivity;

/*2) In file Employee
	2.1 Add different constructors
	2.2 Add getters and setters
	2.3 Add method for introduce of person ->	
	"My name is <name> and i am <age> years old
 	I am work as <jobTitle> in <company>" */

public class Employee extends Person{
		
	public String title;
	public String company;
	private int salary;	 //private!
	public boolean businessTrip;
	
	
	public Employee(){	//default constructor
		this.title = "N/A";
		this.setSalary(0);
		this.company = "N/A";
		
		this.businessTrip = false;
			
		System.out.println("default constructor for (every) Employee is ready");
		}	
		
	public Employee(String title, int salary, String company, boolean businessTrip){	 //parameterized constructor
		this.title = title;
		this.setSalary(1000);
		this.company = company;
		this.businessTrip = false;
		}
	
	public String introEmployee() {
		return introPerson() + "and I work as a " + title + " in " + company + "."; 
	}

		public int getSalary() {
		return salary;
	}

	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}		