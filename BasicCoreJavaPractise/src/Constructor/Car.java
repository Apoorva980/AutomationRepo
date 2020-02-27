package Constructor;

public class Car {

	String Model;
	String color;
	int speed;
	int average;
	int wheels =4;
	
	public void feature () {
		System.out.println(color+ " "+ Model+ " "+"has 4 wheels and its average is" +average+ "speed is "+speed);
	}


public Car(String color, String Model, int speed, int average)
{
	this.color= color;
	this.Model = Model;
	this.speed = speed;
	this.average =average;
	
}


public Car() {
	// TODO Auto-generated constructor stub
}
}


