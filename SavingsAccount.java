import java.lang.Math;
public class SavingsAccount extends BankAccount{
	
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance)
	{
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest()
	{
		//Interest = P(1 + rate)^t(time)
		double interest = this.getBalance() * (rate/12);
		this.setBalance(this.getBalance() + interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount otherAcc, double balance)
	{
		super(otherAcc, balance);
		String otherAccNumber = otherAcc.getAccountNumber();
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

}
