public class BankAccount {
	
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	
	public BankAccount() {
		firstName = "";
		lastName = "";
		accountID = 0;
		balance = 0.00;
	}
	
	// set bank account data and set balance to 0
	public BankAccount(String accountFirstName, String accountLastName, int customerAccountID) {
		setFirstName(accountFirstName);
		setLastName(accountLastName);
		setAccountID(customerAccountID);
		balance = 0.00;
	}
	
	// deposit method that adds to balance
	public void deposit(double balanceToAdd) {
		balance += balanceToAdd;
	}
	
	// withdrawal method that subtracts from balance
	public void withdrawal(double balanceToSubtract) {
		balance -= balanceToSubtract;
	}
	
	// getters and setters for account information
	public void setFirstName(String accountFirstName) {
		firstName = accountFirstName;
	}
	
	public void setLastName(String accountLastName){
		lastName = accountLastName;
	}
	
	public void setAccountID(int customerAccountID){
		accountID = customerAccountID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	// returns account balance
	public double getBalance() {
		return balance;
	}
	
	
	// prints account summary
	void accountSummary() {
		System.out.print("First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", Account ID: " + getAccountID() + ", Balance: " + getBalance());
	}


}