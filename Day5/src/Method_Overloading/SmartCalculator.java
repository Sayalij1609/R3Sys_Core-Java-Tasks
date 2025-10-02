package Method_Overloading;

import java.util.Scanner;

public class SmartCalculator {

	int calculate(int a , int b){
		
		return a+b;
		
	}
	
	int calculate (int a , int b , int c){
		
		return a+b+c;
	}
	
	double calculate(double a, double b){
		
		return a+b;
	}
	
	String calculate(String s1 , String s2){
		
		return s1+s2;
	}
	
	double calculate(int []a){
		int n=a.length;
		if (a==null||n==0){
			return 0.0;
		}
		int sum =0;
		for(int i=0;i<n;i++){
			sum =sum+a[i];
		}
		return sum/n;
		
	}
	
	double calculate(float length , float width){
		
		return length*width;
		
	}
	
	double calculate(float radius){
		
		return 3.14*radius*radius;
	}
	
	double calculate(double radius){
		
		return radius*radius;
	}
	
	void calculate(){
		
		System.out.println("The Smart Calculator is Ready");
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch , choice;
		
		
		SmartCalculator s = new SmartCalculator();
		do{
			
			System.out.println("1.Add two numbers \n2. Add three numbers \n3.Add two decimal numbers \n4.Concatenate two strings \n5.Calculate average of N numbers \n6.Area of rectangle \n7.Area of circle \n8.Area of Square \n9.About Calculator \n10.Exit  ");
			System.out.println("Enter the menu which operation do you perform : ");
			ch = sc.nextInt();
			
		switch(ch){
		
		case 1: 
			System.out.println("Enter Number 1 : ");
			int a =sc.nextInt();
			System.out.println("Enter Number 2 : ");
			int b =sc.nextInt();
			System.out.println("The Addition is : "+(s.calculate(a,b)));
			break;
		
		case 2:
			System.out.println("Enter Number 1 : ");
			int p =sc.nextInt();
			System.out.println("Enter Number 2 : ");
			int q =sc.nextInt();
			System.out.println("Enter Number 3 : ");
			int r =sc.nextInt();
			System.out.println("The Addition is : "+(s.calculate(p,q ,r)));
			break;
			
		case 3:
			System.out.println("Enter Number 2 : ");
			double x =sc.nextDouble();
			System.out.println("Enter Number 2 : ");
			double y =sc.nextDouble();
			System.out.println("The Addition is : "+(s.calculate(x,y)));
			break;
			
		case 4:
			System.out.println("Enter String 1 : ");
			String m = sc.nextLine();
			System.out.println("Enter String 2 : ");
			String n = sc.nextLine();
			System.out.println("The String Concatenation is : "+(s.calculate(m,n)));
			break;
			
		case 5:
			System.out.println("Enter How many numbers you will enter : ");
			int e = sc.nextInt();
			int []array =new int[e];
			for(int i=0 ; i<e;i++){
				System.out.println("Enter Number : "+(i+1));
				array[i]=sc.nextInt();
			}
			System.out.println("The Average is : "+(s.calculate(array)));
			break;
			
		case 6:
			System.out.println("Enter Lenth : ");
			float g = sc.nextFloat();
			System.out.println("Enter Width : ");
			float h = sc.nextFloat();
			System.out.println("The Area of Rectangle is : "+(s.calculate(g,h)));
			break;
			
		case 7 :
			System.out.println("Enter radius : ");
			double rad = sc.nextDouble();
			System.out.println("The Area of the Circle is : "+(s.calculate(rad)));
			break;
			
		case 8:
			System.out.println("Enter Side : ");
			float side = sc.nextFloat();
			System.out.println("The Area of the square is : "+(s.calculate(side)));
			break;
			
		case 9 : 
			s.calculate();
			break;
			
		case 10:
			System.out.println("Exit");
			break;
		
		default : 
			System.out.println("Invalid Input");
			break;
			
		}
		
		System.out.println("Do you want to reapeat the process ?? If yes : Press 1 and If No : then press : 0");
		choice = sc.nextInt();
	}while(choice==1);
		
		
	}

}
