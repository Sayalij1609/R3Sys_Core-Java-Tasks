package MultipleCatchBlocks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandle {
	
	Scanner sc = new Scanner(System.in);
	int a ,b , div ;
	
	public void division(){
	 try{
		 
		 System.out.println("Enter the First Number : ");
		 a = sc.nextInt();
		 System.out.println("Enter the Second Number : ");
		 b= sc.nextInt();
		 div = a/b;
		 System.out.println("The Division is : "+div);
			
		
	}catch(ArithmeticException ae){
		System.err.println("Error: Division by zero is not allowed.");
		
	}catch(InputMismatchException e){
		System.err.println("Error: Input Format is wrong.");
	}catch(Exception e){
		System.out.println("Unexpected error occurred: " + e.getMessage());
	}
	 
	finally {
		System.out.println("Thank You So much !!");
	}

 }
	
}
