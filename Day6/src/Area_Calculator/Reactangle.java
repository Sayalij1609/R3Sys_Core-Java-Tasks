package Area_Calculator;

import java.util.Scanner;

public class Reactangle extends Shape {

	double length, breadth , area;
	Scanner sc = new Scanner(System.in);
	
	void input(){
		System.out.println("Enter Length : ");
		length = sc.nextDouble();
		System.out.println("Enter Breadth : ");
		breadth = sc.nextDouble();
	}
	
	void calculatearea(){
	   area = length*breadth;	
	}
	
	void displayarea(){
		
		System.out.println("The Area of a Circle is : "+area);
		
	}
}
