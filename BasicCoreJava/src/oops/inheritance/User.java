package oops.inheritance;

public class User {

	public static void main(String[] args) {
		
		Telephone phone = new Telephone();
		phone.calling();
		
		
		Mobile mobile = new Mobile();
		mobile.calling();
		mobile.texting();
		
		Smartphone sm = new Smartphone();
		sm.calling();
		sm.texting();
		sm.internet();
		
		// TODO Auto-generated method stub

	}

}
