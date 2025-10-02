package Area_Calculator;

import java.util.Scanner;

public class Circle extends Shape{
	
	Scanner sc = new Scanner(System.in);
	double radius , area;
	void input(){
		System.out.println("Enter Radius : ");
		radius = sc.nextDouble();
	}
	
	void calculatearea(){
	   area = 3.14*radius*radius;	
	}
	
	void displayarea(){
		
		System.out.println("The Area of a Circle is : "+area);
		
	}

}
