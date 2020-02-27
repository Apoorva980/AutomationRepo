package oops.polymorphism;

import oop.inheritance.Mobile;
import oop.inheritance.Smartphone;
import oop.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Telephone phone;
		
		phone =new Mobile();
		phone = new Smartphone ();
		phone = new Telephone();
		
		phone.calling();
		
	}
}
