package com.yash.TDD;

public class SumOfExpression {
	
	
	public int calculateSum(String exp)
	{

		StringBuffer num = new StringBuffer();
		int sum=0,temp=0,rem=0;
		for(int i=0;i<exp.length();i++)
		{
			if(Character.isDigit(exp.charAt(i)))
				num=num.append(exp.charAt(i));
		}
		temp=Integer.parseInt(num.toString());	
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		return sum;
	}
	
}
