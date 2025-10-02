package Bank_Application;

public interface BankAccount {

	
	void createAccount(); 
	void deposit(double amount); 
	void withdraw(double amount); 
	void displayAccountDetails(); 
	double calculateInterest(); 
	
	
}
