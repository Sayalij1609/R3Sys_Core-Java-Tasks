package Area_Calculator;

import java.util.Scanner;



public class Test {
   
	public static void main(String [] args){
		Shape s ;
		Scanner sc = new Scanner(System.in);
		
		int ch , choice;
		
		do{
			System.out.println("1.Calculate area of Circle \n2.Calculate area of Rectangle \n3.Calculate area of Triangle \n4.Exit ");
			System.out.println("Enter which operation you perform : ");
			ch = sc.nextInt();
			switch(ch){
		
		
		case 1:
			s = new Circle();
			s.input();
			s.calculatearea();
			s.displayarea();
			break;
		
		case 2: 
			s=new Reactangle();
			s.input();
			s.calculatearea();
			s.displayarea();
			break;
			
		case 3 : 
			s=new Triangle();
			s.input();
			s.calculatearea();
			s.displayarea();
			
			break;
			
		case 4: 
			System.out.println("Exit");
			break;
			
		default :
			System.out.println("Invalid Input");
		}
			
			System.out.println("\nDo you want to reapeat the process ?? \nIf yes : Press 1  \nIf No : then press : 0");
			choice = sc.nextInt();
			
	}while(choice==1);
		 
		
	}
	
}
