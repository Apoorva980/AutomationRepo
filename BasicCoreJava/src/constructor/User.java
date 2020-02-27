package constructor;

public class User {

	public static void main(String[] args) {
		// we are initilizing our intance variable/ object ko initialize

		
		Car ford = new Car();
		ford.average = 12;
		ford.colour = "White";
		ford.model = "figo";
		ford.speed = 150;
		ford.feature();
	

	
	Car Maruti = new Car();
	Maruti.average = 15;
	Maruti.colour = "Silver";
	Maruti.model = "Kia";
	Maruti.speed = 120;
	//Maruti.wheels = 4;
	Maruti.feature();



		Car Kia = new Car();
		Kia.average = 10;
		Kia.colour = "Red";
		Kia.model = "Corolla";
		Kia.speed = 130;
		//Kia.wheels = 4;
		Kia.feature();
		
		Car hyundai = new Car("Polar White", 140, "Elite", 14);
		hyundai.feature();
		
	}
	}