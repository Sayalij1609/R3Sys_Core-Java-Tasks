package Ecommerce;

import java.util.Scanner;

public class Clothing extends Product{
	
	Scanner sc = new Scanner(System.in);
	String size;
	double finalPrice , price ;
	double tax;
	
	void inputdetails(){
		System.out.println("Enter Sixe of Dress (S , M , L , XL) : ");
		size = sc.nextLine();
		System.out.println("Enter Base price : ");
		baseprice = sc.nextDouble();
		
	}
	
	void calculateFinalPrice(){
		tax = (12/100)*baseprice;
		price = tax + baseprice;
		
		if(baseprice > 2000){
			finalPrice = baseprice + tax -300;
		}
		
		else {
			finalPrice = baseprice + tax;
		}
	}
	
	void displayDetails(){
		System.out.println("\nDress Size : "+size);
		System.out.println("Base price : "+baseprice);
		System.out.println("Price After  applying 12% GST : "+price);
		System.out.println("Final Price : "+finalPrice);
	}
}
