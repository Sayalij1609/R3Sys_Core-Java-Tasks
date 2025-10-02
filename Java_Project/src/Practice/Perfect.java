package Practice;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n ,sum =0;
		
		System.out.println("Enter the Number : ");
		n=s.nextInt();
	
		
		for(int i=1 ; i<=n/2 ; i++){
			if(n%i==0){
				sum=sum+i;
			}
			
		}
		
		if(sum==n){
			System.out.println("It is Perfect Number");
		}
		else{
			System.out.println("It is not Perfect Number");
		}
		
		
		
	}

}
