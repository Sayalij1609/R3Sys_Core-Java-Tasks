package Bank_Application;

import java.util.Scanner;

public class SavingAccount implements BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    double interestRate = 4.0;  
    double minBalance = 1000;

    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Initial Deposit (Min Rs.1000): ");
        balance = sc.nextDouble();

        if (balance < minBalance) {
            System.out.println("Minimum balance 1000 required. Setting to 1000.");
            balance = minBalance;
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + ". New Balance: Rs." + balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount + ". New Balance: Rs." + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum ₹1000 balance required.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Savings Account - " + accountHolder + " (" + accountNumber + ")");
        System.out.println("Balance: Rs." + balance);
    }

    public double calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: Rs." + interest);
        return interest;
    }
}
