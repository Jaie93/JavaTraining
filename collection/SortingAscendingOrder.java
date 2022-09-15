package com.yash.collection;

import java.util.*;

public class SortingAscendingOrder {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Python");
		al.add("Java");
		al.add("Scala");
		al.add("Angular");
		al.add("JavaScript");

		Collections.sort(al);

		System.out.println("List After Sorting :- " + "\n" + al);
	}
}
