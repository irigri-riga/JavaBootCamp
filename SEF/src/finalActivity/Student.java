package finalActivity;

/*3) in file Students
	3.1 Create file students from scratch
	3.2 Add method for introduce of person ->
     "I am study in university <schoolName>"*/

public class Student extends Person {

	public String schoolName;
	
	public String introStudent() {
		return introPerson() + "I study in the" + schoolName; //HOW to check if this works?
	}
}
