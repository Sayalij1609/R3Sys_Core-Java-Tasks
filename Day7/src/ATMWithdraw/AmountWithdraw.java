package ATMWithdraw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AmountWithdraw {
	
	Scanner sc = new Scanner(System.in);
	int balance = 10000, amount ; 
		   
	public void checkbalance(){
		  System.out.println("The Available Balance is : "+balance);
	  }

	   public void amount()throws InsufficientBalanceException  {
	
		   System.out.println("Enter the Amount for Withdrawn : ");
		   amount = sc.nextInt();
		   
		   if(balance > amount ){
			   balance = balance - amount;
			   System.out.println("The Amount Withdrawn successfully !!");
			   System.out.println("The Balance is : "+balance);
		   }
		   else{
			   throw new InsufficientBalanceException ("The Wthdrawn is not possible ");
		   }
		   
	   }
}
