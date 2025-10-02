package area;

import java.util.Scanner;

public class Rectangle {
	
	float length , width , area;
	
	
	void rectangle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length : ");
		length = s.nextFloat();
		
		System.out.println("Enter Width : ");
		width = s.nextFloat();
		
		area = length*width;
		System.out.println("Area of Rectangle is : "+area);
		
		
	}

}
