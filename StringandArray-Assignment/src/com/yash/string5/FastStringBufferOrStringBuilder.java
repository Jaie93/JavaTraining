package com.yash.string5;

import java.util.GregorianCalendar;

//WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
public class FastStringBufferOrStringBuilder {
	
	public static void main(String[] args) {
		
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		
		System.out.println(start);
		
		long startMemory=Runtime.getRuntime().freeMemory();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<10000000; i++)
		{
			sb.append(":").append(i);
		}
		
		long end=new GregorianCalendar().getTimeInMillis();
		System.out.println(end);
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken:"+(end-start));
		System.out.println("Memory used:"+(startMemory-endMemory));
	}

}
