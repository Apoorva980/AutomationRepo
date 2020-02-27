package constructor;

public class Bike {
	
	static String color;
 String model;
	int speed;
	int average;
	static int wheels = 2;
	
	public void feature () {
		
		System.out.println(color+" "+model+ "has two wheels and its average speed is" +speed+ "its average is" +average);
	}

	public Bike (String colour,// parameterized constructor
			int speed,
			String model,
			int average)
			
			{
				this.color = colour;
				this.model = model;
				this.speed = speed;
				this.average = average;
}
}