package ArithematicException;

import java.util.Scanner;

public class Division {
	Scanner sc = new Scanner(System.in);
	int numerator , denominator , div ;
	
	public void div(){
	 try{
		 
		 System.out.println("Enter the Numerator : ");
		 numerator = sc.nextInt();
		 System.out.println("Enter the Denominator : ");
		 denominator = sc.nextInt();
		 div = numerator/ denominator;
		 System.out.println("The Division is : "+div);
			
		
	}catch(Exception e){
		
		e.printStackTrace();
		
		//System.err.println("Error: Division by zero is not allowed.");
		
	}
	 
	finally {
		System.out.println("Thank You So much !!");
	}
  }

	 
}
