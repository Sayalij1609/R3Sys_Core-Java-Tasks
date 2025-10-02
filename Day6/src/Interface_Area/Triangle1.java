package Interface_Area;

import java.util.Scanner;

public class Triangle1 implements Shape1 {

	double base , height , area;
	Scanner sc = new Scanner(System.in);
	
	public void input(){
		System.out.println("Enter Base : ");
		base = sc.nextDouble();
		System.out.println("Enter Height : ");
		height = sc.nextDouble();
	}
	
	public void calculateArea(){
	   area = 0.5*base*height;	
	}
	
	public void displayArea(){
		
		System.out.println("The Height is : "+height);
		System.out.println("The Base is : "+base);
		System.out.println("The Area of a Triangle is : "+area);
		
	}
	
	
}
