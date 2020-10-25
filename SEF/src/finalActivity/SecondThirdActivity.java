package finalActivity;

/*	6) Create a calculator in SecondActivity
 ??	7) Add tests for calculator
 	9) In third activity
		9.1 create try-catch blocks
		9.2 handle the exceptions
 */

public class SecondThirdActivity  {
		static int a = 12;
		static int b = 0;
		
public static void main(String[] args) {
			
	int sum = a + b;
	int sub = a - b;
	int prod = a * b;
	
	System.out.println("Input numbers are: " + a + " and " + b);
	System.out.println("---------------------------");
	System.out.println(a + " + " + b + " = " + sum);
	System.out.println(a + " - " + b + " = " + sub);
	System.out.println(a + " * " + b + " = " + prod);
	
	SecondThirdActivity act = new SecondThirdActivity();
	act.catchMe();
	
	}
					
		
void catchMe(){			//try and catch

	try {
		int div = a/b;
		System.out.println(a + " / " + b + " = " + div);
	}
	
	catch(ArithmeticException e){
		System.out.println("cannot divide by zero!");
	}
	
	finally {
		System.out.println("-------------------");

	}

	}
}