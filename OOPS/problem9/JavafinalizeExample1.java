package com.yash.traning.opps.homeAssignemnt.problem9;

public class JavafinalizeExample1
{
	public static void main(String[] args)   
    {   
        JavafinalizeExample1 obj = new JavafinalizeExample1();   
        System.out.println("Hashcode of object= "+obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
	protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}
