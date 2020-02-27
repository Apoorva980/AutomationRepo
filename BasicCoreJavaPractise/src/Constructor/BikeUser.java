package Constructor;

public class BikeUser {
	
	public static void main(String[] args) {
		
		Bike Bajaj = new Bike("Black", "pulser", 30, 120);
		Bajaj.feature();
		
		Bike Honda = new Bike("purple", "Activa5G", 50, 130);
		Honda.feature();
	}

}
