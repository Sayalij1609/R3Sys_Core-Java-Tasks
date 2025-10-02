package area;

import java.util.Scanner;

public class Area {
	
	public static void main(String [] args){
		
		int ch ;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Enter Your Choice : ");
			System.out.println("1.Area of Square  2.Area of Reactangle  3.Area of Circle ");
			ch =sc.nextInt();
			
			switch(ch) {
			
			case 1 : 
				Square sq = new Square();
				sq.square();
				break;
				
			case 2 : 
				Rectangle rec = new Rectangle();
				rec.rectangle();
				break;
				
			case 3 : 
				Circle ci = new Circle();
				ci.circle();
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
