package com.yash.traning.opps.homeAssignemnt.problem10;

public class Test 
{
public static void main(String[] args) throws CloneNotSupportedException
{
	
	Product product = new Product(101,20000,10,"Samsung Mobile");
	System.out.println("original value: "+product);
	
	Product copyProduct = (Product) product.clone();
	copyProduct.setPname("OnePlus Mobile");
	copyProduct.setPrice(32000);
	System.out.println("after clonning: "+copyProduct);
	
	if(copyProduct instanceof Product)
	{
		System.out.println("new object is belongs to Product class");
	}
	else
{
		System.out.println("new object is not beongs to Product class");
	}
}
}	/*// create objects
	Product p1 = new Product(101, 200, 20, "Samsung Mobiles");
	Product p2 = (Product)p1.clone();
	System.out.println(p1 == p2);
	
	//display details
	System.out.println("before value of p1 is: "+p1.toString()+" and before value of p2 is: "+p2.toString());
	//change orignal object state
	/*p1.setPid(102);
	p1.setPname("One Plus Mobile");
	p1.setPrice(30000);
	p1.setUnitOfMeasurement(20);*/
	


