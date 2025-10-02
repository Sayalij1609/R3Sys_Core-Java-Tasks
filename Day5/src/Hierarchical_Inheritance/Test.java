package Hierarchical_Inheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int ch ; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Type : ");
		System.out.println("Press 1 : for Temporary Employee: ");
		System.out.println("Press 2 : for Permanent Employee: ");
		ch = sc.nextInt();
		
		switch(ch){
		
		case 1 : 
			TEmployee obj = new TEmployee();
			obj.getinfo();
			obj.get_info();
			obj.wage_calculate();
			obj.display();
			obj.payslip();
			break;
			
		case 2 : 
			PEmployee obj1 = new PEmployee();
			obj1.getinfo();
			obj1.getdetails();
			obj1.calculate();
			obj1.display();
			obj1.display_payslip();
			break;
			
		default:
			System.out.println("Invalid Input");
		
		}

	}

}
