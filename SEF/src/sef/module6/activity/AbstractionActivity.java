package sef.module6.activity;

public class AbstractionActivity{
		/*Write the code to print color, area and perimeter of
			Circle  with side 5 and Rectangle with length 5 and
			breadth 6. */
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setColor("green");
		r.length = 5.0;
		r.width = 6.0;
		
		Circle c = new Circle();
		c.setColor("pink");
		//c.length = 5.0;	
		
		System.out.println("---------------------------------------");
		System.out.println("A " + r.getColor() + " rectangle with area " + r.calculateArea() + " and perimeter " + r.calculatePerimeter());
		System.out.print("A " + c.getColor() + " circle with perimeter ");
		
		AbstractionActivity circlePer = new AbstractionActivity();
		circlePer.circlePer();
	}
	
	static void circlePer() {
		double diam = 5.0;		//side of a circle equals its diameter
		double circlePer = Math.PI * diam;
		System.out.println(circlePer);
	}

}
