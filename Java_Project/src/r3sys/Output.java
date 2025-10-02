package r3sys;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int p , q, ch;
		
		do{
			System.out.println("Enter First Number : ");
			p = sc.nextInt();
			System.out.println("Enter Second Number : ");
			q = sc.nextInt();
			System.out.println("Enter Your choice : 1.Addition  2.Substraction  3.Multiplication  4.Division");
			ch =sc.nextInt();
			
			switch(ch){
				
				case 1 :
					Addition sum = new Addition();
					sum.sum(p, q);
					break;
					
				case 2 :
					Substraction sub = new Substraction();
					sub.sub(p, q);
					break;
					
				case 3 : 
					Multiplication mul = new Multiplication();
					mul.mul(p,q);
					break;
					
				case 4 :
					Division div = new Division();
					div.div(p, q);
					break;
					
				default :
					System.out.println("Invalid Input");
			}
			
			System.out.println("Do You want to repeat to Repeat ??");
			System.out.println("If Yes : Presss - 1 or No : press - 2 ");
			ch = sc.nextInt();
			
		}while(ch==1);
		
		
	}

}
