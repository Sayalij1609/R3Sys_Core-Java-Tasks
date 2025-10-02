package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n , fact = 1 ; 
		System.out.println("Enter the Number : ");
		n=s.nextInt();
		for(int i= n ; i>0 ; i--){
			
			fact= fact*i;
			
		}
		
		System.out.println("Factotial is : "+fact);
		
		
		

	}

}
