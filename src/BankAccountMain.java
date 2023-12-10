import javax.swing.JFrame;

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
		
		// NEW created GUI class to improve useability
		CheckingAccountBalance checkingAccountBalance = new CheckingAccountBalance(checkingAccount);
		checkingAccountBalance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkingAccountBalance.pack();
		checkingAccountBalance.setVisible(true);
		
		checkingAccount.displayAccount();
		
	}

}