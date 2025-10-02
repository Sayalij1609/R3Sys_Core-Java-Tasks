package Bank_Application;

import java.util.Scanner;

public class Amount_Deposite extends Account_details {
	
	Scanner sc= new Scanner(System.in);
	double amount;
	void deposite(){
		System.out.println("Enter Amount to deposite : ");
		amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("Amount Deposite Succesfully");
	}
	
	void currentbalance(){
		System.out.println("The Current Balance is : "+balance);
	}

}
