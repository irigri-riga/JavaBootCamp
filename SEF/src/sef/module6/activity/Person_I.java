package sef.module6.activity;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	private String firstName;
	private String lastName;
	private int age;
	
	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	public Person_I(){
		this.firstName = "N/A";
		this.lastName = "N/A";
		this.age = 0;
		System.out.println("I'm Person_I constructor!");
		}
	
	//Behavior - write parameterized constructor
	public Person_I(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// write getter for String name
	public String getFirstName(){
		return firstName;
	}
	
	// write setter for String name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	
	

	// write getter for String last name
	public String getLastName(){
		return lastName;
	}
	
	// write setter for String last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	

	// write getter for int age
	public int getAge() {
		return age;
	}
	

	// write setter for int age
	public void setAge(int age) {
		this.age = age;
	}

}

