package Method_Overriding;

import java.util.Scanner;

public class Rectangle extends Shape {
    
	Scanner sc = new Scanner(System.in);
	double length , width , area;
	
	void input(){
		System.out.println("Enter Length : ");
		length = sc.nextDouble();
		System.out.println("Enter Width : ");
		width = sc.nextDouble();

	}
	
	void calculate(){
		area= length * width;
	}
	
	void display(){
		System.out.println("The Area of a Rectangle is : "+area);
	}
	
}
