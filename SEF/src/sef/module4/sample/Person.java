package sef.module4.sample;

import java.util.Calendar;

public class Person { 	//no main method here!! go to the ClassInstanceSample
						// you cannot actually RUN this code as usual

	//Attributes
	private String name;
	
	
	//Behavior aka METHODs
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String introduce(){
		return "My name is " + name;
	}
	
}
