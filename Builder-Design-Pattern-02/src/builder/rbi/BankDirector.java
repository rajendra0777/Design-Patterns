package builder.rbi;

public class BankDirector {
	
	private BankBuilder bankBuilder;
	
	
	
	public BankDirector(BankBuilder bankBuilder) {
		this.bankBuilder = bankBuilder;
	}



	public void makeTransaction() {
		bankBuilder.bankOrigin();
		bankBuilder.transactionInfo();
		bankBuilder.transactionType();
		bankBuilder.getBank();
		
	}

}
