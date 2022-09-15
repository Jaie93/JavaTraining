package com.yash.array8;

public class VowelsAndConsonantsInArray 
{
	public static void main(String[] args) 
	{
        char c[] = { 'a', 'n', 'd', 'e', 'w', 'i' };
        char ch1[] = new char[c.length];
        char ch2[] = new char[c.length];
        for (int i = 0; i < c.length; i++) 
        {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') 
            {
                ch1[i] = (char) (ch1[i] + c[i]);
            }
            if (c[i] != 'a' || c[i] != 'e' || c[i] != 'i' || c[i] != 'o' || c[i] != 'u') 
            {
                ch2[i] = (char) (ch2[i] + c[i]);
            }
        }
        
        int len = ch1.length + ch2.length;
        char[] ch3 = new char[len];
        int pos = 0;
        for (char c1 : ch1) 
        {
            ch3[pos] = c1;
            pos++;
        }
        
        for (char c1 : ch2) 
        {
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') 
            {
                continue;
            }
            ch3[pos] = c1;
            pos++;
        }
        System.out.print(ch3);
    }
}