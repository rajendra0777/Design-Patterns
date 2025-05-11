package builder.rbi;

public class Client {

	public static void main(String[] args) {

		BankBuilder bankBuilder = new SBIBank();
		BankDirector bankDirector = new BankDirector(bankBuilder);
		bankDirector.makeTransaction();

		Bank bank = bankBuilder.getBank();
		bank.setId(01);
		System.out.println(bank);

	}

}
