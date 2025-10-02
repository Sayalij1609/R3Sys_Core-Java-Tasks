package Hierarchical_Inheritance;

import java.util.Scanner;

public class PEmployee extends Company{
	
	Scanner sc = new Scanner(System.in);
	double basicpay , hra , da , totalsalary;
	void getdetails(){
		System.out.println("Enter Basic pay : ");
		basicpay = sc.nextDouble();
		System.out.println("Enter Your Home rent Allowence : ");
		hra = sc.nextDouble();
		System.out.println("Enter Your Daily Allowence : ");
		da = sc.nextDouble();
	}
	
	void calculate(){
		totalsalary = basicpay+da+hra;
	}
	
	void display_payslip(){
		System.out.println("The Payslip is : ");
		System.out.println("Basic Payment : "+basicpay);
		System.out.println("Home rent Allowence : "+hra);
		System.out.println("Daily Allowence : "+da);
		System.out.println("Total Salary is : "+totalsalary);
	}

}
