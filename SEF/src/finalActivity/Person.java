package finalActivity;

/*1) in file Person
	1.1 Based on code implement Person attributes
	1.2 Add method for introduce of person ->"My name is <name> and i am <age> years old" */

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String introPerson() {
		return "Hi! My name is " + firstName + " " + lastName + ", I am " + age + " years old ";
	}

	public String getFirstName(){ //getter firstName
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	
	
	public String getLastName(){ //getter lastName
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	public int getAge() {	//getter age
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}