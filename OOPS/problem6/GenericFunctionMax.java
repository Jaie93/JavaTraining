package com.yash.traning.opps.homeAssignemnt.problem6;

import java.util.Scanner;

public class GenericFunctionMax<G> 
{
  G obj;

public GenericFunctionMax(G obj) 
{
	super();
	this.obj = obj;
}

static <G> void GenericFunctionMax(G data)
{
	Scanner sc = new Scanner(System.in);
    System.out.println("Please enter total number: ");
    int numbers = sc.nextInt();
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;
    System.out.println("Please enter " + numbers + " numbers.");
    for(int a = 0; a < numbers; a++)
    {
       int current = sc.nextInt();
       if(current > maximum)
       {
          maximum = current;
       }
       if(current < minimum)
       {
          minimum = current;
       }
    }
    System.out.println("largest of " + numbers + " numbers is: " + maximum);
    System.out.println("smallest of " + numbers + " numbers is: " + minimum);
    sc.close();

}
public G getObj() {
	return obj;
}
public void setObj(G obj) {
	this.obj = obj;
}
public static void main(String[] args) 
{
	//GenericFunctionMax;
}
}
