package com.yash.TDD;


public class FindBinaryEquivalent {
	
	public String findBinaryEquivalent(int num)
	{
		int temp=num,rem;
		String binary = "";
		//while(temp==0)
		//{
			rem=temp%2;
			binary+=Integer.toBinaryString(num);
		//	System.out.println(binary);
		//	temp=temp/2;
		//}
		return binary;
	}

	
}
