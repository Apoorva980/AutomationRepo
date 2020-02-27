package Abstraction;

public class HSBC implements RBI{

	@Override
	public void savingaccount() {
		System.out.println("saving account");
		
	}

	@Override
	public void checkingaccount() {
		System.out.println("checking account");
		
	}

	@Override
	public void debitcard() {
		System.out.println("debitcard");
		
	}

	@Override
	public void creditcard() {
		System.out.println("credit card");
		
	}
}
