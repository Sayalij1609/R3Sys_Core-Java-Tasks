package area;

import java.util.Scanner;

public class Square {
	
	float side , area;
	
	void square(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Side : ");
		side = s.nextFloat();
		
		area = side*side;
		System.out.println("Area of Square is : "+area);
		
		
	}

}
