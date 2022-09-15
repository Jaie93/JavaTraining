package com.yash.traning.opps.homeAssignemnt.problem2;

import java.util.Scanner;

public class Square implements Shape{

	@Override
	public void area() 
	{
		double a,s;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Enter the side of the square:");
	      s = sc.nextDouble();

	      a = s*s;
	      System.out.println("Area of the square is: " + a);    		
	}

}
