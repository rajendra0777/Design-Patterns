package builder.rbi;

public interface BankBuilder {
	
	public void bankOrigin();
	public void transactionType();
	public void transactionInfo();
	
	public Bank getBank();

}
