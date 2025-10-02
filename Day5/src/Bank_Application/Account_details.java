package Bank_Application;

import java.util.Scanner;

public class Account_details {

	Scanner sc= new Scanner(System.in);
	int accno ;
	String name ; 
	double balance;
	
	void adduser(){
		System.out.println("Enter Account Number : ");
		accno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter Balance Amount : ");
		balance = sc.nextDouble();
	}
	
	void viewuser(){
		System.out.println("Account Number : "+accno);
		System.out.println("Name : "+name);
		
	}
	
	void checkbalance(){
		
		System.out.println("Balance Amount : "+balance);
	}
}
