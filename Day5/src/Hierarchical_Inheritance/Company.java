package Hierarchical_Inheritance;

import java.util.Scanner;

public class Company {
    
	String cname , ename;
	int empid;
	Scanner sc=new Scanner(System.in);
	
	void getinfo(){
		
		System.out.println("Enter Company name : ");
		cname=sc.nextLine();
		System.out.println("Enter Employee name : ");
		ename=sc.nextLine();
		System.out.println("Enter Employee id : ");
		empid = sc.nextInt();
	}
	
	void display(){
		System.out.println("Company name : "+cname);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee id : "+empid);
	}
	
}
