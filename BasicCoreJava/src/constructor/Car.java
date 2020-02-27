package constructor;

public class Car {

	
	String colour;
	int speed;
	String model;
	int average;
	static int wheels = 4;
	
	public void feature () {
		System.out.println(colour+" "+model+ "car has " +wheels+ "wheels and its average speed is " +speed+  "and average is "+average+ " kmpl");
		
	}
	
	public Car (String colour,// parameterized constructor
	int speed,
	String model,
	int average)
	
	{
		this.colour = colour;
		this.model = model;
		this.speed = speed;
		this.average = average;
		
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}
}