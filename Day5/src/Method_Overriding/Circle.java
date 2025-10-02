package Method_Overriding;

import java.util.Scanner;

public class Circle extends Shape {
	Scanner sc = new Scanner(System.in);
	double radius , area;
	
	void input(){
		System.out.println("Enter Radius : ");
		radius = sc.nextDouble();

	}
	
	void calculate(){
		area= 3.14*radius*radius;
	}
	
	void display(){
		System.out.println("The Area of a Circle is : "+area);
	}
	

}

