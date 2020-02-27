package Constructor;

public class CarUser {

	public static void main(String[] args) {
		
		Car corolla = new Car();
				corolla.average = 20;
				corolla.speed = 120;
				corolla.Model = "corolla le";
				corolla.color = "Black";
			corolla.feature();
	


               Car Kia = new Car ();
                Kia.average = 60;
                Kia.speed = 80;
                Kia.Model = "abc";
                Kia.color = "Brown";
                Kia.feature();
                
                Car Honda = new Car ("brown", "civic", 120, 60 );
                		Honda.feature();
	}
}