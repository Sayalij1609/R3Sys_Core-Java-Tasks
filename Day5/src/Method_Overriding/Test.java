package Method_Overriding;

import java.util.Scanner;

public class Test {
   
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Shape shape;
		int ch , choice;
		
		do{
			System.out.println("1.Calculate area of Circle \n2.Calculate area of Rectangle \n3.Calculate area of Triangle \n4.Exit ");
			System.out.println("Enter which operation you perform : ");
			ch = sc.nextInt();
			switch(ch){
		
		
		case 1:
			shape = new Circle();
			shape.input();
			shape.calculate();
			shape.display();
			break;
		
		case 2: 
			shape = new Rectangle();
			shape.input();
			shape.calculate();
			shape.display();
			break;
			
		case 3 : 
			shape = new Triangle();
			shape.input();
			shape.calculate();
			shape.display();
			break;
			
		case 4: 
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


