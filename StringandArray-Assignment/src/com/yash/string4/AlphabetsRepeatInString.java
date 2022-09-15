package com.yash.string4;

public class AlphabetsRepeatInString{

	private static String s = "JavaisGoodProgrammingLanguage";

	public static void main(String[] args) {

		new AlphabetsRepeatInString().alphabetsrepeated(s);

	}
	private void alphabetsrepeated(String s2) {
		
		char chArr[] = s2.toCharArray();
		for (int i = 0; i < chArr.length; i++) 
		{
			if (chArr[i] == ' ')
				continue;
			int count = 1;
			
			for (int j = i + 1; j < chArr.length; j++) {

				if (chArr[i] == chArr[j]) {
					chArr[j] = ' ';
					count++;
				}
			}
			System.out.println(chArr[i] + "  " + count);
		}
	}
}