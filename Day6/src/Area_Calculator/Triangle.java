package Area_Calculator;

import java.util.Scanner;

public class Triangle extends Shape {

	
	double base , height , area;
	Scanner sc = new Scanner(System.in);
	
	void input(){
		System.out.println("Enter Base : ");
		base = sc.nextDouble();
		System.out.println("Enter Height : ");
		height = sc.nextDouble();
	}
	
	void calculatearea(){
	   area = 0.5*base*height;	
	}
	
	void displayarea(){
		
		System.out.println("The Area of a Triangle is : "+area);
		
	}
}
