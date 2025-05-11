package builder.rbi;

import java.time.LocalTime;

public class SBIBank implements BankBuilder{
	
	private final Bank bank = new Bank("SBI");

	@Override
	public void bankOrigin() {
		System.out.println("Origin - India");
		
	}

	@Override
	public void transactionType() {
		System.out.println("Transaction Type - Domestic");
		
	}

	@Override
	public void transactionInfo() {
		System.out.println("Transaction Time - "+LocalTime.now());
		
	}

	@Override
	public Bank getBank() {
		return bank;
	}

}
