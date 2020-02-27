package oops.abstration;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class BankUser {
	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		sum (a,b);
		RBI obj = new HDFC();// kisi class ka 
		callBank (obj);*/
		
		sum (10,20);
		callBank (new HDFC ());// object pass kiya hai
		callBank (new HSBC());
		
		CallPhone (new Telephone ());
		CallPhone (new Smartphone ());
	CallPhone (new Mobile ());
		
	}
		
	
	
	public static void callBank (RBI bank) // reference banaya hai
	
	{
		bank.creditCard();
		bank.debitCard();
		bank.savingAccount();
		bank.currentAccount();
		bank.demonetization();

}

public static void sum (int a, int b)
{
System.out.println(a+b);
}

public static void CallPhone(Telephone phone)
{
phone.calling();
}
}


