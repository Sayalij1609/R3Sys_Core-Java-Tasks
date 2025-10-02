package Inheritance;

import java.util.Scanner;

public class Student extends College {
	
	String sname ;
	int prn ;
	int marks1 , marks2 , marks3 ; 
	double avg, per;
	
	Scanner sc = new Scanner(System.in);
	void getinfo(){
		System.out.println("Enter Student name : ");
		sname = sc.nextLine();
		System.out.println("Enter PRN : ");
		prn = sc.nextInt();
		System.out.println("Enter Marks of Subject 1 : ");
		marks1 = sc.nextInt();
		System.out.println("Enter Marks of Subject 2 : ");
		marks2 = sc.nextInt();
		System.out.println("Enter Marks of Subject 2 : ");
		marks3 = sc.nextInt();
	}
	
	void avg(){
		avg = (marks1+marks2+marks3)/3;
		per = (avg/150)*100;
	}

	void sdisplay(){
		System.out.println("Student name : "+sname);
		System.out.println("PRN : "+prn);
		System.out.println("Average of Marks is : "+avg);
		System.out.println("Percentage : "+per);
	}
	
}
