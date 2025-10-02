package area;

import java.util.Scanner;

public class Circle {
   
	float radius , area;
	final float pi = 3.14f;
	
	void circle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		radius = s.nextFloat();
		
		area = pi*radius*radius;
		System.out.println("Area of Circle is : "+area);
		
		
	}
}
