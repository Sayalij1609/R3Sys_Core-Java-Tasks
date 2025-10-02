package Interface_Area;

import java.util.Scanner;

public class Rectangle implements Shape1 {

	double length, breadth , area;
	Scanner sc = new Scanner(System.in);
	
	public void input(){
		
		System.out.println("Enter Length : ");
		length = sc.nextDouble();
		System.out.println("Enter Breadth : ");
		breadth = sc.nextDouble();
		
	}
	
	
	public void calculateArea(){
		
	   area = length*breadth;	
	   
	}
	
	public void displayArea(){
		
		System.out.println("The Length is : "+length);
		System.out.println("The Breadth is : "+breadth);
		System.out.println("The Area of a Circle is : "+area);
		
	}
	
}
