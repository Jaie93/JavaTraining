package com.yash.array5;

//An Array Contain different numbers you have to find how many are even, odd, perfect and prime
public class FindEvenOddPerfectPrime 
{
	public static void main(String[] args) 
	{
		int[] a = { 2, 4, 6, 8, 11, 17, 19, 21, 28 };
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int p = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] % 2 == 0) 
			{
				count++;
			}
			if (a[i] % 2 != 0)
			{
				count1++;
			}
			
			int prime = 1;
			for (int j = 2; j <= a.length - 1; j++) 
			{
				if (a[i] % j == 0) 
				{
					prime++;
				}
			}
			if (prime == 1) 
			{
				count2++;
			}
			int sum = 0;
			int t = a[i];
			for (int k = 1; k < t; k++) 
			{
				if (t % k == 0) 
				{
					sum = sum + k;
				}
			}
			if (sum == t) 
			{
				p++;
			}
		}
		System.out.println("Even No Is :- " + count);
		System.out.println("Odd No Is :- " + count1);
		System.out.println("Prime No :- " + count2);
		System.out.println("Perfect No :- " + p);
	}
}