package com.yash.exception10;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 10, 324, 45, 90, 9808 };
		int n = arr.length;
		ParentClass pc = new ParentClass();
		ParentClass cc = new ChildClass();
		System.out.println(pc.largest(arr, n));
		System.out.println(cc.largest(arr, n));
	}
}
