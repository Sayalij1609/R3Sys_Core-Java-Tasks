package Interface_Area;

import java.util.Scanner;

public class Circle1 implements Shape1 {
   
	Scanner sc = new Scanner(System.in);
	double radius , area;
	
	public void input(){
		
		System.out.println("Enter Radius : ");
		radius = sc.nextDouble();
	}
	
	
	public void calculateArea(){
		
	   area = 3.14*radius*radius;	
	   
	}
	
	public void displayArea(){
		
		System.out.println("Radius of the Circle is : "+radius);
		System.out.println("The Area of a Circle is : "+area);
		
	}
	
	
	
	
}
