package Bank_Application;

import java.util.Scanner;

public class CurrentAccount implements BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    double overdraftLimit = 20000;

    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Initial Deposit: ");
        balance = sc.nextDouble();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + ". New Balance: Rs." + balance);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount + ". New Balance: Rs." + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Current Account - " + accountHolder + " (" + accountNumber + ")");
        System.out.println("Balance: Rs." + balance);
    }

    public double calculateInterest() {
        System.out.println("No interest for current account.");
        return 0;
    }
}
