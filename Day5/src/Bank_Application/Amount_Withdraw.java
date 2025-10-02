package Bank_Application;

import java.util.Scanner;

public class Amount_Withdraw extends Account_details {
  
	Scanner sc= new Scanner(System.in);
	double amount;
	
	void withdraw(){
		System.out.println("Enter Amount to deposite : ");
		amount = sc.nextDouble();
		
		if(balance>4999){
		balance = balance - amount;
		System.out.println("Amount Withdrawn Successfully");}
		
		else 
		System.out.println("Amount withdraw is not Possible");
	}
		
	void show(){
		System.out.println("The Current balance is : "+balance);
		
	}
	
}
