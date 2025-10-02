package Bank_Application;

import java.util.Scanner;

public class LoanAccount implements BankAccount {
    String borrowerName;
    String loanAccountNumber;
    double loanAmount;
    double interestRate = 8.5;

    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter Borrower Name: ");
        borrowerName = sc.nextLine();
        System.out.print("Enter Loan Account Number: ");
        loanAccountNumber = sc.nextLine();
        System.out.print("Enter Loan Amount: ");
        loanAmount = sc.nextDouble();
    }

    public void deposit(double amount) {
        System.out.println("Deposit not allowed in Loan Account.");
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed in Loan Account.");
    }

    public void displayAccountDetails() {
        System.out.println("Loan Account - " + borrowerName + " (" + loanAccountNumber + ")");
        System.out.println("Loan Amount: Rs." + loanAmount);
    }

    public double calculateInterest() {
        double interest = loanAmount * interestRate / 100;
        System.out.println("Loan Interest: Rs." + interest);
        return interest;
    }
}
