package sef.module6.activity;

public class Rectangle extends Shape {
	public double length;		//Define double parameter ‘length’ and ‘breadth’
	public double width;
	
	
	public double calculateArea() {		//2 methods from abstraction class Shape
		return length * width;
	}
	
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	public Rectangle(){		 //default constructor
			this.length = 0.0;
			this.width = 0.0;
		System.out.println("The Rectangle is ready!");
	}
	
	public Rectangle(double length, double width){		 //parameterized constructor
		this.length = 32.6;
		this.width = 5.1;
	}
	
	
}
