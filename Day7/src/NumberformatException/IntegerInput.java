package NumberformatException;

import java.util.Scanner;

public class IntegerInput {

	Scanner sc = new Scanner(System.in);
	String num ;
	int a ; 
	
	public void conversion(){
		try{
			System.out.println("Enter the Number as String to convert into integer : ");
			String num = sc.nextLine();
			int a = Integer.parseInt(num);
			System.out.println("The String in convert into Integer Successfully !! ");
			System.out.println("The number is : "+a);
			System.out.println("The Number Multiply by 2 : "+(2*a));
		}catch (NumberFormatException e){
			System.err.println("Invalid input! Please enter digits only");
		}
		finally {
			System.out.println("\nThank You so much !!");
		}
	
		 
	}
}
