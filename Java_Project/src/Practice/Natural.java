package Practice;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n , sum; 
		System.out.println("Enter upto which number the sum do you want ??");
		n= s.nextInt();
		sum=0;
		
		for(int i=1;i<=n;i++){
			sum = sum+i;
		}
		
		System.out.println("The sum is : "+sum);
		
	}

}
