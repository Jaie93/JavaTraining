package com.yash.array12;

public class SortArrayOnBasisOfUnitPlace {
	public static void main(String[] args) {

		int arr[] = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % 10 == i)
					System.out.print(arr[j] + " ");
			}
		}
	}
}