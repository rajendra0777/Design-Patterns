package builder.rbi;

import java.time.LocalDateTime;

public class CBIBank implements BankBuilder{
	
	private final Bank bank = new Bank("CBI");
	

	@Override
	public void bankOrigin() {
		System.out.println("Origin - India");
		
	}

	@Override
	public void transactionType() {
		System.out.println("Transaction Type - Domestic + International");
		
	}

	@Override
	public void transactionInfo() {
		System.out.println("Date and Time - "+LocalDateTime.now());
		System.out.println("Status - Successfull.");
		
	}

	@Override
	public Bank getBank() {
		return bank;
	}

}
