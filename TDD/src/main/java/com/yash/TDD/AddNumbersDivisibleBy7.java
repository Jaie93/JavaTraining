package com.yash.TDD;

public class AddNumbersDivisibleBy7 {
	
	public long add()
	{
		int sum=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			sum=sum+i;
		}
		return sum;
	}

}
