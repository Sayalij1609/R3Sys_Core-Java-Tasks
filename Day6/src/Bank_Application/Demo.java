package Bank_Application;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Welcome to R3 Bank ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Create Loan Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Display Account Info");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            BankAccount acc;
            int index;

            switch (choice) {
                case 1:
                    acc = new SavingAccount();
                    acc.createAccount();
                    accounts.add(acc);
                    break;
                case 2:
                    acc = new CurrentAccount();
                    acc.createAccount();
                    accounts.add(acc);
                    break;
                case 3:
                    acc = new LoanAccount();
                    acc.createAccount();
                    accounts.add(acc);
                    break;
                case 4:
                    index = chooseAccount(sc, accounts);
                    if (index != -1) {
                        System.out.print("Enter amount to deposit: ");
                        double dAmt = sc.nextDouble();
                        accounts.get(index).deposit(dAmt);
                    }
                    break;
                case 5:
                    index = chooseAccount(sc, accounts);
                    if (index != -1) {
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = sc.nextDouble();
                        accounts.get(index).withdraw(wAmt);
                    }
                    break;
                case 6:
                    index = chooseAccount(sc, accounts);
                    if (index != -1) {
                        accounts.get(index).calculateInterest();
                    }
                    break;
                case 7:
                    index = chooseAccount(sc, accounts);
                    if (index != -1) {
                        accounts.get(index).displayAccountDetails();
                    }
                    break;
                case 8:
                    System.out.println("Thanks for using R3 Bank!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

  
    static int chooseAccount(Scanner sc, ArrayList<BankAccount> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return -1;
        }

        System.out.println("Select Account Index (0 to " + (accounts.size() - 1) + "): ");
        int idx = sc.nextInt();

        if (idx >= 0 && idx < accounts.size()) {
            return idx;
        } else {
            System.out.println("Invalid index.");
            return -1;
        }
    }
}
