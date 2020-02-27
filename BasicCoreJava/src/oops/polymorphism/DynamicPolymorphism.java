package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {
	
	public static void main(String[] args) {
		
		
		Telephone phone ;
		
		// one reference for multiple object
		
	    phone = new Mobile();
		phone = new Telephone();
		phone = new Smartphone ();
		
	phone.calling();
	}

}
