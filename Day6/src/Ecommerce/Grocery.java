package Ecommerce;

import java.util.Scanner;

public class Grocery extends Product {
	Scanner sc = new Scanner(System.in);
	double weightKg , finalPrice , tax , price;
	
	void inputdetails(){
		System.out.println("Enter Weight in KG : ");
		weightKg = sc.nextDouble();
		System.out.println("Enter Base Price : ");
		baseprice = sc.nextDouble();
		
	}
	 void calculateFinalPrice(){
		 tax = (5/100)*baseprice;
		 price = tax + baseprice;
		 
		 if (weightKg>5){
			 finalPrice = baseprice + tax -(0.1*baseprice);
		 }
		 
		 else {
			 finalPrice = baseprice + tax;
		 }
	 }
	 
	 void displayDetails(){
		 System.out.println("\nWeight of the product : "+weightKg);
		 System.out.println("Base price : "+baseprice);
		 System.out.println("Price after applying 2% GST : "+price);
		 System.out.println("Final Price is : "+finalPrice);
	 }
	
	

}
