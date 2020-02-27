package Constructor;

public class Bike {
	
	static String color;
	String model;
	int speed;
	int average;
	int wheels ;
		
	public void feature () {
		
		System.out.println(color+ model+ "has two wheels and its speed is" +speed +"and average is" +average);
	
	}

	public Bike(String color, String model, int speed, int average)
	
	{
		this.color =color;
		this.model= model;
		this.speed = speed;
		this.average = average;
	}
	
}
