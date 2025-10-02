package Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int n , a=0 , b=1;
		System.out.println("Enter no. of the terms upto which Fibonacci series You want to print : ");
		n=s.nextInt();
		
		System.out.println("The Fibonacci series is : ");
		System.out.print(a+" "+b+" ");
		
		for(int i=2 ; i<=n ; i++){
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
