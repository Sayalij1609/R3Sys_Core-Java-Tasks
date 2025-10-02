package Ecommerce;

import java.util.Scanner;

public  class Test {
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int choice , ch;
		Product p;
		
		System.out.println("Welcome to the Product Management System\n");
		do{
			System.out.println("------------------------MENU---------------------");
			System.out.println("1. Add Electronic Product \n2.Add Clothing Product \n3.Add Grocery Product \n4.Exit");
			System.out.println("\nEnter which Operation do you want to perform ? ");
		    choice = sc.nextInt();
			
			switch(choice){
			
			case 1 : 
				p = new Electronics();
				p.inputdetails();
				p.calculateFinalPrice();
				p.displayDetails();
				break;
				
			case 2 :
				p = new Clothing();
				p.inputdetails();
				p.calculateFinalPrice();
				p.displayDetails();
				break;
				
			case 3 :
				p = new Grocery();
				p.inputdetails();
				p.calculateFinalPrice();
				p.displayDetails();
				break;
				
			case 4 : 
				System.out.println("Exit");
				break;
				
			default : 
				System.out.println("Invalid Input");
				
			}
			System.out.println("\nDou you want to Repeat the process : \nPress 1 : If yes \nPress 2 : If No");
			ch = sc.nextInt();
			
			
		}while(ch==1);
	}
	
}
