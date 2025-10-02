package Ecommerce;

import java.util.Scanner;

public class Electronics extends Product{
	
	int warrantyYears ;
	double finalPrice, tax , charge, price ;
	Scanner sc = new Scanner(System.in);
	
	void inputdetails(){
		System.out.println("Enter Product Name : ");
		productname = sc.nextLine();
		System.out.println("Enter Product id : ");
		productid = sc.next();
		System.out.println("Enter the Base Price : ");
		baseprice = sc.nextDouble();
		System.out.println("Enter Warranty Years : ");
		warrantyYears = sc.nextInt();
		
	}
	
	void calculateFinalPrice(){
		tax = (18/100)*baseprice;
		price = baseprice + tax;
		if (warrantyYears > 1){
			
			finalPrice = baseprice+ tax+500;
			charge = 500;
			
		}
		else{
			charge = 0;
			finalPrice = baseprice+ tax;
		}
	}
	
	void displayDetails(){
		System.out.println("\nProduct Name : "+productname);
		System.out.println("product id : "+productid);
		System.out.println("Base price : "+baseprice);
		System.out.println("Warranty Years : "+warrantyYears);
		System.out.println("Price after 18 % GST : "+price);
		System.out.println("Additional Charge : "+charge);
		System.out.println("Total Final Price : "+finalPrice);
	}

}
