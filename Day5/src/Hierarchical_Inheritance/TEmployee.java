package Hierarchical_Inheritance;

import java.util.Scanner;

public class TEmployee extends Company  {

	Scanner sc = new Scanner(System.in);
	double rph , wage ;
	int hrs;
	
	void get_info(){
		System.out.println("Enter No. of Hours of Working : ");
		hrs= sc.nextInt();
		System.out.println("Enter Rate of hour per Work : ");
		rph = sc.nextDouble();
	
		
      }
	
	void wage_calculate(){
		wage = hrs*rph;
	}

	void payslip(){
		System.out.println("The Payslip is : ");
		System.out.println("Total Hours Worked : "+hrs);
		System.out.println("Rate per Hours : "+rph);
		System.out.println("Total Wage is : "+wage);
	}
}