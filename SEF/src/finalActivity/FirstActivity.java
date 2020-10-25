package finalActivity;
import java.util.Arrays;

/*in file FirstActivity
	4.1 create few employees
???	4.2 try to print them from top salary to less*/

public class FirstActivity {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setFirstName("Freddy");
		e1.setLastName("Krueger");
		e1.setAge (78);
		e1.title = ("DJ");
		e1.setSalary(2000);
		e1.company = ("Rubin");
		e1.businessTrip = false;
		
		Employee e2 = new Employee();
		e2.setFirstName("Chip");
		e2.setLastName("N`Dale");
		e2.setAge (39);
		e2.title = ("Ranger");
		e2.setSalary(1750);
		e2.company = ("the forest");
		e2.businessTrip = true;
				
		Employee e3 = new Employee();
		e3.setFirstName("Ralph");
		e3.setLastName("Hinterland");
		e3.setAge (39);
		e3.title = ("Developer");
		e3.setSalary(3400);
		e3.businessTrip = true;
		e3.introEmployee();
		
		
		System.out.println("------------------------------");
		System.out.println("These are our best employees: ");
		System.out.println("------------------------------");
		System.out.println("Name: " + e1.getFirstName() + " " + e1.getLastName());
		System.out.println("Age: " + e1.getAge());
		System.out.println("Company: " + e1.company);
		System.out.println("Title: " + e1.title);
		System.out.println("Salary: " + e1.getSalary());	
		System.out.println("------------------------------");
		System.out.println("Name: " + e2.getFirstName() + " " + e2.getLastName());
		System.out.println("Age: " + e2.getAge());
		System.out.println("Company: " + e2.company);
		System.out.println("Title: " + e2.title);
		System.out.println("Salary: " + e2.getSalary());	
		System.out.println("------------------------------");
		System.out.println("Name: " + e3.getFirstName() + " " + e3.getLastName());
		System.out.println("Age: " + e3.getAge());
		System.out.println("Company: " + e3.company);
		System.out.println("Title: " + e3.title);
		System.out.println("Salary: " + e3.getSalary());	
		System.out.println("------------------------------");
		System.out.println(e1.introEmployee());
		System.out.println(e2.introEmployee());
		System.out.println(e3.introEmployee());
		
		
		int[] salaries = {e1.getSalary(), e2.getSalary(), e3.getSalary()};
		Arrays.sort(salaries);
//		System.out.println(Arrays.toString(salaries));
		
		for(int i=0; i<salaries.length/2; i++){
			 int j= salaries[i];
			 salaries[i] = salaries[salaries.length -i -1];
			 salaries[salaries.length -i -1] = j;
			}
		
		System.out.println("sorted salaries: " + Arrays.toString(salaries));		
		
	}	

}
