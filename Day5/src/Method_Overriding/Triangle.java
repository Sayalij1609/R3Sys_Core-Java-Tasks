package Method_Overriding;

import java.util.Scanner;

public class Triangle extends Shape {

	Scanner sc = new Scanner(System.in);
	double height , base , area;
	
	void input(){
		System.out.println("Enter Height : ");
		height = sc.nextDouble();
		System.out.println("Enter Base : ");
		base = sc.nextDouble();

	}
	
	void calculate(){
		area= 0.5*base * height;
	}
	
	void display(){
		System.out.println("The Area of a Circle is : "+area);
	}
	
}
