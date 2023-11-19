public class BankAccountMain {
	
	public static void main(String[] args) {
		
		// create bank account superclass
		BankAccount bankAccount = new BankAccount("John", "Marks", 2225);
		// create checking account sub class of bank account
		CheckingAccount checkingAccount = new CheckingAccount();
		
		// set checking account data
		checkingAccount.setFirstName(bankAccount.getFirstName());
		checkingAccount.setLastName(bankAccount.getLastName());
		checkingAccount.setAccountID(bankAccount.getAccountID());
		
		// test deposit method
		checkingAccount.deposit(300.50);
		// test withdrawal and overdraft logic
		checkingAccount.processWithdrawal(500);
		
		System.out.print("Checking Account: ");
		checkingAccount.displayAccount();
		
	}

}