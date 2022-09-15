package com.yash.array1;

public class FindThirdMaximumNumberInArray 
{
	public static void main(String[] args) 
	{
		int array[]= {10,12,48,35,55,50,65};
		int sizeof = array.length;
		int temp;
		for(int i=0;i<sizeof;i++)
		{
			for(int j=i+1;j<sizeof;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Third Maximum Number Is :- "+array[sizeof-3]);
	}
}

