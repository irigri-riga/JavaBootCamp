package sef.module6.activity;
import java.lang.Math.*;

public class Circle extends Shape {
	public double length;		//Define side of the cirle
	
	
	public double calculateArea() {		
		//return Math.PI  * Math.PI * length/2 ;
	}
	
	public double calculatePerimeter() {
		//return 2 * Math.PI * length;
	}
	
	
	
	public Circle(){			 //default constructor
			this.length = 0.0;
		System.out.println("The Circle is ready!");
	}
	
	public Circle (double length){		 //parameterized constructor
		this.length = 32.6;;
		}
	

}
