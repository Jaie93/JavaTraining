package com.yash.array10;

public class ArrayOfString 
{
		
	public static void main(String[] args) 
	{
			
		String strArr[]= {"Mumbai","Pune","Jalgaon","b","dd","cc"};
		
		for(int i=0;i<strArr.length;i++)
		{
				String temp;
				
				for(int j=i+1;j<strArr.length;j++)
					
				{
					if(strArr[i].length()>strArr[j].length())
				{
						temp=strArr[i];
						strArr[i]=strArr[j];
						strArr[j]=temp;
				}
			}
		}
			
		for(String s:strArr)
		{
				System.out.print(s+"  ");
		}
	}
}