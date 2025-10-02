package Practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int count = 0;
		
		if(n<=1){
			System.out.println("It is not prime");
		}
		else{
			for(int i=2 ; i<Math.sqrt(n); i++){
				if(n%i==0){
					count++;
					break;
				}
			}
		}
		
		if(count==0){
			System.out.println("It is Prime Number");
		}
		else{
			System.out.println("It is not a prime number");
		}
	
	}

}
