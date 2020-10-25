package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape() {	//default constructor
		System.out.println("The Shape is ready!");
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() 
														//with return type as double
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	public abstract void calculateArea(double area);		//2 abstraction methods
	public abstract void calculatePerimeter(double per);
	

}
