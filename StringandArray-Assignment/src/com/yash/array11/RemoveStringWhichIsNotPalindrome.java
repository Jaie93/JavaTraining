package com.yash.array11;

public class RemoveStringWhichIsNotPalindrome 
{
	static String str[]= {"nayan","ssad","akscfd"};
	
	public static void main(String[] args) 
	{
		RemoveStringWhichIsNotPalindrome t= new RemoveStringWhichIsNotPalindrome();
		
		for(String st:str)
		{
			t.checkThePalindrome(st);		
		}
	}
	
	public void checkThePalindrome(String s)
	{
		char chArr[]=s.toCharArray();
		
		int n =chArr.length;
		int count=0;
		for(int i=0,j=chArr.length-1;i<chArr.length;i++,j--)
		{
			if(chArr[i]==chArr[j])
			{
				count++;
			}		
		}
		if(count==n)
		{
			System.out.println("Palindrome: "+s);
		}
	}
}