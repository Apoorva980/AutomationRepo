package oops.abstration;

public class HDFC implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("HDFC saving account");
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("hdfc debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("hdfc credit card");
		
	}

}
