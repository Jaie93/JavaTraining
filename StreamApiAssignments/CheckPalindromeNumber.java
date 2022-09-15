package StreamApiAssignments;

import java.util.Scanner;

interface StringFunc {
	   String func(String n);
	}
public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		StringFunc reverse = (s) -> {   // lambda expression
	         String result = "";
	         for(int i = s.length()-1; i >= 0; i--)
	            result += s.charAt(i);
	         return result;
	      };
		if(reverse.equals(str))
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");

	}

}
