package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num , n , sum , r ;
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Number : ");
		num = s.nextInt();
		n=num;
		sum = 0;
		
		do{
			r = n%10;
			sum = sum + (r*r*r);
			n=n/10;
			
		}while(n!=0);
		
		if(num==sum){
			System.out.println("It is Armstrong Number");
		}
		
		else{
			System.out.println("It is not a Armstrong Number");
		}
			
		
	}

}
