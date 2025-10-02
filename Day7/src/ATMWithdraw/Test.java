package ATMWithdraw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to R3System");
	    AmountWithdraw a = new AmountWithdraw();
		
		int choice , ch;
		do{
			System.out.println("------------------------MENU---------------------");
			System.out.println("1.Check Balance \n2.Withdrawn Amount \n3.Exit");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			try{
			
			switch(choice){
			case 1 : 
				a.checkbalance();
			    break;
			    
			case 2 :
				a.amount();
				break;
				
			case 3 :
				System.out.println("Exit");
				
			default :
				System.out.println("Invalid Input");
			   }
			
			}
			catch(InputMismatchException ae ){
				
				System.err.println("Error : The input is not in proper format");
				
			}
			catch(InsufficientBalanceException e){
				
		      System.out.println(e.getMessage());
		      
			}
				
			System.out.println("Do you want to repeat the process ?");
			
			ch = sc.nextInt();
			
		}while(ch==1);

	}

} 












