package com.yash.exception10;

import java.util.Arrays;

public class ParentClass {
	int largest(int[] arr, int n) {
		try {
			System.out.println("From Parent class");
			Arrays.sort(arr);
			return arr[n - 1];
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}
		return n;
	}

}
