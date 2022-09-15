package com.yash.exception10;

import java.util.Arrays;

public class ChildClass extends ParentClass {

	@Override
	int largest(int[] arr, int n) {
		try {
			System.out.println("From child class");
			Arrays.sort(arr);
			return arr[n - 1];
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println(e);
		}
		return n;
	}

}
