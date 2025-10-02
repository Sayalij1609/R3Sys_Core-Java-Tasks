package Ecommerce;

public abstract class Product {
    
	String productid , productname;
	double baseprice;
	
	abstract void inputdetails();
	abstract void calculateFinalPrice();
	abstract void displayDetails();

}
