package com.yash.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesNames {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
		    list.add("jaie");
		    list.add("Pournima");
		    list.add("Shaili");
		    list.add("Jaie");
		    list.add("Shaili");

		    System.out.println("Before removing duplicate List "+list);

		    
		    Set<String> set = new HashSet<>(list);

		    System.out.println("After removing duplicates List "+set);
	}
}
