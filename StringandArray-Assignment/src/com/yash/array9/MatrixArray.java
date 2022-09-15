package com.yash.array9;

import java.util.Scanner;

public class MatrixArray 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The No Of Rows:");
			int n=sc.nextInt()	;
			int [][]matrix=new int[n][n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter The Element In "+i+1+"Row");
				for(int j=0;j<n;j++)
				{
					matrix[i][j]=sc.nextInt();
				}
			}
			sc.close();
			
			System.out.println("First Row:");
			for(int i=0;i<1;i++)
			{
				for(int j=0;j<n;j++)
			{
					System.out.print(matrix[i][j]+"  ");
			}
		}		
	}
}