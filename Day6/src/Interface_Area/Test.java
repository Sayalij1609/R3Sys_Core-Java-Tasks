package Interface_Area;

import java.util.Scanner;

import Area_Calculator.Circle;
import Area_Calculator.Reactangle;
import Area_Calculator.Shape;
import Area_Calculator.Triangle;

public class Test {

	public static void main(String[] args) {
		
		Shape1 shape ;
		Scanner sc = new Scanner(System.in);
		
		int ch , choice;
		
		do{
			System.out.println("------------------------MENU---------------------");
			System.out.println("1.Calculate area of Circle \n2.Calculate area of Rectangle \n3.Calculate area of Triangle \n4.Exit ");
			System.out.println("\nEnter which operation you perform : ");
			ch = sc.nextInt();
			switch(ch){
		
		
		case 1:
			shape = new Circle1();
			shape.input();
			shape.calculateArea();
			shape.displayArea();
			break;
		
		case 2: 
			shape = new Rectangle();
			shape.input();
			shape.calculateArea();
			shape.displayArea();
			break;
			
		case 3 : 
			shape = new Triangle1();
			shape.input();
			shape.calculateArea();
			shape.displayArea();
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
