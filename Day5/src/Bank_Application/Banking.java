package Bank_Application;

import java.util.Scanner;

public class Banking extends Account_details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banking b=new Banking();
		Amount_Deposite dep = new Amount_Deposite();
		Amount_Withdraw wed = new Amount_Withdraw();
		
		
		int ch , choice;
		
		do{
			System.out.println("1.Add User \n2.View User \n3.Deposite Amount \n4.Withdrawn Amount \n5.Check Balance \n6.Exit");
			System.out.println("Enter Which Operation do you want to perform ? : ");
			ch = sc.nextInt();
			
			switch(ch){
			
			case 1 : 
				b.adduser();
				dep.accno=b.accno;
				wed.accno=b.accno;
				dep.name = b.name;
				wed.name = b.name;
				dep.balance = b.balance;
				wed.balance = b.balance;
				break;
			
			case 2: 
				b.viewuser();
				break;
				
			case 3:
				dep.deposite();
				b.balance = dep.balance;
				wed.balance = dep.balance;
				break;
				
			case 4:
				wed.withdraw();
				dep.balance = wed.balance;
				b.balance = wed.balance;
				break;
				
			case 5:
				b.checkbalance();
				break;
				
			case 6:
				System.out.println("Exit");
				break;
				
			default :
				System.out.println("Invalid Input");
			}
			
			System.out.println("Do you want to reapeat the process ?? If yes : Press 1 and If No : then press : 0");
			choice = sc.nextInt();
			
		}while(choice==1);

	}

}
