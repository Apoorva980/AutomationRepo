package oop.inheritance;

public class User {
	
	public static void main(String[] args) {
		
		Telephone phone = new Telephone();
		
		phone.calling();
		
		
		Mobile m = new Mobile ();
		
				m.calling();
		        m.texting();
		        
		Smartphone sm = new Smartphone ();
		sm.calling();
		sm.texting();
		sm.internet();
				
	}

}
