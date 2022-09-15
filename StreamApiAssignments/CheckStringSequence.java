package StreamApiAssignments;

import java.util.Scanner;

interface CheckCharSeq
{
	boolean check(String input,String seq);
}
public class CheckStringSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String");
		 String str = sc.nextLine();
		 System.out.println("Enter the charcter sequence");
		 String seq = sc.next();
		 CheckCharSeq  result = (s, q) -> {	 
			 if(s.contains(q))
				return   true;
			 else
				return  false;

		 };
		 
			 System.out.println(result);
		 
	}

}
