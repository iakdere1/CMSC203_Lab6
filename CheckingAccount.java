
public class CheckingAccount extends BankAccount{
	
	private static final double FEE = .15;
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		boolean success = true;
		
		if (amount + FEE <= super.getBalance())
		{
			super.setBalance(super.getBalance() - (amount + FEE));
		}
		else
		{
			success = false;
		}
		return success;
	}

}
