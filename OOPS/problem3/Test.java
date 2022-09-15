package com.yash.traning.opps.homeAssignemnt.problem3;

public class Test 
{
  public static void main(String[] args) 
  {
	  System.out.println("===============branch details======================");
	  
	  Branch   b1 = new Branch(67,"SBI","Nasik" );
	  System.out.println("------details of brnach sbi---------------------");
	  System.out.println(b1);
	  
	  Branch   b2 = new Branch(78,"ICICI","Mumbai" );
	  System.out.println("------details of brnach ICICI-------------------");
	  System.out.println(b2);
	  
	  Branch   b3 = new Branch(1003,"PNB","INDORE" );
	  System.out.println("------details of brnach PNB--------------------");
	  System.out.println(b3);
	  
	System.out.println("=========customer details================");	
	
	Customer c1 = new Customer(1,567,"Sayali", "Kangane","02/02/99","12/12/21", b1);
	System.out.println("=---details of customer c1---------------------------------------");
	System.out.println(c1);
	
	Customer c2 = new Customer(102,30002,"sapna", "abd","07/07/91","01/12/22", b2);
	System.out.println("=---details of customer c2---------------------------------------------");
	System.out.println(c2);
	
	Customer c3 = new Customer(103,30002,"Ashwini", "barshi","05/03/95","01/02/20", b3);
	System.out.println("=---details of customer c3----------------------------------------------------");
	System.out.println(c3);
	
	
	System.out.println("=============all the details of Customer_Account_Statement====================");
	
	Customer_Account_Statement ca1 = new Customer_Account_Statement(501,c1, 1200, 500, "24/08/22");
	System.out.println("--------------details of Customer_Account_Statement ca1");
	System.out.println(ca1);
	
	Customer_Account_Statement ca2 = new Customer_Account_Statement(502,c2, 2000, 700, "22/07/20");
	System.out.println("--------------details of Customer_Account_Statement ca2");
	System.out.println(ca2);
	
	Customer_Account_Statement ca3 = new Customer_Account_Statement(503,c3, 3000, 800, "21/07/21");
	System.out.println("--------------details of Customer_Account_Statement ca3");
	System.out.println(ca3);
  }
}
