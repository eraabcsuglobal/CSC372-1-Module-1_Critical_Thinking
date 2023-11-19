public class CheckingAccount extends BankAccount {
	
	// interest rate attribute
	double interestRate;
	
	public CheckingAccount() {
		interestRate = 1.50;
	}

	// process withdrawal method to handle withdrawal and account if the balance is under 0
	public void processWithdrawal(double withdrawalAmount) {
		
		// call withdrawal method from superclass
		withdrawal(withdrawalAmount);
		
		// then check if account balance is under 0 after withdrawal
		if (getBalance() < 0) {
			// if so, subtract an additional $30
			balance -= 30.00;
			// then print the current balance and message to the user
			System.out.println("Balance: " + getBalance());
			System.out.println("Due to you overdrawing your account, a fee of $30.00 has been accessed.");
		}
	}
	
	// method to show the superclass attributes along with the interest rate for checking account
  	public void displayAccount() {
		super.accountSummary();
		System.out.print(", Interest Rate: " + interestRate + "%");
	}
 

}